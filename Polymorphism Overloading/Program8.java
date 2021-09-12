class Demo {

	void m1(int x) {

		System.out.println("Int Method");
	}

	void m1(int ... varg) {

		System.out.println("VarArgs Method");
	}
}

class Test {

	public static void main(String[] args) {

		Demo obj = new Demo();

		obj.m1();
		obj.m1(10);
		obj.m1(10,20);
	}
}