
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
    private int turnCount;
    
    public AI() {
        reset();
    }
    
    @Override
    public void reset() throws PlayerException {
        startGameAs(Referee.assignColour());
        gameOverStatus = null;
        opponent = 0;
        turnCount = 1;
    }
    
    @Override
    public void startGameAs(Colour c) throws PlayerException {
        colour = c;
    }
    
    @Override
    public void noteOpponentsId(int id) throws PlayerException {
        opponent = id;
        //dunno if necessary
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
        
        Bead b1;
        Bead b2;
        Bead b3;
        
        if(isFirstFour()) {
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
                if(Board.getPeg[i].getLength() == 3) {
                    b1 = Board.getPeg[i].beadlist[0];
                    b2 = Board.getPeg[i].beadlist[1];
                    b3 = Board.getPeg[i].beadlist[2];
                    
                    if(b1.getColour() == b2.getColour() && b2.getColour() == b3.getColour()) {
                        row = Board.getPeg[i].getRow();
                        column = Board.getPeg[i].getColumn();
                        height = Board.getPeg[i].getLength();
                    
                        move = new Loc3d(row, column, height);
                        i = Board.getPeg[].length;
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
    
    public abstract void noteGameOver(GameOverStatus whatHappened) throws PlayerException {
        gameOverStatus = whatHappened;
    }
    
    private boolean isFirstFour() {
        return (turnCount < 9);
    }
    
    private Loc3d randomPlay() {
        Loc3d move;
        Random random = new Random();
        boolean isLegal = false;
        while(!isLegal) {
            int randomIndex = random.nextInt(4);
            
            if(Board.getPeg[randomIndex].getLength() < 4) {
                int row = Board.getPeg[randomIndex].getRow();
                int col = Board.getPeg[randomIndex].getColumn();
                int height = Board.getPeg[randomIndex].getLength();
                move = new Loc3d(row, col, height);
                isLegal = true;
            }
        }
        return move;
    }
}
