

class InterruptedDemo {

	public static void main(String[] args) {

		Thread t = new Thread();
		t.start();

		System.out.println("Core2Web");
		t.sleep(5000);

		System.out.println("Biencaps");				
	}
}

/*
D:\Java\Exception Handling>javac InterruptedDemo.java
InterruptedDemo.java:11: error: unreported exception InterruptedException; must be caught or declared to be thrown
                t.sleep(5000);
                       ^
1 error
*/