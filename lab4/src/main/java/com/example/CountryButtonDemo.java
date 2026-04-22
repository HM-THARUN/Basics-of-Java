package com.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountryButtonDemo extends JFrame implements ActionListener {

    JLabel label;
    JButton btnIndia, btnSrilanka;

    public CountryButtonDemo() {
        // Set title
        setTitle("Button Event Handling");

        // Create label
        label = new JLabel("Press a button", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.PLAIN, 20));

        // Create buttons
        btnIndia = new JButton("India");
        btnSrilanka = new JButton("Srilanka");

        // Add ActionListener to buttons
        btnIndia.addActionListener(this);
        btnSrilanka.addActionListener(this);

        // Set layout
        setLayout(new FlowLayout());

        // Add components
        add(label);
        add(btnIndia);
        add(btnSrilanka);

        // Frame settings
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Event handling
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnIndia) {
            label.setText("India is pressed");
        } else if (e.getSource() == btnSrilanka) {
            label.setText("Srilanka is pressed");
        }
    }

    public static void main(String[] args) {
        new CountryButtonDemo();
    }
}