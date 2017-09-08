
public class LongDistanceBill extends PhoneBill {
	
	public LongDistanceBill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LongDistanceBill(double monthlyRate, double callRate) {
		super(monthlyRate, callRate);
	
	}
	public double CalculateBill(int time) {
		return getCallRate() * time + getMonthlyRate();
	}

	


}
