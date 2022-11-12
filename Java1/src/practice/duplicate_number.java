package practice;

public class duplicate_number {

	
	public static void main(String[] args) {
	
		int[] arr1={1,2,3,4,5,5,6,6,5,5,5,2,2,1,1};
		for(int a=0;a<=arr1.length-1;a++) {
			int x=0;
				for(int b=a;b<=arr1.length-1;b++) {
					if(arr1[a]==arr1[b]) {
						x++;
					}
				}System.out.println(arr1[a]+" = "+x);
				if(arr1[a]==arr1[a ]) {
					System.out.println("===");	
							break;
		}
				}
	}
			
			}

//for(int i=0;i<=arr1.length-1;i++) {
//int a= 0;
//	for(int j=i;j<=arr1.length-1;j++) {
//		if(arr1[i]==arr1[j]) {
//			a+=1;
//}}
//	System.out.println(arr1[i]+" = "+a);
//		if(arr1[i]==arr1[i+1]) {
//		System.out.println("===");	
//				break;
//}
//	}