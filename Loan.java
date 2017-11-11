import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Loan extends JFrame {
  private double annualInterestRate;
  private int numberOfYears;
  private double loanAmount;
  private java.util.Date loanDate;
  
  //Swing Components
  JPanel panel;
  JPanel panel1;
  JPanel panel2;
  
  //Labels
  JLabel blank;
  JLabel annual;
  JLabel number;
  JLabel loan;
  JLabel month;
  JLabel total;
  
  
  //TextFields
  JTextField txtAnnIntRate;
  JTextField txtNoOfYears;
  JTextField txtLoanAmount;
  JTextField txtMontPaymemt;
  JTextField txtTotal;
  
  //Button
  JButton compute;
  
  
  
  /** Default constructor */
  public Loan() {
	
	
    setPreferredSize(new Dimension(700,300));
    setTitle("Loan Calculator");
    
    Border newBorder = BorderFactory.createTitledBorder("Enter loan amount, interest rate, and years");
    
    panel = new JPanel(); // Creates new Panel, Default Layout FlowLayout
    panel.setBorder(newBorder);
    panel.setLayout(new GridLayout(5,2));    // create 5 rows and 2 columns
	panel.setSize(500, 200); //sets size
	panel.setLocation(50, 50); //sets location
 
	
	 
	
	panel2 = new JPanel();
	panel2.setLayout(new GridLayout(1,2));
	 
	
	
    //Label Components
    annual = new JLabel("Annual Interest Rate");
    number = new JLabel("Number of Years");
    loan = new JLabel("Loan Amount");
    month = new JLabel("Monthly Payment");
    total = new JLabel ("Total Payment");
   
    blank = new JLabel("");
    
    
    //TextField Components
    txtAnnIntRate = new JTextField(getAnnualInterestRate() + "");
    txtNoOfYears = new JTextField(getNumberOfYears() + "");
    txtLoanAmount = new JTextField(getLoanAmount() +"");
    txtMontPaymemt = new JTextField("0.0");
    txtTotal = new JTextField("0.0");
    
    txtMontPaymemt.setEnabled(false);
    txtTotal.setEnabled(false);
    
    
    //New Button
    JButton compute = new JButton("Compute Payment");
    
    //for computing
    compute.addActionListener(new ActionListener() {
    	
        public void actionPerformed(ActionEvent e) {
      
        double ann = 0;
        int NO = 0;
        double LOAN = 0;
        
        
        ann = Double.parseDouble(txtAnnIntRate.getText());
        NO  = Integer.parseInt(txtNoOfYears.getText());
        LOAN = Double.parseDouble(txtLoanAmount.getText());
        
        Loan j = new Loan(ann,NO,LOAN);
        
       
		j.setAnnualInterestRate(ann);
		j.setNumberOfYears(NO);
		j.setLoanAmount(LOAN);
        	
        txtMontPaymemt.setText(j.getMonthlyPayment() +"");
        txtTotal.setText(j.getTotalPayment()+"");
          
        }
      }
    );
    
    
    //Add Components
    
    add(panel2, BorderLayout.SOUTH);
    panel2.add(blank);
    panel2.add(compute);
    compute.setPreferredSize(new Dimension(40,40));
    
    add(panel);
    panel.add(annual);
    panel.add(txtAnnIntRate);
    panel.add(number);
    panel.add(txtNoOfYears);
    panel.add(loan);
    panel.add(txtLoanAmount);
    panel.add(month);
    panel.add(txtMontPaymemt);
    panel.add(total);
    panel.add(txtTotal);
    pack();
    
    setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  
  /** FOR GUI **/

  /** Construct a loan with specified annual interest rate,
      number of years, and loan amount
    */
  public Loan(double annualInterestRate, int numberOfYears,
      double loanAmount) {
    this.annualInterestRate = annualInterestRate;
    this.numberOfYears = numberOfYears;
    this.loanAmount = loanAmount;
    loanDate = new java.util.Date();
  }

  /** Return annualInterestRate */
  public double getAnnualInterestRate() {
    return annualInterestRate;
  }

  /** Set a new annualInterestRate */
  public void setAnnualInterestRate(double annualInterestRate) {
    this.annualInterestRate = annualInterestRate;
  }

  /** Return numberOfYears */
  public int getNumberOfYears() {
    return numberOfYears;
  }

  /** Set a new numberOfYears */
  public void setNumberOfYears(int numberOfYears) {
    this.numberOfYears = numberOfYears;
  }

  /** Return loanAmount */
  public double getLoanAmount() {
    return loanAmount;
  }

  /** Set a newloanAmount */
  public void setLoanAmount(double loanAmount) {
    this.loanAmount = loanAmount;
  }

  /** Find monthly payment */
  public double getMonthlyPayment() {
    double monthlyInterestRate = annualInterestRate / 1200;
    double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
      (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
    return monthlyPayment;    
  }

  /** Find total payment */
  public double getTotalPayment() {
    double totalPayment = getMonthlyPayment() * numberOfYears * 12;
    return totalPayment;    
  }

  /** Return loan date */
  public java.util.Date getLoanDate() {
    return loanDate;
  }
  
  public static void main(String[] args){
		new Loan();
		
	}
}