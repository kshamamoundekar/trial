package numberseries;


public class numberpractice {

//	prime number & range
//	palindrome & range
//	armstrong & range
//	fibonacci
//	factorial = 6*5*4*3*2*1
//	palindrome word
//	string array (reverse/alphabetic)
//	single string  (reverse/alphabetic)
//	int type array  (reverse/asc/desc)
	
	public static void main(String[] args) {


		String a= "dbfgtrasj";
		char b []=a.toCharArray();
		
		for(int x=0;x<=b.length-1;x++) {
			for(int y=x;y<=b.length-1;y++) {
				if(b[x]>b[y]) {
					char i=b[x];
					b[x]=b[y];
					b[y]=i;
				}			
			}
		}	for(int p=0;p<=b.length-1;p++) {
					System.out.print(b[p]);
				}
		 
		
		
		
		
		
		
		
		
		
	}	}