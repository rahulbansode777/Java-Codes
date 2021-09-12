
class FinallyDemo2 {

	public static void main(String[] args) {

		try {

			System.out.println("In try");		//This line will be executed, coz no Exception
			System.out.println(10/0);		//ArithmeticException occured
		} catch(Exception e) {				//ArithmeticException caught

			System.out.println("In catch");		//This line will be executed	
		} finally {

			System.out.println("In finally");	//Then finally block will be executed		
		}
	}
}

//Main purpose of "finally" is to close the connection

/*
D:\Java\Exception Handling>javac FinallyDemo2.java

D:\Java\Exception Handling>java FinallyDemo2
In try
In catch
In finally

*/

