import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
	
public class JLabelChallenge {

		public static void main(String[] args){
			
			//Frame
			JFrame frame = new JFrame();
			frame.setTitle("My Window With Color Panels");
			frame.setSize(520,400);
			frame.setLocation(400, 300);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
			//Label
			JLabel red = new JLabel();
			red.setText("Red");
			red.setForeground(Color.RED);
			red.setLocation(85,50);
			red.setSize(75,50);
			
			JLabel blue = new JLabel();
			blue.setText("Blue");
			blue.setForeground(Color.BLUE);
			blue.setLocation(235,50);
			blue.setSize(75,50);
			
			JLabel yellow = new JLabel();
			yellow.setText("Yellow");
			yellow.setForeground(Color.YELLOW);
			yellow.setLocation(380,50);
			yellow.setSize(75,50);
			
			//Default Panel
			JPanel panel = new JPanel();
			panel.setLayout(null);
			panel.setSize(600,400);
			panel.setLocation(50,100);
			
			//Red Panel
			JPanel panel1 = new JPanel();
			panel1.setLayout(null);
			panel1.setBackground(Color.RED);
			panel1.setLocation(50,100);
			panel1.setSize(100,100);
			
			//Blue Panel
			JPanel panel2 = new JPanel();
			panel2.setLayout(null);
			panel2.setBackground(Color.BLUE);
			panel2.setLocation(200,100);
			panel2.setSize(100,100);
			
			//Yellow Panel
			JPanel panel3 = new JPanel();
			panel3.setLayout(null);
			panel3.setBackground(Color.YELLOW);
			panel3.setLocation(350,100);
			panel3.setSize(100,100);
			
			//Adding Panels to Frame
			frame.add(panel);
			panel.add(red);
			panel.add(blue);
			panel.add(yellow);
			panel.add(panel1);
			panel.add(panel2);
			panel.add(panel3);
			
			
		
			
			frame.setVisible(true);
		}
	}