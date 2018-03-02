/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mojox
 */
package ProjectGraphics;

import java.awt.BorderLayout;
import static java.awt.BorderLayout.EAST;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class NotGraphics extends JFrame {

    public JFrame froome;
    private JLabel jooble;
    public static int peg00 = 0;
    public static int peg01 = 0;
    public static int peg02 = 0;
    public static int peg03 = 0;
    public static int peg10 = 0;
    public static int whomTurn=0;

    public static void main(String[] args) {
//JLabel jooble=new JLabel("This one");
        runGUI();
    }

    private static void runGUI() {

        Board bird = new Board();
        HelloComponent hi = new HelloComponent();
//Board bird=new Board();
        JLabel jooble = new JLabel("This one");
        JFrame froome = new JFrame();
        JPanel panool = new JPanel();
        JPanel prandel = new JPanel();
        JPanel pindle = new JPanel();
        JPanel smash = new JPanel();
        JPanel trick = new JPanel();
        panool.setLayout(new BoxLayout(panool, BoxLayout.X_AXIS));
        JButton butoon = new JButton("Place beed at 0,0");
        JButton buffoon = new JButton("Place beed at 0,1");
        ActionListener kurt = new doActionListener();
        panool.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println(e.getX() + " " + e.getY());
                if ((e.getX() > 185 && e.getX() < 205) && e.getY() > 330 && e.getY() < 440) {
                    ++peg00;
                    ++whomTurn;
                    HelloComponent hi = new HelloComponent();
                    froome.setSize(1001, 900);
                    froome.setSize(1000, 900);
                    // GoodbyeComponent bye = new GoodbyeComponent();
                    //System.out.println("workds");
                    System.out.println("peg00 is" + peg00);
                    System.out.println("peg01 is" + peg01);
                    hi.repaint();
                    hi.repaint();
                    hi.repaint();
                    hi.paintComponent(HelloComponent.g2);
                    for (int i = 0; i < 10; ++i) {
                        hi.repaint();
                    }
                    for (int i = 0; i < 100; ++i) {
                        hi.repaint();
                    }
                    jooble.setText("hi");
                    if (peg00 == 2) {
                        jooble.setText("bye");
                    } else;
                } else if ((e.getX() > 255 && e.getX() < 275) && e.getY() > 390 && e.getY() < 482) {
                    ++peg01;
++whomTurn;
                    //HelloComponent hi = new HelloComponent();
                    //GoodbyeComponent bye = new GoodbyeComponent();
                    //System.out.println("workds");
                    System.out.println("peg 00 is" + peg00);
                    System.out.println("peg 01 is" + peg01);
                    jooble.setText("hi");
                    HelloComponent hi = new HelloComponent();
                    hi.repaint();
                    froome.setSize(1001, 900);
                    froome.setSize(1000, 900);
                    hi.repaint();
                    hi.paintComponent(HelloComponent.g2);
                    hi.repaint();
                    for (int i = 0; i < 10; ++i) {
                        hi.repaint();
                    }
                    for (int i = 0; i < 100; ++i) {
                        hi.repaint();
                    }
                    if (peg00 == 2) {
                        jooble.setText("bye");
                    } else;

                } else if ((e.getX() > 325 && e.getX() < 345) && e.getY() > 437 && e.getY() < 534) {
                    ++peg02;
++whomTurn;
                    HelloComponent hi = new HelloComponent();
                    hi.repaint();
                    hi.repaint();
                    froome.setSize(1001, 900);
                    froome.setSize(1000, 900);
                    hi.repaint();
                    hi.paintComponent(HelloComponent.g2);
                    for (int i = 0; i < 10; ++i) {
                        hi.repaint();
                    }
                    for (int i = 0; i < 100; ++i) {
                        hi.repaint();
                    }
                    // GoodbyeComponent bye = new GoodbyeComponent();
                    //System.out.println("workds");
                    System.out.println("peg 00 is" + peg00);
                    System.out.println("peg 02 is" + peg02);
                    jooble.setText("hi");
                    if (peg00 == 2) {
                        jooble.setText("bye");
                    } else;

                } else if ((e.getX() > 395 && e.getX() < 415) && e.getY() > 477 && e.getY() < 584) {

                    ++peg03;
++whomTurn;
                    HelloComponent hi = new HelloComponent();
                    hi.repaint();
                    froome.setSize(1001, 900);
                    froome.setSize(1000, 900);
                    //  hi.paint();
                    hi.paintComponent(HelloComponent.g2);
                    for (int i = 0; i < 10; ++i) {
                        hi.repaint();
                    }
                    for (int i = 0; i < 100; ++i) {
                        hi.repaint();
                    }
                    // GoodbyeComponent bye = new GoodbyeComponent();
                    //System.out.println("workds");
                    System.out.println("peg 00 is" + peg00);
                    System.out.println("peg 02 is" + peg02);
                    jooble.setText("hi");
                    if (peg00 == 2) {
                        jooble.setText("bye");
                    } else;

                } else if ((e.getX() > 285 && e.getX() < 305) && e.getY() > 310 && e.getY() < 410) {

                    ++peg10;
++whomTurn;
                    HelloComponent hi = new HelloComponent();
                    hi.repaint();
                    froome.setSize(1001, 900);
                    froome.setSize(1000, 900);
                    //  hi.paint();
                    hi.paintComponent(HelloComponent.g2);
                    for (int i = 0; i < 10; ++i) {
                        hi.repaint();
                    }
                    for (int i = 0; i < 100; ++i) {
                        hi.repaint();
                    }
                    // GoodbyeComponent bye = new GoodbyeComponent();
                    //System.out.println("workds");
                    System.out.println("peg 00 is" + peg00);
                    System.out.println("peg 02 is" + peg02);
                    jooble.setText("hi");
                    if (peg00 == 2) {
                        jooble.setText("bye");
                    } else;
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
                GoodbyeComponent bye = new GoodbyeComponent();
                System.out.println("workds");
                System.out.println(peg00);
                jooble.setText("hi");
                if (peg00 == 2) {
                    jooble.setText("bye");
                } else;
            
            }
        });

        hi.repaint();
        hi.repaint();
        hi.repaint();
        hi.repaint();
        hi.repaint();

        for (int i = 0; i < 100; ++i) {
            hi.repaint();
        }
        panool.add(hi);
        pindle.add(hi);
        smash.add(jooble);
        panool.setLayout(new BorderLayout());
        prandel.setLayout(new FlowLayout());
        prandel.setSize(100, 100);

        trick.add(buffoon);
        prandel.add(trick, BorderLayout.SOUTH);
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
