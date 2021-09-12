class MyThread extends Thread {

	public void run() {

		for(int i = 0; i < 10; i++) {

			System.out.println("Child Thread");

			try {

				Thread.sleep(2000);
			} catch(InterruptedException ie) {

				System.out.println("Exception Handled");
			}
		}
	}
}

class JoinDemo {

	public static void main(String[] args) throws InterruptedException {

		MyThread mt = new MyThread();
		mt.start();
		mt.join();	

		for(int i = 0; i < 10; i++) {

			System.out.println("Main Thread");
		}
	}
}