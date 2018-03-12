
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ca.unbc.cpsc.latte;

/**
 *
 * @author jli3
 */
import ca.unbc.cpsc.score4.enums.GameOverStatus;
import ca.unbc.cpsc.score4.interfaces.Colour;
import ca.unbc.cpsc.score4.interfaces.Location;
import ca.unbc.cpsc.score4.exceptions.PlayerException;
import ca.unbc.cpsc.latte.Referee;
import java.util.Random;

public class AI implements ca.unbc.cpsc.score4.interfaces.Player {
    private Colour colour;
    private GameOverStatus gameOverStatus;
    private int opponent;
    //this is also not necessary and not used for anything but i'll just keep it anyway in case Casperson wants to do something
    //in the tournament with it
    private int turnCount;
    //turnCount is not necessary it's just a counter for my AI's strategy etc.
    
    public AI() {
        reset();
    }
    
    @Override
    public void reset() throws PlayerException {
        startGameAs(Referee.assignColour());
        //not sure if AI calls the referee method or if the referee calls AI.startGameAs directly
        //also not sure what this method will be called
        gameOverStatus = null;
        opponent = 0;
        turnCount = 1;
        
        /*
        one BIG question I have is whether Referee calls all the methods like startGameAs(), noteOpponentsId(), or if
        the referee just calls reset() and those methods get called by the AI's reset() method. like for example should
        I call those methods in this method or does the Referee do that for me? if I am calling those methods I will need 
        to receive information from the Referee that the Referee receives from Player etc. Very complicated, I know.
        */
        
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
        Loc3d move;
        //for choosing a peg at random
        
        int row;
        int column;
        int height;
        
        boolean sameColor;
        //for checking vertical lines of 3
        
        Bead b1;
        Bead b2;
        Bead b3;
        
        if(isFirstFour()) { //try to get a corner peg
            if(Board.getPeg[0].getLength() == 0) {
                 move = new Loc3d(3, 0, 0);
            }
            else if(Board.getPeg[3].getLength() == 0) {
                 move = new Loc3d(3, 3, 0);
            }
            else if(Board.getPeg[12].getLength() == 0) {
                 move = new Loc3d(0, 0, 0);
            }
            else if(Board.getPeg[15].getLength() == 0) {
                 move = new Loc3d(0, 3, 0);
            }
        }
        else {
            for(int i = 0; i < Board.getPeg[].length; i++) {
                if(Board.getPeg[i].getLength() == 3) { //check if there are vertical lines of 3
                    b1 = Board.getPeg[i].beadlist[0];
                    b2 = Board.getPeg[i].beadlist[1];
                    b3 = Board.getPeg[i].beadlist[2];
                    
                    if(b1.getColour() == b2.getColour() && b2.getColour() == b3.getColour()) {
                        //check if 3 beads in a line are same colour
                        row = Board.getPeg[i].getRow();
                        column = Board.getPeg[i].getColumn();
                        height = Board.getPeg[i].getLength();
                    
                        move = new Loc3d(row, column, height);
                        i = Board.getPeg[].length;
                        //exit loop
                    }
                }
                else
                    move = randomPlay();
            }
        }
        
        turnCount++;
        return move;
    }
    
    @Override
    public Location retry() throws PlayerException {
        requestMoveLocation();
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
        Loc3d move;
        Random random = new Random();
        boolean isLegal = false;
        
        while(!isLegal) {
            int randomIndex = random.nextInt(4);
            
            if(Board.getPeg[randomIndex].getLength() < 4) { //if peg isn't full
                int row = Board.getPeg[randomIndex].getRow();
                int col = Board.getPeg[randomIndex].getColumn();
                int height = Board.getPeg[randomIndex].getLength();
                
                move = new Loc3d(row, col, height);
                isLegal = true;
                //exit loop
            }
        }
        return move;
    }
}
