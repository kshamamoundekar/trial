package OOPs;

public class abstract_test extends abstractclass{

	
	public void mabstract() {
		}
	public void nstatic() {
		System.out.println("nstatic from sub class");}

	public static void mstatic() {
		System.out.println("m static method from sub class");}
	

	void A() {
		this.nstatic();
		this.mstatic();
		super.nstatic();
		super.mstatic();
		}
	
	public static void main(String[] args) {
		abstract_test AA=new abstract_test();
		AA.nstatic();
		mstatic();
		
		
	}
		
	

}
