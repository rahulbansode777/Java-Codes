

class IndexOutDemo {

	public static void main(String[] args) {

		int arr[] = new int[3];
	
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;

		System.out.println(arr[2]);	//30

		String s = "Shashi";

		System.out.println(s.charAt(5));	//i
	}
}

/*
D:\Java\Exception Handling>javac IndexOutDemo.java

D:\Java\Exception Handling>java IndexOutDemo
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        at IndexOutDemo.main(IndexOutDemo.java:13)


D:\Java\Exception Handling>javac IndexOutDemo.java

D:\Java\Exception Handling>java IndexOutDemo
Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 6
        at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:47)
        at java.base/java.lang.String.charAt(String.java:693)
        at StringOutDemo.main(StringOutDemo.java:9)
*/