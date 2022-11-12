package Accesmodifier;

import Accessmodifier2.defaultmodifier;
import Accessmodifier2.protectedmodifier;

public class publicmodifier {

	public void methodvisibleinproject() {
		System.out.println("method visible in project");}
	
	private void methodvisibleinprivate() {
		System.out.println("method visible is private");
		
	}
	
	protected void methodvisibleisprotected() {
		System.out.println("method visible is protected");
	methodvisibleinproject();	
	}
	
	void methodvisibleinpackage() {
		System.out.println("method visible is package default");}
	
	public static void main(String[] args) {
		publicmodifier pub=new publicmodifier();
		pub.methodvisibleinproject();
		
		//privatemodifier pri=new privatemodifier();
		//pri.methodvisibleinprivate();
		//not able to find it outside class with help of object
//		
//		protectedmodifier prot=new protectedmodifier();
//		prot.methodvisibleisprotected();
//		
//		defaultmodifier def=new defaultmodifier();
//		def.methodvisibleinpackage();
		
		
}}

