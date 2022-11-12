package star;

public class Ipattern {

	public static void main(String[] args) {
		int space1=0;
		int star1=8;
	for(int line=1;line<=12;line++) {
			for(int space = 1;space<=space1;space++) {
				System.out.print("  ");
			}
			for(int star = 1;star<=star1;star++) {
				System.out.print("*"+"*");
			}System.out.println();
			if(line>=2) {
				space1=3;
				star1=2;}
			if(line>=10) {
				space1=0;
				star1=8;
			}
				}}}
