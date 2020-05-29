// Class and package names had to be changed.

package hw07;

interface Pet{}

public class Q05 implements Pet {
	
	/*
	 * - this keyword reference to the current object.
	 * 
	 * - An object either can be referenced with its own type, or its superclass's type or an interface type that
	 * the object implements. Since all classes in Java inherits from java.lang.Object, Object can be used here.
	 * Since the object implements Pet, that can be used, too. 
	 * 
	 * - There is no class called Class in Java or in this code so that it cannot be used to reference any object.
	 */
	public Pet getDoggy() {
		return this;
	}
	/*
	public Q05 getDoggy() {
		return this;
	}
	
	public Object getDoggy() {
		return this;
	}
	*/
	
	
}
