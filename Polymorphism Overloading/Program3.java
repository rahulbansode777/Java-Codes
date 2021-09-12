
class OverloadDemo {

	void m1(int x) {

		System.out.println("Int in m1");
	}

	void m1(float x) {

		System.out.println("Float in m1");
	}
}

class Test {

	public static void main(String[] args) {

		OverloadDemo obj = new OverloadDemo();

		obj.m1('A');
		obj.m1(20);
		obj.m1(30l);
		obj.m1(30.5f);
	}	
}