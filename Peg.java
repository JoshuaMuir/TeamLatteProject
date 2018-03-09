package ca.unbc.cpsc.latte;

import java.util.ArrayList;

public class Peg extends Line{
    private final int myRow;
    private final int myCol;
    /*What the grid of pegs looks like:
    row     peg index number in array
    3       0   1   2   3
    2       4   5   6   7
    1       8   9   10  11
    0       12  13  14  15
    
    column  0   1   2   3
    */

    public Peg(int r, int c) {
        super();
        myRow = r;
        myCol = c;
    }
    
    public int getRow(){
        return myRow;
    }
    public int getColumn(){
        return myCol;
    }
    
    @Override
    public void addBead(int i, Bead b) {//i is not used for anything here
        //but it is necessary for the line object which it extends
        super.addBead(length, b);
        //using location of bead, add to appropriate lines;

    }

}
