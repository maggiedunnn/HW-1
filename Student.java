package HW1;

public class Student {
	public String Name;
	public int ID;
	public String Grade;

public Student(String Name, int ID, String Grade) {
	this.Name = Name;
	this.ID = ID;
	this.Grade = Grade;
}
	

public static void main(String[] args) {
	Student Student1 = new Student("Haley", 123456789, "junior");
	System.out.println("This student's name is " + Student1.Name + ", her ID number is " + Student1.ID + "and she is a " + Student1.Grade);

	}

}
// Maggie Dunn HW 14