package ca.unbc.cpsc.latte;

import ca.unbc.cpsc.score4.enums.GameOverStatus;
import ca.unbc.cpsc.score4.interfaces.*;
import ca.unbc.cpsc.score4.exceptions.PlayerException;
import static ca.unbc.cpsc.latte.NotGraphics.joey;
import java.util.Random;

public class AI1 implements Player {
    public PlayerColour colour=PlayerColour.b;
    public PlayerColour opponentColour=PlayerColour.w;
    
    private GameOverStatus gameOverStatus;
    
    private int turnCount;
    public static Board board;
    public static Board board2;
    
    private Loc3d lastmove;
    private static int numWins = 0;
    
    private boolean oneEmpty;
    private boolean twoEmpty;
    private boolean threeEmpty;
    private boolean fourEmpty;
//    
//   public AI1()throws PlayerException{
//       reset();
//   }
    
    public Board getBoard(){
        return board;
    }
    
    public Colour getColour(){
        return colour;
}
    
    @Override
    public void reset() throws PlayerException {
        turnCount = 1;
        board2=new Board();
        board = new Board();
    }
    
    @Override
    public void startGameAs(Colour c) throws PlayerException {
        colour = (PlayerColour)c;
        
        if(c == PlayerColour.b)
            opponentColour = PlayerColour.b;
        else
            opponentColour = PlayerColour.w;
    }
    
    @Override
    public void noteOpponentsId(int id) throws PlayerException {
    }
    
    @Override
    public void opponentPlays(Location ell) throws PlayerException {
        Loc3d drum=(Loc3d)ell;
        int row = drum.getRow();
        int col = drum.getColumn();
        int height = drum.getHeight();
        if(drum.getHeight()==4) {
            
        }
               
       lastmove=drum;
   
      
        turnCount += 2;   
        Bead b = new Bead(opponentColour, lastmove, lastmove.getHeight());
       board.addtoLines(b);
       board2.addtoLines(b);

      board.getPeg(lastmove).addBead(0, b);
    
    }
 
    
    @Override
    public Loc3d requestMoveLocation() throws PlayerException {
        Loc3d move = new Loc3d(0,0,0); //to ensure that move is initialized
        //for choosing a peg at random
       System.out.println("got in here pal");
        int row;
        int column;
        int height;
        
        //for checking vertical lines of 3
        
        if(isFirstFour()) { //try to get a corner peg

            
            if(board.getPeg(new Loc3d(3,0,0)).getLength() == 0) {
                 move = new Loc3d(3, 0, 0);
                 
            }
            else if(board.getPeg(new Loc3d(3,3,0)).getLength() == 0) {
                 move = new Loc3d(3, 3, 0);
            }
            else if(board.getPeg(new Loc3d(0,0,0)).getLength() == 0) {
                 move = new Loc3d(0, 0, 0);
            }
            else if(board.getPeg(new Loc3d(0,3,0)).getLength() == 0) {
                 move = new Loc3d(0, 3, 0);
            }
        }
        else move = playVertical();
        if(playVertical().getHeight() == 4)
            move = playHorizontal();
        else;
        ++turnCount;
        while(move.getHeight()>3){move=randomPlay();}
       
        lastmove = move;
        Bead b = new Bead(colour,lastmove,lastmove.getHeight());
             board.getPeg(lastmove).addBead(0, b);
       
         board.addtoLines(b);
        
         board2.addtoLines(b);
        //add my last move
        return move;
    }
    

    
    
    
    public Location retry() throws PlayerException {
        Loc3d move = requestMoveLocation();
        return move;
    }
    
