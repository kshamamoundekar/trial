package OOPs;

public class polymorphism_super {
	//overloading
	polymorphism_super(int a){
		System.out.println("constructor with parameter 1");
	}
	polymorphism_super(int a,int b){
		System.out.println("constructor with parameter 2");
	}
	
	public void Method1(int a) {
		System.out.println("n-static with 1 parameter");
	}
	public static void Method2(int a) {
		System.out.println("static with 1 parameter");
	}
	
}
