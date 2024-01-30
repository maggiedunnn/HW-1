package HW1;

public class Animal {
	public String Name;
	public String Species;
	
public Animal(String Name, String Species) {
	this.Name = Name;
	this.Species = Species;
}
	
public static void main(String[] args) {
	Animal Animal1 = new Animal("Pepper","Dog");
	System.out.println("Animal1's name is " + Animal1.Name + " and he is a " + Animal1.Species);

			
	}
}
//Maggie Dunn HW11