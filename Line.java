package ca.unbc.cpsc.latte;

import static ca.unbc.cpsc.latte.NotGraphics.joey;

public class Line {

    private int length = 0;
    protected Bead[] beadlist = new Bead[4];
    public int t = 0;
    public int j = 0;
    //beadlist[0] is at lowest possible height, col, row
    //goes, left to right, bottom to top, smallest row position to largest
    private final Board board;

    public Line(Board b) {

        board = b;
    }

    public void addBead(int i, Bead b) {

        if (this.length < 4) {

            beadlist[j] = b;
            j++;
            ++length;
        }
        if (length == 4) {

            if (beadlist[0].isBlack()
                    == beadlist[1].isBlack()
                    && beadlist[1].isBlack() == beadlist[2].isBlack()
                    && beadlist[2].isBlack() == beadlist[3].isBlack()) {
                
                if (beadlist[0].isBlack()) {
                    joey.whomstdveWon(PlayerColour.b);
                } else {
                    joey.whomstdveWon(PlayerColour.w);
                }

            } else;
        } else ;
        //request different move

    }

    public final int getLength() {
        return length;
    }

}
