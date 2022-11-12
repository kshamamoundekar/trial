package string;

public class Arrange_singlestring {

	
	public static void main(String[] args) {
//String in alphabet order
		
		String z="adbhfe";
//	Descending = hadbfe;hfadbe;hfeabd;hfedab;hfedba
//	Ascending = adbhfe;abdhfe;abdhfe;abdehf;abdefh;
		char[]x=z.toCharArray();
		
		System.out.println(x);
		System.out.println("--------------");
		for(int k=0;k<x.length;k++) {
			for(int l=k;l<x.length;l++) {
				if(x[k]<x[l]) {
					char b=x[k];
					x[k]=x[l];
					x[l]=b;
					
				}
				
			}
			
		}System.out.println(x);
		
		
		System.out.println("--------------");
		for(int k=0;k<x.length;k++) {
			for(int l=k;l<x.length;l++) {
				if(x[k]>x[l]) {
					char b=x[l];
					x[l]=x[k];
					x[k]=b;
					
				}
				
			}
			
		}
		System.out.println(x);
		
	}
}
