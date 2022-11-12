package numberseries;

public class multipleofnone {
	public static void main(String[] args) {
		
		int divisible=174;
		int line;
		boolean A=true;
		for(line=2;line<divisible/2;line++) 
			if(divisible%line==0) {
				A=false;
				break;}
		if(!A) {System.out.println("not prime number");
		}	else {System.out.println("prime number");}
	}}
//10 &11 line are connected if condition is equals to boolean