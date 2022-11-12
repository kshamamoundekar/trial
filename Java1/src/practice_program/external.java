package practice_program;

public class external {

//	palindrome between 1 to 100
	
	static int low=1;
	
	static int high=100;
	
	static void method(int num) {
		int x=0;
		for(int a=num;a>0;a/=10) {
			x=a%10+x*10;
		}if(num==x) {
			System.out.println(num);
		}
	}
	
	
	public static void main(String[] args) {
		
		for(int i=low;i<=high;i++) {
			method(i);
		}
		
		
	}
	
}
