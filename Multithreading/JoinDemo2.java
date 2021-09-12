class MyThread extends Thread {

	static Thread mainThread = null;

	public void run() {

		//System.out.println(mainThread.getName());	//main
		try {

			mainThread.join();
		}catch(InterruptedException ie) {

			
		}

		for(int i = 0; i < 10; i++) {

			System.out.println("Child Thread");
		}
	}
}

class JoinDemo2 {

	public static void main(String[] args) throws InterruptedException {

		MyThread mt = new MyThread();
		mt.start();

		MyThread.mainThread = Thread.currentThread();

		for(int i = 0; i < 10; i++) {

			System.out.println("Parent Thread");
		}
	}
}