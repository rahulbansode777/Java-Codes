class Core2Web {

	Core2Web() {

		System.out.println("Core2Web Constructor");
	}

	void learning() {

		System.out.println("Programming Language");
		System.out.println("Guide : Shashi");
	}
}

class Incubator extends Core2Web {

	Incubator() {

		System.out.println("Incubator Constructor");
	}

	void implementation() {

		System.out.println("Projects");
		System.out.println("Self Learning");
	}	
}

class Network extends Core2Web {

	Network() {

		System.out.println("Network Constructor");
	}

	void connect() {

		System.out.println("Coders Community");
		System.out.println("Guide : Professionals");
	}
}

class Students {

	public static void main(String[] args) {

		Core2Web c2w = new Core2Web();
		c2w.learning();

		//Type1
		Incubator ibtr = new Incubator();
		ibtr.implementation();

		Core2Web obj = new Incubator();
		obj.implementation();
	}
}