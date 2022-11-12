package methodconstructor;

public class constructorpractice extends Constructor1 {
	int a,b,c,d;
		
	constructorpractice(int l,int m,int n,int o) {
		a=l;b=m;c=n;d=o;
		System.out.println("fordailypractice with 4 variables");}
	constructorpractice(int l,int m,int n){
		a=l;b=m;c=n;
		System.out.println("fordailypractice with 3 variables");}
	constructorpractice(int l,int m){
		a=l;b=m;
		System.out.println("fordailypractice with 2 variables");}
	void Method1() {
		System.out.print("from method1 ");
		System.out.println(a+b);}
	void Method2() {
		System.out.print("from method2 ");
		System.out.println(a+b+c);}
	void Method3() {
		System.out.print("from method3 ");
		System.out.println(a+b+c+d);}
	public static void main(String[] args) {
		constructorpractice v2=new constructorpractice(20, 30,50,90) ;
		v2.Method1();
		v2.Method2();
		v2.Method3();
	
		constructorpractice v3=new constructorpractice(20, 30,50,80) ;
		v3.Method1();
		v3.Method2();
		v3.Method3();
		
		constructorpractice v4=new constructorpractice(20, 30,50,100) ;
		v4.Method1();
		v4.Method2();
		v4.Method3();
	}

}
