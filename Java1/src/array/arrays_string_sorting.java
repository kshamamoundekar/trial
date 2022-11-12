package array;


public class arrays_string_sorting {
	public static void main(String[] args) {
		String[] A= {"abhi","shri","kshama","family","oreo"};
		String Z="";
		
		for(int a=A.length-1;a>=0;a--) {
			Z=Z+A[a];
			System.out.println(A[a]);}
//		System.out.println();
		System.out.println("==============");
	
//		================================
		
		
		for(int aa=0;aa<=A.length-1;aa++) {
			for(int b=aa;b<=A.length-1;b++) {
				if(A[aa].compareTo(A[b])>0) {
					String temp=A[aa];
							A[aa]=A[b];
							A[b]=temp;
					}
			}System.out.println(A[aa]);

		}
		
		
	}
	
		
		
		
}
