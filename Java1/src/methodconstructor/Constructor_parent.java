package methodconstructor;

public class Constructor_parent {

	private int balance=15000;
	private int deposit = 20000;
	
	private static void bal_method() {
		Constructor_parent b=new Constructor_parent();
		System.out.println("update balance = "+(b.deposit+b.balance));}
	
	public int check() {
		return balance;}
	
	public void neww() {
		bal_method();
	}

}
	
