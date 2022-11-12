package scannerclassusage;
import java.util.Scanner;

public class scanner {

		public static void main(String[] args) {
//			Scanner Input= new Scanner(System.in);
//			System.out.println("My favorite fruit");
//			String V1=Input.next();
//			if(V1.equals("apple")){
//				System.out.println("correct");
//				System.out.println();
//				System.out.println("what are the benefits of apple");
//			String V2=Input.next();
//			if(V2.equals("healthy")) {
//				System.out.println("yess right");}
//			else {System.out.println("galat jawab");}
//		} 	else {System.out.println("Naa naa kuch gadbad hai");}
//			Input.close();
			
//	we use this scanner class to get user input
//	called scanner class to create object in main method
//	2 string value for user name and password
			Scanner value=new Scanner(System.in);
			System.out.print("Enter roll number = ");
			int v1=value.nextInt();
			if(v1==12345678) {
				System.out.print("enter password = ");
			String v2=value.next();
			if(v2.equals("abc@123")) {
				System.out.println("login done");
			}else {System.out.println("password not matched");}
			}else {System.out.println("not found");}
			
			
			
			
//			
//	
//		
	
	
		

}}
