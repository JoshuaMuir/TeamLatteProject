package ca.unbc.cpsc.latte;

import ca.unbc.cpsc.score4.enums.GameOverStatus;
import ca.unbc.cpsc.score4.interfaces.Colour;
import ca.unbc.cpsc.score4.interfaces.Location;
import ca.unbc.cpsc.score4.exceptions.PlayerException;
import java.util.Random;

public class AI implements ca.unbc.cpsc.score4.interfaces.Player {
    private Colour colour;
    private GameOverStatus gameOverStatus;
    private int opponent;
    private int turnCount;
    private Board board = new Board();
    private Loc3d lastmove;
    
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
        turnCount = 1;
        board = new Board();
    }
    
    @Override
    public void startGameAs(Colour c) throws PlayerException {
        colour = c;
    }
    
    @Override
    public void noteOpponentsId(int id) throws PlayerException {
        opponent = id;
    }
    
    @Override
    public void opponentPlays(Location ell) throws PlayerException {
        turnCount++;
    }
    
    @Override
    public Loc3d requestMoveLocation() throws PlayerException {
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
            else if(board.getPeg(new Loc3d(0,0,0)).getLength() == 0) {
                 move = new Loc3d(0, 0, 0);
            }
            else if(board.getPeg(new Loc3d(0,3,0)).getLength() == 0) {
                 move = new Loc3d(0, 3, 0);
            }
        }
        else {
            for(int i = 0; i < 16; i++) {
                if(board.getPeg(i).getLength() == 3) { //check if there are vertical lines of 3
                    b1 = board.getPeg(i).beadlist[0];
                    b2 = board.getPeg(i).beadlist[1];
                    b3 = board.getPeg(i).beadlist[2];
                    
                    if(b1.getColour() == b2.getColour() && b2.getColour() == b3.getColour()) {
                        //check if 3 beads in a line are same colour
                        row = board.getPeg(i).getRow();
                        column = board.getPeg(i).getColumn();
                        height = board.getPeg(i).getLength();
                    
                        move = new Loc3d(row, column, height);
                        i = 16;
                        //exit loop
                    }
                }
                else
                    move = randomPlay();
            }
        }
        
        turnCount++;
        lastmove = move;
        return move;
    }
    
    @Override
    public Location retry() throws PlayerException {
        lastmove.add();
        return lastmove;
    }
    
    @Override
    public void noteGameOver(GameOverStatus whatHappened) throws PlayerException {
        gameOverStatus = whatHappened;
    }
    
    private boolean isFirstFour() {
        return (turnCount < 9);
        //first four AI turns, 8 turns total
    }
    
    private Loc3d randomPlay() {
        //method chooses a peg location at random
        Loc3d move = new Loc3d(0,0,0);
        Random random = new Random();
        boolean isLegal = false;
        
        while(!isLegal) {
            int randomIndex = random.nextInt(4);
            
            if(board.getPeg(randomIndex).getLength() < 4) { //if peg isn't full
                int row = board.getPeg(randomIndex).getRow();
                int col = board.getPeg(randomIndex).getColumn();
                int height = board.getPeg(randomIndex).getLength();
                
                move = new Loc3d(row, col, height);
                isLegal = true;
                //exit loop
            }
        }
        return move;
    }
}