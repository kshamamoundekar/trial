package Accesmodifier;

public class super_class {
	
	
	String A="Super class string A";
	String B="Super class string B";
	
	super_class(){
		System.out.println("cons1 w/o from super class parameter");
	}
	
	super_class(int a){
		System.out.println("cons2 with from super class  parameter");
	}
	public void FromSUPER() {
		String A="callingSUPER NON STATIC A";
		String B="callingSUPER NON STATIC B";
		System.out.println(A);
		System.out.println(B);

}
	public static void FromSUPERSTATIC() {
		String A="callingSUPER STATIC A";
		String B="callingSUPER STATIC B";
		System.out.println(A);
		System.out.println(B);
}}
