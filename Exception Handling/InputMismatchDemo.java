import java.util.*;

class InputMismatchDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		System.out.println(a);
	}
}

/*
D:\Java\Exception Handling>javac InputMismatchDemo.java

D:\Java\Exception Handling>java InputMismatchDemo
Shashi
Exception in thread "main" java.util.InputMismatchException
        at java.base/java.util.Scanner.throwFor(Scanner.java:939)
        at java.base/java.util.Scanner.next(Scanner.java:1594)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
        at InputMismatchDemo.main(InputMismatchDemo.java:9)
*/