package methodconstructor;

public class Constructor1 {
	double a,b,c,d;//global variable
Constructor1(){
	System.out.println("i am default from constructor1");}
Constructor1(double x,double y) {
	a=x;b=y;//here we have declared value to variable of constructor
	System.out.println("constructor type 1(value1,value2)");}
Constructor1(double x,double y,double z){
	a=x;b=y;c=z;//here we have declared value to variable of constructor
	System.out.println("constructor type 2(value1,value2,value3)");}
Constructor1(double x,double y,double z,double l) {
	a=x;b=y;c=z;d=l;//here we have declared value to variable of constructor
	System.out.println("constructor type 3(value1,value2,value3,value4)");}

public void type1_addition() {
System.out.print("add = ");
System.out.println(a+b+c+d); }//this will execute as per the type of constructor used in method}
public void type2_substract() {
System.out.print("substract = ");
System.out.println( a-b-c-d);}
public void type3_divide() {
System.out.print("divide = ");
System.out.println(a/b*c/d);}
public void type4_multiply() {
System.out.print("multiply = ");
System.out.println((a*b)+(c*d));}
	public static void main(String[] args) {
		Constructor1 calling1 = new Constructor1(100,500); 
		calling1.type1_addition();//k+l is executing by taking its value from local variable directly
		//System.out.println(k);//this is not accessible bcz it is local variable
		calling1.type2_substract();
		calling1.type3_divide();
		calling1.type4_multiply();
		System.out.println();
		Constructor1 calling2 = new Constructor1(1000,500,100);
		calling2.type1_addition();
		calling2.type2_substract();
		calling2.type3_divide();
		calling2.type4_multiply();
		System.out.println();
		Constructor1 calling3 = new Constructor1(100,500,10,5);
		calling3.type1_addition();
		calling3.type2_substract();
		calling3.type3_divide();
		calling3.type4_multiply();
		
		
		
	}


}
