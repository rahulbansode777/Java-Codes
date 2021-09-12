class ForWhileDemo {

	public static void main(String[] args) {

		int num = 247;
		int rem = 0;
		int sum = 0;

		for(;num != 0;) {

			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		System.out.println("Sum = " + sum);
	}
}