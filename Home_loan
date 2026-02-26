package fidelity.programs;

public class Home_loan {
// here i use string instead of void so i can use return in line 11,14,18,22
	// then in line 25 i can use sopln class name and call the values 
	//now if i use static void loan in line 7 instead of string then i have to use sopln in line 11,14,18,22 and in line 26 no need to use sopln directly use the class name and call the values
	public static String loan(int age, int salary, int creditScore) {
		if(age >= 21) {
			if(salary >= 25000) {
				if(creditScore >= 700) {
					return("Approved");
				}
				else {
					return("Rejected - Low credit score");
				}
			}
			else {
				return("Rejected - Low salary");
			}
		}
		else {
			return("Rejected - Under age");
			}
		}
	public static void main(String[] args){
	        System.out.println(loan(24,45000,761)); // 
	}
}
