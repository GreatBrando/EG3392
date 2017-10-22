import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Scoreboard {

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
		panel.setSize(300, 200);
		panel.setLocation(50, 50);
		
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
		panel.add(redteam);
		panel.add(blueteam);
		panel.add(redScore);
		panel.add(blueScore);
		panel.add(resetScore);
		panel.add(redScoreCount);
		panel.add(blueScoreCount);
		frame.setVisible(true);
	}

}
