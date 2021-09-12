class OddEven {

	
	int EvenOdd(int a) {

		if(a % 2 == 0) 
			return 0;
		else
			return 1;
	}

	public static void main(String[] args) {

		OddEven obj = new OddEven();

		int result = obj.EvenOdd(12);

		if(result == 0)
			System.out.println("Even No.");
		else
			System.out.println("Odd No.");
	}
}