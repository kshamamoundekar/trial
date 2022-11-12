package string;

public class chartype_stringspliting {

	
	public static void main(String[] args) {
		
		String A="KshamaMoundekar.km12@!#=gmail.com";
				
		for(int k=0;k<=A.length()-1;k++) {
			if(Character.isUpperCase(A.charAt(k))){
				System.out.print(A.charAt(k));
			}
		}
		System.out.println();
		for(int l=0;l<=A.length()-1;l++) {
			if(Character.isLowerCase(A.charAt(l))){
				System.out.print(A.charAt(l));
			
		}
		}
		System.out.println();
		for(int l=0;l<=A.length()-1;l++) {
			if((!Character.isLetter(A.charAt(l))&&(!Character.isDigit(A.charAt(l))&&(!Character.isWhitespace(A.charAt(l)))))){
				System.out.print(A.charAt(l));
			
		}
		}
		
		
	}}
