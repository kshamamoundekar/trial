package Accesmodifier;

public abstract class Testinghirarchical {
public static void main(String[] args) {
	sub_class1 Sub1=new sub_class1();
	Sub1.FromSUB();
	Sub1.FromSUPER();
	
	Sub_class2 Sub2=new Sub_class2();
	
	Sub2.FromSubclass2();
	Sub2.FromSUPER();
}
}
