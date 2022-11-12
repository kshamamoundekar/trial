package string;

import java.util.Arrays;

public class string_reverse {

	
	public static void main(String[] args) {
		
//		String A="Shrikant";
//		String B="";
//		
//		for(int a=A.length()-1;a>=0;a--) {
//			B=B+A.charAt(a);
//		}System.out.println(B);
//
//	System.out.println("----------------------------");
//	
//	
//	String X[]={"Shrikant","Weds","Kshama"};
//	for(int p=0;p<=(X.length-1)/2;p++) {
//		
//	String Z=X[p];
//		X[p]=X[(X.length-1)-p];
//		X[(X.length-1)-p]=Z;
////		System.out.println(X[p]);
//	}
//	for(int u=0;u<=X.length-1;u++) {
//		System.out.println(X[u]);
//	}
	
		String A="ASDFDSA";//this is string
		char x[]=A.toCharArray();//this is used to convert it into array so i can get length
		String Z="";//this is to store
		for(int a=x.length-1;a>=0;a--){//he reverse karai sathix
		Z=Z+ A.charAt(a);//ithe Z mdhe ek ek character add karun save karat ahe
		}
		if(A.equals(Z)){
		System.out.println("It is reverse string");///and ithe conditions
		}
		else{
		System.out.println("It is not reverse string");
		};
		
		
		
		
		
		
		
		
		
		
		
}}
