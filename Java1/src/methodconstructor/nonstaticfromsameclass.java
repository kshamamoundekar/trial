package methodconstructor;

public class nonstaticfromsameclass {

public void method1() {
String Username ="Srikrushna";
System.out.println("Running method1 from non static same class");
System.out.println("Username = "+Username);
}

public void method2() {
String password = "Srikrushna@1";
System.out.println("Running method2 from non static same class");
System.out.println("Password = "+ password);
nonstaticfromsameclass A=new nonstaticfromsameclass();

}
public static void main(String[] args) {
	
	nonstaticfromsameclass M1=new nonstaticfromsameclass();
	M1.method1();
	M1.method2();
	
	M1.method1();
	


	}
}
