import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GridChallenge {
	
	public static void main(String[] args){
	//Default JFrame
	JFrame frame = new JFrame();
	frame.setTitle("JButton Scoreboard");
	frame.setSize(400, 300);   
	frame.setLocation(400, 300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	
	//Panel to frame to add components into
	JPanel panel = new JPanel();
	panel.setLayout(new GridLayout(2, 3)); // Add a GridLayout manager to the content pane.
	panel.setSize(300, 200);
	panel.setLocation(50, 50);
	
	//panels to add
	JPanel panel1 = new JPanel();
	panel1.setSize(300, 200);
	
	JPanel panel2 = new JPanel();
	panel2.setSize(300, 200);
	
	JPanel panel3 = new JPanel();
	panel3.setSize(300, 200);
	
	JPanel panel4 = new JPanel();
	panel4.setSize(300, 200);
	
	JPanel panel5 = new JPanel();
	panel5.setSize(300, 200);
	
	JPanel panel6 = new JPanel();
	panel6.setSize(300, 200);
	
    // Create six buttons.
    JButton button1 = new JButton("Button 1");
    JButton button2 = new JButton("Button 2");
    JButton button3 = new JButton("Button 3");
    JButton button4 = new JButton("Button 4");
    JButton button5 = new JButton("Button 5");
    JButton button6 = new JButton("Button 6");
    
    //create six labels
    JLabel label1 = new JLabel("This is cell 1.");
    label1.setSize(75, 50);

    JLabel label2 = new JLabel("This is cell 2.");
    label2.setSize(75, 50);
    
    JLabel label3 = new JLabel("This is cell 3.");
    label3.setSize(75, 50);
    
    JLabel label4 = new JLabel("This is cell 4.");
    label4.setSize(75, 50);
    
    JLabel label5 = new JLabel("This is cell 5.");
    label5.setSize(75, 50);
    
    JLabel label6 = new JLabel("This is cell 6.");
    label6.setSize(75, 50);
    
    // Add the six buttons to the content pane.
    frame.add(panel);
    
    panel.add(panel1);  // Goes into row 1, column 1
    panel1.add(label1);
    panel1.add(button1);
    
    panel.add(panel2);  // Goes into row 1, column 2
    panel2.add(label2);
    panel2.add(button2);
    
    panel.add(panel3);  // Goes into row 1, column 3
    panel3.add(label3);
    panel3.add(button3);
    
    panel.add(panel4);  // Goes into row 2, column 1
    panel4.add(label4);
    panel4.add(button4);
    
    panel.add(panel5);  // Goes into row 2, column 2
    panel5.add(label5);
    panel5.add(button5);
    
    panel.add(panel6);  // Goes into row 2, column 3
    panel6.add(label6);
    panel6.add(button6);
    
    frame.setVisible(true);
 }
}
