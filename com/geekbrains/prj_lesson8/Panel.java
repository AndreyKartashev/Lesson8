package com.geekbrains.prj_lesson8;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

public class Panel extends JPanel {
    public Panel() {
        setBounds(20, 80, 710, 450);
        setBackground(MainClass.colorBack);
        //Начальные фигуры - без нажатия на кнопки - линии
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int w = (int) (Math.random() * 200);
                int h = (int) (Math.random() * 150);
                Graphics graphics = getGraphics();
                graphics.setColor(MainClass.color[0]);
                graphics.drawLine(e.getX(), e.getY(), e.getX() + (w / 2), e.getY() + (h / 2));
            }
        });
        setVisible(true);
    }
}