package practice;

public class find_int_and_add {
	public static void main(String[] args) {
		
		String A="1a235b";
		
		for(int i=0;i<=A.length()-1;i++) {
			char d=A.charAt(i);
			if(Character.isDigit(d)) {
				System.out.println(d);}
			
		}

	}}