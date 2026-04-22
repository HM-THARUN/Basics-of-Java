package com.example;

import javax.swing.*;
import java.awt.*;

public class HelloSwing {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Swing Hello Program");

        // Create a JLabel with the message
        JLabel label = new JLabel("Hello! VI C , Welcome to Swing Programming", JLabel.CENTER);

        // Set font: Plain, size 32
        label.setFont(new Font("Arial", Font.PLAIN, 32));

        // Set text color to Blue
        label.setForeground(Color.BLUE);

        // Add label to frame
        frame.add(label);

        // Set frame size
        frame.setSize(700, 200);

        // Set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Center the frame on screen
        frame.setLocationRelativeTo(null);

        // Make frame visible
        frame.setVisible(true);
    }
}