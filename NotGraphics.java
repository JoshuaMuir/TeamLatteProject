package ca.unbc.cpsc.score4.interfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.util.Timer;
import java.util.ArrayList;
import ca.unbc.cpsc.latte.*;
import ca.unbc.cpsc.score4.exceptions.PlayerException;
import java.util.TimerTask;
public class NotGraphics extends JPanel {

    public BufferedImage image;
    public static JFrame mainFrame;
    private static JLabel jooble;
    private static JLabel bottomLabel;
    private static Referee joey=new Referee();
    public static int peg00 = 0;
    public static int peg01 = 0;
    public static int peg02 = 0;
    public static int peg03 = 0;
    public static int peg10 = 0;
    public static int peg11 = 0;
    public static int peg12 = 0;
    public static int peg13 = 0;
    public static int peg20 = 0;
    public static int peg21 = 0;
    public static int peg22 = 0;
    public static int peg23 = 0;
    public static int peg30 = 0;
    public static int peg31 = 0;
    public static int peg32 = 0;
    public static int peg33 = 0;
    public static int whomTurn = 0;
    public static int a = 0;
    public static int c = 0;
    public static int b = 0;
  //  private static final Object lock;
    private static Loc3d lastLoc;
    private static PlayerColour pc;
    public static boolean myTurn = true;

    public NotGraphics() {
        try {
            image = ImageIO.read(new File("/home/jmuir/Downloads"));

        } catch (IOException ex) {

        }

    }
    private static void setLastLoc(Loc3d l){
        lastLoc = l;
    }
    
    public static Loc3d getLastLoc(){
        return lastLoc;
    }
    
    private static void setPlayerColour(boolean b){
        if (b){
            pc = PlayerColour.w;
        }else{
            pc = PlayerColour.b;
        }
    }
    
    public static PlayerColour getPlayerColour(){
        return pc;
    }

