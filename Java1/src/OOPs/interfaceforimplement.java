package OOPs;

public interface interfaceforimplement {
	static void M1() {
		System.out.println("static");
		}

		default void M2() {
		System.out.println("default2");
		}

		void M3();

		static void interfacestatic() {
			System.out.println("I am static from interface");
		}
}
