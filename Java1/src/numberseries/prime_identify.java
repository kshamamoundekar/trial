package numberseries;

public class prime_identify {

	
	public static void main(String[] args) {
		
		int num=31;
		int X;
		boolean a=false;
		for(X=2;X<=num/2;X++) 
			if(num%X==0) {
			a=true;
			break;}
		if(!a) {
			System.out.println("prime number");
		}
		else {
			System.out.println("not prime number");
		}
	
}}
