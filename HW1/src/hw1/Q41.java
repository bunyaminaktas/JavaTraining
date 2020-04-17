package hw1;

import dog.*;
import dog.puppy.*;
//Class name is changed to Q41 due to that it must be same with file name.
public class Q41 {
	//KC kc = new KC(); // cannot be accessed because its package is not imported.
	dog.puppy.female.KC kc = new dog.puppy.female.KC(); // Full package name must be stated to access this class
														// because that package is not imported.
	Georgette george = new Georgette();
	Webby webby = new Webby();
	Object object = new Object();	
}
