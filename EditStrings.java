package JavaP;

import java.util.Scanner;

public class EditStrings {
	static Scanner a = new Scanner(System.in);
	public static void main(String[] args) {
		
		String b = a.nextLine(); // input as acd@yopmail.com
		String c = ""; // acd is assigned here as the program gets break after it gets @
		 for(int i =0; i<b.length(); i++) { 
			 if (b.charAt(i)=='@'){ // CharAt starts from index 0 and reaches to @ as @ is found the program gets break and no more data is 
				 //c+= "k"; // assigned as value for  variable c. 
				 break;
			 }
			 else
			 {
				 c+= b.charAt(i); // if there is no @ in the input then the given value will be assigned to C.
			 }
			 
		 }
		 System.out.println(c);
		 a.close();
	}
	
}
