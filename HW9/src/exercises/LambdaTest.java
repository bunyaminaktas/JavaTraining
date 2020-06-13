package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
/*
interface Predicate<T>{
	boolean test(T t);
}
*/
class Animal{
	private String species;
	private boolean canHop;
	private boolean canSwim;
	public Animal(String species, boolean canHop, boolean canSwim) {
		this.species = species;
		this.canHop = canHop;
		this.canSwim = canSwim;
	}
	public boolean canSwim() {return canSwim;}
	public boolean canHop() {return canHop;}
	public String toString() {return species;}
}

public class LambdaTest {

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));
		
		List<Animal> animals2 = new ArrayList<Animal>();
		animals2.add(new Animal("fish", false, true));
		
		print(animals, a -> a.canHop());
	}
	private static void print(List<Animal> animals, Predicate<Animal> checker) {
		for(Animal animal : animals)
			if(checker.test(animal))
				System.out.print(animal + " ");
		System.out.println();
	}

}
