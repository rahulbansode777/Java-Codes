class NewThread extends Thread {

	public void run() {

		System.out.println("Thread name = " + Thread.currentThread().getName());		
	}
}

class MyThread extends Thread {

	public void run() {

		System.out.println("Thread name = " + Thread.currentThread().getName());

		NewThread nt = new NewThread();		//2nd way of creating new thread(call from run method)
		nt.start();		
	}
}

class MultipleThread {
	
	public static void main(String[] args) {
	
		MyThread mt = new MyThread();
		mt.start();

		System.out.println("Thread name = " + Thread.currentThread().getName());

		//MyThread mt1 = new MyThread();	//1st way of creating new thread
		//mt1.start();
	}
}
