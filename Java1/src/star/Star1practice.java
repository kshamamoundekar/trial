package star;

public class Star1practice {

	public static void main(String[] args) {
		
		int star1=2,space1=1,star2=6,space2=1,star3=0,line;
		for(line=1;line<=9;line++) {
			for(int s1=1;s1<=star1;s1++) {
				System.out.print("**");}
			for(int p1=1;p1<=space1;p1++) {
				System.out.print("  ");	}
			for(int s2=1;s2<=star2;s2++) {
				System.out.print("**");}
			for(int p2=1;p2<=space2;p2++) {
				System.out.print("  ");}
			for(int p2=1;p2<=star3;p2++) {
				System.out.print("**");}
		System.out.println();
		if(line==1) {
			star1=2;space1=1;star2=6;space2=0;star3=0;}
		else if(line==2) {
			star1=2;space1=1;star2=3;space2=0;star3=0;}
		else if(line<=5) {
			star1=0;space1=0;star2=9;space2=0;star3=0;}
		else if(line==6) {
			star1=0;space1=3;star2=3;space2=1;star3=2;}
		else if(line>6) {
			star1=6;space1=1;star2=2;space2=0;star3=0;}}
	}}