package star;

public class triangleinverted {
	
	public static void main(String[] args) {
		
		int star=9;
		int space=0;
		for(int line=1;line<=17;line++) {
			
		for(int i=1;i<=star;i++) {
			System.out.print("*");}
		for(int j=0;j<=space;j++) {
			System.out.print(" ");}
		for(int i=1;i<=star;i++) {
			System.out.print("*");}
		System.out.println();
		if(line<9) {star--;
		space=space+2;	}
		else if (line>8) {
			star++;
			space=space-2;}
		
		}
	}

}
