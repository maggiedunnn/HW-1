package HW1;

public class Employee {
	public String Name;
	public int ID;
	public int Salary;
	
public Employee(String Name, int ID, int Salary) {
	this.Name = Name;
	this.ID = ID;
	this.Salary = Salary;
	
}

public static void main(String[] args) {
	Employee Employee1 = new Employee("Jenna", 42690713, 10000000);
	System.out.println("This employee's name is " + Employee1.Name + " her ID number is" + Employee1.ID + " and she makes " + Employee1.Salary + " dollars");
	

	}

}
 //Maggie Dunn HW15