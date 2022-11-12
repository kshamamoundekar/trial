package string;

public class stringg {

	public static void Main(String [] args){

		String A="ASDFDSA";
		char x[]=A.toCharArray();
		String Z="";
		for(int a=x.length-1;a>=0;a--){
		Z=Z+ A.charAt(a);
		}
		if(A.equals(Z)){
		System.out.println("It is reverse string");
		}
		else{
		System.out.println("It is not reverse string");
		};

		}
	
}
