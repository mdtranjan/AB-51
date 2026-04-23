package JavaP;
//import java.io.*;
import java.util.Scanner;

public class NameReverse1 { // Class is Defined
	static Scanner s = new Scanner(System.in); // object to take Input from user

	public static void main(String[] args) { // Main method

		String a;  //variable declarition to store input from user.
		System.out.println("Enter Your Name"); 
		a = s.next(); // Input from user
 
		String r = ""; // Declaration to use as a blank space.
		char ch; // Declaration Where it can be used to store reversed name.

		for (int i = 0; i < a.length(); i++) { // Loop

			// extracts each character
			ch = a.charAt(i); // Character after loop change.

			// adds each character in
			// front of the existing string
			r = ch + r; // Stored reversed name.
		}

		System.out.println("Reverse of your name is " + r);
		s.close();
	}

}
