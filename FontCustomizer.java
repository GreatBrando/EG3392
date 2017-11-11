import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class FontCustomizer extends JFrame {
	
	
	private JCheckBox bold; 
	private JPanel top;
	private JPanel bottom;
	private JTextField userText;
	private JCheckBox redCheckBox;
	private JRadioButton Arial;  // Miles conversion button
	private JRadioButton Times;   // Feet conversion button
	private JRadioButton Verdana; // Inches conversion button
	private ButtonGroup FontButtonGroup;
	private final int WINDOW_WIDTH = 500; // Window width
	private final int WINDOW_HEIGHT = 200; // Window height
	
	
	//Different Fonts
	 Font a = new Font("Arial", Font.BOLD, 20);
	 Font b = new Font ("Arial", Font.PLAIN,12);
	 Font c = new Font ("Times New Roman", Font.PLAIN,12);
	 Font d = new Font ("Verdana", Font.PLAIN,12);

	public FontCustomizer() {
		// Set the text for the title bar.
		setTitle("Font Customizer");

		// Set the size of the window.
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

		
		// Set The Layout
		setLayout(new GridLayout(3,1));
		
		//Panel
		top = new JPanel();
		
		bottom = new JPanel();
		bottom.setLayout(new GridLayout(2,3,5,10));
		
		//TextField
		userText = new JTextField();
		userText.setPreferredSize(new Dimension(300, 30));
		userText.setLocation(50, 50);
		
		
		
		
		//Create Radio Buttons
		Arial = new JRadioButton("Arial");
		Times = new JRadioButton("Times");
		Verdana = new JRadioButton("Verdana");
		
		//Create Check Buttons 
		bold = new JCheckBox("bold");
		redCheckBox = new JCheckBox("red");
		
		
		
		
		//Group Buttons 
		
		// Add action listeners to the radio buttons.
		Arial.addActionListener(new RadioButtonListener());
	    Times.addActionListener(new RadioButtonListener());
	    Verdana.addActionListener(new RadioButtonListener());
	    
	    bold.addItemListener(new Listener());
	    redCheckBox.addItemListener(new Listener());
		
		//add components
		add(top);
		top.add(userText);
		add(bottom);
		bottom.add(Arial);
		bottom.add(Times);
		bottom.add(Verdana);
		bottom.add(bold);
		bottom.add(redCheckBox);
		
		

		// Specify an action for the close button.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Display the window.
		setVisible(true);

	}
	
	 private class RadioButtonListener implements ActionListener
	   {
	      public void actionPerformed(ActionEvent e)
	      { 
	         // Determine the button that was clicked and
	         // perform the selected conversion.
	         if (e.getSource() == Arial)
	         {
	            userText.setFont(b);
	           
	         }
	         else if (e.getSource() == Times)
	         {
	            userText.setFont(c);
	            
	         }
	         else if (e.getSource() == Verdana)
	         {
	            userText.setFont(d);
	            
	         }

	      }
	   }
	      
	      private class Listener implements ItemListener {
	  		public void itemStateChanged(ItemEvent e) {
	  			// Determine which check box was clicked.	  			
	  			if (e.getSource() == bold) {
	  				// Is the bold check box selected? If so, we
	  				// want to set the text color to bold.
	  				if (bold.isSelected()) {
	  					// The bold check box was selected. Set
	  					// the background color for the content
	  					// pane and the two check boxes to yellow.
	  					userText.setFont(a);
	  				} else {
	  					// The bold check box was deselected. Set
	  					// the background color for the content
	  					// pane and the two check boxes to light gray.
	  					userText.setFont(b);
	  				}
	  				
	  			} else if (e.getSource() == redCheckBox) {
	  				// Is the red check box selected? If so, we want
	  				// to set the forground color to red.
	  				if (redCheckBox.isSelected()) {
	  					// The red check box was selected. Set the
	  					// text color  to red.
	  					
	  					userText.setForeground(Color.RED);
	  					
	  				} else {
	  					// The red check box was deselected. Set the
	  					// text color to black.
	  					userText.setForeground(Color.BLACK);
	  				}
	  			}
	  		}
	  	}

	   

	


public static void main(String[] args){
	new FontCustomizer();
}

}
