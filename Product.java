package HW1;

public class Product {
	public String Name;
	public double Price;
	public int Quantity;

public Product(String Name, double Price, int Quantity) {
	this.Name = Name;
	this.Price = Price;
	this.Quantity = Quantity;
}

public static void main(String[] args) {
	Product Product1 = new Product("NYX Jumbo Eye Pencil", 4.99, 9);
	System.out.println("The product name is " + Product1.Name + " it costs " + Product1.Price + " and there are " + Product1.Quantity + " left in stock.");
	

	}

}
// Maggie Dunn HW 19