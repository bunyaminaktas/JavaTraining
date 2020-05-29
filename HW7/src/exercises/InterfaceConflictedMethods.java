package exercises;

interface Herbivore{
	public int eatPlants();
}
interface Omnivore{
	public void eatPlants();
}

/*
 * - Interfaces cannot extend interfaces that have conflicting methods.
 */
//interface Supervore extends Herbivore, Omnivore {}

/*
 * - Classes implementing interfaces that have same methods, cannot compile
 */
class Bear {
}

public class InterfaceConflictedMethods {

}
