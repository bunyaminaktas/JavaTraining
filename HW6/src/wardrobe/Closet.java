package wardrobe;

// This line has to be added to be able to call gtClothes() method
import static store.Store.getClothes;
public class Closet {
	public void borrow() {
		System.out.print("Borrowing clothes: "+getClothes());
	}
}
