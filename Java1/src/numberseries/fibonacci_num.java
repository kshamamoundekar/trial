package numberseries;

public class fibonacci_num {
public static void main(String[] args) {
	
	int a=0;
	int b=1;
	System.out.println(a);
	System.out.println(b);
	for(int i=2;i<10;i++) {
		int c=a+b;
		a=b;
		b=c;	
	System.out.println(c);
	}
	
	
	
//	int x=0;
//	int y=1;
//	for(int a=2;a<=10;a++) {
//		int z=x+y;
//		x=y;
//		y=z;
//		System.out.println(z);
//	}
	
	
}
	
}
