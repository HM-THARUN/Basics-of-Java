package lab5;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

	

	public class CountryListDemo extends JFrame {

	    JList<String> countryList;

	    public CountryListDemo() {
	        setTitle("Country List Demo");

	        // Country data
	        String[] countries = {
	            "USA", "India", "Vietnam", "Canada", "Denmark",
	            "France", "Great Britain", "Japan", "Africa",
	            "Greenland", "Singapore"
	        };

	        // Create JList
	        countryList = new JList<>(countries);

	        // Allow multiple selection
	        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

	        // Add ListSelectionListener
	        countryList.addListSelectionListener(new ListSelectionListener() {
	            public void valueChanged(ListSelectionEvent e) {
	                // Avoid duplicate events
	                if (!e.getValueIsAdjusting()) {
	                    // Get selected values
	                    java.util.List<String> selected = countryList.getSelectedValuesList();

	                    // Print to console
	                    System.out.println("Selected Countries:");
	                    for (String country : selected) {
	                        System.out.println(country);
	                    }
	                    System.out.println("-------------------");
	                }
	            }
	        });

	        // Add to scroll pane
	        JScrollPane scrollPane = new JScrollPane(countryList);

	        // Layout
	        setLayout(new BorderLayout());
	        add(scrollPane, BorderLayout.CENTER);

	        // Frame settings
	        setSize(300, 250);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);
	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        new CountryListDemo();
	    }
	}
