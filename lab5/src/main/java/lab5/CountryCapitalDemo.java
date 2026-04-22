package lab5;


	import javax.swing.*;
	import java.awt.*;
	import javax.swing.event.*;
	import java.util.HashMap;
	import java.util.List;

	public class CountryCapitalDemo extends JFrame {

	    JList<String> countryList;
	    HashMap<String, String> countryCapitalMap;

	    public CountryCapitalDemo() {
	        setTitle("Country Capital Demo");

	        // Country data
	        String[] countries = {
	            "USA", "India", "Vietnam", "Canada", "Denmark",
	            "France", "Great Britain", "Japan", "Africa",
	            "Greenland", "Singapore"
	        };

	        // Map for country -> capital
	        countryCapitalMap = new HashMap<>();
	        countryCapitalMap.put("USA", "Washington, D.C.");
	        countryCapitalMap.put("India", "New Delhi");
	        countryCapitalMap.put("Vietnam", "Hanoi");
	        countryCapitalMap.put("Canada", "Ottawa");
	        countryCapitalMap.put("Denmark", "Copenhagen");
	        countryCapitalMap.put("France", "Paris");
	        countryCapitalMap.put("Great Britain", "London");
	        countryCapitalMap.put("Japan", "Tokyo");
	        countryCapitalMap.put("Africa", "No single capital"); // continent
	        countryCapitalMap.put("Greenland", "Nuuk");
	        countryCapitalMap.put("Singapore", "Singapore");

	        // Create JList
	        countryList = new JList<>(countries);

	        // Allow multiple selection
	        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

	        // Add listener
	        countryList.addListSelectionListener(new ListSelectionListener() {
	            public void valueChanged(ListSelectionEvent e) {
	                if (!e.getValueIsAdjusting()) {
	                    List<String> selectedCountries = countryList.getSelectedValuesList();

	                    System.out.println("Selected Countries and Capitals:");
	                    for (String country : selectedCountries) {
	                        String capital = countryCapitalMap.get(country);
	                        System.out.println(country + " -> " + capital);
	                    }
	                    System.out.println("-----------------------------");
	                }
	            }
	        });

	        // Add to scroll pane
	        JScrollPane scrollPane = new JScrollPane(countryList);

	        // Layout
	        setLayout(new BorderLayout());
	        add(scrollPane, BorderLayout.CENTER);

	        // Frame settings
	        setSize(350, 250);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);
	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        new CountryCapitalDemo();
	    }
	}

