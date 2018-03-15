package ca.unbc.cpsc.latte;

 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ca.unbc.cpsc.latte.Colour;
/**
 *
 * @author ryans
 */
public class Referee {
    private Colour aicolour ; 
    private Colour hpcolour;
    private Colour win; 
    private Board board; 
    private Bead b;
    private AI ai;
    private HumanPlayer hp;

    public void placeBead(int i,Colour c,Location ell)
    {
        //communicates with the bead to the peg
        //checkmoves then places the bead
        //if checkkmove is true then place bead
        Loc3d ell3d = (Loc3d) ell;
       		if (b.getHeight()<i)
        	board.getPeg(ell3d).addBead(i, (Bead) c);
    }

//    public boolean checkMove(Location ell)
//    {
//
//    }
    public void checkWin()
    {

      //notify who has won
      if (board.gethasWin()==true)
      {
         //find what color has won
         win =  b.getColour(); 
         getWinner();
      }
       

    }
    //gets the winner
    public Colour getWinner()
    {
        if (hpcolour==win)
            {
                return hpcolour;
            }
            else if(aicolour==win)
            {
                return aicolour;
            }
            else 
            {
                return null;
            }
    }
    
    private Colour colourAt(Bead b)
    {  
    Colour c = b.getColour();
    return c;
    }
    public Colour getAI()
    {
    return aicolour;
    }
    public Colour getHumanPlayer()
    {
    return hpcolour;
    }

    public void startGame() throws PlayerException
    {
        ai = new AI();
        hp = new HumanPlayer();
        aicolour =  ai.getColour();
        hpcolour =  hp.getColour();
    }
}

