/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgraphics;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javafx.scene.shape.Circle;

class HelloComponent extends JComponent {
    public static ArrayList<Integer> gold=new ArrayList<Integer>();
    public static int whey=0;
    public static int whey2;
    public static Graphics2D g2;
    public static Ellipse2D.Double[] tricycle;
    public static int[] coward=new int[90]; 
    public static int theNum;
   
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        theNum=0;
        Color myColor=new Color(222,184,135);
        Color hisColor=new Color(211,211,211);
     if(whey==0) create();
        ++whey;
        System.out.println("im in yr method");
        if (NotGraphics.peg01 == 2) {
            System.out.println("what is going on man");
        } else;
        g2 = (Graphics2D) g;
        Graphics2D g3 = (Graphics2D) g;
        Rectangle rect1 = new Rectangle(20, 400, 800, 500);
        Rectangle rect2 = new Rectangle(200, 300, 800, 500);
        Rectangle rect3 = new Rectangle(500, 300, 10, 100);
        Rectangle rect4 = new Rectangle(600, 300, 10, 100);
        Rectangle rect5 = new Rectangle(700, 300, 10, 100);
        Rectangle rect6 = new Rectangle(800, 300, 10, 100);
        Rectangle rect7 = new Rectangle(400, 300, 10, 100);
        Rectangle[] bricks = new Rectangle[50];

        int counter = 0;
        int xcoord = 190;
        int ycoord = 290;
        int length = 10;
        int width = 100;
          g2.setColor(hisColor);
          g2.setColor(Color.white);
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

        xcoord = 500;
        ycoord = 233;
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

            g2.setColor(myColor);
            
