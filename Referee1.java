/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.unbc.cpsc.latte;
import ca.unbc.cpsc.score4.interfaces.*;
import ca.unbc.cpsc.score4.exceptions.PlayerException;  

/**
 *
 * @author jmuir
 */
public class Referee1 {
    public AI deep;//=new AI();
    public Referee1(AI myAI){
    deep=myAI;
        
        try{
            
            
            
    deep.reset();}catch(Exception e){}
    }
    public void placeBead(Location l) throws PlayerException{
    AI deep=new AI();
   
    System.out.println("now its here");
    l.getRow();   
    deep.reset();
    deep.opponentPlays(l);
    NotGraphics.whatIs(l.getRow(), l.getColumn(), 0);
   ++NotGraphics.whomTurn;
 ca.unbc.cpsc.score4.interfaces.NotGraphics.mainFrame.setSize(1001,900);
 ca.unbc.cpsc.score4.interfaces.NotGraphics.mainFrame.setSize(1000,900);
    
    
    
    
    }
    public void doThis() throws PlayerException{
//    deep=new AI();
    System.out.println("we are here for some reason");
    
    //deep.reset();
    Loc3d josh=deep.requestMoveLocation();
    NotGraphics.timerThing(josh.getRow(),josh.getColumn(),1);
    
    
    }
    public void checkWin(Location l) throws PlayerException{
    
    System.out.println(AI.board.getPeg(l));
    
    }
 public boolean checkMove(Location l){
 
 
 return true;
 
 }   
 public void setColor(){
 
 
 
 }
}
