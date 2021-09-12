
class CatchSequence2 {

	public static void main(String[] args) {

		try {

			System.out.println(10/0);
		} catch(Exception ae) {				//Parent class

			System.out.println("Arithmetic Catched");
		} catch(ArithmeticException ae) {		//Child class

			System.out.println("Again Arithmetic Catched");
		} 
	}
}

//Compile Time Error
//Sequence Matters(In catch sequence should be from child class to parent class and not vice versa)

/*	
D:\Java\Exception Handling>javac CatchSequence.java
CatchSequence.java:12: error: exception ArithmeticException has already been caught
                } catch(ArithmeticException ae) {
                  ^
1 error
*/