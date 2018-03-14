 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Jordan: I'm assuming Referee will be in the latte package, so you do not need to import other stuff in the latte package.
import ca.unbc.cpsc.latte.Loc3d;
import ca.unbc.cpsc.latte.Bead;
import ca.unbc.cpsc.latte.HumanPlayer;
import ca.unbc.cpsc.latte.AI;
import ca.unbc.cpsc.score4.interfaces.Colour;
/**
 *
 * @author ryans
 */
public class Referee {
 
    //should probably have a private AI and Player object to ensure communication to those classes.
  
    private Colour pc; 
    private Board board;
    private Bead b;

    public void placeBead()
    {
    //communicates with the bead to the peg
    //checkmoves then places the bead
    }

    public boolean checkMove(Location l)
    {
    //communicates with loc3d and loc2d
    //maybe the rules to check
    //checks if its a valid move
    }
    public void checkWin(Location l)
    {
    //checks the rows
    //maybe the rules to check
    //notify the players who won

    }
    private Colour colourAt(Bead b){
    Colour c = b.getColour();
    return c;
    }
    
    
    public boolean hasaWin(Loc3d [] aLine)
    {
         for (int i = 0;i < 16; i++)
         {
             if (board.getPeg(i).getLength()==4)
             {
                 b1 = board.getPeg(i).beadlist[0];
                 b2 = board.getPeg(i).beadlist[1];
                 b3 = board.getPeg(i).beadlist[2];
                 b4 = board.getPeg(i).beadlist[3];
                 if(b1.getColour() == b2.getColour() == b3.getColour()==b4.getColour()) 
                 {
                     //win
                 return true;
                 }
             }
             else
             {
             return false;
             }
            
         }
    }
    
    public Colour assignColour(Colour c)//or tracks color
    {
        pc = c;
      return c;
    }
    public void startGame()
    {
    
      AI ai = new AI();
      HumanPlayer hp = new HumanPlayer();
      if (pc == isWhite())
      {
      hp.reset();
      hp.StartGameAs(isWhite());
      ai.reset();
      ai.StartGameAs(isBlack());
      
      }
      else 
      {
      hp.reset();
      hp.StartGameAs(isBlack());
      ai.reset();
      ai.StartGameAs(isWhite());
      }
    }
}
