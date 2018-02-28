/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.unbc.cpsc.latte;
import ca.unbc.cpsc.latte.Loc3d;
import ca.unbc.cpsc.latte.Loc2d;
import ca.unbc.cpsc.latte.Bead;
import ca.unbc.cpsc.latte.player;
import ca.unbc.cpsc.latte.AI;
import ca.unbc.cpsc.latte.rules;//not sure if we are making this as a class or not.
/**
 *
 * @author ryans
 */
public class Referee {
    public void reset()
    {
    //restarts the game or starts it
    }
    public void placeBead()
    {
    //communicates with the bead to the peg
    //isnt this the bead or player class job?
        //no the referee will be the one keeping track of the board and placing beads. remember that ref only places a bead
        //if the move is legal
    //checkmove
    }
    public void displayBoard()
    {
    //displays the board
    }
    public void checkMove(Location l)
    {
    //communicates with loc3d and loc2d
    //maybe the rules to check
    //checks if its a valid move
    }
    public void checkWin(Location l)
    {
    //communicates with loc3d and loc2d
    //maybe the rules to check
    //notify the players who won
    }
    public void assignColour()//or tracks color
    {
    //who the black or white is
    }
    public void rules()
    {
    //if we are not doing a rules class
   
    }
   
}
