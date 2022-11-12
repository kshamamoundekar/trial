package numberseries;

import java.util.Scanner;

public class primewithscanner {
public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	String A="Check number here = ";
	System.out.print(A);
	int value=input.nextInt();
	int line;
	boolean count = false;
	for( line = 2;line<=value/2;line++) 
		if(value%line==0) {
			count=true;
			break;
		}
	if(!count){
	System.out.println("Yes! this is prime number");}
	else {
	System.out.println("No! this is not prime number");}
		
	input.close();	
}}

