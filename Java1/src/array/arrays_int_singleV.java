package array;

import java.util.Arrays;

public class arrays_int_singleV{

		public static void main(String[] args) {
		int[]l= {50,80,60,40,51,42,63,55,5,2};
		int temp;
		for(int a=0;a<=l.length-1;a++) {
			System.out.print(l[a]+",");
		}
		System.out.println();
		System.out.println("----------------------------");
		
		for(int b=0;b<l.length/2;b++) {
			int z=l[b];
			l[b]=l[(l.length-1)-b];
			l[(l.length-1)-b]=z;
			}
		
		for(int b=l.length-1;b>=0;b--) {
			System.out.print(l[b]+",");
		}
		System.out.println();
		System.out.println("---------------------------------");
		for(int x=0;x<=l.length-1;x++) {
			System.out.print(l[x]+",");
		}
		System.out.println();
		System.out.println("---------------------------------");

		for(int y=0;y<=l.length-1;y++) {
			for(int z=y;z<=l.length-1;z++) {
				if(l[y]<l[z]) {
					temp=l[y];
					l[y]=l[z];
					l[z]=temp;
				}
			}
			System.out.print(l[y]+",");
		}
		
	}
	
}
