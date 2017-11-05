import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestFigurePanel extends JPanel {
		
	public void paint(Graphics g) {
		super.paint(g);
		
		//draw two intersecting lines
		g.setColor(Color.BLACK);
		g.drawLine(60, 10, 75, 75);
		g.drawLine(75, 10, 60, 75);
		
		//draw a unfilled Oval
		g.setColor(Color.BLACK);
		g.drawOval(20, 90, 100, 60);
		
		// Draw a Blue unfilled rectangle.
		g.setColor(Color.BLUE);
		g.drawRect(145, 10, 100, 60);

		// Draw a Blue filled rectangle.
		g.setColor(Color.BLUE);
		g.fillRect(145, 90, 100, 60);
		
		// Draw a unfilled RED Round Rectangle
		g.setColor(Color.RED);
		g.drawRoundRect(265, 10, 100, 60, 50, 50);
		
		// Draw a filled RED Round Rectangle
		g.setColor(Color.RED);
		g.fillRoundRect(265, 90, 100, 60, 50, 50);
		
	}
	
	public static void main(String[] args){
		JFrame j = new JFrame("TestFigurePanel");
		j.add(new TestFigurePanel());
		j.setSize(400, 200);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setVisible(true);
	}

}
