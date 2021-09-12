class Company {

	String CompName = "BMC Software";
	private String name = "Rahul";
	private int age = 29;

	Company() {

		System.out.println("No-arg Constructor");
	}

	//Company(String empname, int empage) {
	Company(String name, int age) {

		System.out.println("Parameterized Constructor");
		//name = empname;
		//age = empage;
		this.name = name;
		this.age = age;
	}

	void display() {

		System.out.println("CompanyName = " + CompName);	
		System.out.println("Name = " + name);
		System.out.println("Age = " + age);
	}
}

class Employee {

	public static void main(String[] args) {

		Company rahul = new Company();
		rahul.display();
		Company kanha = new Company("Kanha",28);
		kanha.display();
	}
}