class SwitchDemo3 {

	public static void main(String[] args) {

		String x = new String("Shashi");	//byte,short,int,char,String

		switch(x) {

			case "Shashi" :
				System.out.println("Camel case");
				break;
			case "shashi" :
				System.out.println("Small case");
				break;
		}
	}
}