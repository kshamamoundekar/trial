package methodconstructor;

public class nonstaticfromdiffclass {

public void method3() {
	System.out.println("Running method3 from non static different class");
	
}
public static void main(String[] args) {
	nonstaticfromdiffclass M3= new nonstaticfromdiffclass();
	M3.method3();
	nonstaticfromsameclass M1=new nonstaticfromsameclass();
	M1.method1();
	M1.method2();
}
}
