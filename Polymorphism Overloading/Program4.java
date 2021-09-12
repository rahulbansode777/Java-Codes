class Demo {

	void m1(int x, float y) {

		System.out.println("Int-float Para");
	}

	void m1(float x, int y) {

		System.out.println("Float-int Para");
	}

	public static void main(String[] args) {

		Demo obj = new Demo();

		obj.m1(10,10.5f);
		obj.m1(10.5f,10);

		//obj.m1(10,10);
		obj.m1(10.5f,10.5f);
	}
}