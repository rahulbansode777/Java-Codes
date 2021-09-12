class StringDemo6 {

	public static void main(String[] args) {

		String s1 = new String("Bielearn");
		String s2 = new String("BieMedia");
		String s3 = new String("BieTickets");

		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3,6));		//(Start Index, End Index - 1)

		System.out.println(s1);
		System.out.println(s1.toUpperCase());		//BIELEARN
		System.out.println(s1.toLowerCase());		//bielearn
	}
}