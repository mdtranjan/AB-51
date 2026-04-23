package JavaP;

public class NameReverse2 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		for (int i = 0 ; i<sb.length()/2;i++) {
			int front = i;
			int back=sb.length()-1-i;// length of sb = 5-1-0(index of H)=> 4 so H will be moved to 4th index.
			char frontChar= sb.charAt(front);
			char backChar= sb.charAt(back);
			
			sb.setCharAt(front, backChar ); // front replaced to back
			sb.setCharAt(back,frontChar); // and back replaced by front
	
		}
		System.out.println(sb);
	}
	

}
