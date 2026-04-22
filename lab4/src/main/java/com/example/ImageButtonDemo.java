package com.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

	

	public class ImageButtonDemo extends JFrame implements ActionListener {

	    JLabel label;
	    JButton btnDigital, btnHourGlass;

	    public ImageButtonDemo() {
	        // Set title
	        setTitle("Image Button Demo");

	        // Create label
	        label = new JLabel("Press a button", JLabel.CENTER);
	        label.setFont(new Font("Arial", Font.PLAIN, 20));

	        // Load images
	        ImageIcon digitalIcon = new ImageIcon("digital.png");
	        ImageIcon hourGlassIcon = new ImageIcon("hourglass.png");

	        // Create buttons with images
	        btnDigital = new JButton("Digital Clock", digitalIcon);
	        btnHourGlass = new JButton("Hour Glass", hourGlassIcon);

	        // Add action listeners
	        btnDigital.addActionListener(this);
	        btnHourGlass.addActionListener(this);

	        // Layout
	        setLayout(new FlowLayout());

	        // Add components
	        add(label);
	        add(btnDigital);
	        add(btnHourGlass);

	        // Frame settings
	        setSize(500, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);
	        setVisible(true);
	    }

	    // Event handling
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == btnDigital) {
	            label.setText("Digital Clock is pressed");
	        } else if (e.getSource() == btnHourGlass) {
	            label.setText("Hour Glass is pressed");
	        }
	    }

	    public static void main(String[] args) {
	        new ImageButtonDemo();
	    }
	}

