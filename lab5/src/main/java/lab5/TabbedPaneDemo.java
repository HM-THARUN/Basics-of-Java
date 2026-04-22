package lab5;


	import javax.swing.*;
	import java.awt.*;
	import javax.swing.event.*;

	public class TabbedPaneDemo extends JFrame {

	    JTabbedPane tabbedPane;

	    public TabbedPaneDemo() {
	        setTitle("Tabbed Pane Color Demo");

	        // Create tabbed pane
	        tabbedPane = new JTabbedPane();

	        // Create panels for each tab
	        JPanel redPanel = new JPanel();
	        redPanel.setBackground(Color.RED);

	        JPanel bluePanel = new JPanel();
	        bluePanel.setBackground(Color.BLUE);

	        JPanel greenPanel = new JPanel();
	        greenPanel.setBackground(Color.GREEN);

	        // Add tabs
	        tabbedPane.addTab("RED", redPanel);
	        tabbedPane.addTab("BLUE", bluePanel);
	        tabbedPane.addTab("GREEN", greenPanel);

	        // Add ChangeListener to detect tab selection
	        tabbedPane.addChangeListener(new ChangeListener() {
	            public void stateChanged(ChangeEvent e) {
	                int index = tabbedPane.getSelectedIndex();
	                String title = tabbedPane.getTitleAt(index);
	                System.out.println(title + " tab selected");
	            }
	        });

	        // Add tabbed pane to frame
	        add(tabbedPane);

	        // Frame settings
	        setSize(400, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);
	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        new TabbedPaneDemo();
	    }
	}

