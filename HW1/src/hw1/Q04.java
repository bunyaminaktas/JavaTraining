package hw1;

//If only Date classes would be used, these packages may not be imported, for that they are already expressed explicitly.
import java.util.*;
import java.sql.*;

// Class name must same with the file name.
// A separate class is created with a name "BirthdayManager", then it cannot have access modifier.
public class Q04 {
	/*
	 * - Because there are two classes that have same name in two different libraries,
	 * we should explicitly state which library's class is meant to be used.
	 */
	
	// This definition would cause compiler error of ambiguity.
	//private Date rob = new Date();
	private java.sql.Date rob = new java.sql.Date(0);
	private java.util.Date sharon = new java.util.Date();
}