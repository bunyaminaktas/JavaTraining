package woods;

//these statements imports static members of Grass
import static food.Grass.getGrass;
import static food.Grass.seeds;

public class Deer {
    public void eat() {
        getGrass();
        System.out.print(seeds);
    }
}