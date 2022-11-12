package methodconstructor;

public class methodwithparameter {

			
		static void A(int a) {			
			System.out.println("int a");
		}
		
		static void A(double a) {
			System.out.println("double a");
		}
		
		static void A(long a) {
			System.out.println("long a");
		}
		
		public static void main(String[] args) {
			A(10);
			A(1000000000);
			A(1000000);
			
		}
		}
