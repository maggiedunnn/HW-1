package HW1;

public class Rectangle {
	public int Length;
	public int Width;
	public int Area;

public Rectangle(int Length, int Width) {
	this.Length = Length;
	this.Width = Width;
	this.Area = Length * Width;
}


public static void main(String[] args) {
	Rectangle Rectangle1 = new Rectangle(4, 7);
	System.out.println("The area of the Rectangle is " + Rectangle1.Area);
	
	}

}
//Maggie Dunn HW 110