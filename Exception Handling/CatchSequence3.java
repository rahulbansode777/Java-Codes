
class CatchSequence3 {

	public static void main(String[] args) {

		try {

			System.out.println(10/0);
		} catch(ArithmeticException ae) {			//Child class

			System.out.println("Arithmetic Catched");
		} catch(Exception ae) {					//Parent class

			System.out.println("Again Arithmetic Catched");
		} 
	}
}

//No CompileTime Error 
//Sequence Matters(In catch sequence should be from child class to parent class and not vice versa)

/*
D:\Java\Exception Handling>javac CatchSequence3.java

D:\Java\Exception Handling>java CatchSequence3
Arithmetic Catched

*/