 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
  
    private Colour pc; 
    private Board board;
    private Bead b;

    public void placeBead()
    {
    //communicates with the bead to the peg
    //isnt this the bead or player class job?
    //checkmoves then places the bead
    }
    public void displayBoard()
    {
    //displays the board
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
        //
//     int index =0;
//     switch (index)
//     {
//         case 0:
//             if ((colourAt(aLine[1],aLine[2],aLine[3]))==pc){return true;}
//             else if ((colourAt(aLine[4],aLine[8],aLine[12])==pc)){return true;}
//             else if (colourAt(aLine[5],aLine[10],aLine[15])==pc){return true;}
//             else {return false;}
//     }
//           
     return false;   
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
