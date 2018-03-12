
package projectgraphics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import java.util.ArrayList;

public class NotGraphics extends JFrame {

    public JFrame froome;
    private JLabel jooble;
    public static int peg00 = 0;
    public static int peg01 = 0;
    public static int peg02 = 0;
    public static int peg03 = 0;
    public static int peg10 = 0;
    public static int peg11=0;
    public static int peg12=0;
    public static int peg13=0;
    public static int peg20=0;
    public static int peg21=0;
     public static int peg22=0;
      public static int peg23=0;
       public static int peg30=0;
        public static int peg31=0;
         public static int peg32=0;
          public static int peg33=0;
    public static int whomTurn=0;
        public static int a=0;
    public static int c=0;
public static int b=0;

    public static void main(String[] args) {
//JLabel jooble=new JLabel("This one");
        runGUI();
    }

    private static void runGUI() {

        //Board bird = new Board();
        HelloComponent hi = new HelloComponent();
//Board bird=new Board();
        JLabel jooble = new JLabel("This one");
        JFrame froome = new JFrame();
        JPanel panool = new JPanel();
        JPanel prandel = new JPanel();
        JPanel pindle = new JPanel();
        JPanel smash = new JPanel();
        JPanel trick = new JPanel();
         JPanel what=new JPanel();
        panool.setLayout(new BoxLayout(panool, BoxLayout.X_AXIS));
        JButton butoon = new JButton("Place beed at 0,0");
        JButton buffoon = new JButton("QUIT");
JButton berten=new JButton("  RESET  ");
        JToggleButton twitch=new JToggleButton("BLACK");
        JToggleButton twitch2=new JToggleButton("WHITE");
          what.add(twitch2);
          //what.add(butoon); 
          what.add(twitch);
        what.add(berten);
        berten.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
        peg00=0;
        peg01=0;
        peg02=0;
        peg03=0;
        peg10=0;
        peg11=0;
        peg12=0;
        peg13=0;
        peg20=0;
        peg21=0;
        peg22=0;
        peg23=0;
        peg30=0;
        peg31=0;
        peg32=0;
        peg33=0;
                
                
        whomTurn=0;
        
        froome.setSize(1001,900);
        froome.setSize(1000,900);
        
        }});
buffoon.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent ae){
          
          System.exit(0);
          
          
          }
      
      });
