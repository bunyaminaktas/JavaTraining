package hw8;

import java.io.IOException;

public class Q08 {
	public static void main(String[] args) {
		/*
		 * - Broader Exception classes must come after narrower ones.
		 */
		
		try {}
		catch (Exception e) {}
		// This is unreachable since even if an IOException is thrown, it would be handled in previous block.
		//catch (IOException e) {}
		
		try {throw new Exception();}
		catch(IOException e) {}
		catch(Exception e) {}
	}
}
