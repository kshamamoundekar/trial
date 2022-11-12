package star;

public class Heart {
	public static void main(String[] args) {
		int space1 = 3;
		int space2 = 6;
		int star1 = 3;
		int star2=3;
		for(int line=1;line<=10;line++) {
			for(int a=1;a<=space1;a++) {
				System.out.print(" ");}
			for(int b=1;b<=star1;b++) {
				System.out.print("**");}
			for(int c=1;c<=space2;c++) {
				System.out.print(" ");}
			for(int d=1;d<=star2;d++) {
				System.out.print("**");}
			if(line<=3) {space1--;star1++;star2++;space2=space2-2;}
			else if(line==4) {star1=star2;}
			else if(line<=10) {space1=space1+2;star1--;star2--;space2=0;}
			System.out.println();
		}
	}

}
