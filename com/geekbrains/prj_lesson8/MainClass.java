package com.geekbrains.prj_lesson8;

import javax.swing.*;
import java.awt.*;

public class MainClass {
    public static Graph graph;
    public static Panel panel;
    public static int butNumber;

    public static String[] labelButtons = new String[]{"Прямоугольник", "Квадрат", "Овал", "Круг", "Залитый прямоугольник", "Залитый квадрат", "Залитый овал", "Залитый круг", "Линия", "Удалить все фигуры"};
    public static Color[] color = new Color[]{Color.red, Color.black, Color.blue, Color.cyan, Color.green, Color.magenta, Color.orange, Color.yellow, Color.darkGray, Color.white};
    public static Color colorBack = Color.white;

    public static void main(String[] args) {
        graph = new Graph();
        panel = new Panel();
        graph.drawButtons();
        graph.setLayout(new BoxLayout(graph.getContentPane(), BoxLayout.Y_AXIS));
        graph.add(panel);
        panel.setVisible(true);
        graph.setVisible(true);
    }
}