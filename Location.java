/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ca.unbc.cpsc.latte;//ask about interfaces package?

/**
 *
 * @author jho
 */
public interface Location {
    public static final int MAX_ROW = 3;
    public static final int MIN_ROW = 0;
    public static final int MAX_COLUMN = 3;
    public static final int MIN_COLUMN = 0;
    
    public abstract int getRow();
    public abstract int getColumn();
}
