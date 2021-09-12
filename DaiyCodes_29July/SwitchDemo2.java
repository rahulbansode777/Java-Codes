class SwitchDemo2 {

	public static void main(String[] args) {

		char x = 'B';			//A-Z => 65-90 a-z => 97-122

		switch(x) {			//byte,short,int,char
	
			case 65:
				System.out.println("A - ASCII");
				break;
			case 66:
				System.out.println("B - char");
				break;
		}
	}
}