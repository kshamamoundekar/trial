package star;

public class practice {
	
	public static void main(String[] args) {
		int a = 5;int b=1;
		for(int i=1;i<=a;i++) {
			for(int j=i;j<=a-1;j++) {
				System.out.print(" ");}
			for(int k=1;k<=b;k++) {
				System.out.print("*");
			}System.out.println();
			b=b+2;
		}
		
	}

}
