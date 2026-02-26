package Tech_2;
class Employee1{  // parent class
	int empid;
	String name;
	double salary;
	
	public Employee1(int empid, String name, double salary)
	{
		this.empid = empid;
		this.name = name;
		this.salary=salary;
	}
	
	void display(){
		System.out.println("Employee ID " + empid);
		System.out.println("Employee Name " + name);
		System.out.println("Employee salary " + salary);
		System.out.println("------------");
	}
}

class TempEmployee extends Employee1{    // subclass/ child class
	
	/*int empid;
	String name;
	double salary; here these parameters arecalled automatically but its not visible to us */
	
	int bonus;
	public TempEmployee(int empid, String name, double salary,int bonus)
	{
		super(empid,name,salary);
		this.bonus=bonus;
	}
	
	void calcSalary(){
		double final_salary = salary + bonus;
		System.out.println("Your final salary is: "+ final_salary); 
	}
	//method void display() will come automatically thorugh inheritnace
}
class PermanentEmployee extends Employee1{    // subclass/ child class
	
	/*int empid;
	String name;
	double salary;*/
	
	int bonus;
	public PermanentEmployee(int empid, String name, double salary,int bonus)
	{
		super(empid,name,salary);
		this.bonus=bonus;
	}
	
	void calcSalary(){
		double final_salary = salary + bonus;
		System.out.println("Your final salary is: "+ final_salary); 
	}
	//method void display() will come automatically thorugh inheritnace
}

public class Inheritance {

	public static void main(String[] args) {

		TempEmployee temp = new TempEmployee(101,"Viren",45000.00,1000);
		temp.display();
		temp.calcSalary();
		
		PermanentEmployee pemp = new PermanentEmployee(102,"Kavita",34000.00,10000);
		pemp.display();
		pemp.calcSalary();
	}
}
