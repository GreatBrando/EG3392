import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Change C to F, make F uneditable
public class TemperatureConverter extends JFrame{
	
	//Variables
	JButton con;
	JLabel C;
	JLabel F;
	JTextField Celcius;
	JTextField Farenheight;
	JPanel panel;
	double celcius = 0;
	double Fare = 0;
	double result = 0;
	
	public TemperatureConverter(){
		setTitle("Temperature Converter");
		setPreferredSize(new Dimension(500,100)); //Sets size of frame
		panel = new JPanel(); // Creates new Panel
		con = new JButton("Convert"); //Creates Button
		
		//Labels
		C = new JLabel("Celcius:");
		F = new JLabel ("Farenheight:");
		
		//TextFields
		Celcius = new JTextField(celcius + "");
		Farenheight = new JTextField("0.0");
		
		Farenheight.setEnabled(false);
		
		con.addActionListener(new Listener());
		
		//Add Components
		add(panel);
		
		panel.add(C);
		panel.add(Celcius);
		panel.add(F);
		panel.add(Farenheight);
		panel.add(con);
		pack();
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public class Listener implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			result = Double.parseDouble(Celcius.getText());
			Fare =   9.0 / 5 * result + 32;
			Farenheight.setText(Fare +"");
			System.out.println(e.getActionCommand());
			
		}
	}

	public static void main(String[] args){
		new TemperatureConverter();
		
	}

}
