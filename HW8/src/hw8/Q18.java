package hw8;
class PrintException extends Exception{}
class PaperPrintException extends PrintException{}

// Interface name Printer has been changed toQ18
public interface Q18 {
	abstract int printData() throws PrintException;
}
class Test implements Q18 {
	/*
	 * - Overridden methods cannot throw a new exception or a broader exception than the declared exception
	 * in the parent method.
	 */
	
	// This method throws a narrower exception than the declared exception in parent method. 
	//public int printData() throws PaperPrintException{return 0;	}
	
	// This method throws a broader exception than the declared exception in parent method, which will cause a compilation error.
	//public int printData() throws Exception{return 0;}
	
	// This method throws nothing which is allowed since it is considered as throwing a narrower exception.
	public int printData() {return 0;}
	
}
