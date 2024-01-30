package HW1;

public class Triangle {
	public int Base;
	public int Height;
	
public Triangle(int Base, int Height) {
	this.Base = Base;
	this.Height = Height;
}			

public static void main(String[] args) {
	Triangle Triangle1 = new Triangle(4, 3);
	System.out.println("The area of Triangle1 is " + (Triangle1.Base * Triangle1.Height /2));

	}

}
//Maggie Dunn HW19