package ca.unbc.cpsc.latte;
//four unique bead locations, but two types of beads?
//000 - paths: 3 straights, 3 singles, 1 double

import ca.unbc.cpsc.score4.interfaces.Location;
import ca.unbc.cpsc.score4.interfaces.Colour;

//100 - paths: 3 straights, 1 single 
//101 - paths: 3 straights, 1 single
//111 - paths: 3 straights, 3 singles, 1 double
//16 type 1
//48 type 2
//singles occur if a bead is at the same location on two straights
//doubles occur if a bead is at the same location on three straights
public class Bead{

    private final PlayerColour c;
    private final Loc3d l;
    

    public Bead(PlayerColour co, Location argL, int h) {
        c = co;
        l = new Loc3d(argL.getRow(), argL.getColumn(),h);
    }

    //method that accepts interface can accept any class that
    //implements said interface
    public Loc3d getLocation() {
        return l;
    }
    
    public int getRow(){
        return l.getRow();
    }
    
    public int getColumn(){
        return l.getColumn();
    }
    
    public int getHeight(){
        return l.getHeight();
    }

    public Colour getColour() {
        return c;
    }
    
    public boolean isBlack(){

       return c==PlayerColour.b;
        /*c.isBlack();
        System.out.println("We are after isBlack now12423452345234");
        return (c.isBlack());*/
        
    }
}