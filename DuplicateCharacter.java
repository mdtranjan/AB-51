
public class DuplicateCharacter {

	public static void main(String[] args) {
		String s1 ="Rajaaaa bbb";
		int count;
		char String[]= s1.toCharArray();
		System.out.println("Duplicate characters in a given string: "); 
        for(int i = 0; i <String.length; i++) {  
            count = 1;  
            for(int j = i+1; j <String.length; j++) {  
                if(String[i] == String[j] && String[i] != ' ') {  
                    count++;  
                    //Set string[j] to 0 to avoid printing visited character  
                    String[j] = '0';  
                }  
            }  
            //A character is considered as duplicate if count is greater than 1  
            if(count > 1 && String[i] != '0')  
                System.out.println(String[i]);  
        }
}}
