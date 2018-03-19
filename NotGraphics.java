package ca.unbc.cpsc.latte;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import sun.audio.*;
import javax.swing.*;
import java.io.*;
import java.io.File;
import java.io.IOException;
import javax.swing.JPanel;
import java.util.Timer;
import java.util.TimerTask;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class NotGraphics extends JPanel {

    /*
    The mainFrame.setSize(1000,900); statements
    that appear to be littered throughout the 
    program appear because we were having trouble
    updating the display at the correct time,
    repaint(), for example did not work, setSize
    method does work.
     */
    public static JFrame mainFrame;
    public static JLabel bottomLabel;
    public static Referee1 joey;
    /*
    The following variables are counters that cause 
    beads to be displayed on the board, the naming
    convention is peg(row)(column).
     */
    public static int peg00 = 0;
    public static int peg01 = 0;
    public static int peg02 = 0;
    public static int peg03 = 0;
    public static int peg10 = 0;
    public static int peg11 = 0;
    public static int peg12 = 0;
    public static int peg13 = 0;
    public static Clip clip;
    public static int peg20 = 0;
    public static int peg21 = 0;
    public static int peg22 = 0;
    public static int peg23 = 0;
    public static int peg30 = 0;
    public static int peg31 = 0;
    public static int peg32 = 0;
    public static int peg33 = 0;
    public static int whomTurn = 0;
    public static int counterBlack = 0;
    public static int counterWhite = 0;
    public static int GameOver = 0;

    public NotGraphics() {
        joey = new Referee1();
    }

    public static void showEndGame() {

        bottomLabel.setText("YOU ARE A WINNER MF");
        ++GameOver;
        mainFrame.setSize(1001,900);
        mainFrame.setSize(1000,900);
    }

//    public static void main(String[] args) {
////JLabel jooble=new JLabel("This one");
//        runGUI();
//    }
    public static void delay() {

        final Runnable doHelloWorld = () -> {
            mainFrame.setSize(1001, 900);
            mainFrame.setSize(1000, 900);
        };
        Thread appThread = new Thread() {
            @Override
            public void run() {
                try {
                    SwingUtilities.invokeAndWait(doHelloWorld);

                    mainFrame.setSize(1001, 900);
                    mainFrame.setSize(1000, 900);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                System.out.println("Finished on " + Thread.currentThread());

            }
        };

        appThread.start();
        mainFrame.setSize(1001, 900);
        mainFrame.setSize(1000, 900);

        //++whomTurn;
    }

    public static void timer(int r, int h, int c) {
        if (Referee1.whoWon != 2) {
            Timer tim = new Timer();
            bottomLabel.setText("AI is thinking...");
            tim.schedule(new TimerTask() {
                public void run() {
                    bottomLabel.setText("Click a peg!");

                    aiPlays(r, h, c);

                }

            }, 100);
        } else;
    }

    public static void aiPlays(int r, int c, int h) {

        Thread dogThread = new Thread() {
            public void run() {

                ++whomTurn;

                if (r == 0 && c == 0) {
                    ++peg00;
                } else if (r == 1 && c == 0) {
                    ++peg01;
                } else if (r == 2 && c == 0) {
                    ++peg02;
                } else if (r == 3 && c == 0) {
                    ++peg03;
                } else if (r == 0 && c == 1) {
                    ++peg10;
                } else if (r == 1 && c == 1) {
                    ++peg11;
                } else if (r == 2 && c == 1) {
                    ++peg12;
                } else if (r == 3 && c == 1) {
                    ++peg13;
                } else if (r == 0 && c == 2) {
                    ++peg20;
                } else if (r == 1 && c == 2) {
                    ++peg21;
                } else if (r == 2 && c == 2) {
                    ++peg22;
                } else if (r == 3 && c == 2) {
                    ++peg23;
                } else if (r == 0 && c == 3) {
                    ++peg30;
                } else if (r == 1 && c == 3) {
                    ++peg31;
                } else if (r == 2 && c == 3) {
                    ++peg32;
                } else if (r == 3 && c == 3) {
                    ++peg33;
                } else;

                // 
                mainFrame.setSize(1001, 900);
                mainFrame.setSize(1000, 900);

                delay();

                mainFrame.setSize(1001, 900);
                mainFrame.setSize(1000, 900);

            }

        };

        SwingUtilities.invokeLater(dogThread);

    }

    public static void resetGame() {
        //Resets the game so that it may be played again.

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
        counterBlack = 0;
        counterWhite = 0;
        GameComponent.whey = 0;
        whomTurn = 0;
        bottomLabel.setText("Aye man how ");
        joey = new Referee1();

    }

    public static void startSound() throws IOException {
  
        try {

            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(new File("dial-up-modem-2.wav")));
            clip.start();
            // clip.stop();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void playSound() {
        java.util.Random randNum = new java.util.Random();
        int i = randNum.nextInt(2);
        try {
            if (Referee1.whoWon == 0) {
                if (i == 1) {
                    clip = AudioSystem.getClip();
                    
                    clip.open(AudioSystem.getAudioInputStream(new File("shoryuryu.wav")));

                } else {
                    clip = AudioSystem.getClip();
                    
                    clip.open(AudioSystem.getAudioInputStream(new File("hadouryu.wav")));

                }

                clip.flush();
                clip.start();
                clip.flush();
                clip.start();
                if (!clip.isActive()) {

                    clip.start();
                    clip.flush();
                } else;
            } else;

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void fight() {

        try {
            clip.stop();
            Clip flip = AudioSystem.getClip();
            flip.open(AudioSystem.getAudioInputStream(new File("fight.wav")));
            flip.start();
        } catch (Exception t) {
            t.printStackTrace();
        }

    }

    public static void sound() throws IOException {
       
        AudioPlayer MGP = AudioPlayer.player;
        AudioStream BGM;
        AudioData MD;
        ContinuousAudioDataStream loop = null;
        try {
            BGM = new AudioStream(new FileInputStream("hadouryu.wav"));

            MD = BGM.getData();
            loop = new ContinuousAudioDataStream(MD);

        } catch (Exception e) {
            e.printStackTrace();
        }
        MGP.stop();
        MGP.start(loop);
        MGP.stop();
    }

    public void runGUI() {
        try {
            startSound();
        } catch (Exception e) {
            e.printStackTrace();
        }

        GameComponent scoreGame = new GameComponent();
        bottomLabel = new JLabel("Please Select A Colour!");
        mainFrame = new JFrame();
        JPanel mainPanel = new JPanel();
        JPanel auxillaryPanel = new JPanel();
        JPanel quitPanel = new JPanel();
        Color myColor = new Color(165, 42, 42);
        JPanel buttonPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));
        JButton butoon = new JButton("Place beed at 0,0");
        JButton quitButton = new JButton("QUIT");
        JButton resetButton = new JButton("  RESET  ");
        JToggleButton blackButton = new JToggleButton("BLACK");
        JToggleButton whiteButton = new JToggleButton("WHITE");
        buttonPanel.add(whiteButton);
        bottomLabel.setFont(new Font("Times Roman", Font.BOLD, 48));
        buttonPanel.add(blackButton);
        buttonPanel.add(resetButton);
        resetButton.addActionListener((ActionEvent ae) -> {
            try {
                startSound();
            } catch (Exception g) {
                g.printStackTrace();
            }
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
            counterBlack = 0;
            counterWhite = 0;
            Referee1.whoWon = 0;
            GameOver = 0;
            Referee1.yurd = 0;
            joey = new Referee1();
            blackButton.setEnabled(true);
            whiteButton.setEnabled(true);
            whiteButton.setSelected(false);
            blackButton.setSelected(false);
            bottomLabel.setText("Please Select A Colour!");
            GameComponent.whey = 0;
            whomTurn = 0;

            mainFrame.setSize(1001, 900);
            mainFrame.setSize(1000, 900);
            GameComponent score4Game = new GameComponent();
        });
        quitButton.addActionListener((ActionEvent ae) -> {
            System.exit(0);
        });
        blackButton.addActionListener((ActionEvent ae) -> {
            if (counterWhite == 1) {
                return;
            } else if (counterBlack == 0) {
                counterBlack++;
                whomTurn = 0;
                
                mainFrame.setSize(1000, 900);
                mainFrame.setSize(1001, 900);
                blackButton.setEnabled(false);
                whiteButton.setEnabled(false);
                 
                bottomLabel.setText("Now Click a Peg!");
                fight();
            } else {
                return;
            }
        });
        whiteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                if (counterBlack == 1) {
                    return;
                } else if (counterWhite == 0) {
                    counterWhite++;
                    whomTurn = 1;
                    mainFrame.setSize(1000, 900);
                    mainFrame.setSize(1001, 900);
              
                    whiteButton.setEnabled(false);
                    blackButton.setEnabled(false);
                     
                    bottomLabel.setText("Now Click a Peg!");
                    fight();
                    // twitch2.removeActionListener(this);
                } else {
                    return;
                }
            }

        });
        //ActionListener kurt = new doActionListener();
        mainPanel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                try {

                    if (Referee1.whoWon < 1) {
                        playSound();
                    } else;

                } catch (Exception q) {
                    q.printStackTrace();
                }
                if (counterBlack == 0 && counterWhite == 0) {
                    bottomLabel.setText("You Must Select A Color First!");

                    return;
                } else {
                    bottomLabel.setText("");
                }
                if (Referee1.whoWon < 1) {

                    System.out.println(e.getX() + " " + e.getY());
                    if ((e.getX() > 185 && e.getX() < 205) && e.getY() > 330 && e.getY() < 440) {

                        if (peg00 < 4) {
                            ++whomTurn;

                            Loc3d good = new Loc3d(0, 0, peg00);

                            try {

                                joey.placeBead(good);

                                joey.doThis();
                            } catch (Exception c) {

                            }

                             

                        }

                    } else if ((e.getX() > 255 && e.getX() < 275) && e.getY() > 390 && e.getY() < 482) {
                        //++peg01;
                        if (peg01 < 4) {
                            ++whomTurn;
                            Loc3d good = new Loc3d(1, 0, peg01);
                            // Referee1 joey=new Referee1();

                            try {
                                joey.placeBead(good);
                                joey.doThis();
                            } catch (Exception c) {
                                
                                c.printStackTrace();
                            }

             
                            //  bottomLabel.setText("hi");
                             
                            mainFrame.setSize(1001, 900);
                            mainFrame.setSize(1000, 900);
                        }

                    } else if ((e.getX() > 325 && e.getX() < 345) && e.getY() > 437 && e.getY() < 534) {
                        //++peg02;
                        if (peg02 < 4) {
                            ++whomTurn;

                             
                            Loc3d good = new Loc3d(2, 0, peg02);
                            //Referee joey=new Referee();
                            try {
                                joey.placeBead(good);
                                // ++whomTurn;

                                joey.doThis();
                                joey.checkWin(good);
                            } catch (Exception c) {
                                
                                c.printStackTrace();
                            }
                            mainFrame.setSize(1001, 900);
                            mainFrame.setSize(1000, 900);

                  
                        }

                    } else if ((e.getX() > 395 && e.getX() < 415) && e.getY() > 477 && e.getY() < 584) {

                        // ++peg03;
                        if (peg03 < 4) {
                            ++whomTurn;
                            Loc3d good = new Loc3d(3, 0, peg03);
                            //Referee joey=new Referee();
                            try {
                                joey.placeBead(good);
                                // ++whomTurn;
                                joey.doThis();
                            } catch (Exception c) {
                                c.printStackTrace();
                            }
                             
                            mainFrame.setSize(1001, 900);
                            mainFrame.setSize(1000, 900);

        
                            
                        }

                    } else if ((e.getX() > 285 && e.getX() < 305) && e.getY() > 310 && e.getY() < 410) {

                        // ++peg10;
                        if (peg10 < 4) {
                            ++whomTurn;
                            Loc3d good = new Loc3d(0, 1, peg10);
                            //Referee joey=new Referee();
                            try {
                                joey.placeBead(good);
                                // ++whomTurn;
                                joey.doThis();
                            } catch (Exception c) {
                                c.printStackTrace();
                            }
                             
                            mainFrame.setSize(1001, 900);
                            mainFrame.setSize(1000, 900);
                        
                        }

                    } else if ((e.getX() > 355 && e.getX() < 375) && e.getY() > 370 && e.getY() < 450) {
                        //++peg11;
                        if (peg11 < 4) {
                            ++whomTurn;

                            Loc3d good = new Loc3d(1, 1, peg11);
                            //Referee joey=new Referee();
                            try {
                                joey.placeBead(good);
                                // ++whomTurn;
                                joey.doThis();
                            } catch (Exception c) {
                                c.printStackTrace();
                            }
                             
                            mainFrame.setSize(1001, 900);
                            mainFrame.setSize(1000, 900);
                 
                        }

                    } else if ((e.getX() > 420 && e.getX() < 440) && e.getY() > 410 && e.getY() < 510) {
                        //++peg12;
                        if (peg12 < 4) {
                            ++whomTurn;

                            Loc3d good = new Loc3d(2, 1, peg12);
                            //Referee joey=new Referee();
                            try {
                                joey.placeBead(good);
                                // ++whomTurn;
                                joey.doThis();
                            } catch (Exception c) {
                                c.printStackTrace();
                            }
                             
                            mainFrame.setSize(1001, 900);
                            mainFrame.setSize(1000, 900);
                          
                        }

                    } else if ((e.getX() > 490 && e.getX() < 510) && e.getY() > 460 && e.getY() < 560) {
                        //++peg13;
                        if (peg13 < 4) {
                            ++whomTurn;

                            try {
                                Loc3d good = new Loc3d(3, 1, peg13);
                                //Referee joey=new Referee();
                                joey.placeBead(good);
                                // ++whomTurn;
                                joey.doThis();
                            } catch (Exception c) {
                                c.printStackTrace();
                            }
                             
                            mainFrame.setSize(1001, 900);
                            mainFrame.setSize(1000, 900);
                            
                        }

                    } else if ((e.getX() > 385 && e.getX() < 405) && e.getY() > 300 && e.getY() < 395) {
                        // ++peg20;
                        if (peg20 < 4) {
                            ++whomTurn;
                            Loc3d good = new Loc3d(0, 2, peg20);
                            //Referee joey=new Referee();
                            try {
                                joey.placeBead(good);
                                // ++whomTurn;
                                joey.doThis();
                            } catch (Exception c) {
                                c.printStackTrace();
                            }
                             
                            mainFrame.setSize(1001, 900);
                            mainFrame.setSize(1000, 900);
                            
                        }

                    } else if ((e.getX() > 455 && e.getX() < 475) && e.getY() > 345 && e.getY() < 460) {
                        //  ++peg21;
                        if (peg21 < 4) {
                            ++whomTurn;

                            try {
                                Loc3d good = new Loc3d(1, 2, peg21);
                                //Referee joey=new Referee();
                                joey.placeBead(good);
                                // ++whomTurn;
                                joey.doThis();
                            } catch (Exception c) {
                                c.printStackTrace();
                            }
                             
                            mainFrame.setSize(1001, 900);
                            mainFrame.setSize(1000, 900);
                    
                        }

                    } else if ((e.getX() > 515 && e.getX() < 535) && e.getY() > 390 && e.getY() < 500) {
                        // ++peg22;
                        if (peg22 < 4) {
                            ++whomTurn;

                            try {
                                Loc3d good = new Loc3d(2, 2, peg22);
                                //Referee joey=new Referee();
                                joey.placeBead(good);
                                // ++whomTurn;
                                joey.doThis();
                            } catch (Exception c) {
                                c.printStackTrace();
                            }
                             
                            mainFrame.setSize(1001, 900);
                            mainFrame.setSize(1000, 900);
                       
                        }

                    } else if ((e.getX() > 575 && e.getX() < 605) && e.getY() > 430 && e.getY() < 530) {
                        // ++peg23;
                        if (peg23 < 4) {
                            ++whomTurn;

                            try {
                                Loc3d good = new Loc3d(3, 2, peg23);
                                //Referee joey=new Referee();
                                joey.placeBead(good);
                                // ++whomTurn;
                                joey.doThis();
                            } catch (Exception c) {
                                c.printStackTrace();
                            }
                             
                            mainFrame.setSize(1001, 900);
                            mainFrame.setSize(1000, 900);
                         
                        }

                    } else if ((e.getX() > 495 && e.getX() < 515) && e.getY() > 280 && e.getY() < 380) {
                        //++peg30;
                        if (peg30 < 4) {
                            ++whomTurn;

                            try {
                                Loc3d good = new Loc3d(0, 3, peg30);
                                //Referee joey=new Referee();
                                joey.placeBead(good);
                                // ++whomTurn;
                                joey.doThis();
                            } catch (Exception c) {
                                c.printStackTrace();
                            }
                             
                            mainFrame.setSize(1001, 900);
                            mainFrame.setSize(1000, 900);
                    
                        }

                    } else if ((e.getX() > 555 && e.getX() < 575) && e.getY() > 320 && e.getY() < 420) {
                        // ++peg31;
                        if (peg31 < 4) {
                            ++whomTurn;

                            try {
                                Loc3d good = new Loc3d(1, 3, peg31);
                                //Referee joey=new Referee();
                                joey.placeBead(good);
                                // ++whomTurn;
                                joey.doThis();
                            } catch (Exception c) {
                                c.printStackTrace();
                            }
                             
                            mainFrame.setSize(1001, 900);
                            mainFrame.setSize(1000, 900);
                   
                        }

                    } else if ((e.getX() > 615 && e.getX() < 635) && e.getY() > 360 && e.getY() < 460) {
                        //++peg32;
                        if (peg32 < 4) {
                            ++whomTurn;

                            try {
                                Loc3d good = new Loc3d(2, 3, peg32);
                                //Referee joey=new Referee();
                                joey.placeBead(good);
                                // ++whomTurn;
                                joey.doThis();
                            } catch (Exception c) {
                                c.printStackTrace();
                            }
                             
                            mainFrame.setSize(1001, 900);
                            mainFrame.setSize(1000, 900);
                      
                        }

                    } else if ((e.getX() > 675 && e.getX() < 695) && e.getY() > 400 && e.getY() < 500) {
                        //++peg33;
                        if (peg33 < 4) {
                            ++whomTurn;

                            try {
                                Loc3d good = new Loc3d(3, 3, peg33);
                                //Referee joey=new Referee();
                                joey.placeBead(good);
                                // ++whomTurn;
                                joey.doThis();
                            } catch (Exception c) {
                                c.printStackTrace();
                            }
                             
                            mainFrame.setSize(1001, 900);
                            mainFrame.setSize(1000, 900);
                        
                        }
                    } else;
                }

            }
        });
        bottomLabel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

              
            }
        });
        quitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                ++peg01;
                 

            }
        });
        butoon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                ++peg00;
                 
                //GoodbyeComponent bye = new GoodbyeComponent();
             
                //   bottomLabel.setText("hi");
                if (peg00 == 2) {
                    //     bottomLabel.setText("bye");
                } else;

            }
        });

        mainPanel.add(scoreGame);
        // pindle.add(scoreGame);
        // smash.add(jooble);
        mainPanel.setLayout(new BorderLayout());
        auxillaryPanel.setLayout(new FlowLayout());
        auxillaryPanel.setSize(100, 100);
      
        quitPanel.add(quitButton);
        auxillaryPanel.add(quitPanel, BorderLayout.SOUTH);
        auxillaryPanel.add(buttonPanel);
        mainPanel.add(auxillaryPanel, BorderLayout.NORTH);
        //mainPanel.add(pindle, BorderLayout.SOUTH);
        mainPanel.add(bottomLabel, BorderLayout.SOUTH);
        mainPanel.setBackground(myColor);
        butoon.setBounds(20, 20, 20, 20);
        NotGraphics.mainFrame.setSize(1001, 900);
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

    
    }

}
