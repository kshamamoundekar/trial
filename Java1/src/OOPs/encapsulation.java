package OOPs;

import java.util.Scanner;

public class encapsulation {
	
	Scanner input=new Scanner(System.in);
	
	private int password=input.nextInt();
	
	private static int balance;
	
	void A() {
		password=1818;
	}
	
	static void B() {
		balance=100000;
	}
	
	public static void main(String[] args) {
		B();
		
	}

}

