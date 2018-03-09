package ca.unbc.cpsc.latte;

public class Loc3d implements Location {

    private int row;
    private int col;
    private int height;
    private boolean isKey;
    /**key locations are either in the corner or in the center; these are the
    ones that are double skewed and are part of 7 lines
    non-key locations are part of 4 lines and are located on the sides
    * */
    public static final int MIN_HEIGHT = 0;
    public static final int MAX_HEIGHT = 3;

    public Loc3d(int r, int c, int h) {
        row = r;
        col = c;
        height = h;
        setIsKey();
    }

    @Override
    public int getRow() {
        return row;
    }

    @Override
    public int getColumn() {
        return col;
    }

    public int getHeight() {
        return height;
    }

    private final void setIsKey() {
        if (row == col || col == height || height == row) {
            if (row == 2 || row == 3 && col == 2 || col == 3
                    && height == 2 || height == 3) {
                isKey = true;
            } else if (row == 0 || row == 4 && col == 0 || col == 4
                    && height == 0 || height == 4) {
                isKey = true;
            } else {
                isKey = false;
            }
        }
    }

    public final boolean getIsKey() {
        return isKey;
    }
}
