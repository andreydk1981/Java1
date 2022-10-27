package org.example.lesson8;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyApp extends JFrame {

    MyApp() {
        setTitle("Моё окошко");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(300, 300,400,400);

        JButton button1 = new JButton("Button1");
        JButton button2 = new JButton("Button2");
        add(button1, BorderLayout.NORTH);
        add(button2, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MyApp();
    }
}
