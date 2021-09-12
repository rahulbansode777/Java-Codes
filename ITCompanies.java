class Capgemini {

	static int noOfEmp = 200000;
	int projectCount = 200;

	void displayProject() {

		System.out.println("Cap Project Count = " + projectCount);	
	}	

	static void empInfo() {

		System.out.println("Cap Total Count = " + noOfEmp);
	}

}

class TCS {

	static int noOfEmp = 300000;
	int projectCount = 500;

	void displayProject() {

		System.out.println("TCS Project Count = " + projectCount);	
	}	

	static void empInfo() {

		System.out.println("TCS Total Count = " + noOfEmp);
	}

}

class ITCompanies {

	public static void main(String[] args) {

		Capgemini pune = new Capgemini();
		pune.projectCount = 130;

		pune.empInfo();				//200000
		pune.displayProject();			//130

		Capgemini chennai = new Capgemini();
		chennai.projectCount = 70;

		chennai.empInfo();			//200000
		chennai.displayProject();		//70

		TCS mumbai = new TCS();
		mumbai.projectCount = 270;

		mumbai.empInfo();			//300000
		mumbai.displayProject();		//270

		TCS bangalore = new TCS();
		bangalore.projectCount = 230;

		bangalore.empInfo();			//300000
		bangalore.displayProject();		//230
	}

}