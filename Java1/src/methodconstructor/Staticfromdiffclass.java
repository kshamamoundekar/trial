package methodconstructor;

class Staticfromdiffclass {

	static int a;
	static int b;
	Staticfromdiffclass(int x,int y){
		a=x;b=y;
	}
public void MethodA() {
	int z=100;
	
	int c=a+b;
	System.out.println(c);
System.out.println("learning static from different class");}

public static void main(String[] args) {
	Staticfromdiffclass test = new Staticfromdiffclass(10,15);
	test.MethodA();
	
	System.out.println(test.a);
	System.out.println(test.a=50);	
	Staticfromdiffclass.a=200;
	System.out.println(b);
	b=300;
	System.out.println(b);
	
	
}
}
