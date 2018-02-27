
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
    
    public AI() {
        reset();
    }
    
    @Override
    public void reset() throws PlayerException {
        startGameAs(Referee.assignColour());
        gameOverStatus = null;
        //or whatever method from referee class assigns colours
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
        //do i even do anything for this
    }
    
    @Override
    public Location requestMoveLocation() throws PlayerException {
        Location move;
        return move;
        /*pick a peg at random and check if it's full? possibly with a 
        static checkPeg method?*/
    }
    
    @Override
    public Location retry() throws PlayerException {
        requestMoveLocation();
    }
    
    public abstract void noteGameOver(GameOverStatus whatHappened) throws PlayerException {
        gameOverStatus = whatHappened;
    }
    
    public static boolean isLegal(Location l) {
        
    }
}