twitch.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                if(c==1)twitch.removeActionListener(this);else{
                    a++;
                
                System.out.println("whats this");
                twitch.removeActionListener(this);}
                
                
                }
        
        
        });
        twitch2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                if(a==1)
                    twitch2.removeActionListener(this);else{
                    c++;
                    ++whomTurn;
                System.out.println("this worked");
                twitch2.removeActionListener(this);}
                }
        
        
        });
        //ActionListener kurt = new doActionListener();
        panool.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println(e.getX() + " " + e.getY());
                if ((e.getX() > 185 && e.getX() < 205) && e.getY() > 330 && e.getY() < 440) {
                    ++peg00;
                    ++whomTurn;
                    HelloComponent hi = new HelloComponent();
                    froome.setSize(1001, 900);
                    froome.setSize(1000, 900);
                    System.out.println("peg00 is" + peg00);
                    System.out.println("peg01 is" + peg01);
                } else if ((e.getX() > 255 && e.getX() < 275) && e.getY() > 390 && e.getY() < 482) {
                    ++peg01;
                    ++whomTurn;
 
                    System.out.println("peg 00 is" + peg00);
                    System.out.println("peg 01 is" + peg01);
                    jooble.setText("hi");
                    HelloComponent hi = new HelloComponent();
                    froome.setSize(1001, 900);
                    froome.setSize(1000, 900);


                } else if ((e.getX() > 325 && e.getX() < 345) && e.getY() > 437 && e.getY() < 534) {
                    ++peg02;
                    ++whomTurn;
                    HelloComponent hi = new HelloComponent();

                    froome.setSize(1001, 900);
                    froome.setSize(1000, 900);

                    System.out.println("peg 00 is" + peg00);
                    System.out.println("peg 02 is" + peg02);


                } else if ((e.getX() > 395 && e.getX() < 415) && e.getY() > 477 && e.getY() < 584) {

                    ++peg03;
                    ++whomTurn;
                    HelloComponent hi = new HelloComponent();
                    froome.setSize(1001, 900);
                    froome.setSize(1000, 900);

                    System.out.println("peg 00 is" + peg00);
                    System.out.println("peg 02 is" + peg02);
                    jooble.setText("hi");
                 

                } else if ((e.getX() > 285 && e.getX() < 305) && e.getY() > 310 && e.getY() < 410) {

                    ++peg10;
                    ++whomTurn;
                    HelloComponent hi = new HelloComponent();
                    froome.setSize(1001, 900);
                    froome.setSize(1000, 900);
                    System.out.println("peg 00 is" + peg00);
                    System.out.println("peg 02 is" + peg02);
                 
                } else if ((e.getX() > 355 && e.getX() < 375) && e.getY() > 370 && e.getY() < 450) {
                    ++peg11;
                    ++whomTurn;
                    HelloComponent hi = new HelloComponent();
                    froome.setSize(1001, 900);
                    froome.setSize(1000, 900);
                    System.out.println("peg00 is" + peg00);
                    System.out.println("peg01 is" + peg01);
                }else if ((e.getX() > 420 && e.getX() < 440) && e.getY() > 410 && e.getY() < 510) {
                    ++peg12;
                    ++whomTurn;
                    HelloComponent hi = new HelloComponent();
                    froome.setSize(1001, 900);
                    froome.setSize(1000, 900);
                    System.out.println("peg00 is" + peg00);
                    System.out.println("peg01 is" + peg01);
                } else if ((e.getX() > 490 && e.getX() < 510) && e.getY() > 460 && e.getY() < 560) {
                    ++peg13;
                    ++whomTurn;
                    HelloComponent hi = new HelloComponent();
                    froome.setSize(1001, 900);
                    froome.setSize(1000, 900);
                    System.out.println("peg00 is" + peg00);
                    System.out.println("peg01 is" + peg01);
                } else if ((e.getX() > 385 && e.getX() < 405) && e.getY() > 300 && e.getY() < 395) {
                    ++peg20;
                    ++whomTurn;
                    HelloComponent hi = new HelloComponent();
                    froome.setSize(1001, 900);
                    froome.setSize(1000, 900);
                    System.out.println("peg00 is" + peg00);
                    System.out.println("peg01 is" + peg01);
                } else if ((e.getX() > 455 && e.getX() < 475) && e.getY() > 345 && e.getY() < 460) {
                    ++peg21;
                    ++whomTurn;
                    HelloComponent hi = new HelloComponent();
                    froome.setSize(1001, 900);
                    froome.setSize(1000, 900);
                    System.out.println("peg00 is" + peg00);
                    System.out.println("peg01 is" + peg01);
                } else if ((e.getX() > 515 && e.getX() < 535) && e.getY() > 390 && e.getY() < 500) {
                    ++peg22;
                    ++whomTurn;
                    HelloComponent hi = new HelloComponent();
                    froome.setSize(1001, 900);
                    froome.setSize(1000, 900);
                    System.out.println("peg00 is" + peg00);
                    System.out.println("peg01 is" + peg01);
                } else if ((e.getX() > 575 && e.getX() < 595) && e.getY() > 430 && e.getY() < 530) {
                    ++peg23;
                    ++whomTurn;
                    HelloComponent hi = new HelloComponent();
                    froome.setSize(1001, 900);
                    froome.setSize(1000, 900);
                    System.out.println("peg00 is" + peg00);
                    System.out.println("peg01 is" + peg01);
                } else if ((e.getX() > 495 && e.getX() < 515) && e.getY() > 280 && e.getY() < 380) {
                    ++peg30;
                    ++whomTurn;
                    HelloComponent hi = new HelloComponent();
                    froome.setSize(1001, 900);
                    froome.setSize(1000, 900);
                    System.out.println("peg00 is" + peg00);
                    System.out.println("peg01 is" + peg01);
                } else if ((e.getX() > 555 && e.getX() < 575) && e.getY() > 320 && e.getY() < 420) {
                    ++peg31;
                    ++whomTurn;
                    HelloComponent hi = new HelloComponent();
                    froome.setSize(1001, 900);
                    froome.setSize(1000, 900);
                    System.out.println("peg00 is" + peg00);
                    System.out.println("peg01 is" + peg01);
                } else if ((e.getX() > 615 && e.getX() < 635) && e.getY() > 360 && e.getY() < 460) {
                    ++peg32;
                    ++whomTurn;
                    HelloComponent hi = new HelloComponent();
                    froome.setSize(1001, 900);
                    froome.setSize(1000, 900);
                    System.out.println("peg00 is" + peg00);
                    System.out.println("peg01 is" + peg01);
                } else if ((e.getX() > 675 && e.getX() < 695) && e.getY() > 400 && e.getY() < 500) {
                    ++peg33;
                    ++whomTurn;
                    HelloComponent hi = new HelloComponent();
                    froome.setSize(1001, 900);
                    froome.setSize(1000, 900);
                    System.out.println("peg00 is" + peg00);
                    System.out.println("peg01 is" + peg01);
                }

            }
        });
        jooble.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                System.out.println("Clicked");
            }
        });
        buffoon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                ++peg01;
                HelloComponent hi = new HelloComponent();

            }
        });
        butoon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                ++peg00;
                HelloComponent hi = new HelloComponent();
                //GoodbyeComponent bye = new GoodbyeComponent();
                System.out.println("workds");
                System.out.println(peg00);
                jooble.setText("hi");
                if (peg00 == 2) {
                    jooble.setText("bye");
                } else;
            
            }
        });

        panool.add(hi);
        pindle.add(hi);
        smash.add(jooble);
        panool.setLayout(new BorderLayout());
        prandel.setLayout(new FlowLayout());
        prandel.setSize(100, 100);

        trick.add(buffoon);
        prandel.add(trick, BorderLayout.SOUTH);
     prandel.add(what);
        panool.add(prandel, BorderLayout.NORTH);
        panool.add(pindle, BorderLayout.SOUTH);
        panool.add(jooble, BorderLayout.EAST);

        butoon.setBounds(20, 20, 20, 20);
        butoon.setPreferredSize(new Dimension(200, 25));
        panool.setSize(100, 100);

        froome.setSize(1000, 900);
        froome.setSize(1001, 900);
        froome.setSize(1000, 900);

        froome.setTitle("Score 4");
        froome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        froome.setBackground(Color.red);
        froome.setVisible(true);
        froome.setSize(1001, 900);

        froome.add(panool);

        panool.add(hi);


        System.out.println("hmm");
    }

}