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

public class AI implements ca.unbc.cpsc.score4.interfaces.Player {
    private Colour colour;
    
    public AI() {
        reset();
    }
    
    @Override
    public void reset() throws PlayerException {
        startGameAs(Referee.assignColour());
    }
    
    @Override
    public void startGameAs(Colour c) throws PlayerException {
        colour = c;
    }
    
    @Override
    public void noteOpponentsId(int id) throws PlayerException {
        
    }
    
    @Override
    public void opponentPlays(Location ell) throws PlayerException {
        
    }
    
    @Override
    public Location requestMoveLocation() throws PlayerException {
        Location move;
        return move;
        /*pick a peg at random and check if it's empty? possibly with a 
        static checkPeg method?*/
    }
    
    @Override
    public Location retry() throws PlayerException {
        requestMoveLocation();
    }
    
    public abstract void noteGameOver(GameOverStatus whatHappened) throws PlayerException {
        
    }
}
