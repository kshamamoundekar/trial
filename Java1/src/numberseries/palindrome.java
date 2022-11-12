package numberseries;

public class palindrome {
	
	static int min=100;
	static int max=300;
	
	static void method(int num) {
		int rev=0;
		for(int i=num;i>0;i/=10) {
			rev=i%10+rev*10;}
		if(rev==num) {
		System.out.println(rev);
		}
	}
	
	public static void main(String[] args) {
		for(int a=min;a<=max;a++) {
			method(min);
			min++;
		}
		
		
}}


