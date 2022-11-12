package methodconstructor;


public class Staticfromsameclass {

public static void static1() {
	System.out.println("Static from same class");
	System.out.println("learn method");}
	
public static void main(String[]args) {
	static1();	
	Staticfromdiffclass K1=new Staticfromdiffclass(40,60);
	K1.MethodA();
	Staticfromdiffclass test = new Staticfromdiffclass(10,15);
		test.MethodA();
		
	
}

}
