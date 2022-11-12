package star;

public class Pyramid {
	public static void main(String[] args) {
		int a=1;
		int b=10;
		for(int line=1;line<=10;line++) {
			for(int space=1;space<=a;++space) {
				System.out.print(" ");}
			for(int star=1;star<=b*2;star++) {
				System.out.print("+");}
			System.out.println();
		a++;
		b--;}
		}

}
