
public class Q07 {
	public static void main(String...strings) 
	{
		int num = 1;
		
		// labels are allowed in Java optionally. This label is created to try goto statement. 
		SWITCH: switch("Hello")
		{
			default:
				break;
				
			case "World":
				//continue; // is not allowed in switch statements
				
			//exit; There is no such a keyword in Java
				
			case "hello":
				// goto SWITCH: //goto statement in other programming languages are used with a label
					// but because it has no use in Java, the compiler does not compile code when it sees goto keyword.
					// while goto is a reserved word in Java compiler it has no use.
				
		}
	}
}
