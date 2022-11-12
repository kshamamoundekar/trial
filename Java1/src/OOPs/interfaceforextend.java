package OOPs;

public interface interfaceforextend {
	
	void interfaceusage1();
	
	void interfaceusage2();
	
	static void interfacestatic() {
		System.out.println("I am static from interface");
	}
	 
	  int a=100;
	 
	  int b=200;
	 
	  int c=a+b;
	 
	 public static void main() {
		System.out.println("only static a =" +a);
		System.out.println("only static b =" +b);
		System.out.println("total of a & b = "+a+" + "+b);
		interfacestatic();
	}
	 
}
