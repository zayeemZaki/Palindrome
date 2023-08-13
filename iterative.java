/*Zayeem_Zaki HW3
 * Project 1 where we check palindrome with iterative method.
 */

import java.util.Scanner;

public class iterative {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		
		//take string from user if they enter q, we quit the execution
		System.out.print("Enter a string ('q' to quit): ");
		String str = input.nextLine();
		String str2 = "";
		
		//loops until user enters q
		while(!str.equals("q")) {
			//change string input to string without spaces
			for (int i=0; i< str.length(); i++) {
				if(str.charAt(i) != ' ') 
					str2 += str.charAt(i);			
			}
			//call the palindrome method to check if the string str2 is a palindrome
			if (palindrome(str2))
				System.out.println("\"" + str + "\"" + " is a palindrome ");
			else
				System.out.println("\"" + str + "\"" + " is not a palindrome ");
			
			System.out.println();
			System.out.print("Enter a string ('q' to quit): ");
			str = input.nextLine();
			str2 = "";
		}

	}
	
	//palindrome method which compares first half of sting with the last half in reverse order
	public static boolean palindrome(String str) {
		
		for (int i=0; i< str.length()/2; i++) {
			if(str.charAt(i) != str.charAt(str.length()-i-1))
				return false;
		}
		return true;
	}

}
