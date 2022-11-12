package casting;

public class test {
	
	public static void main(String[] args) {
	System.out.println("*********superr*********");
		superr V=new superr();
		V.nonstate();
		V.nonstate(0);
		V.state();
		V.newtype();
		
	System.out.println("**********subb**********");
	subb X=new subb();
	X.nonstate();
	X.nonstate(0);
	X.state();
	X.none();
	X.newtype();
		
	System.out.println("***********upcast************");
	superr Y=new subb();
	Y.nonstate();
	Y.nonstate(0);
	Y.state();
	Y.newtype();
	
	System.out.println("***********downcast*********");
	subb Z=(subb)new superr();
	Z.none();
	Z.nonstate();
	Z.nonstate(0);
	Z.state();
	Z.newtype();
		


		
	}

}