    public static void main(String[] args) {
//JLabel jooble=new JLabel("This one");
        runGUI();
    }
    public static void satSome(){
    
        final Runnable doHelloWorld = new Runnable() {
             public void run() {
                 mainFrame.setSize(1001,900);
                 mainFrame.setSize(1000,900);
                 
             }
         };
        Thread appThread = new Thread() {
             public void run() {
                 try {
                     SwingUtilities.invokeAndWait(doHelloWorld);
                     System.out.println("when does this");
                     mainFrame.setSize(1001,900);
                     mainFrame.setSize(1000,900);
                 }
                 catch (Exception e) {
                     e.printStackTrace();
                 }
                // --whomTurn;
                 System.out.println("Finished on " + Thread.currentThread());
             }
         };
         appThread.start();
        mainFrame.setSize(1001,900);
        mainFrame.setSize(1000,900);
        //++whomTurn;
    
    }
    public static void timerThing(int r, int h, int c){
    
    Timer tim=new Timer();
    bottomLabel.setText("AI is thinking...");
    tim.schedule(new TimerTask(){
    public void run(){
    bottomLabel.setText("Click a peg!");
        whatIs(r,h,c);
    
    }
    
    }, 2000);
    
    }
    public static void whatIs(int r, int c, int h){
        
        Thread dogThread=new Thread(){
            public void run(){
        System.out.println(whomTurn+"!!!!!!!!!!");
       ++whomTurn;
        if(r==0&&c==0){
            setLastLoc(new Loc3d(0,0,peg00));
            ++peg00;
        }else if(r==1&&c==0){
            setLastLoc(new Loc3d(1,0,peg01));
            ++peg01;
        }else if(r==2&&c==0){
            setLastLoc(new Loc3d(2,0,peg02));
            ++peg02;
        }else if(r==3&&c==0){
            setLastLoc(new Loc3d(3,0,peg03));
            ++peg03;
        }else if(r==0&&c==1){
            setLastLoc(new Loc3d(0,1,peg10));
            ++peg10;
        }else if(r==1&&c==1){
            setLastLoc(new Loc3d(1,1,peg11));
            ++peg11;
        }else if(r==2&&c==1){
            setLastLoc(new Loc3d(2,1,peg12));
            ++peg12;
        }else if(r==3&&c==1){
            setLastLoc(new Loc3d(3,1,peg13));
            ++peg13;
        }else if(r==0&&c==2){
            setLastLoc(new Loc3d(0,2,peg20));
            ++peg20;
        }else if(r==1&&c==2){
            setLastLoc(new Loc3d(1,2,peg21));
            ++peg21;
        }else if(r==2&&c==2){
            setLastLoc(new Loc3d(2,2,peg22));
            ++peg22;
        }else if(r==3&&c==2){
            setLastLoc(new Loc3d(3,2,peg23));
            ++peg23;
        }else if(r==0&&c==3){
            setLastLoc(new Loc3d(0,3,peg30));
            ++peg30;
        }else if(r==1&&c==3){
            setLastLoc(new Loc3d(1,3,peg31));
            ++peg31;
        }else if(r==2&&c==3){
            setLastLoc(new Loc3d(2,3,peg32));
            ++peg32;
        }else if(r==3&&c==3){
            setLastLoc(new Loc3d(3,3,peg33));
            ++peg33;
        }
 System.out.println("what is ehre");
  
    GameComponent hi = new GameComponent();
                    mainFrame.setSize(1001, 900);
                    mainFrame.setSize(1000, 900);
                  satSome();
                    System.out.println("im sure");
                    //++whomTurn;
                    System.out.println("peg00 is" + peg00);
                    System.out.println("peg01 is" + peg01);
                      mainFrame.setSize(1001, 900);
                    mainFrame.setSize(1000, 900);
                      mainFrame.setSize(1001, 900);
                    mainFrame.setSize(1000, 900);
                      mainFrame.setSize(1001, 900);
                    mainFrame.setSize(1000, 900);
                      mainFrame.setSize(1001, 900);
                    mainFrame.setSize(1200, 900);
            }
        };
        SwingUtilities.invokeLater(dogThread);
        
      
    
                    
    }
    public static void whoIs(int r, int h, int c){
//    Thread godThread=new Thread(){
//        public void Run(){
        System.out.println(whomTurn+"!!!!!!!!!!"); //GameComponent hi = new GameComponent();
      // ++whomTurn;
        if(r==0)++peg00;
    else if(r==1)++peg01;
    else if(r>=2)++peg02;else;
    
 
  System.out.println("now it is invoked");
   
                  
                    System.out.println("peg00 is" + peg00);
                    System.out.println("peg01 is" + peg01);
                      //GameComponent hi = new GameComponent();
//                
//        }
//    };SwingUtilities.invokeLater(godThread);
//    
//    try{
//    SwingUtilities.invokeAndWait(godThread);}catch(Exception e){
//    System.out.println("got him");}
    
    }
    private static void runGUI() {
        PlayerColour grood=new PlayerColour(true);
        PlayerColour brood=new PlayerColour(false);
        HumanPlayer joshuaman=new HumanPlayer();
       // joshuaman.startGameAs(grood);
        //Board bird = new Board();
        GameComponent scoreGame = new GameComponent();
//Board bird=new Board();
         bottomLabel = new JLabel("Please Select A Color!");
//        HumanPlayer Josh = new HumanPlayer();
        mainFrame = new JFrame();
        //Player Josh=new Player();
//        HumanPlayer joshua=new HumanPlayer();
        // Colour old=new Colour();
        JPanel mainPanel = new JPanel();
        JPanel auxillaryPanel = new JPanel();
        JPanel pindle = new JPanel();
        JPanel smash = new JPanel();
        JPanel trick = new JPanel();
        Color myColor = new Color(165, 42, 42);
        JPanel what = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));
        JButton butoon = new JButton("Place beed at 0,0");
        JButton quitButton = new JButton("QUIT");
        JButton resetButton = new JButton("  RESET  ");
        JToggleButton blackButton = new JToggleButton("BLACK");
        JToggleButton whiteButton = new JToggleButton("WHITE");
        what.add(whiteButton);
        bottomLabel.setFont(new Font("Times Roman", Font.BOLD, 48));
        //what.add(butoon); 

        what.add(blackButton);
        what.add(resetButton);
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                peg00 = 0;
                peg01 = 0;
                peg02 = 0;
                peg03 = 0;
                peg10 = 0;
                peg11 = 0;
                peg12 = 0;
                peg13 = 0;
                peg20 = 0;
                peg21 = 0;
                peg22 = 0;
                peg23 = 0;
                peg30 = 0;
                peg31 = 0;
                peg32 = 0;
                peg33 = 0;
                a = 0;
                c = 0;
                b = 0;
                blackButton.setEnabled(true);
                whiteButton.setEnabled(true);
                whiteButton.setSelected(false);
                blackButton.setSelected(false);
                GameComponent.whey = 0;
                whomTurn = 0;

                mainFrame.setSize(1001, 900);
                mainFrame.setSize(1000, 900);
                GameComponent hi = new GameComponent();
                //runGUI();
                //System.exit(4);
            }
        });
        quitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                System.exit(0);

            }

        });
        blackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (c == 1) {
                    return;
                } else if (a == 0) {
                    a++;
                    whomTurn = 0;
//                    joshua.startGameAsNot("white");
                    System.out.println("this shows that the black button is has been pressed");
                    System.out.println("whomTurn is now" + whomTurn);
                    mainFrame.setSize(1000, 900);
                    mainFrame.setSize(1001, 900);
                    blackButton.setEnabled(false);
                    whiteButton.setEnabled(false);
                    setPlayerColour(false);
                    GameComponent hi = new GameComponent();
                    bottomLabel.setText("Now Click a Peg!");
                    //twitch.removeActionListener(this);
                } else {
                    return;
                }

            }

        });
        whiteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.out.println("whom turn is" + whomTurn);
                if (a == 1) {
                    return;
                } else if (c == 0) {
                    c++;
                    whomTurn = 1;
                    mainFrame.setSize(1000, 900);
                    mainFrame.setSize(1001, 900);
                    System.out.println("this shows that the white button is has been pressed");
                    System.out.println("whomTurn is now" + whomTurn);
                    whiteButton.setEnabled(false);
                    blackButton.setEnabled(false);
                    setPlayerColour(true);
                    GameComponent hi = new GameComponent();
                    bottomLabel.setText("Now Click a Peg!");
                    // twitch2.removeActionListener(this);
                } else {
                    return;
                }
            }

        });
        //ActionListener kurt = new doActionListener();
        mainPanel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (a == 0 && c == 0) {
                    bottomLabel.setText("You Must Select A Color First!");
                    System.out.println("you must select a color");
                    return;
                } else {
                    bottomLabel.setText("");
                }
                System.out.println(e.getX() + " " + e.getY());
                if ((e.getX() > 185 && e.getX() < 205) && e.getY() > 330 && e.getY() < 440) {
                    //  ++peg00;
                    // Josh.requestMoveLocation();
                    if (peg00 <= 4) {
                        ++whomTurn;
                    } else;
                    System.out.println("whomturn in this motha "+whomTurn);
                    Loc3d good=new Loc3d(0,0,peg00);
                    //Referee joey=new Referee();
                    try{
                    joey.placeBead(good);
                   // ++whomTurn;
                    joey.doThis();
                    }catch(Exception c){System.out.println("got it");}
                    GameComponent hi = new GameComponent();
//                    mainFrame.setSize(1001, 900);
//                    mainFrame.setSize(1000, 900);
                    System.out.println("peg00 is" + peg00);
                    System.out.println("peg01 is" + peg01);
                } else if ((e.getX() > 255 && e.getX() < 275) && e.getY() > 390 && e.getY() < 482) {
                    //++peg01;
                    if (peg01 <= 4) {
                        ++whomTurn;
                    } else;
                    Loc3d good=new Loc3d(1,0,peg01);
                    Referee joey=new Referee();
                    try{joey.placeBead(good);
                    joey.doThis();}catch(Exception c){System.out.println("got em");}
                    System.out.println("peg 00 is" + peg00);
                    System.out.println("peg 01 is" + peg01);
                    bottomLabel.setText("hi");
                    GameComponent hi = new GameComponent();
                    mainFrame.setSize(1001, 900);
                    mainFrame.setSize(1000, 900);

                } else if ((e.getX() > 325 && e.getX() < 345) && e.getY() > 437 && e.getY() < 534) {
                    //++peg02;
                    if (peg02 <= 4) {
                        ++whomTurn;
                    } else;
                    GameComponent hi = new GameComponent();
                    Loc3d good=new Loc3d(2,0,peg02);
                    //Referee joey=new Referee();
                    try{joey.placeBead(good);
                   // ++whomTurn;
                   
                    joey.doThis();
                    joey.checkWin(good);}catch(Exception c){System.out.println("caught it");}
                    mainFrame.setSize(1001, 900);
                    mainFrame.setSize(1000, 900);

                    System.out.println("peg 00 is" + peg00);
                    System.out.println("peg 02 is" + peg02);

                } else if ((e.getX() > 395 && e.getX() < 415) && e.getY() > 477 && e.getY() < 584) {

                   // ++peg03;
                    if (peg03 <= 4) {
                        ++whomTurn;
                    } else;
                    Loc3d good=new Loc3d(3,0,peg03);
                    //Referee joey=new Referee();
                    try{joey.placeBead(good);
                   // ++whomTurn;
                    joey.doThis();}catch(Exception c){}
                    GameComponent hi = new GameComponent();
                    mainFrame.setSize(1001, 900);
                    mainFrame.setSize(1000, 900);

                    System.out.println("peg 00 is" + peg00);
                    System.out.println("peg 02 is" + peg02);
                    bottomLabel.setText("hi");

                } else if ((e.getX() > 285 && e.getX() < 305) && e.getY() > 310 && e.getY() < 410) {

                   // ++peg10;
                    if (peg10 <= 4) {
                        ++whomTurn;
                    } else;
                    Loc3d good=new Loc3d(0,1,peg10);
                    //Referee joey=new Referee();
                    try{joey.placeBead(good);
                   // ++whomTurn;
                    joey.doThis();}catch(Exception c){}
                    GameComponent hi = new GameComponent();
                    mainFrame.setSize(1001, 900);
                    mainFrame.setSize(1000, 900);
                    System.out.println("peg 00 is" + peg00);
                    System.out.println("peg 02 is" + peg02);

                } else if ((e.getX() > 355 && e.getX() < 375) && e.getY() > 370 && e.getY() < 450) {
                    //++peg11;
                    if (peg11 <= 4) {
                        ++whomTurn;
                    } else;
                    Loc3d good=new Loc3d(1,1,peg11);
                    //Referee joey=new Referee();
                    try{joey.placeBead(good);
                   // ++whomTurn;
                    joey.doThis();}catch(Exception c){}
                    GameComponent hi = new GameComponent();
                    mainFrame.setSize(1001, 900);
                    mainFrame.setSize(1000, 900);
                    System.out.println("peg00 is" + peg00);
                    System.out.println("peg01 is" + peg01);
                } else if ((e.getX() > 420 && e.getX() < 440) && e.getY() > 410 && e.getY() < 510) {
                    //++peg12;
                    if (peg12 <= 4) {
                        ++whomTurn;
                    } else;
                    Loc3d good=new Loc3d(2,1,peg12);
                    //Referee joey=new Referee();
                    try{joey.placeBead(good);
                   // ++whomTurn;
                    joey.doThis();}catch(Exception c){}
                    GameComponent hi = new GameComponent();
                    mainFrame.setSize(1001, 900);
                    mainFrame.setSize(1000, 900);
                    System.out.println("peg00 is" + peg00);
                    System.out.println("peg01 is" + peg01);
                } else if ((e.getX() > 490 && e.getX() < 510) && e.getY() > 460 && e.getY() < 560) {
                    //++peg13;
                    if (peg13 <= 4) {
                        ++whomTurn;
                    } else;
                   try{ Loc3d good=new Loc3d(3,1,peg13);
                    //Referee joey=new Referee();
                    joey.placeBead(good);
                   // ++whomTurn;
                    joey.doThis();}catch(Exception c){}
                    GameComponent hi = new GameComponent();
                    mainFrame.setSize(1001, 900);
                    mainFrame.setSize(1000, 900);
                    System.out.println("peg00 is" + peg00);
                    System.out.println("peg01 is" + peg01);
                } else if ((e.getX() > 385 && e.getX() < 405) && e.getY() > 300 && e.getY() < 395) {
                   // ++peg20;
                    if (peg20 <= 4) {
                        ++whomTurn;
                    } else;
                    Loc3d good=new Loc3d(0,2,peg20);
                    //Referee joey=new Referee();
                    try{joey.placeBead(good);
                   // ++whomTurn;
                    joey.doThis();}catch(Exception c){}
                    GameComponent hi = new GameComponent();
                    mainFrame.setSize(1001, 900);
                    mainFrame.setSize(1000, 900);
                    System.out.println("peg00 is" + peg00);
                    System.out.println("peg01 is" + peg01);
                } else if ((e.getX() > 455 && e.getX() < 475) && e.getY() > 345 && e.getY() < 460) {
                  //  ++peg21;
                    if (peg21 <= 4) {
                        ++whomTurn;
                    } else;
                   try{ Loc3d good=new Loc3d(1,2,peg21);
                    //Referee joey=new Referee();
                    joey.placeBead(good);
                   // ++whomTurn;
                    joey.doThis();}catch(Exception c){}
                    GameComponent hi = new GameComponent();
                    mainFrame.setSize(1001, 900);
                    mainFrame.setSize(1000, 900);
                    System.out.println("peg00 is" + peg00);
                    System.out.println("peg01 is" + peg01);
                } else if ((e.getX() > 515 && e.getX() < 535) && e.getY() > 390 && e.getY() < 500) {
                   // ++peg22;
                    if (peg22 <= 4) {
                        ++whomTurn;
                    } else;
                   try{ Loc3d good=new Loc3d(2,2,peg22);
                    //Referee joey=new Referee();
                    joey.placeBead(good);
                   // ++whomTurn;
                    joey.doThis();}catch(Exception c){}
                    GameComponent hi = new GameComponent();
                    mainFrame.setSize(1001, 900);
                    mainFrame.setSize(1000, 900);
                    System.out.println("peg00 is" + peg00);
                    System.out.println("peg01 is" + peg01);
                } else if ((e.getX() > 575 && e.getX() < 595) && e.getY() > 430 && e.getY() < 530) {
                   // ++peg23;
                    if (peg23 <= 4) {
                        ++whomTurn;
                    } else;
                   try{ Loc3d good=new Loc3d(3,2,peg23);
                    //Referee joey=new Referee();
                    joey.placeBead(good);
                   // ++whomTurn;
                    joey.doThis();}catch(Exception c){}
                    GameComponent hi = new GameComponent();
                    mainFrame.setSize(1001, 900);
                    mainFrame.setSize(1000, 900);
                    System.out.println("peg00 is" + peg00);
                    System.out.println("peg01 is" + peg01);
                } else if ((e.getX() > 495 && e.getX() < 515) && e.getY() > 280 && e.getY() < 380) {
                    //++peg30;
                    if (peg30 <= 4) {
                        ++whomTurn;
                    } else;
                    try{Loc3d good=new Loc3d(0,3,peg30);
                    //Referee joey=new Referee();
                    joey.placeBead(good);
                   // ++whomTurn;
                    joey.doThis();}catch(Exception c){}
                    GameComponent hi = new GameComponent();
                    mainFrame.setSize(1001, 900);
                    mainFrame.setSize(1000, 900);
                    System.out.println("peg00 is" + peg00);
                    System.out.println("peg01 is" + peg01);
                } else if ((e.getX() > 555 && e.getX() < 575) && e.getY() > 320 && e.getY() < 420) {
                   // ++peg31;
                    if (peg31 <= 4) {
                        ++whomTurn;
                    } else;
                    try{ Loc3d good=new Loc3d(1,3,peg31);
                    //Referee joey=new Referee();
                    joey.placeBead(good);
                   // ++whomTurn;
                    joey.doThis();}catch(Exception c){}
                    GameComponent hi = new GameComponent();
                    mainFrame.setSize(1001, 900);
                    mainFrame.setSize(1000, 900);
                    System.out.println("peg00 is" + peg00);
                    System.out.println("peg01 is" + peg01);
                } else if ((e.getX() > 615 && e.getX() < 635) && e.getY() > 360 && e.getY() < 460) {
                    //++peg32;
                    if (peg32 <= 4) {
                        ++whomTurn;
                    } else;
                     try{Loc3d good=new Loc3d(2,3,peg32);
                    //Referee joey=new Referee();
                    joey.placeBead(good);
                   // ++whomTurn;
                    joey.doThis();}catch(Exception c){}
                    GameComponent hi = new GameComponent();
                    mainFrame.setSize(1001, 900);
                    mainFrame.setSize(1000, 900);
                    System.out.println("peg00 is" + peg00);
                    System.out.println("peg01 is" + peg01);
                } else if ((e.getX() > 675 && e.getX() < 695) && e.getY() > 400 && e.getY() < 500) {
                    //++peg33;
                    if (peg33 <= 4) {
                        ++whomTurn;
                    } else;
                     try{Loc3d good=new Loc3d(3,3,peg33);
                    //Referee joey=new Referee();
                    joey.placeBead(good);
                   // ++whomTurn;
                    joey.doThis();}catch(Exception c){}
                    GameComponent hi = new GameComponent();
                    mainFrame.setSize(1001, 900);
                    mainFrame.setSize(1000, 900);
                    System.out.println("peg00 is" + peg00);
                    System.out.println("peg01 is" + peg01);
                }

            }
        });
        bottomLabel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                System.out.println("Clicked");
            }
        });
        quitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                ++peg01;
                GameComponent hi = new GameComponent();

            }
        });
        butoon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                ++peg00;
                GameComponent hi = new GameComponent();
                //GoodbyeComponent bye = new GoodbyeComponent();
                System.out.println("workds");
                System.out.println(peg00);
                bottomLabel.setText("hi");
                if (peg00 == 2) {
                    bottomLabel.setText("bye");
                } else;

            }
        });

        mainPanel.add(scoreGame);
        pindle.add(scoreGame);
        // smash.add(jooble);
        mainPanel.setLayout(new BorderLayout());
        auxillaryPanel.setLayout(new FlowLayout());
        auxillaryPanel.setSize(100, 100);
        System.out.println("at the bottom");
        trick.add(quitButton);
        auxillaryPanel.add(trick, BorderLayout.SOUTH);
        auxillaryPanel.add(what);
        mainPanel.add(auxillaryPanel, BorderLayout.NORTH);
        //mainPanel.add(pindle, BorderLayout.SOUTH);
        mainPanel.add(bottomLabel, BorderLayout.SOUTH);
        mainPanel.setBackground(myColor);
        butoon.setBounds(20, 20, 20, 20);
        ca.unbc.cpsc.score4.interfaces.NotGraphics.mainFrame.setSize(1001,900);
        butoon.setPreferredSize(new Dimension(200, 25));
        mainPanel.setSize(100, 100);
        mainFrame.getContentPane().setBackground(Color.black);
        mainFrame.setSize(1000, 900);
        mainFrame.setSize(1001, 900);
        mainFrame.setSize(1000, 900);
        mainFrame.setLocation(500, 100);

        mainFrame.setTitle("Score 4");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setBackground(myColor);
        mainFrame.setVisible(true);
        mainFrame.setSize(1001, 900);

        mainFrame.add(mainPanel);

        mainPanel.add(scoreGame);

        System.out.println("hmm");
    }

}
