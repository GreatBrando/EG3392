import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Employee extends JFrame {
	
	JPanel Left;
	JTable myTable;
	DefaultTableModel myModel;
	
	public Employee() {

		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(1,2));

		String[] colNames = { "EmployeeID", "Name", "Position", "HourlyPayRate" };
		String[][] rowData = { { "1123", "Jake", "Cashier", "7.50" }, { "1051", "John", "Stocker", "7.50" }, 
				{  "1021", "Jade", "Cashier", "7.50" }, { "1031", "Jack", "Cashier", "7.50" }, { "1041", "Shawn", "Cashier", "7.50"}, 
				{ "1071", "Joe", "Cashier", "7.50" } };

		myTable = new JTable(rowData, colNames);
		myModel = new DefaultTableModel(rowData, colNames);
		myTable = new JTable(myModel);
		
		JScrollPane scrollPane = new JScrollPane(myTable);
		
		Left = new Left();
		
		add(Left);
		add(scrollPane, BorderLayout.CENTER);
		
		setVisible(true);
	}
	
	
	
	public class Left extends JPanel{
		
		private JButton add1;
		private JButton remove;
		private JButton update;
		
		private JTextField txtfieldID;
		private JTextField txtfieldName;
		private JTextField txtfieldPosition;
		private JTextField txtfieldRate;
		
		private JLabel Id;
		private JLabel Name;
		private JLabel Position;
		private JLabel Rate;
		
		private JPanel textInfo;
		private JPanel buttonInfo;
		
		public Left(){
			
			//Layout
			setLayout(new GridLayout(2,1));
			
			//Components
			add1 = new JButton("Add");
			remove = new JButton("Remove");
			update = new JButton("Update");
			
			//Components
			txtfieldID = new JTextField();
			txtfieldName = new JTextField();
			txtfieldPosition = new JTextField("");
			txtfieldRate = new JTextField();
			
			//Components
			Id = new JLabel("Employee ID:");
			Name = new JLabel("Name:");
			Position = new JLabel("Position:");
			Rate = new JLabel("HourlyPayRate:");
			
			textInfo = new JPanel();
			buttonInfo = new JPanel();
			
			//Layout for Text
			textInfo.setLayout(new GridLayout(4,2));
			
			
			add(textInfo);
			add(buttonInfo);
			
			textInfo.add(Id);
			textInfo.add(txtfieldID);
			
			textInfo.add(Name);
			textInfo.add(txtfieldName);
			
			textInfo.add(Position);
			textInfo.add(txtfieldPosition);
			
			textInfo.add(Rate);
			textInfo.add(txtfieldRate);
			
			buttonInfo.add(add1);
			buttonInfo.add(remove);
			buttonInfo.add(update);
			
			
			add1.addActionListener(new Listener());
			remove.addActionListener(new Listener());
			update.addActionListener(new Listener());
		}
	
		private class Listener implements ActionListener {
			
			
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource() == add1){
					
					//Add Row
					myModel.addRow(new Object[]{txtfieldID.getText(),txtfieldName.getText(),txtfieldPosition.getText(),txtfieldRate.getText()});
					
					//For SQL
					try{
						 Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost/personnel", "root", "");
						 
						 // Create a Statement object.
						 Statement stmt = conn.createStatement();
						 
						 String query = "INSERT INTO `employee`(`EmployeeID`, `Name`, `Position`, `HourlyPayRate`) VALUES ('"+txtfieldID.getText()+"','"+txtfieldName.getText()+"','"+txtfieldPosition.getText()+"','"+txtfieldRate.getText()+"')";
					     
						 ResultSet result = stmt.executeQuery(query);
						 
						// Close the connection.
				         conn.close();
						 
					}
						
					
					catch(Exception  ex){
						 System.out.println("ERROR: " + ex.getMessage());
					}
				
				}
				else if(e.getSource() == remove){
				       
					// get selected row
				       int selectRow = myTable.getSelectedRow();
				       myModel.removeRow(selectRow);
				       
				       
				   	//For SQL
						try{
							 Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost/personnel", "root", "");
							 
							 // Create a Statement object.
							 Statement stmt = conn.createStatement();
							 
							 String query =  "DELETE FROM `employee` WHERE EmployeeID = "+txtfieldID.getText();
						     
							 ResultSet result = stmt.executeQuery(query);
							 
							// Close the connection.
					         conn.close();
							 
						}
							
						
						catch(Exception  ex){
							 System.out.println("ERROR: " + ex.getMessage());
						}
				       
				}   
				
				
				else if(e.getSource() == update){
					
					
					int selectRow = myTable.getSelectedRow();
				    
					if(selectRow >= 0){
						myTable.setValueAt(txtfieldID.getText(),selectRow,0);
						myTable.setValueAt(txtfieldName.getText(),selectRow,1);
						myTable.setValueAt(txtfieldPosition.getText(),selectRow,2);
						myTable.setValueAt(txtfieldRate.getText(),selectRow,3);
					}
					
					
					
					try{
						 Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost/personnel", "root", "");
						 
						 // Create a Statement object.
						 Statement stmt = conn.createStatement();
						 
						   String query = "UPDATE `employee` SET `Name`='"+txtfieldName.getText()+"',`Position`='"+txtfieldPosition.getText()+"',`HourlyPayRate`="+txtfieldRate.getText()+" WHERE EmployeeID = "+txtfieldID.getText();
						 ResultSet result = stmt.executeQuery(query);
						 
						// Close the connection.
				         conn.close();
						 
					}
						
					
					catch(Exception  ex){
						 System.out.println("ERROR: " + ex.getMessage());
					}
				
			}
			
		}
		
	}
	
}
	

	       
	

	public static void main(String[] args) {
		new Employee();
	}

}