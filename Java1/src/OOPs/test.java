package OOPs;

public class test implements interfaceforimplement, interfaceforimplements{


	public void M2() {
		interfaceforimplement.super.M2();
		interfaceforimplements.super.M2();
	}

	public void M3() {
		
	}
	
	public static void main(String[] args) {
		test T=new test();
		T.M2();
	}

}
