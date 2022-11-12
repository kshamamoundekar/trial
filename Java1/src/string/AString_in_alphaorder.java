package string;

public class AString_in_alphaorder {

	public static void main(String[] args) {
		
		String K="354216";
		char[] L=K.toCharArray();
		
		
		for(int i=0;i<L.length;i++) {
			for(int l=i;l<L.length;l++) {
				if(L[i]>L[l]) {
					char temp=L[i];
					L[i]=L[l];
					L[l]=temp;
				}
			}System.out.println(L);
		}			

		
	}
	
}
