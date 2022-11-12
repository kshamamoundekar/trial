package star;

public class JuneB {

	public static void main(String[]args) {
		
	int a=8;
	int b=1;
	for(int line=1;line<=17;line++) {
		for(int space=1;space<=a;space++) {
			System.out.print(" ");}
		for(int star=1;star<=b;star++) {
			System.out.print("*");}
		System.out.println();
	if(line <=3) {a--;b=b+2;}
	else if(line==4) {a=a-5;b=b+10;}
	else if(line<=8) {a=a+1;b=b-2;}
	else  if(line<=12) {a=a-1;b=b+2;}
	else if(line==13) {a=a+5;b=b-10;}
	else if(line <=16){a++;b=b-2;}
	}
	}
	}
	
	
	
	
			
