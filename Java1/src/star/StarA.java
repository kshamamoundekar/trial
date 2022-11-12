package star;

public class StarA {

	public static void main(String[] args) {
		
		int star=4;
		int star2=4;
		int space=16;
		int space2=0;
		for(int k=0;k<=10;k++) {
			for(int l=0;l<=space2;l++) {
				System.out.print(" ");
			}
			for(int m=0;m<=star;m++) {
				System.out.print("*");
			}
			for(int n=0;n<=space;n++) {
				System.out.print(" ");
			}
			for(int p=0;p<=star2;p++) {
				System.out.print("*");
			}
			System.out.println();
			if(k==8) {
				star=star-1;				
			}
			if(k==9) {
				star=star-2;				
			}			
			space=space-2;space2++;
		}
		
		
	}
}
