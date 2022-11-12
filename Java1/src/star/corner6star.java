package star;

public class corner6star {
	//line 20
	//change 5th line
	//stars 5
	
	public static void main(String[] args) {
		int space1=13;
		int star1=1;
		for(int line=1;line<=19;line++) {
			for(int space=1;space<=space1;space++) {
				System.out.print(" ");
			}
			for(int star=1;star<=star1;star++) {
				System.out.print("**");
			}System.out.println();
			if(line<=4) {
				space1--;
				star1++;}
			else if(line==5) {
				space1=0;
				star1=14;}
			else if(line<=9) {
				space1++;
				star1--;}
			else if(line<=13) {
				space1--;
				star1++;}
			else if(line==14) {
				space1=9;
				star1=5;}
			else if(line<=18) {
				space1++;
				star1--;
			}
			
			
		}
	}

}
