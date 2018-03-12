/*
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
  
    private Colour pc; 
    private Bead b;
    
    public void placeBead()
    {
    
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
    private Colour colourAt(Bead[] b){
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
         case 1:
             if ((colourAt(aLine[0],aLine[2],aLine[3]))==pc){return true;}
             else if ((colourAt(aLine[5],aLine[9],aLine[13])==pc)){return true;}
             else if (colourAt(aLine[5],aLine[10],aLine[15])==pc){return true;}
             else {return false;}
        case 2:
             if ((colourAt(aLine[0],aLine[2],aLine[3]))==pc){return true;}
             else if ((colourAt(aLine[5],aLine[9],aLine[13])==pc)){return true;}
             else if (colourAt(aLine[5],aLine[10],aLine[15])==pc){return true;}
             else {return false;}
        case 3:
             if ((colourAt(aLine[0],aLine[2],aLine[3]))==pc){return true;}
             else if ((colourAt(aLine[5],aLine[9],aLine[13])==pc)){return true;}
             else if (colourAt(aLine[5],aLine[10],aLine[15])==pc){return true;}
             else {return false;}
        case 4:
             if ((colourAt(aLine[0],aLine[2],aLine[3]))==pc){return true;}
             else if ((colourAt(aLine[5],aLine[9],aLine[13])==pc)){return true;}
             else if (colourAt(aLine[5],aLine[10],aLine[15])==pc){return true;}
             else {return false;}
           case 5:
             if ((colourAt(aLine[0],aLine[2],aLine[3]))==pc){return true;}
             else if ((colourAt(aLine[5],aLine[9],aLine[13])==pc)){return true;}
             else if (colourAt(aLine[5],aLine[10],aLine[15])==pc){return true;}
             else {return false;}
               case 6:
             if ((colourAt(aLine[0],aLine[2],aLine[3]))==pc){return true;}
             else if ((colourAt(aLine[5],aLine[9],aLine[13])==pc)){return true;}
             else if (colourAt(aLine[5],aLine[10],aLine[15])==pc){return true;}
             else {return false;}
              case 7:
             if ((colourAt(aLine[0],aLine[2],aLine[3]))==pc){return true;}
             else if ((colourAt(aLine[5],aLine[9],aLine[13])==pc)){return true;}
             else if (colourAt(aLine[5],aLine[10],aLine[15])==pc){return true;}
             else {return false;}
               case 8:
             if ((colourAt(aLine[0],aLine[2],aLine[3]))==pc){return true;}
             else if ((colourAt(aLine[5],aLine[9],aLine[13])==pc)){return true;}
             else if (colourAt(aLine[5],aLine[10],aLine[15])==pc){return true;}
             else {return false;}
               case 9:
             if ((colourAt(aLine[0],aLine[2],aLine[3]))==pc){return true;}
             else if ((colourAt(aLine[5],aLine[9],aLine[13])==pc)){return true;}
             else if (colourAt(aLine[5],aLine[10],aLine[15])==pc){return true;}
             else {return false;}
               case 10:
             if ((colourAt(aLine[0],aLine[2],aLine[3]))==pc){return true;}
             else if ((colourAt(aLine[5],aLine[9],aLine[13])==pc)){return true;}
             else if (colourAt(aLine[5],aLine[10],aLine[15])==pc){return true;}
             else {return false;}
               case 11:
             if ((colourAt(aLine[0],aLine[2],aLine[3]))==pc){return true;}
             else if ((colourAt(aLine[5],aLine[9],aLine[13])==pc)){return true;}
             else if (colourAt(aLine[5],aLine[10],aLine[15])==pc){return true;}
             else {return false;}
               case 12:
             if ((colourAt(aLine[0],aLine[2],aLine[3]))==pc){return true;}
             else if ((colourAt(aLine[5],aLine[9],aLine[13])==pc)){return true;}
             else if (colourAt(aLine[5],aLine[10],aLine[15])==pc){return true;}
             else {return false;}
              
     }
           
     return false;   
    }

    public Colour assignColour(Colour c)//or tracks color
    {
      if (pc == isWhite())
      {
      HumanPlayer.reset();
      HumanPlayer.StartGameAs(isWhite());
      ai.reset();
      ai.StartGameAs(isBlack());
      
      }
      else 
      {
      HumanPlayer.reset();
      HumanPlayer.StartGameAs(isBlack());
      ai.reset();
      ai.StartGameAs(isWhite());
      }
    }
    //not sure yet
    public void startGame()
    {
    
    }
}