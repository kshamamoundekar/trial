package practice;

public class reversestring {

	public static void main(String[] args) {
		String z="Automation";
		String a="";
		char j[]=z.toCharArray();
		for(int i=j.length-1;i>=0;i--) {
			a=a+z.charAt(i);
		}
		System.out.println(a);
	}
	
}
