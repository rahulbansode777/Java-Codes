class ExamsCancel {

	int x = 10;

	static int y = 20;

	int z = 30;

	void happy() {

		System.out.println("Thanks CM");

	}

	static void decisionPending() {

		System.out.println("Angry Faces");
	
	}

}

class Students {

	public static void main(String[] args) {

		ExamsCancel obj = new ExamsCancel();

		obj.happy();				//Thanks CM

		//decisionPending();			//Error

		obj.decisionPending();			//Angry Faces

		ExamsCancel.decisionPending();		//Angry Faces

	}

}