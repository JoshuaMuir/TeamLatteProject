package ca.unbc.cpsc.latte;

public class Line {

    protected int length = 0;
    protected Bead[] beadlist = new Bead[4];
    //beadlist[0] is at lowest possible height, col, row
    //goes, left to right, bottom to top, smallest row position to largest

    public Line() {

    }

    public void addBead(int i, Bead b) {//i is from 0 to 3
        if (this.length < 4) {
            beadlist[i] = b;
            length++;
            if (length == 4) {
                if (beadlist[0].isBlack() == beadlist[1].isBlack()
                        && beadlist[1].isBlack() == beadlist[2].isBlack()
                        && beadlist[2].isBlack() == beadlist[3].isBlack()) 
                {
                    //return game over somehow
                }
            }
        } else {
            //request different move
        }

    }

    public final int getLength() {
        return length;
    }
}
