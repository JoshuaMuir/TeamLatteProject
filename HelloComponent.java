/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectGraphics;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.io.FileNotFoundException;
import javafx.scene.shape.Circle;

class HelloComponent extends JComponent {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        System.out.println("im in yr method");
if(NotGraphics.peg01==2)System.out.println("what is going on man");
else;
        Graphics2D g2 = (Graphics2D) g;
        Graphics2D g3 = (Graphics2D) g;
        Rectangle rect1 = new Rectangle(20, 400, 800, 500);
        Rectangle rect2 = new Rectangle(200, 300, 800, 500);
        Rectangle rect3 = new Rectangle(500, 300, 10, 100);
        Rectangle rect4 = new Rectangle(600, 300, 10, 100);
        Rectangle rect5 = new Rectangle(700, 300, 10, 100);
        Rectangle rect6 = new Rectangle(800, 300, 10, 100);
        Rectangle rect7 = new Rectangle(400, 300, 10, 100);
        Rectangle[] bricks = new Rectangle[50];
        /*bricks[0]=new Rectangle(400,300,10,100);
bricks[1]=new Rectangle(350,300,10,100);
bricks[2]=new Rectangle(300,300,100,100);
bricks[3]=new Rectangle(250,300,10,100);
bricks[4]=new Rectangle(200,300,10,100);
bricks[5]=new Rectangle(100,300,10,100);
bricks[6]=new Rectangle(50,300,10,100);

         */
        int counter = 0;
        int xcoord = 190;
        int ycoord = 290;
        int length = 10;
        int width = 100;
        while (counter < 4) {

            bricks[counter] = new Rectangle(xcoord, ycoord, length, width);

            xcoord += 70;
            ycoord += 50;
            ++counter;
        }
        xcoord = 290;
        ycoord = 270;
        while (counter < 8) {

            bricks[counter] = new Rectangle(xcoord, ycoord, length, width);

            xcoord += 68;
            ycoord += 48;
            ++counter;
        }

        xcoord = 390;
        ycoord = 250;
        while (counter < 12) {

            bricks[counter] = new Rectangle(xcoord, ycoord, length, width);

            xcoord += 65;
            ycoord += 45;
            ++counter;
        }

        xcoord = 520;
        ycoord = 220;
        while (counter < 16) {

            bricks[counter] = new Rectangle(xcoord, ycoord, length, width);

            xcoord += 60;
            ycoord += 40;
            ++counter;
        }

        Circle circ3 = new Circle(500, 400, 50);
        Circle circ4 = new Circle(500, 300, 50);
        Circle circ5 = new Circle(500, 300, 50);
        Rectangle[] guy = new Rectangle[110];
        g2.fill(rect3);
        int i = 0;
        int spot = -300;
        int trot = 300;
        int kret = 30;
        int fret = 300;
        do {

            guy[i] = new Rectangle(spot, trot, kret, fret);

            spot += 5;
            trot += 5;
            if (i % 3 == 0) {
                kret -= 1;
                fret -= 1;
            } else;
            ++i;
        } while (i < 100);

//g2.setColor(Color.green);
//g2.fill(rect1);
        g2.setColor(Color.black);
//g2.fill(guy[0]);
//g2.fill(guy[1]);
        Area[] ctr = new Area[110];
        int j = 0;
        ctr[0] = new Area(guy[0]);
        while (j < 90) {
            ctr[j] = new Area(guy[j]);

            ++j;

        }
        j = 0;
        while (j < 80) {

            g2.setColor(Color.red);
            //ctr[j]=new Area(guy[j]);  
            //ctr[j].add(new Area(guy[j]));
            j++;
           // System.out.println("irks");
            if (j < 75 && j > 2) {
                ctr[j].add(new Area(guy[j - 1]));
             //   System.out.print("orks");
            } else;
        }

//g2.setColor(Color.white);
//g2.fill(rect3);
        j = 2;
        g2.rotate(Math.toRadians(-60));
        while (j < 70) {
            g2.fill(ctr[j]);
            ++j;
        }
        g2.setColor(Color.red);
//g2.fill(ar2);
        g2.setColor(Color.black);
        Rectangle prop1 = new Rectangle(500, 400, 30, 200);
        Area jirp1 = new Area(prop1);
        ctr[j].add(new Area(jirp1));
//g2.fill(ctr[j]);
        g3.rotate(Math.toRadians(60));
//g3.fill(rect3);
//g3.fill(rect4);
//g3.fill(rect5);
//g3.fill(rect6);
//g3.fill(rect7);
        g3.fill(bricks[1]);
        g2.setColor(Color.white);
        Ellipse2D.Double circle = new Ellipse2D.Double(180, 360, 30, 30);
        xcoord = 180;
        ycoord = 360;
        byte dia1 = 30;
        Ellipse2D.Double[] tricycle = new Ellipse2D.Double[50];
        for (int r = 0; r < 32; ++r) {

            tricycle[r] = new Ellipse2D.Double(xcoord, ycoord, dia1, dia1);
            ycoord -= 30;
            if (r == 3) {
                xcoord=248;
                ycoord =410;
            } else;
            if(r==7){
            xcoord=310;
            ycoord=460;
            }
        }
        g2.setColor(Color.black);
//g2.draw(circle);
        g2.setColor(Color.white);
//g2.fill(circle);
        if(NotGraphics.peg01==2)
            System.out.println("what is going on");
        else;
        g2.setColor(Color.black);

        for (int q = 0; q < 16; ++q) {

            g3.fill(bricks[q]);
        } 
        
        
        g2.setColor(Color.white);
        if (NotGraphics.peg00 >=1||NotGraphics.peg00==2) {
            System.out.println("now we are here");
            g2.fill(tricycle[0]);
        } else;
        if (NotGraphics.peg00 >= 2) {
            g2.fill(tricycle[1]);
        } else;
        
        if(NotGraphics.peg00>=3){
            g2.fill(tricycle[2]);
        } else;
        
        if(NotGraphics.peg00>=4){
        
            g2.fill(tricycle[5]);
        } else;
         System.out.println("we are before the if");   
        System.out.println("we are also before the if");
         
         if(NotGraphics.peg01 >= 2){
        System.out.println("We are in things");
            g2.fill(tricycle[5]);}
        
        else;
        
        if (NotGraphics.peg01 ==1||NotGraphics.peg01==2) {
            g2.fill(tricycle[4]);

        }else; 
        
        System.out.println("we are before the if");   
        if(NotGraphics.peg01 >= 2){
        System.out.println("We are in things");
            g2.fill(tricycle[5]);}
        
        else;
        
        
        if(NotGraphics.peg02>=1)
            g2.fill(tricycle[8]);
        else;
        if(NotGraphics.peg02>=2){
            g2.fill(tricycle[9]);
        System.out.println("what is this");}
        else;
//switch(NotGraphics.boot){
//    case 1: g2.fill(tricycle[0]);
//    case 2: g2.fill(tricycle[1]);
//
//}
        g2.setColor(Color.white);
//g2.fill(circle);
        g2.setColor(Color.black);
    }
}

