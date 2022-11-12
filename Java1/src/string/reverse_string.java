package string;

public class reverse_string {
	
	public static void main(String[] args) {
		
		String A="good morning siri";
		String B[]=A.split(" ");
		for(int i=0;i<=B.length-1;i++) {
			String C=" "+B[i];
			char x[]=C.toCharArray();
			for(int j=x.length-1;j>=0;j--) {
				System.out.print(x[j]);
			}
		}
	
	}
	
}
