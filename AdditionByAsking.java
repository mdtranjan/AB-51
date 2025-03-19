import java.util.Scanner;

public class AdditionByAsking {

	private static Scanner mudi;
	//private static Scanner mudit;

	public static void main(String [] args)
	{
		int a,b,c;
		mudi = new Scanner(System.in);
		System.out.println("Enter the value of A ");
		 a = mudi.nextInt();
		//int b;
		
		//mudit = new Scanner(System.in);
		System.out.println("Enter the value of B ");
		 b = mudi.nextInt();
		
		//int c=a+b;
		c=a+b;
		System.out.println("The addition value is :  "+c);
		mudi.close();


		
	}
}
