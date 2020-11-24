package com.geekbrains.prj_lesson8;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Graph extends JFrame {
    public Graph() { //конструктор
        setBounds(30, 30, 800, 600);
        setTitle("Программа для работы с графикой");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    public void drawButtons() {
        JButton[] jbs = new JButton[10];

        jbs[0] = new JButton(MainClass.labelButtons[0]);
        MainClass.butNumber = 0;
        jbs[0].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent k) {
                //Прямоугольник
                MainClass.panel.removeMouseListener(MainClass.panel.getMouseListeners()[0]);
                MainClass.panel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        int w = (int) (Math.random() * 200);
                        int h = (int) (Math.random() * 150);
                        Graphics graphics = MainClass.panel.getGraphics();
                        graphics.setColor(MainClass.color[0]);
                        graphics.drawRect(e.getX(), e.getY(), w, h);
                    }
                });
            }
        });
        add(jbs[0]);
        setVisible(true);

        jbs[1] = new JButton(MainClass.labelButtons[1]);
        MainClass.butNumber = 1;
        jbs[1].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent k) {
                //Квадрат
                MainClass.panel.removeMouseListener(MainClass.panel.getMouseListeners()[0]);
                MainClass.panel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        int w = (int) (Math.random() * 200);
                        //int h = (int) (Math.random() * 150);
                        Graphics graphics = MainClass.panel.getGraphics();
                        graphics.setColor(MainClass.color[1]);
                        graphics.drawRect(e.getX(), e.getY(), w, w);
                    }
                });
            }
        });
        add(jbs[1]);
        setVisible(true);

        jbs[2] = new JButton(MainClass.labelButtons[2]);
        MainClass.butNumber = 2;
        jbs[2].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent k) {
                //Овал
                MainClass.panel.removeMouseListener(MainClass.panel.getMouseListeners()[0]);
                MainClass.panel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        int w = (int) (Math.random() * 200);
                        int h = (int) (Math.random() * 150);
                        Graphics graphics = MainClass.panel.getGraphics();
                        graphics.setColor(MainClass.color[2]);
                        graphics.drawOval(e.getX(), e.getY(), w, h);
                    }
                });
            }
        });
        add(jbs[2]);
        setVisible(true);

        jbs[3] = new JButton(MainClass.labelButtons[3]);
        MainClass.butNumber = 3;
        jbs[3].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent k) {
                //Круг
                MainClass.panel.removeMouseListener(MainClass.panel.getMouseListeners()[0]);
                MainClass.panel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        int w = (int) (Math.random() * 200);
                        //int h = (int) (Math.random() * 150);
                        Graphics graphics = MainClass.panel.getGraphics();
                        graphics.setColor(MainClass.color[3]);
                        graphics.drawOval(e.getX(), e.getY(), w, w);
                    }
                });
            }
        });
        add(jbs[3]);
        setVisible(true);

        jbs[4] = new JButton(MainClass.labelButtons[4]);
        MainClass.butNumber = 4;
        jbs[4].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent k) {
                //Залитый прямоугольник
                MainClass.panel.removeMouseListener(MainClass.panel.getMouseListeners()[0]);
                MainClass.panel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        int w = (int) (Math.random() * 200);
                        int h = (int) (Math.random() * 150);
                        Graphics graphics = MainClass.panel.getGraphics();
                        graphics.setColor(MainClass.color[4]);
                        graphics.fillRect(e.getX(), e.getY(), w, h);
                    }
                });
            }
        });
        add(jbs[4]);
        setVisible(true);

        jbs[5] = new JButton(MainClass.labelButtons[5]);
        MainClass.butNumber = 5;
        jbs[5].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent k) {
                //Залитый квадрат
                MainClass.panel.removeMouseListener(MainClass.panel.getMouseListeners()[0]);
                MainClass.panel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        int w = (int) (Math.random() * 200);
                        //int h = (int) (Math.random() * 150);
                        Graphics graphics = MainClass.panel.getGraphics();
                        graphics.setColor(MainClass.color[5]);
                        graphics.fillRect(e.getX(), e.getY(), w, w);
                    }
                });
            }
        });
        add(jbs[5]);
        setVisible(true);

        jbs[6] = new JButton(MainClass.labelButtons[6]);
        MainClass.butNumber = 6;
        jbs[6].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent k) {
                //Круг
                MainClass.panel.removeMouseListener(MainClass.panel.getMouseListeners()[0]);
                MainClass.panel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        int w = (int) (Math.random() * 200);
                        int h = (int) (Math.random() * 150);
                        Graphics graphics = MainClass.panel.getGraphics();
                        graphics.setColor(MainClass.color[6]);
                        graphics.fillOval(e.getX(), e.getY(), w, h);
                    }
                });
            }
        });
        add(jbs[6]);
        setVisible(true);

        jbs[7] = new JButton(MainClass.labelButtons[7]);
        MainClass.butNumber = 7;
        jbs[7].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent k) {
                //Залитый круг
                MainClass.panel.removeMouseListener(MainClass.panel.getMouseListeners()[0]);
                MainClass.panel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        int w = (int) (Math.random() * 200);
                        //int h = (int) (Math.random() * 150);
                        Graphics graphics = MainClass.panel.getGraphics();
                        graphics.setColor(MainClass.color[7]);
                        graphics.fillOval(e.getX(), e.getY(), w, w);
                    }
                });
            }
        });
        add(jbs[7]);
        setVisible(true);

        jbs[8] = new JButton(MainClass.labelButtons[8]);
        MainClass.butNumber = 8;
        jbs[8].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent k) {
                //Залитый квадрат
                MainClass.panel.removeMouseListener(MainClass.panel.getMouseListeners()[0]);
                MainClass.panel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        int w = (int) (Math.random() * 200);
                        int h = (int) (Math.random() * 150);
                        Graphics graphics = MainClass.panel.getGraphics();
                        graphics.setColor(MainClass.color[8]);
                        graphics.drawLine(e.getX(), e.getY(), e.getX() + w, e.getY() + h);
                    }
                });
            }
        });
        add(jbs[8]);
        setVisible(true);

        jbs[9] = new JButton(MainClass.labelButtons[9]);
        MainClass.butNumber = 9;
        jbs[9].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent k) {
                //Залитый квадрат
                MainClass.panel.repaint();
            }
        });
        add(jbs[9]);
        setVisible(true);
    }
}