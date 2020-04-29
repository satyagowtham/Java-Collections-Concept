package ListConcept;

public class FinallyConcept {

	public static void main(String[] args) {
		//test1();
		//test2();
		division();

	}
	
	public static void test1() {
		try {
			System.out.println("Inside test1 mathod");
			throw new RuntimeException("test");
		} catch(Exception e) {
			System.out.println(" Inside catch block");
		}
		
		finally
		{
			System.out.println("Inside finally block");
		}
		
	}
	
	public static void test2() {
		try {
			System.out.println("Inside Test 2");
		}
		finally 
		{
			System.out.println("Inside finally test2");
		}
	}
	
	public static void division() {
		int i = 10;
		try {
			System.out.println("Inside try block");
			int k = i/0;
		}
		catch( NullPointerException e) {
			System.out.println(" Inside catch block");
			System.out.println(" divide by Zero error");
			
		}
		finally 
		{
			System.out.println("Execute this code even after exception");
		}
		
	}

}
