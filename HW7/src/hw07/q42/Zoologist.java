package hw07.q42;

public class Zoologist {
	Canine animal;
	public final void setAnimal(Dog animal) { this.animal = animal; }
	public static void main(String[] furryFriends) {
		new Zoologist().setAnimal(new Husky()); // Husky is subclass of Dog so this line is valid
		new Zoologist().setAnimal(new Dog());	// This line is valid, too
		//new Zoologist().setAnimal(new Wolf());	// Wolf has no relationship to Dog so this line is not valid.
		new Zoologist().setAnimal(null);		// null can be assigned to any object	
	}
}
