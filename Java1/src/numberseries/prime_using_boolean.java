
package numberseries;

public class prime_using_boolean {
public static void main(String[] args) {
	

int value=53;
int a;
boolean i=false;
for(a=2;a<=value/2;a++)
	if(value%a==0) {
	i=true;
		break;}
	if(!(i)) {
		System.out.println("this is prime");
	}else {
		System.out.println("this is not prime");
	}

}}

//if num%v==0 calculated it will search for condition given to it
//and if num%v>0 then search for default condition