package hw2;

// Class name had to be changed to Q19
public class Q19 {
	private String name;
	private Q19 next;
	public Q19(String name, Q19 next) {
		this.name = name;
		this.next = next;
	}
	public void setNext(Q19 next) {
		this.next = next;
	}
	public Q19 getNext() {
		return next;
	}
	public String toString() {
		return this.name;
	}
	public static void main(String[] args) {
		Q19 link1 = new Q19("x", null);
		Q19 link2 = new Q19("y", link1);
		Q19 link3 = new Q19("z", link2);
		//link2 and link3 pointed each other
		link2.setNext(link3);
		link3.setNext(link2);
		//link1 and link3 has been made null.
		link1 = null;
		link3 = null;
		
		//The objects remain in memory until the GC runs.
		System.out.println(link2.getNext().getNext().toString());
	}
}
