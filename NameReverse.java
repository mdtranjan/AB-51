
//import java.io.*;
import java.util.Scanner;

public class NameReverse {
	static Scanner z = new Scanner(System.in);

	public static void main(String[] args) {

		String s;
		System.out.println("Enter Your Name");
		s = z.next();

		String r = "";
		char ch;

		for (int i = 0; i < s.length(); i++) {

			// extracts each character
			ch = s.charAt(i);

			// adds each character in
			// front of the existing string
			r = ch + r;
		}

		System.out.println("Reverse of your name is " + r);
		z.close();
	}

}
