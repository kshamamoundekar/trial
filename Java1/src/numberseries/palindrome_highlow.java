package numberseries;

public class palindrome_highlow {

	static int low=1;
	static int high=1000;
	
	static void method(int number) {
		int reverse=0;
		for(int i=number;i>0;i=i/10) {
			reverse=i%10+reverse*10;
		}if(number==reverse) {
			System.out.println(number);
		}
	}
	
	public static void main(String[] args) {
		
		for(int j=low;j<=high;j++) {
			method(low);
			low++;
		}
		
			}


}
