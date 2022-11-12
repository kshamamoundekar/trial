package operators;

public class logicaloperators {
	
	void logic() {
		int a=10,b=20,c=30,d=60;
	System.out.println("showing execution from non static method");
	System.out.println((a<b)&&(d>c)) ;
	System.out.println();
	}
	static void logicof() {
		int a=10,b=20,c=30,d=60;
	System.out.println("showing execution from static method");
	System.out.println((a+b==c)&&(c-b==a));
	System.out.println(!(a<b)&& !(b<c));}
	
	
	public static void main(String[] args) {
		logicaloperators logical=new logicaloperators();
		logical.logic();//called with object creation non static method
			
			logicof();//called with method name as it is static method
		}
	}

