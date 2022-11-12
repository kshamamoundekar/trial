package OOPs;

public class polymorphism_sub extends polymorphism_super{
	
	polymorphism_sub(int a){
		super(a);
	}
	
	polymorphism_sub(int a,int b){
		super(a, b);
	}
	
	public void Method1(int a) {
		System.out.println("n-static with 1 parameter");
	}
	
	public static void Method2(int a) {
		System.out.println("static with 1 parameter");
	}
	
	public static void main(String[] args) {
		polymorphism_sub N=new polymorphism_sub(0,0);
		N.Method1(0);
		N.Method2(0);
		N.Method1(0);
		N.Method2(0);
		
	}
	
}
