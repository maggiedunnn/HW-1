package HW1;

public class Circle {
	public int Radius;
	
public Circle(int Radius) {
	this.Radius = Radius;
	
}


public static void main(String[] args) {
	Circle Circle1 = new Circle(5);
	double Area = Circle1.Radius * 3.14159 * Circle1.Radius;
	System.out.println("The area of the circle is " + Area);	

	}

}
 //Maggie Dunn HW18