/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.unbc.cpsc.latte;
import ca.unbc.cpsc.score4.interfaces.*;
import ca.unbc.cpsc.score4.exceptions.PlayerException;  
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author jmuir
 */
public class Referee1 {public static int yurd=0;
    public AI1 deep=new AI1();
    public static int whoWon=0;
    public static int whoWon2=0;
//=new AI();
 public Referee1(){
//   try{
     AI1 deep=new AI1();
//   }catch(Exception e){e.printStackTrace();}
   
   try{
       deep.reset();}catch(Exception c){c.printStackTrace();}
  
 
 }
    public void placeBead(Location l) throws PlayerException{
  Loc3d location2=(Loc3d)l;
  
    deep.opponentPlays(l);
    if(yurd==1)NotGraphics.resetGame(); else;

    NotGraphics.aiPlays(l.getRow(), l.getColumn(), location2.getHeight());
   ++NotGraphics.whomTurn;
 
    
    }
    public void doThis() throws PlayerException{

    Loc3d josh=deep.requestMoveLocation();
    NotGraphics.timer(josh.getRow(),josh.getColumn(),1);
    
    
    }
    public void checkWin(Location l) throws PlayerException{
    
    System.out.println(AI1.board.getPeg(l));
    
    }
 public boolean checkMove(Location l){
 
 
 return true;
 
 }   
 public void whomstdveWon(PlayerColour c){
     NotGraphics.showEndGame();
    
     if(c==deep.colour){System.out.println("AI WINS");whoWon=1;playSound();}
     else {System.out.println("NOT AI WINS");whoWon=2;soundPlay();}
     endGame();
 }
 private void endGame(){
 try{
     //++yurd;
    // NotGraphics.sendBro();
     deep.reset();}catch(PlayerException c){c.printStackTrace();}
     
 }
 public void setColor(){
 
 
 
 }
 public void startColour(String s){
 
 
 if(s.equals("white"))System.out.println("did");
 
 }
 private void playSound(){
 
 
 
    try{
    NotGraphics.clip.stop();
    Clip clip=AudioSystem.getClip();
    clip.open(AudioSystem.getAudioInputStream(new File("Price_Is_Right_loser_clip.wav")));
    clip.start();
    }catch(Exception e){e.printStackTrace();}
    
 
 
 }
 private void soundPlay(){
 
    try{
    NotGraphics.clip.stop();
    Clip clip=AudioSystem.getClip();
    clip.open(AudioSystem.getAudioInputStream(new File("fatality.wav")));
    clip.start();
    }catch(Exception e){e.printStackTrace();}
 
 
 }
}
