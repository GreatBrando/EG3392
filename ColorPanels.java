import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorPanels {

	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.setTitle("Basic Window");
		
		frame.setSize(600,400);
		frame.setLocation(400, 300);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setLocation(50,100);
		panel.setSize(600,400);
		frame.add(panel);
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setBackground(Color.RED);
		panel1.setLocation(50,100);
		panel1.setSize(100,100);
		
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBackground(Color.GREEN);
		panel2.setLocation(200,100);
		panel2.setSize(100,100);
		
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBackground(Color.BLUE);
		panel3.setLocation(350,100);
		panel3.setSize(100,100);
		
		
		frame.add(panel);
		panel.add(panel1);
		panel.add(panel2);
		panel.add(panel3);
	
		
		frame.setVisible(true);
	}
}
