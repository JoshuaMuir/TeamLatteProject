package ca.unbc.cpsc.latte;

import ca.unbc.cpsc.score4.enums.GameOverStatus;
import ca.unbc.cpsc.score4.interfaces.Colour;
import ca.unbc.cpsc.score4.interfaces.Location;
import ca.unbc.cpsc.score4.exceptions.PlayerException;
import java.util.Random;

public class AI implements ca.unbc.cpsc.score4.interfaces.Player {
    private Colour colour;
    private Colour opponentColour;
    
    private GameOverStatus gameOverStatus;
    
    private int opponent;
    private int turnCount;
    
    private Board board;
    
    private Loc3d lastmove;
    private static int numWins = 0;
    
    public AI() throws PlayerException{
        reset();
    }
    
    public Board getBoard(){
        return board;
    }
    
    public Colour getColour(){
        return colour;
}
    
    @Override
    public void reset() throws PlayerException {
        gameOverStatus = null;
        turnCount = 0;
        board = new Board();
        board.changehasWin(false);
    }
    
    @Override
    public void startGameAs(Colour c) throws PlayerException {
        colour = c;
        
        if(c = PlayerColour.isWhite())
            opponentColour = PlayerColour.isBlack();
        else
            opponentColour = PlayerColour.isWhite();
    }
    
    @Override
    public void noteOpponentsId(int id) throws PlayerException {
        opponent = id;
    }
    
    @Override
    public void opponentPlays(Location ell) throws PlayerException {
        loc3d ell3d = (loc3d) ell;
        int row = ell3d.getRow();
        int col = ell3d.getColumn();
        int height = board.getPeg(ell3d).getLength();
        
        board.getPeg(ell3d).addBead(0, new Bead(opponentColour, ell3d, height));
        //add the opponents last move
        board.getPeg(lastmove).addBead(0, new Bead(colour, lastmove, lastmove.getHeight()));
        //add my last move
        
        turnCount += 2;
    }
    
    @Override
    public Location requestMoveLocation() throws PlayerException {
        Loc3d move = new Loc3d(0,0,0); //to ensure that move is initialized
        //for choosing a peg at random
        
        int row;
        int column;
        int height;
        
        //for checking vertical lines of 3
        
        Bead b1;
        Bead b2;
        Bead b3;
        
        if(isFirstFour()) { //try to get a corner peg
            if(board.getPeg(new Loc3d(3,0,0)).getLength() == 0) {
                 move = new Loc3d(3, 0, 0);
            }
            else if(board.getPeg(new Loc3d(3,3,0)).getLength() == 0) {
                 move = new Loc3d(3, 3, 0);
            }
            else if(board.getPeg(new Loc3d(0,0,0)).getLength() == 0) {                 move = new Loc3d(0, 0, 0);
            }
            else if(board.getPeg(new Loc3d(0,3,0)).getLength() == 0) {
                 move = new Loc3d(0, 3, 0);
            }
        }
        else {
            for(int i = 0; i < board.sz0[].length; i++) {
                //loop through all pegs
                if(board.sz0[i].getlength() == 3) { //check if there are vertical lines of 3
                    b1 = board.sz0[i].beadlist[0];
                    b2 = board.sz0[i].beadlist[1];
                    b3 = sz0[i].beadlist[2];
                    
                    if(b1.getColour() == b2.getColour() && b2.getColour() == b3.getColour()) {
                        //check if 3 beads in a line are same colour
                        row = board.sz0[i].getRow();
                        column = board.sz0[i].getColumn();
                        height = board.sz0[i].getLength();
                    
                        move = new Loc3d(row, column, height);
                        i = board.sz0[].length;
                        //exit loop
                    }
                }
                else
                    move = randomPlay();
            }
        }
        
        lastmove = move;
        return move;
    }
    
    @Override
    public Location retry() throws PlayerException {
        loc3D move = requestMoveLocation();
        return move;
    }
    
    @Override
    public void noteGameOver(GameOverStatus whatHappened) throws PlayerException {
        gameOverStatus = whatHappened;
        
        if(gameOverStatus == GameOverStatus.WIN)
            numWins++;
    }
    
    public int getNumWins() {
        //returns the amount of times AI has ever won a game
        return numWins;
    }
    
    private boolean isFirstFour() {
        return (turnCount < 4);
    }
    
    private Loc3d randomPlay() {
        //method chooses a peg location at random
        Random random = new Random();
        
        int randomIndex = random.nextInt(4);
            
        int row = board.sz0[randomIndex].getRow();
        int col = board.sz0[randomIndex].getColumn();
        int height = board.sz0[randomIndex].getLength();
            
        move = new Loc3d(row, col, height);
        return move;
    }
}
