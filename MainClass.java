package ca.unbc.cpsc.latte;

import ca.unbc.cpsc.score4.exceptions.PlayerException;
//import ca.unbc.cpsc.score4.enums.GameOverStatus;

public class MainClass {

    public static void main(String[] args) throws PlayerException {
        
        NotGraphics ng = new NotGraphics();
        ng.runGUI();
        
    }


}