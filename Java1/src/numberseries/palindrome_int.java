package numberseries;

public class palindrome_int {
	public static void main(String[] args) {
		
//
//		int x=45654;
//		int re=0;
//		int j;
//		for(j=x;j>0;j/=10) {
//			re=j%10+re*10;
//			System.out.print(re);
//			System.out.println();
//		}
//		if(re==x) {
//			System.out.println(" Palindrome");
//		}
//		else {
//			System.out.println(" Not palindrome");
//		}
	
	
		for(int d=1;d<=200;d++){
		int rem=0;
		for(int q=d;q>0;q/=10) {
			rem=q%10+rem*10;
			}
		if(d==rem) {
			System.out.println(d);
		}
		}

}}


