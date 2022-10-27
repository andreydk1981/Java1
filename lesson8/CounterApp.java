package org.example.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CounterApp extends JFrame {
    private int value;
    private static String errorMessage  = "Out Off Range!";

    CounterApp(int initValue) {
        setBounds(300, 300, 300, 150);
        setTitle("My simple counter");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Font font = new Font("Arial", Font.BOLD, 45);

        //  number
        JLabel label = new JLabel();
        label.setFont(font);
        value = initValue;
        label.setText(String.valueOf(value));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);

        // Error message
        Font errorFont = new Font("Arial", Font.BOLD, 26);
        JLabel errorLabel = new JLabel();
        errorLabel.setFont(errorFont);
        errorLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(errorLabel, BorderLayout.SOUTH);

        // button+
        JButton incrementButton = new JButton(">");
        incrementButton.setFont(font);
        add(incrementButton, BorderLayout.EAST);

        incrementButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value++;
                label.setText(String.valueOf(value));
                if (!validateValueInRange(value)){
                    errorLabel.setText(errorMessage);
                } else errorLabel.setText("");
            }
        });

        // button-
        JButton decrementButton = new JButton("<");
        decrementButton.setFont(font);
        add(decrementButton, BorderLayout.WEST);

        decrementButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value--;
                label.setText(String.valueOf(value));
                if (!validateValueInRange(value)){
                    errorLabel.setText(errorMessage);
                } else errorLabel.setText("");
            }
        });
        setVisible(true);


    }



    public static void main(String[] args) {
        new CounterApp(1);
    }

    private boolean validateValueInRange(int label){
        if (label < -10 || label > 10) return false;
        else return true;
    }
}
