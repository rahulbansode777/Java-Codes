
class CatchSequence {

	public static void main(String[] args) {

		try {

			System.out.println(10/0);
		} catch(ArithmeticException ae) {

			System.out.println("Arithmetic Catched");
		} catch(ArithmeticException ae) {

			System.out.println("Again Arithmetic Catched");
		} 
	}
}

//Compile Time Error

/*	
D:\Java\Exception Handling>javac CatchSequence.java
CatchSequence.java:12: error: exception ArithmeticException has already been caught
                } catch(ArithmeticException ae) {
                  ^
1 error
*/