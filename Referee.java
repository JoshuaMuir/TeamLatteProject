 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.unbc.cpsc.latte;
import ca.unbc.cpsc.latte.Loc3d;
import ca.unbc.cpsc.latte.Bead;
import ca.unbc.cpsc.latte.Player;
import ca.unbc.cpsc.latte.AI;
/**
 *
 * @author ryans
 */
public class Referee {
  
    private Color pc; 
    private Board board;
    private Bead b;
    
//    public void reset()
//    {
//    //resets the game if the user wants to
//    }
    public void placeBead()
    {
    //communicates with the bead to the peg
    //isnt this the bead or player class job?
    //checkmoves then places the bead
        //uses the array above
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
//     return colourAt(b.getRow(),b.getColumn(),b.getHeight());
    
//    Peg p = board.getPeg(b.getRow(),b.getColumn());
    Colour c = b.getColour();
    return c;
    }
    
    
    public boolean hasaWin(Loc3d [] aLine)
    {
     //checks the stuff   
     int index =0;
     switch (index)
     {
         case 0:
             if ((colourAt(aLine[1],aLine[2],aLine[3]))==pc){return true;}
             else if ((colourAt(aLine[4],aLine[8],aLine[12])==pc)){return true;}
             else if (colourAt(aLine[5],aLine[10],aLine[15])==pc){return true;}
             else {return false;}
     }
           
     return false;   
    }

    public Color assignColour(Color c)//or tracks color
    {
        pc = c;
      return c;
    }
    //not sure yet
    public void startGame()
    {
    AI ai = new AI();
    Player p = new Player();
    }
}
