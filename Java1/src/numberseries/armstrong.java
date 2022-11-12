package numberseries;

public class armstrong {

	public static void main(String[] args) {
		int number=1634;
		int ttl = 0;
		
		for(int x=number;x>0;x/=10) {
			int rem=x%10;
			ttl+=Math.pow(rem, 4);
			}
		if(ttl==number) {
			System.out.println("It's armstrong");
		}
		else {
			System.out.println("it's not armstrong");
		}
	}
}
