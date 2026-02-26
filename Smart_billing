package fidelity.programs;

public class Smart_Billing {
	public static double Calculate_bill(double amount , boolean isfirstorder) {
		double Final ;
		if (amount <500) {
			Final = amount;
		}
		else if (amount>500 && amount<1500) {
			Final = amount-(amount*0.05);
		}
		else {
			Final = amount-(amount*0.10);
		}
		if (isfirstorder) {
			Final = Final-(Final*0.02);
		}
		return Final;

	

	}
    public static void main(String args[]) {
    	System.out.println(Calculate_bill(200 , false));
    }
}
