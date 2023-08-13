import java.util.Scanner;

public class recursive {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//take string from user if they enter q, we quit the execution
		System.out.print("Enter a string ('q' to quit): ");
		String str = input.nextLine();
		
		//loops until user enters q
		while (!str.equals("q")) {
			//calls palindrome method to check if the string is palindrome
			if (palindrome(str))
				System.out.println("\"" + str + "\"" + " is a plaindrome");
			else
				System.out.println("\"" + str + "\"" + " is not a palindrome");
			
			//takes input again from the user for the second string.
			System.out.println();
			System.out.print("Enter a string ('q' to quit): ");
			str = input.nextLine();
			
		}
		
	}
	
	//palindrome method which checks if the string is palindrome using recursive method and keeps breaking strings in substrings til 1 or 0 character is left 
	//and returns true if it is palindrome or otherwise false
	public static boolean palindrome(String str) {
		if (str.length() == 0 || str.length() == 1)
			return true;
		if(str.charAt(0) == str.charAt(str.length()-1))
			return palindrome(str.substring(1,str.length()-1));
		else
			return false;
		
	}
}
