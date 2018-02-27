package ca.unbc.cpsc.latte;

/**
 *
 * @author jho
 */
public class Loc3d implements Location{
    
    public int row;
    public int col;
    public int height;
    
    public static final int MIN_HEIGHT = 0;
    public static final int MAX_HEIGHT = 3;
    
    public Loc3d(int r, int c, int h){
        if (r > MAX_ROW || r < MIN_ROW && 
            c > MAX_COLUMN || c < MIN_COLUMN &&
            h > MAX_HEIGHT || h < MIN_HEIGHT){
            ;
        }else{
            row = r;
            col = c;
            height = h;
        }
    }  
    
    @Override
    public int getRow(){
        return row;
    }
    
    @Override
    public int getColumn(){
        return col;
    }
    
    public int getHeight(){
        return height;
    }
}
