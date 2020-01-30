package ru.geekbrains.hw;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class ClicableWindow extends JFrame{
        private static int WIDTH = 500;
        private static int HEIGHT  = 200;
        private boolean pressed = false;

    ClicableWindow() {
            setTitle("Привет, кликни в черный прямоугольник!"); // заголовок окна
            setDefaultCloseOperation(EXIT_ON_CLOSE); // при закрытии окна программа завершается
            setBounds(50, 50, WIDTH, HEIGHT); //позиция левого верхнего угла и размеры окна в пикселях

            ClicableWindow currentWindow = this;
            currentWindow.getContentPane();

            JPanel panel = new JPanel();
            add(panel);

            panel.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    //System.out.println(e.getX());
                    //System.out.println(e.getY());
                    //System.out.println();

                    if(e.getX() >= 40 && e.getX() <= 140 && e.getY() >= 20 && e.getY() <= 70)
                        pressed = true;
                        currentWindow.getContentPane();


                }
            });

            setVisible(true); // сделать видимым
        }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.drawLine(250, 250, 120, 120);
        g.setColor(Color.YELLOW);
        g.fillOval(250, 150, 20,30);

        if(!pressed) g.setColor(Color.BLACK);
        if(pressed) g.setColor(Color.BLUE);
        g.fillRect(50,50, 100,50);
        repaint();
    }

}


