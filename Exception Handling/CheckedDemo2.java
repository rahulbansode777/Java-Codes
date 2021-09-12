
import java.io.*;

class CheckedDemo2 {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {

			System.out.println(br.readLine());
		} catch(InterruptedException obj) {			//} catch(IOException obj) {

			System.out.println("IOException Catched");
		}

		System.out.println("End of program");
	}
}

/*
D:\Java\Exception Handling>javac CheckedDemo2.java
CheckedDemo2.java:13: error: exception InterruptedException is never thrown in body of corresponding try statement
                } catch(InterruptedException obj) {
                  ^
CheckedDemo2.java:12: error: unreported exception IOException; must be caught or declared to be thrown
                        System.out.println(br.readLine());
                                                      ^
2 errors
*/