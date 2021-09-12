
class StringConstrDemo2 {

	public static void main(String[] args) {

		char name[] = {'s','h','a','s','h','i'};

		String obj = new String(name);			//Constructor type 3 - char parameter

		System.out.println(obj);

		byte barr[] = {100,101,102,103,104};

		String s2 = new String(barr);			//Constructor type 4 - byte parameter

		System.out.println(s2);	
	}
}