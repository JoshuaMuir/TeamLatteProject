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
    //might want to have some private member variables like a colour, gameoverstatus, etc
    
    public HumanPlayer() {
        
    }
    
    @Override
    public void reset() throws PlayerException {
        /*
        getting this information from the referee probably.
        reset the state of GUI. 
        maybe a message?
        
        Edit: This information is probably coming from the GUI, then being sent to the referee for a reset?..
        
        yeah for our program, it's the user who calls reset. only in david's tournament director will the ref call reset i think
        */
    }
    
    @Override
    public void startGameAs(Colour c) throws PlayerException {
        /*
        GUI should display player's colour
        so need to get that info to the GUI,
        from the referee.
        
        Edit: This info is also being originiated in the GUI, or?
        
        yes, the player chooses their own colour
        */
    }    
    
    @Override
    public void noteOpponentsId(int id) throws PlayerException {
        /*
        getting this information from the referee.
        send to GUI and show opponent's ID on screen(?),
        but we can just skip this because it says so in the document.
        
        yeah i don't think we need this really
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
        
        loc3d is our class that implements Location interface, which we are allowed to use.
        
        oh. ok. :)
        */
    }
    
    @Override
    public Location retry() throws PlayerException {
        /*
        pop-up message requesting another move from GUI?
        gathering this from referee and sending to GUI.
        
        Edit: Also originating from GUI, then being sent to referee?
        
        I think so, yes. In our program it's pretty much the user that makes decisions
        
        */
        return requestMoveLocation();
    }
    
    @Override
    public void noteGameOver(GameOverStatus whatHappened) throws PlayerException {
        /*
        pop-up message on GUI indicating game-over
        happens after referee sends this info.
        */
    }
    
    //possibly some private methods should be added if necessary
 
    
}
