package JavaP;

public class Parse {

	public static void main(String[] args) {
		
		String a= "123"; // This is a String variable with any value as numeric which is having integer value. 
		int b = Integer.parseInt(a); // to convert is to integer we use parseInt.
		System.out.println(b+1);

		int c = 505;
		String d = Integer.toString(c);
		System.out.println(d);
		System.out.println(d.length());
		
	}

}
