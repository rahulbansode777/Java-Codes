class Demo {

	void m1(Object s1) {

		System.out.println("Object method");
	}

	void m1(String s1) {

		System.out.println("String method");
	}
}

class Test {

	public static void main(String[] args) {

		Demo obj = new Demo();

		obj.m1("Shashi");
		obj.m1(new Object());

		obj.m1(null);
	}
}