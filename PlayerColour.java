/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.unbc.cpsc.latte;

import ca.unbc.cpsc.score4.interfaces.Colour;
import ca.unbc.cpsc.score4.enums.wb;

/**
 *
 * @author Jordan
 */
public class PlayerColour implements Colour {

    public static final PlayerColour w = new PlayerColour(true);
    public static final PlayerColour b = new PlayerColour(false);
    private wb c;

    private PlayerColour(boolean b) {
        if (b) {
            c = wb.WHITE;
        } else {
            c = wb.BLACK;
        }
    }

    @Override
    public boolean isWhite() {
        return c == wb.WHITE;
    }

    @Override
    public boolean isBlack() {
        return c == wb.BLACK;
    }
}
