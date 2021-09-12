import java.io.*;

class FileNotDemo {

	public static void main(String[] args) {

		File f = new File("Core2Web.txt");

		FileInputStream fis = new FileInputStream(f);
	}
}

/*
D:\Java\Exception Handling>javac FileNotFoundExceptionDemo.java
FileNotFoundExceptionDemo.java:9: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
                FileInputStream fis = new FileInputStream(f);
                                      ^
1 error
*/