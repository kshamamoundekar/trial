package numberseries;

public class Primenumber {

	public static void main(String[] args) {
		int num=51;int i;
		
		for(i=2;i<num/2;i++) 
		if(num%i==0) {
			System.out.println("it is not prime");
			break;
			}
		if(num%i>0) {
			System.out.println("it is prime");
		}
		
	}
}
