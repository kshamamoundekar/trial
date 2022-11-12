package star;

public class Hpattern {
	public static void main(String[] args) {
		int star1 = 3;
		int space=4;
		int star2=3;
		for (int line=1;line<=10;line++) {
			for(int b=1;b<=star1;++b) {
				System.out.print("*");}
			for(int c=1;c<=space;c++) {
				System.out.print(" ");}
			for(int d=1;d<=star2;d++) {
				System.out.print("*");}
			
			if(line==4) {
				space=0;
				star1=7;}
				else if(line==5) {
					space=0;
					star1=7;}
				else {star1=3;space=4;}
			System.out.println();
		}
			
			
		}
	}


