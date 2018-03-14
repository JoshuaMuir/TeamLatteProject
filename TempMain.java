package ca.unbc.cpsc.latte;

import ca.unbc.cpsc.score4.exceptions.PlayerException;
import ca.unbc.cpsc.score4.enums.GameOverStatus;
import ca.unbc.cpsc.score4.interfaces.*;

public class TempMain {

    public static void main(String[] args) throws PlayerException {
        AI myAI = new AI();
        
        NotGraphics ng = new NotGraphics();
        ng.runGUI();
        while(ng.getPlayerColour() == null){
        //waiting for player to choose colour    
        }
        if(ng.getPlayerColour() == PlayerColour.w){
            myAI.startGameAs(PlayerColour.b);
        }else{
            myAI.startGameAs(PlayerColour.w);
        }
        while(!myAI.getBoard().hasWin){
            taketurns();
        }
        //wait until reset or exit
    }

    public static int lconvert(Location l) {
        int i;
        i = l.getColumn() * 4 + 4 - l.getRow();
        return i;
    }
   
    public static void taketurns(){
        
    }
}