    private boolean checkLine(Peg p1, Peg p2, Peg p3, Peg p4, int i) { //added
    
         boolean empty = false;
        int beadCount = 0;
        int blackCount = 0;
        int whiteCount = 0;
        
        oneEmpty = false;
        twoEmpty = false;
        threeEmpty = false;
        fourEmpty = false;

        
        if(p1.getLength() == i-1) {
            
            empty = true;
            oneEmpty = true;
            //emptyIndex = 0;
        }
        else if (p1.getLength() >= i && p1.getLength() < 4) {
            Bead b1 = p1.beadlist[i-1];
          
            beadCount++;
            
            if(b1.getColour().isWhite())
                whiteCount++;
            else
                blackCount++;
        }
        
        if(p2.getLength() == i-1) {
           
            empty = true;
            twoEmpty = true;
            //emptyIndex = 1;
        }
        else if(p2.getLength() >= i) {
            Bead b2 = p2.beadlist[i-1];
            beadCount++;
            if(b2.getColour().isWhite())
                whiteCount++;
            else
                blackCount++;
        }
        
        if(p3.getLength() == i-1) {
            
            empty = true;
            threeEmpty = true;
            //emptyIndex = 2;
        }
        else if(p3.getLength() >= i) {
            Bead b3 = p3.beadlist[i-1];
            beadCount++;
            if(b3.getColour().isWhite())
                whiteCount++;
            else
                blackCount++;
        }
        
        if(p4.getLength() == i-1) {
            
            empty = true;
            fourEmpty = true;
            //emptyIndex = 3;
        }
        else if(p4.getLength() >= i) {
            Bead b4 = p4.beadlist[i-1];
            beadCount++;
            if(b4.getColour().isWhite())
                whiteCount++;
            else
                blackCount++;
        }
       
        boolean q=(whiteCount==3||blackCount==3);
        return q;
}
        
       
    private Loc3d playVertical() { //added
        Loc3d move=new Loc3d(0,0,0);
        
        //alternately this could all be condensed to
        
        /*if(board.getIsVital()) {
            return board.getVitalMove();
        }
        else
            return playHorizontal(); */
        
       // should probably just try that first and see if jordan's method works
        
        
          for(int i = 0; i < board.sz0.length; i++) {
                //loop through all pegs
                if(board.sz0[i].getLength() == 3) { //check if there are vertical lines of 3
                   Bead b1 = board.sz0[i].beadlist[0]; //bottom bead
                   Bead b2 = board.sz0[i].beadlist[1]; //middle bead ask her about this
                   Bead b3 = board.sz0[i].beadlist[2]; //top bead
                    
                    if(b1.getColour() == b2.getColour() && b2.getColour() == b3.getColour()) {
                        //check if 3 beads in a line are same colour
                       int row = board.sz0[i].getRow();
                       int column = board.sz0[i].getColumn();
                       int height = board.sz0[i].getLength();
                    
                        move = new Loc3d(row, column, height);
                        //return move;
                        i = board.sz0.length;
                        //exit loop
                    }
                }
                else 
                    move = playHorizontal(); //go to next check method
                    //return move;
            }
        if(isValid(move))
            return move;
        else
            return playHorizontal();
}
    
    
    
        private Loc3d playHorizontal() { //added
        Peg p1, p2, p3, p4;
        
        Loc3d move=new Loc3d(0,0,0);
        boolean foundMove = false;
        
        for(int i = 0; i < 13; i += 4) {
            p1 = board.sz0[i];
            p2 = board.sz0[i+1];
            p3 = board.sz0[i+2];
            p4 = board.sz0[i+3];
            int emptyIndex;
            //loop through whole board
//            System.out.println(p1.beadlist[i].getColour()+" this is the p1 from the loop");
            
            for(int j = 1; j < 4; j++) {
            //loop through all heights
            
                if(checkLine(p1, p2, p3, p4, j)) {
                    
                    if(oneEmpty) {
                        emptyIndex = 0;
                        
                    }
                    else if(twoEmpty) {
                        emptyIndex = 1;
                        
                    }
                    else if(threeEmpty) {
                        emptyIndex = 2;
                      
                    }
                    else {
                        emptyIndex = 3;
                       
                    }
                  //  System.out.println("the value of i is this mf gd "+i);
                
                    int row = board.sz0[emptyIndex + i].getRow();
                    int col = board.sz0[emptyIndex + i].getColumn();
                    int hei = board.sz0[emptyIndex + i].getLength();
                  
                    move = new Loc3d(row, col, hei);
                    foundMove = true;
                    j = 4; //exit inner loop
                    i = 13; //exit outer loop
                }else;
            }
        }
        if(foundMove){
            
            return move;}
        else
            move = playHorizontal2();
        
        if(isValid(move))
            return move;
        else
            return playHorizontal2();
    }
        
