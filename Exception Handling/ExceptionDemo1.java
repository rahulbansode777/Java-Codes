class Core2Web extends RuntimeException {

	int x = 20;
}

class ExceptionDemo {

	public static void main(String[] args) {

		System.out.println("Before Exception");

		try {

			System.out.println(10/0);
		} catch(Core2Web e) {

			System.out.println("Handling Code");
		}
		System.out.println("After Exception");				
	}
}