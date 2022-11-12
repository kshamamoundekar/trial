package OOPs;

public interface multi_interface extends interfaceforimplements, interfaceforextend{
	
	default void interfaceusage1() {
		
	}
	default void interfaceusage2() {
		
	}
	default void M2() {
		
	}

	default void M3() {
		
	}
	
	public static void main(String[] args) {
		
		interfaceforextend.interfacestatic();
		interfaceforimplements.interfacestatic();
		interfaceforimplements.M1();
	}
	
}
