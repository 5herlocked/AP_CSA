//commission employee
//author: Shardul Vaidya
//Date: 22/2/18

public class Commission extends Employee {
	private double commission;

	public Commission (String eName, String eAddress, String ePhone,
                    String socSecNumber, double rate) {
		super (eName, eAddress, ePhone, socSecNumber, rate);

		commission = 0;
	}

	public void setCommission (double commission) {
		this.commission = commission;
	} 

	public double pay(){
		double payment = getPayRate() + commission;

		commission = 0;

		return payment;
	}

	public String toString () {

		String result = super.toString();

		result += "\nCommission: " + commission;

		return result;
	}

}