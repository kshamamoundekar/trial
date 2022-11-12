package numberseries;

public class palindrome_string {

	public static void main(String[] args) {
		String b="12322";
		String a="";	
		
		for(int i=b.length()-1;i>=0;i--) {
			a=a+b.charAt(i);
		}
		if(b.equals(a)) {
			System.out.println(a+" = palindrome");
		}else {
			System.out.println(a+" = not palindrome");
		}
		
	}
	
}
