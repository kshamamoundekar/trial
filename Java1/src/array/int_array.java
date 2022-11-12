package array;

public class int_array {
	
	public static void x() {
		
		
		
	}
	public static void main(String[] args) {
		int A[]= {59,54,45,95,22};
		for(int a=0;a<=A.length-1;a++) {
		System.out.print(A[a]+",");
		}
		System.out.println();
		System.out.println("-------------");
		//		=================================
		//		REVERSE ORDER INT
				
			for(int u=0;u<=(A.length-1)/2;u++) {
				int k=A[u];
				A[u]=A[(A.length-1)-u];
				A[(A.length-1)-u]=k;
				}
			for(int a=0;a<=A.length-1;a++) {
				System.out.print(A[a]+",");
				}
		
				System.out.println();
				System.out.println("--------------");
		//		=================================
		//		INT ASCENDING ORDER WITHOUT SORT METHOD
				for(int u=0;u<=(A.length-1);u++) {
					for(int l=u;l<=A.length-1;l++) {
						if(A[u]>A[l]) {
					int m=A[u];
					A[u]=A[l];
					A[l]=m;
					}
					}
					}
				for(int a=0;a<=A.length-1;a++) {
					System.out.print(A[a]+",");
					}
		
	}
}
