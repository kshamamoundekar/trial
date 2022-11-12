package Accessmodifier2;

import Accesmodifier.privatemodifier;
import Accesmodifier.publicmodifier;

public class protectedmodifier {

	public void methodvisibleinproject() {
		System.out.println("method visible in project");}
		
	private void methodvisibleinprivate() {
		System.out.println("method visible is private");}
		
	public void methodvisibleisprotected() {
		System.out.println("method visible is protected");}

	void methodvisibleinpackage() {
		System.out.println("method visible is package default");}
	
	public static void main(String[] args) {
		publicmodifier pub1=new publicmodifier();
		pub1.methodvisibleinproject();
		
		privatemodifier pri=new privatemodifier();
		pri.methodvisibleinprivate();
		
		protectedmodifier prot=new protectedmodifier();
		prot.methodvisibleisprotected();
		
		defaultmodifier def=new defaultmodifier();
		def.methodvisibleinpackage();
		
		
	}
	
}
