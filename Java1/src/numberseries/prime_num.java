package numberseries;

public class prime_num {
public static void main(String[] args) {

for(int V=1;V<=100;V++) {
int x;
for(x=2;x<=V/2;x++)
	if(V%x==0) {
		System.out.println(V+"= this is not prime");
		break;}
	if (V%x>0) {
		System.out.println(V+"= this is prime");
	}
}
	}
}
