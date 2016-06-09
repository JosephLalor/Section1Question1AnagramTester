package section1Q2;

/**
 * Hello world!
 *
 */

/* 
In line 24, a string is wrapped in an object of Class String, called wordToCheck.
As originally written (Line 25) the program compares the reference to wordToCheck
with the string, 'hostleworld'. As the two will never be the same the program will 
recurse until a stack overflow occurs.  The solution is not to use the == operator
but to call wordToCheck's equals() method to compare its value with 'hostleworld'.  
Once this is done the string 'hostelworld' is printed after one iteration.
*/

public class Main 
{
	public static void main(String[] args) {
		System.out.println(fixSpelling("hostleworld"));
	}
		
	public static String fixSpelling(String name) {
		String wordToCheck = new String(name);
		//if(wordToCheck == "hostleworld" )
		if(wordToCheck.equals("hostleworld")) {
			name = "hostelworld";
		} else {
			fixSpelling(name);
		}
		return name;
	}
}