    private Loc3d playHorizontal2() {
        
        Peg p1, p2, p3, p4;
        Loc3d move=new Loc3d(0,0,0);//initialize for compiler
        boolean foundMove = false;
        int emptyIndex;
        
        for(int i = 0; i < 4; i++) {
            p1 = board.sz0[i];
            p2 = board.sz0[i+4];
            p3 = board.sz0[i+8];
            p4 = board.sz0[i+12];
            //loop through whole board
            
            for(int j = 1; j < 4; j++) {
            //loop through all heights
            
                if(checkLine(p1, p2, p3, p4, j)) {
                    if(oneEmpty)
                        emptyIndex = 0;
                    else if(twoEmpty)
                        emptyIndex = 4;
                    else if(threeEmpty)
                        emptyIndex = 8;
                    else
                        emptyIndex = 12;
                    
                    int row = board.sz0[emptyIndex + i].getRow();
                    int col = board.sz0[emptyIndex + i].getColumn();
                    int hei = board.sz0[emptyIndex + i].getLength();
                    
                    move = new Loc3d(row, col, hei);
                    foundMove = true;
                    j = 4;
                    i = 4;
                }
            }
        }
        if(foundMove)
            return move;
        else
            move = randomPlay();
        
        if(isValid(move))
            return move;
        else
            return randomPlay();
    }
    
    private boolean isValid(Loc3d p){
    
    
    return (p.getHeight() < 4);
    
    
    }
    private Loc3d playDiagonal() {
        Peg p1, p2, p3, p4;
        Loc3d move=new Loc3d(0,0,0);//just made sure its initialized for compiler
        boolean foundMove = false;
        
        
        
        p1 = board.sz0[0];
        p2 = board.sz0[5];
        p3 = board.sz0[10];
        p4 = board.sz0[15];
        
        for(int i = 1; i < 4; i++) {
            if(checkLine(p1, p2, p3, p4, i)) {
                int emptyIndex;
                if(oneEmpty) {
                        emptyIndex = 0;
                        
                    }
                    else if(twoEmpty) {
                        emptyIndex = 1;
                        
                    }
                    else if(threeEmpty) {
                        emptyIndex = 2;
                      
                    }
                    else {
                        emptyIndex = 3;
                       
                    }
                int row = board.sz0[emptyIndex].getRow();
                int col = board.sz0[emptyIndex].getColumn();
                int hei = board.sz0[emptyIndex].getLength();
                    
                move = new Loc3d(row, col, hei);
                foundMove = true;
                i = 4;
            }
        }
        if(foundMove)
            return move;
        else
            return randomPlay();
}
    @Override
    public void noteGameOver(GameOverStatus whatHappened) {
        gameOverStatus = whatHappened;
        
        if(gameOverStatus == GameOverStatus.WIN)
            numWins++;
    }
    
    public int getNumWins() {
        //returns the amount of times AI has ever won a game
        return numWins;
    }
    
    private boolean isFirstFour() {
        return (turnCount < 6);
    }
    
    private Loc3d randomPlay() {
        
        //method chooses a peg location at random
        Loc3d move = new Loc3d(0,0,0);
        Random random = new Random();
        boolean isLegal = false;
        
        while(!isLegal) {
            
            int randomIndex = random.nextInt(16);
            
            int row = board.sz0[randomIndex].getRow();
            int col = board.sz0[randomIndex].getColumn();
            int height = board.sz0[randomIndex].getLength();
            
            move = new Loc3d(row, col, height);
            
            if(isValid(move)) { //if peg isn't full
                isLegal = true;
            }
        }
        //alternately, I just let the Referee do all the checking and just return whatever random location is generated
        //this is probably what i'll do, cause I should not be calling the Referee check method at all.
        
        return move;
    }
}