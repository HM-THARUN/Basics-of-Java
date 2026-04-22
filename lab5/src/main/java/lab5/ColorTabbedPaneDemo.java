package lab5;


	import javax.swing.*;
	import java.awt.*;
	import javax.swing.event.*;

	public class ColorTabbedPaneDemo extends JFrame {

	    JTabbedPane tabbedPane;

	    public ColorTabbedPaneDemo() {
	        setTitle("Cyan Magenta Yellow Tabbed Pane");

	        // Create tabbed pane
	        tabbedPane = new JTabbedPane();

	        // Create panels
	        JPanel cyanPanel = new JPanel();
	        cyanPanel.setBackground(Color.CYAN);

	        JPanel magentaPanel = new JPanel();
	        magentaPanel.setBackground(Color.MAGENTA);

	        JPanel yellowPanel = new JPanel();
	        yellowPanel.setBackground(Color.YELLOW);

	        // Add tabs
	        tabbedPane.addTab("CYAN", cyanPanel);
	        tabbedPane.addTab("MAGENTA", magentaPanel);
	        tabbedPane.addTab("YELLOW", yellowPanel);

	        // Event handling for tab selection
	        tabbedPane.addChangeListener(new ChangeListener() {
	            public void stateChanged(ChangeEvent e) {
	                int index = tabbedPane.getSelectedIndex();
	                String tabName = tabbedPane.getTitleAt(index);
	                System.out.println(tabName + " tab selected");
	            }
	        });

	        // Add to frame
	        add(tabbedPane);

	        // Frame settings
	        setSize(400, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);
	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        new ColorTabbedPaneDemo();
	    }
	}