            j++;
            // System.out.println("irks");
            if (j < 75 && j > 2) {
                ctr[j].add(new Area(guy[j - 1]));
                //   System.out.print("orks");
            } else;
        }


        j = 2;
        g2.rotate(Math.toRadians(-60));
        while (j < 65) {
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
        g3.fill(bricks[1]);
        g2.setColor(Color.white);
        Ellipse2D.Double circle = new Ellipse2D.Double(180, 360, 30, 30);
        xcoord = 180;
        ycoord = 360;
        byte dia1 = 30;
        
         tricycle = new Ellipse2D.Double[80];
        for (int r = 0; r < 70; ++r) {

            tricycle[r] = new Ellipse2D.Double(xcoord, ycoord, dia1, dia1);
            ycoord -= 30;
            if (r == 3) {
                xcoord = 248;
                ycoord = 410;
            } else;
            if (r == 7) {
                xcoord = 318;
                ycoord = 460;
            } else;
            if (r == 11) {
                xcoord = 388;
                ycoord = 510;
            } else;
            if (r == 15) {
                xcoord = 278;
                ycoord = 340;
            } else;
            if(r==19){
            xcoord=348;
            ycoord=390;
            
            }
            if(r==23){
            xcoord=415;
            ycoord=436;
            
            }else;
            if(r==27){
            xcoord=482;
            ycoord=484;
            
            
            }else;
            if(r==31){
            xcoord=379;
            ycoord=326;
            
            }else;
            if(r==35){
            xcoord=445;
            ycoord=365;
            
            }else;
              if(r==39){
            xcoord=510;
            ycoord=410;
            
            }else;
              if(r==43){
            xcoord=574;
            ycoord=459;
            
            }else;
                if(r==47){
            xcoord=490;
            ycoord=303;
            
            }else;
                if(r==51){
                xcoord=550;
                ycoord=345;
                }
            if(r==55){
            xcoord=610;
            ycoord=383;
            
            }
            if(r==59){
            xcoord=670;
            ycoord=423;
            
            }
        }
        g2.setColor(Color.black);
//g2.draw(circle);
        g2.setColor(Color.white);
//g2.fill(circle);
       
        if (NotGraphics.peg01 >= 2) {
            System.out.println("what is going on");
        } else;
       g2.setColor(Color.black);
         g2.setColor(hisColor);

        for (int q = 0; q < 16; ++q) {

            g3.fill(bricks[q]);
        } if(NotGraphics.whomTurn%2==0)
            g2.setColor(Color.white);
        else g2.setColor(Color.black);

//        g2.setColor(Color.white);
        if (NotGraphics.peg00 >= 1) {
            whatColor(coward[0], 0);
        
        } else;
        intlColor();
        if (NotGraphics.peg00 >= 2) {
            
            whatColor(coward[1],1);
        } else;
        intlColor();
        if (NotGraphics.peg00 >= 3) {
           whatColor(coward[2],2);
        } else;
        intlColor();
        if (NotGraphics.peg00 >= 4) {
            whatColor(coward[3],3);
           
        } else;
     
        intlColor();
        if (NotGraphics.peg01 >= 1) {
           whatColor(coward[4],4);

        } else; 
        intlColor();
        if (NotGraphics.peg01 >= 2) {
           whatColor(coward[5],5);
        } else;
        intlColor();
        if (NotGraphics.peg01 >= 3) {
           whatColor(coward[6],6);
        } else;
        intlColor();
        if (NotGraphics.peg01 >= 4) {
            whatColor(coward[7],7);
        } else;
        intlColor();

        if (NotGraphics.peg02 >= 1) {
            whatColor(coward[8],8);
        } else;
        intlColor();
        if (NotGraphics.peg02 >= 2) {
           whatColor(coward[9],9);
        } else;
        intlColor();
        if (NotGraphics.peg02 >= 3) {
           whatColor(coward[10],10);

        } else;
        intlColor();
        if (NotGraphics.peg02 >= 4) {
            whatColor(coward[11],11);
        } else;
        intlColor();
        if (NotGraphics.peg03 >= 1) {
            whatColor(coward[12],12);
        } else;
        intlColor();
        if (NotGraphics.peg03 >= 2) {
           whatColor(coward[13],13);
        } else;
        intlColor();
        if (NotGraphics.peg03 >= 3) {
           whatColor(coward[14],14);

        } else;  intlColor();
        if (NotGraphics.peg03 >= 4) {
            whatColor(coward[15],15);
        }
        if (NotGraphics.peg10 >= 1) {
            whatColor(coward[16],16);

        } else;  intlColor();
        if (NotGraphics.peg10 >= 2) {
          whatColor(coward[17],17);
        } else;  intlColor();
        if (NotGraphics.peg10 >= 3) {
            whatColor(coward[18],18);

        } else;  intlColor();
        if (NotGraphics.peg10 >= 4) {
           whatColor(coward[19],19);
        }else; intlColor();
        if (NotGraphics.peg11 >= 1) {
            whatColor(coward[20],20);

        } else;  intlColor();
        if (NotGraphics.peg11 >= 2) {
          whatColor(coward[21],21);
        } else;  intlColor();
        if (NotGraphics.peg11 >= 3) {
            whatColor(coward[22],22);

        } else;  intlColor();
        if (NotGraphics.peg11 >= 4) {
           whatColor(coward[23],23);
        }else; intlColor();
        if (NotGraphics.peg12 >= 1) {
            whatColor(coward[24],24);

        } else;  intlColor();
        if (NotGraphics.peg12 >= 2) {
          whatColor(coward[25],25);
        } else;  intlColor();
        if (NotGraphics.peg12 >= 3) {
            whatColor(coward[26],26);

        } else;  intlColor();
        if (NotGraphics.peg12 >= 4) {
           whatColor(coward[27],27);
        }else; intlColor();
        if (NotGraphics.peg13 >= 1) {
            whatColor(coward[28],28);

        } else;  intlColor();
        if (NotGraphics.peg13 >= 2) {
          whatColor(coward[29],29);
        } else;  intlColor();
        if (NotGraphics.peg13 >= 3) {
            whatColor(coward[30],30);

        } else;  intlColor();
        if (NotGraphics.peg13 >= 4) {
           whatColor(coward[31],31);
        }else; intlColor();
          if (NotGraphics.peg20 >= 1) {
            whatColor(coward[32],32);

        } else;  intlColor();
        if (NotGraphics.peg20 >= 2) {
          whatColor(coward[33],33);
        } else;  intlColor();
        if (NotGraphics.peg20 >= 3) {
            whatColor(coward[34],34);

        } else;  intlColor();
        if (NotGraphics.peg20 >= 4) {
           whatColor(coward[35],35);
        }else; intlColor();
         if (NotGraphics.peg21 >= 1) {
            whatColor(coward[36],36);

        } else;  intlColor();
        if (NotGraphics.peg21 >= 2) {
          whatColor(coward[37],37);
        } else;  intlColor();
        if (NotGraphics.peg21 >= 3) {
            whatColor(coward[38],38);

        } else;  intlColor();
        if (NotGraphics.peg21 >= 4) {
           whatColor(coward[39],39);
        }else; intlColor();
        if (NotGraphics.peg22 >= 1) {
            whatColor(coward[40],40);

        } else;  intlColor();
        if (NotGraphics.peg22 >= 2) {
          whatColor(coward[41],41);
        } else;  intlColor();
        if (NotGraphics.peg22 >= 3) {
            whatColor(coward[42],42);

        } else;  intlColor();
        if (NotGraphics.peg22 >= 4) {
           whatColor(coward[43],43);
        }else; intlColor();
        if (NotGraphics.peg23 >= 1) {
            whatColor(coward[44],44);

        } else;  intlColor();
        if (NotGraphics.peg23 >= 2) {
          whatColor(coward[45],45);
        } else;  intlColor();
        if (NotGraphics.peg23 >= 3) {
            whatColor(coward[46],46);

        } else;  intlColor();
        if (NotGraphics.peg23 >= 4) {
           whatColor(coward[47],47);
        }else; intlColor();
        if (NotGraphics.peg30 >= 1) {
            whatColor(coward[48],48);

        } else;  intlColor();
        if (NotGraphics.peg30 >= 2) {
          whatColor(coward[49],49);
        } else;  intlColor();
        if (NotGraphics.peg30 >= 3) {
            whatColor(coward[50],50);

        } else;  intlColor();
        if (NotGraphics.peg30 >= 4) {
           whatColor(coward[51],51);
        }else; intlColor();
                if (NotGraphics.peg31 >= 1) {
            whatColor(coward[52],52);

        } else;  intlColor();
        if (NotGraphics.peg31 >= 2) {
          whatColor(coward[53],53);
        } else;  intlColor();
        if (NotGraphics.peg31 >= 3) {
            whatColor(coward[54],54);

        } else;  intlColor();
        if (NotGraphics.peg31 >= 4) {
           whatColor(coward[55],55);
        }else; intlColor();
                if (NotGraphics.peg32 >= 1) {
            whatColor(coward[56],56);

        } else;  intlColor();
        if (NotGraphics.peg32 >= 2) {
          whatColor(coward[57],57);
        } else;  intlColor();
        if (NotGraphics.peg32 >= 3) {
            whatColor(coward[58],58);

        } else;  intlColor();
        if (NotGraphics.peg32 >= 4) {
           whatColor(coward[59],59);
        }else; intlColor();
                if (NotGraphics.peg33 >= 1) {
            whatColor(coward[60],60);

        } else;  intlColor();
        if (NotGraphics.peg33 >= 2) {
          whatColor(coward[61],61);
        } else;  intlColor();
        if (NotGraphics.peg33 >= 3) {
            whatColor(coward[62],62);

        } else;  intlColor();
        if (NotGraphics.peg33 >= 4) {
           whatColor(coward[63],63);
        }else; intlColor();

        g2.setColor(Color.white);
//g2.fill(circle);
        g2.setColor(Color.black);
    }
public void whatColor(int r, int c){

 if(r==0){
            g2.fill(tricycle[c]);
            coward[c]=NotGraphics.whomTurn;
            }
            else if(coward[c]%2==0){
                g2.setColor(Color.white);
            g2.fill(tricycle[c]);
            } else {g2.setColor(Color.black);
                    g2.fill(tricycle[c]);
            }

}
public void intlColor(){
if(NotGraphics.whomTurn%2==0)
            g2.setColor(Color.white);
        else g2.setColor(Color.black);

}
public void create(){
for(int i=0;i<80;++i){

coward[i]=0;
}
}
}

