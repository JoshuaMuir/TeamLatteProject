/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.unbc.cpsc.latte;

/**
 *
 * @author talha
 */
public class HumanPlayer implements ca.unbc.cpsc.score4.interfaces.Player {
    
    public HumanPlayer() {
        
    }
    
    @Override
    public void reset() throws PlayerException {
        /*
        getting this information from the referee probably.
        reset the state of GUI. 
        maybe a message?
        */
    }
    
    @Override
    public void startGameAs(Colour c) throws PlayerException {
        /*
        GUI should display player's colour
        so need to get that info to the GUI,
        from the referee.
        */
    }    
    
    @Override
    public void noteOpponentsId(int id) throws PlayerException {
        /*
        getting this information from the referee.
        send to GUI and show opponent's ID on screen(?),
        but we can just skip this because it says so in the document.
        */
    }
    
    @Override
    public void opponentPlays(Location ell) throws PlayerException {
        /*
        GUI should show where opponent has placed bead
        so, updating the game board after a move.
        communicate back to the GUI about the game-state,
        the game might be over after that move.
        */
    }
    
    @Override
    public  Location requestMoveLocation() throws PlayerException {
        /*
        User clicks a button to make a move, pass this info to ref.
        call a method in GUI requesting for a move location
        (that's one way to do it)
        also, Location instead of Loc3d? it's "Location" in the document
        */
    }
    
    @Override
    public Location retry() throws PlayerException {
        /*
        pop-up message requesting another move from GUI?
        gathering this from referee and sending to GUI.
        */
        return requestMoveLocation();
    }
    
    @Override
    public void noteGameOver(GameOverStatus whatHappened) throws PlayerException {
        /*
        pop-up message on GUI indicating game-over
        happens after referee sends this info
        */
    }
    
    //possibly some private methods should be added if necessary.
 
    
}
