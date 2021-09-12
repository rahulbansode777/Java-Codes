
class FinallyDemo {

	public static void main(String[] args) {

		try {

			System.out.println("In try");		//This line will be executed, coz no Exception
		} catch(Exception e) {

			System.out.println("In catch");		//So wont be caught	
		} finally {

			System.out.println("In finally");	//Directly finally block will be executed		
		}
	}
}

/*
D:\Java\Exception Handling>javac FinallyDemo.java

D:\Java\Exception Handling>java FinallyDemo
In try
In finally

*/