
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class GridChallenge2 {

	public static void main(String[] args) {
		
		//Default JFrame
		JFrame frame = new JFrame();
		frame.setTitle("JButton Scoreboard");
		frame.setSize(400, 300);   
		frame.setLocation(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		
		//Panel to frame to add components into
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setLayout(new GridLayout(4, 2)); // 3 rows, 2 columns
		panel.setSize(300, 200);
		panel.setLocation(50, 50);
		
		//panels to align components
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
		
		JPanel panel7 = new JPanel();
		panel6.setSize(300, 200);
		
		//redTeam label
		JLabel redteam = new JLabel("Red Team");
		redteam.setForeground(Color.red);
		redteam.setLocation(50, 5);
		redteam.setSize(75, 50);
		
		//blueTeam Label
		JLabel blueteam = new JLabel("Blue Team");
		blueteam.setForeground(Color.blue);
		blueteam.setLocation(230, 5);
		blueteam.setSize(75, 50);
		
		//RedScore Label
		JLabel redScoreCount = new JLabel("0");
		redScoreCount.setForeground(Color.BLACK);
		redScoreCount.setLocation(70, 40);
		redScoreCount.setSize(75,50);
		
		//BlueScore Label
		JLabel blueScoreCount = new JLabel("0");
		blueScoreCount.setForeground(Color.BLACK);
		blueScoreCount.setLocation(260, 40);
		blueScoreCount.setSize(75,50);
		
		//Red Button
		JButton redScore = new JButton();
		redScore.setText("Red Score!");
		redScore.setSize(100, 50);
		redScore.setLocation(30, 105);
		
		//Blue Button
		JButton blueScore = new JButton();
		blueScore.setText("Blue Score!");
		blueScore.setSize(100, 50);
		blueScore.setLocation(210, 105);
		
		//Reset Score Button
		JButton resetScore = new JButton();
		resetScore.setText("Reset Score");
		resetScore.setSize(285, 50);
		resetScore.setLocation(30, 175);
		
		
		//Adding components to panel
		frame.add(panel);
		
		panel.add(panel1);          // Goes into row 1, column 1
		panel1.add(redteam);
		
		panel.add(panel2);			 // Goes into row 1, column 2
		panel2.add(blueteam);
		
		panel.add(panel3);			// Goes into row 2, column 1
		panel3.add(redScoreCount);   
		
		panel.add(panel4);			// Goes into row 2, column 2
		panel4.add(blueScoreCount);  

		panel.add(panel5);
		panel5.add(redScore);        // Goes into row 3, column 1
		
		panel.add(panel6);			// Goes into row 3, column 2
		panel6.add(blueScore);    
		
		panel.add(panel7);
		panel7.add(resetScore);
		
		
		frame.setVisible(true);
	}

}
