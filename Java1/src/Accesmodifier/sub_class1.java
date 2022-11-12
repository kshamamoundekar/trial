package Accesmodifier;

public class sub_class1 extends super_class{
String A="calling string from same class A";
String B="calling string from same class B";


sub_class1(){
	System.out.println("hi");
	}
sub_class1(int a){
	
}
public void FromSUB() {
	String A="callingSUB non static A";
	String B="callingSUB1 non static B";

	
	System.out.println(B);
	System.out.println(A);
	System.out.println(this.B);
	System.out.println(this.A);
	System.out.println(super.B);
	System.out.println(super.A);
}
public static void FromSUBStatic() {

	String A="callingSUB1STATIC A";
	String B="callingSUB1STATIC B";

	System.out.println(A);
	System.out.println(B);
}
	
	public static void main(String[] args) {
		
		FromSUBStatic();
		sub_class1 SUB=new sub_class1();
		SUB.FromSUB();
		FromSUPERSTATIC();
		super_class SUP=new super_class();
		SUP.FromSUPER();
		

	}
}
