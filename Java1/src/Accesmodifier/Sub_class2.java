package Accesmodifier;

public class Sub_class2 extends super_class {


//	Sub_class2(int a) {
//		super(a);}

	Sub_class2() {	}

	public void FromSubclass2() {
		String A="callingSub2 A";
		String B="callingSub2 B";
		System.out.println(A);
		System.out.println(B);}
	
	public static void FromSubclass2Static() {
		System.out.println("FromSubclass2");}
	
	public static void main(String[] args) {
		Sub_class2 X=new Sub_class2();
		X.FromSUPER();
		X.FromSUPERSTATIC();
		X.FromSubclass2();
		X.FromSubclass2Static();
		

}}
