class Flat {

	int x = 10;
	static int tv = 20;

	public static void main(String[] args) {

		System.out.println("Static Demo");
	}

}

/* OUTPUT

Microsoft Windows [Version 10.0.18362.836]
(c) 2019 Microsoft Corporation. All rights reserved.

C:\Users\I-Net>D:

D:\>cd Java

D:\Java>javac Program2.java

D:\Java>javap -c Flat.class
Compiled from "Program2.java"
class Flat {
  int x;

  static int tv;

  Flat();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: aload_0
       5: bipush        10
       7: putfield      #2                  // Field x:I
      10: return

  public static void main(java.lang.String[]);
    Code:
       0: getstatic     #3                  // Field java/lang/System.out:Ljava/io/PrintStream;
       3: ldc           #4                  // String Static Demo
       5: invokevirtual #5                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       8: return

  static {};
    Code:
       0: bipush        20
       2: putstatic     #6                  // Field tv:I
       5: return
}

D:\Java>

*/