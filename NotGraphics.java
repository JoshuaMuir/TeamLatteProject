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
    public static int peg02=0;

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
                if ((e.getX() > 190 && e.getX() < 200) && e.getY() > 330 && e.getY() < 440) {
                    ++peg00;
                    HelloComponent hi = new HelloComponent();
                    GoodbyeComponent bye = new GoodbyeComponent();
                    //System.out.println("workds");
                    System.out.println("peg00 is"+peg00);
                    System.out.println("peg01 is"+peg01);
                    jooble.setText("hi");
                    if (peg00 == 2) {
                        jooble.setText("bye");
                    } else;
                } else if ((e.getX() > 260 && e.getX() < 270) && e.getY() > 390 && e.getY() < 482) {
                    ++peg01;
                    
                    //HelloComponent hi = new HelloComponent();
                    GoodbyeComponent bye = new GoodbyeComponent();
                    //System.out.println("workds");
                    System.out.println("peg 00 is"+peg00);
                    System.out.println("peg 01 is"+peg01);
                    jooble.setText("hi");
                    HelloComponent hi=new HelloComponent();
                    if (peg00 == 2) {
                        jooble.setText("bye");
                    } else;

                }  if ((e.getX() > 330 && e.getX() < 340) && e.getY() > 437 && e.getY() < 534) {
                    ++peg02;
                    
                    HelloComponent hi = new HelloComponent();
                    GoodbyeComponent bye = new GoodbyeComponent();
                    //System.out.println("workds");
                    System.out.println("peg 00 is"+peg00);
                    System.out.println("peg 02 is"+peg02);
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
                //++peg01;
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
                // panool.add(jooble, BorderLayout.WEST);
            }
        });
        //panool.add(butoon);
        //panool.add(buffoon);
        panool.add(hi);
        pindle.add(hi);
        smash.add(jooble);
        panool.setLayout(new BorderLayout());
        prandel.setLayout(new FlowLayout());
        prandel.setSize(100, 100);
        prandel.add(butoon, BorderLayout.NORTH);
        //prandel.add(buffoon,BorderLayout.SOUTH);
        trick.add(buffoon);
        prandel.add(trick, BorderLayout.SOUTH);
        panool.add(prandel, BorderLayout.NORTH);
        panool.add(pindle, BorderLayout.SOUTH);
        panool.add(jooble, BorderLayout.EAST);
        //panool.add(trick, BorderLayout.NORTH);
        butoon.setBounds(20, 20, 20, 20);
        butoon.setPreferredSize(new Dimension(200, 25));
        panool.setSize(100, 100);

        //froome.setLayout(new BoxLayout(froome, BoxLayout.Y_AXIS));
        froome.setSize(1000, 900);
        //froome.setLayout(new FlowLayout());
        froome.setTitle("Score 4");
        froome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        froome.setBackground(Color.red);
        froome.setVisible(true);
        //panool.setLayout(new GridBagLayout());

        //froome.add(prandel, BorderLayout.NORTH);
        //froome.add(pindle, BorderLayout.CENTER);
        froome.add(panool);
//hi.add(bird);
        //panool.add(butoon);
        panool.add(hi);
// panool.add(hi);
// froome.getContentPane().add(panool);
        //froome.add(panool);

        System.out.println("hmm");
    }

}
