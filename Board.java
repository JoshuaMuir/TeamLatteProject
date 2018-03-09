package ca.unbc.cpsc.latte;

public class Board {

    //vars private or public final?
    public final Line[] sx0 = new Line[16]; //refers to face where x is zero
    public final Line[] sy0 = new Line[16];
    public final Peg[] sz0 = new Peg[16];
    public final Line[] ssx0 = new Line[8];
    public final Line[] ssy0 = new Line[8];
    public final Line[] ssz0 = new Line[8];
    public final Line[] ds = new Line[4];//ds[0] is at origin
    //ds[1] is at 400, ds[2] is at 440, ds[3] is at 040

    public Board() {
        init(sx0);
        init(sy0);
        init(sz0);
        init(ssx0);
        init(ssy0);
        init(ssz0);
        init(ds);
    }

    private void init(Line[] lineArray) {
        for (int i = 0; i < lineArray.length; i++) {
            lineArray[i] = new Line();
        }
    }

    private void init(Peg[] pegArray) {
        for (int i = 0; i < pegArray.length; i++) {
            pegArray[i] = new Peg(3 - i / 4, i % 4);
        }
    }

    public Peg getPeg(Location l) {
        int index;
        index = (3 - l.getRow()) * 4 + l.getColumn();
        return sz0[index];
    }

    public void addtoLines(Bead b) {
        int x = b.getColumn();
        int y = b.getRow();
        int z = b.getHeight();

        sx0[(3 - z) * 4 + x].addBead(x, b);
        sy0[(3 - z) * 4 + y].addBead(y, b);

        if (b.getLocation().getIsKey()) {
            if (x == y && y == z) {
                ds[0].addBead(x, b);
            } else if (x == z) {
                ds[1].addBead(x, b);
            } else if (y == x) {
                ds[2].addBead(4 - x, b);
            } else if (z == y) {
                ds[3].addBead(4 - x, b);
            }
        }

        if (y == z) {
            ssx0[2*x].addBead(y, b);
        }else if (y + z == 3 ){
            ssx0[2*x+1].addBead(3-y, b);
        }
        if (x == z) {
            ssy0[2*y].addBead(x, b);
        }else if (x + z == 3 ){
            ssy0[2*y+1].addBead(3-x, b);
        }
        if (x == y) {
            ssz0[2*z].addBead(z, b);
        }else if (x + y == 3 ){
            ssz0[2*z+1].addBead(3-z, b);
        }
    }
}
