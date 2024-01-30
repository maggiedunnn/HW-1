package HW1;

public class Movie {
	public String Title;
	public String Director;
	public String Genre;
	
public Movie(String Title, String Director, String Genre) {
	this.Title = Title;
	this.Director = Director;
	this.Genre = Genre;
}

public static void main(String[] args) {
	Movie Movie1 = new Movie("Barbie", "Greta Gerwig", "Drama");
	System.out.println("The movie is " + Movie1.Title);
	System.out.println("The director is " + Movie1.Director);
	System.out.println("The genre is " + Movie1.Genre);
	

	}

}
//Maggie Dunn HW 12