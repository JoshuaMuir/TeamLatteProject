package ca.unbc.cpsc.latte;

import ca.unbc.cpsc.score4.interfaces.*;
import static ca.unbc.cpsc.latte.NotGraphics.joey;

public class Board {

    protected final Line[] sx0 = new Line[16]; //refers to face where x is zero
    protected final Line[] sy0 = new Line[16];
    protected final Peg[] sz0 = new Peg[16];
    protected final Line[] ssx0 = new Line[8];
    protected final Line[] ssy0 = new Line[8];
    protected final Line[] ssz0 = new Line[8];
    protected final Line[] ds = new Line[4];//ds[0] is at origin
    //ds[1] is at 400, ds[2] is at 440, ds[3] is at 040
    private boolean hasWin = false;
    private Loc3d vitalMove;
    private boolean isVital;
    public boolean whowon;

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
            lineArray[i] = new Line(this);
        }
    }

    public boolean getIsVital() {
        return isVital;
    }

    public void setIsVital() {
        isVital = true;
    }

    //added
    public Loc3d getVitalMove() {
        return vitalMove;
    }

    public void setVitalMove(Loc3d l) {
        vitalMove = l;
    }

    public void changehasWin(boolean b) {
        hasWin = b;
    }

    public boolean gethasWin() {
        return hasWin;
    }

    private void init(Peg[] pegArray) {
        for (int i = 0; i < pegArray.length; i++) {
            pegArray[i] = new Peg(3 - i / 4, i % 4);
        }
    }

    public Peg getPeg(Location l) {
        int index;
        l.getRow();
        index = (3 - l.getRow()) * 4 + l.getColumn();
        return sz0[index];
    }

    public void addtoLines(Bead b) {
        int x = b.getColumn();
        int y = b.getRow();
        System.out.println(b.getColumn());
        System.out.println(b.getRow());
        System.out.println(b.getHeight());
        int z = b.getHeight();
        // System.out.println("this is where it would print null"+x+" "+y+" "+z);
        sx0[(3 - z) * 4 + x].addBead(x, b);
        if (hasWin) {
            System.out.println("sx0" + ((3 - z) * 4 + x));
            if (whowon) {
                joey.whomstdveWon(PlayerColour.w);
            } else {
                joey.whomstdveWon(PlayerColour.b);
            }

        }
        sy0[(3 - z) * 4 + y].addBead(y, b);
        if (hasWin) {
            System.out.println("sy0" + ((3 - z) * 4 + y));
            if (whowon) {
                joey.whomstdveWon(PlayerColour.w);
            } else {
                joey.whomstdveWon(PlayerColour.b);
            }

        }

        if (b.getLocation().getIsKey()) {
            if (x == y && y == z) {
                ds[0].addBead(x, b);
                if (hasWin) {
                    if (whowon) {
                        System.out.println("ds0");
                        joey.whomstdveWon(PlayerColour.w);
                    } else {
                        System.out.println("ds0");
                        joey.whomstdveWon(PlayerColour.b);
                    }

                }
            } else if ((x == z) && (x + y) == 3) {

                ds[1].addBead(x, b);
                if (hasWin) {
                    System.out.println("ds1");
                    if (whowon) {

                        joey.whomstdveWon(PlayerColour.w);
                    } else {
                        joey.whomstdveWon(PlayerColour.b);
                    }

                }
            } else if ((y == x) && (z == x)) {

                ds[2].addBead(4 - x, b);
                if (hasWin) {
                    System.out.println("ds2");
                    if (whowon) {

                        joey.whomstdveWon(PlayerColour.w);
                    } else {
                        joey.whomstdveWon(PlayerColour.b);
                    }

                }
            } else if ((z == y) && ((z + x) == 3)) {

                ds[3].addBead(4 - x, b);
                if (hasWin) {
                    System.out.println("ds3");
                    if (whowon) {
                        joey.whomstdveWon(PlayerColour.w);
                    } else {
                        joey.whomstdveWon(PlayerColour.b);
                    }

                }
            }
        }

        if (y == z) {

            ssx0[2 * x].addBead(y, b);
            if (hasWin) {
                System.out.println("ssx0" + (2 * x));
                if (whowon) {
                    joey.whomstdveWon(PlayerColour.w);
                } else {
                    joey.whomstdveWon(PlayerColour.b);
                }

            }
        } else if (y + z == 3) {
            ssx0[2 * x + 1].addBead(3 - y, b);
            if (hasWin) {
                System.out.println("ssx0" + (2 * x + 1));
                if (whowon) {
                    joey.whomstdveWon(PlayerColour.w);
                } else {
                    joey.whomstdveWon(PlayerColour.b);
                }

            }
        }
        if (x == z) {
            ssy0[2 * y].addBead(x, b);
            if (hasWin) {
                System.out.println("ssy0" + (2 * y));
                if (whowon) {
                    joey.whomstdveWon(PlayerColour.w);
                } else {
                    joey.whomstdveWon(PlayerColour.b);
                }

            }
        } else if (x + z == 3) {
            ssy0[2 * y + 1].addBead(3 - x, b);
            if (hasWin) {
                System.out.println("ssy0" + (2 * y + 1));
                if (whowon) {
                    joey.whomstdveWon(PlayerColour.w);
                } else {
                    joey.whomstdveWon(PlayerColour.b);
                }

            }
        }
        if (x == y) {
            ssz0[2 * z].addBead(z, b);
            if (hasWin) {
                System.out.println("ssz0" + (2 * z));
                if (whowon) {
                    joey.whomstdveWon(PlayerColour.w);
                } else {
                    joey.whomstdveWon(PlayerColour.b);
                }

            }
        } else if (x + y == 3) {
            ssz0[2 * z + 1].addBead(3 - z, b);
            if (hasWin) {
                System.out.println("ssz0" + (2 * z));
                if (whowon) {
                    joey.whomstdveWon(PlayerColour.w);
                } else {
                    joey.whomstdveWon(PlayerColour.b);
                }

            }
        }
    }
}
