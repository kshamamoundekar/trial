package practice;

public class primeseries {
	
public static void main(String[] args) {
	
	for(int a=1;a<=100;a++) {
		int x;
		boolean i=false;
		for(x=2;x<=a/2;x++) 
			if(a%x==0) {
				i=true;
				break;
			}
		if(!i) {
			System.out.println(a);
		}
		
	}
}}
