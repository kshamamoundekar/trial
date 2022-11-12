package star;

public class starr {

	public static void main(String[] args) {
		
		int space=6;
		int star=1;
		int line;
		for(line=1;line<=13;line++) {
			for(int a=1;a<=space;a++) {
				System.out.print(" ");
			}
			for(int b=1;b<=star;b++) {
				System.out.print("*");
			}System.out.println();
			if(line<7) {
			space--;
			star=star+2;}
			else{
				space++;
				star=star-2;}
			}
		
	}}
