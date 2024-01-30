package HW1;

public class Dogs {
	public String Name;
	public String Breed;
	public int Age;
	
public Dogs(String Name, String Breed, int Age) {
	this.Name = Name;
	this.Breed = Breed;
	this.Age = Age;
}

public static void main(String[] args) {
	Dogs Dogs1 = new Dogs("Pepper", "mixed", 8);
	System.out.println("My dog's name is " + Dogs1.Name + " and he is a " + Dogs1.Breed + " breed who is " + Dogs1.Age + " years old");
	

	}

}

//Maggie Dunn HW 16