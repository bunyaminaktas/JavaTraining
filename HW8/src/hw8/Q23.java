package hw8;
import java.io.*;
public class Q23 {
	public static void main(String[] args) {
		try {
			throw new IOException();
		} catch(IOException i) {
			System.out.println("IOException is caught in the first catch block");
		} catch (Exception e) { // Since the previous block catches the exception this block is skipped.
			System.out.println("IOException is caught in the second catch block");
		}
	}
}
