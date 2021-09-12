//Runtime

class ArithmeticDemo {

	public static void main(String[] args) {

		System.out.println("ExceptionDemo");
		System.out.println(10/0);
	}
}

/*
D:\Java\Exception Handling>javac ArithmeticDemo.java

D:\Java\Exception Handling>java ArithmeticDemo
ExceptionDemo
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at ArithmeticDemo.main(ArithmeticDemo.java:8)
*/