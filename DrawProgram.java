import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class DrawProgram extends JFrame{
	
	//Panel
	JPanel Left;
	JPanel Right;
	JPanel Center1;
	JPanel Center2;
	JPanel Center3;
	JPanel Center4;
	JPanel Center5;
	JPanel Center6;
	JPanel Center7;
	JPanel Center8;
	JPanel Center9;
	JPanel Center10;
	JPanel Center11;
	JPanel Center12;
	
	//Label
	JLabel x;
	JLabel y;
	JLabel w;
	JLabel h;
	JLabel Filled;
	
	//Textfield
	JTextField x_text;
	JTextField y_text;
	JTextField h_text;
	JTextField w_text;
	
	//Button
	JButton drawOval;
	JButton drawRectangle;
	
	//Checkbox
	JCheckBox a;
	
	//Variables
	int x1 = 0;
    int y1 = 0;
    int w1 = 0;
    int h1 = 0;
    int Shape = 0;
    int Fill = 0;
	
public DrawProgram(){
		setTitle("Draw Rectangle or Oval");
		setLayout(new GridLayout(1,2));
		setSize(600,400);
		
		//Panel 
		Right = new Right();
		Left =  new Left();
		
		//add components
		add(Left);
		add(Right);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
	
private class Left extends JPanel{
	
	public Left(){
		
		setLayout(new GridLayout(6,2));
		
		//Labels
		 x = new JLabel("x");
		 y = new JLabel("y");
		 w = new JLabel("w");
		 h = new JLabel("h");
		 Filled = new JLabel("Filled");
		
		//Panels
		Center1 = new JPanel();
		Center2 = new JPanel();
		Center3 = new JPanel();
		Center4 = new JPanel();
		Center5 = new JPanel();
		Center6 = new JPanel();
		Center7 = new JPanel();
		Center8 = new JPanel();
		Center9 = new JPanel();
		Center10 = new JPanel();
		Center11 = new JPanel();
		Center12 = new JPanel();
				
		//Button 
		drawOval = new JButton("Draw Oval");
		drawRectangle = new JButton("Draw Rectangle");
				
		//Checkbox
		a = new JCheckBox();
				
		//TextField
	    x_text = new JTextField("");
		x_text.setPreferredSize(new Dimension(40,20));
				
		y_text = new JTextField("");
		y_text.setPreferredSize(new Dimension(40,20));
			
		h_text = new JTextField("");
		h_text.setPreferredSize(new Dimension(40,20));
				
		w_text = new JTextField("");
		w_text.setPreferredSize(new Dimension(40,20));
				
		//add listneres
		drawOval.addActionListener(new Listener());
		drawRectangle.addActionListener(new Listener());
		
		a.addItemListener(new CheckListener());
		
		add(Center1);
		Center1.add(x);
		
		add(Center2);
		Center2.add(x_text);
		
		add(Center3);
		Center3.add(y);
		
		add(Center4);
		Center4.add(y_text);
		
		add(Center5);
		Center5.add(w);
		
		add(Center6);
		Center6.add(w_text);
		
		add(Center7);
		Center7.add(h);
		
		add(Center8);
		Center8.add(h_text);
		
		add(Center9);
		Center9.add(Filled);
		
		add(Center10);
		Center10.add(a);
		
		add(Center11);
		Center11.add(drawOval);
		
		add(Center12);
		Center12.add(drawRectangle);
		
		
		
	}
	
	 private class Listener implements ActionListener {
			
			public void actionPerformed(ActionEvent e) {
				
		        
		        x1 = Integer.parseInt(x_text.getText());
		        y1 = Integer.parseInt(y_text.getText());
		        w1 = Integer.parseInt(w_text.getText());
		        h1 = Integer.parseInt(h_text.getText());

				if (e.getSource() == drawOval) {
					Shape = 1;
					Right.repaint();
					
					
				} else if (e.getSource() == drawRectangle) {
					Shape = 2;
					Right.repaint();
				
				
			}
		 }
	  }
	 
	 private class CheckListener implements ItemListener {
	  		
		 public void itemStateChanged(ItemEvent e) {
			 if (e.getSource() == a) {
	  				
	  				if (a.isSelected()) {
	  					Fill = 1; // is filled 
	  					repaint();
	  				} else {
	  					Fill = 2; // is not filled 
	  					repaint();
	  				}
			 
		 }
	
	  }
   }
}
	

 

 private class Right extends JPanel{
	 
	 public Right(){
		 setBackground(Color.WHITE);
		 Border newBorder = BorderFactory.createLineBorder(Color.RED, 2);
		 setBorder(newBorder);
		 
	 }
 	 
	 public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		if(Shape == 1){
			g.drawOval(x1, y1, w1, h1);
			
		}
		
		if(Shape == 2){
			g.drawRect(x1, y1, w1, h1);
			
		}
		
		if(Shape == 1 && Fill == 1){
			g.fillOval(x1, y1, w1, h1);
			
		}
		
		if(Shape == 2 && Fill == 1){
			
			g.fillRect(x1, y1, w1, h1);
			
		}
		
		
	}
 }
	
 
 public static void main(String[] args){
	 new DrawProgram();
 }

}
