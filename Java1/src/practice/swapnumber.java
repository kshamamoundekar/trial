package practice;

public class swapnumber {

	public static void main(String[] args) {
		
		int x[]= {45,87,51,84,35,74,61};
//		for(int i=0;i<=(x.length-1)/2;i++) {
//			int j=x[i];
//			x[i]=x[(x.length)-1-i];
//			x[(x.length)-1-i]=j;
//		}
//		for(int k=0;k<=x.length-1;k++) {
//			System.out.print(x[k]+",");
//		}
		
		for(int i=0;i<=x.length-1;i++) {
				int a=x[i]%10;
					int j=a*10+x[i]/10;
					System.out.println(j);
			
//				for(int v=0;v<=x.length-1;v++) {
//					System.out.print(x[v]+",");
//					}System.out.println();
					}
		
		
		
		
		
		
	}
	
}
