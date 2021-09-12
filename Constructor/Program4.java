class IPL {

	private String playerName = "KLRahul";
	private int runs = 579;

	IPL() {

		System.out.println("In No arg Constructor");
	}

	IPL(String playerName, int runs) {

		System.out.println("In parameterized Constructor");
		this.playerName = playerName;
		this.runs = runs;
	}

	void display() {

		System.out.println("Name = " + playerName);
		System.out.println("Runs = " + runs);
	}
}

class IPL2020 {

	public static void main(String[] args) {

		IPL obj = new IPL();
		obj.display();

		IPL obj2 = new IPL("Mayank",550);
		obj2.display();
	}
}