
class StringArrayDemo {

	public static void main(String[] args) {

		String s1 = new String("Amazon");
		String s2 = new String("Google");
		String s3 = new String("Apple");
		String s4 = new String("Microsoft");
		String s5 = new String("Tesla");

		String strArr[] = new String[] {s1,s2,s3,s4,s5};

		for(int i = 0; i < strArr.length; i++) {

			System.out.println(strArr[i]);
		}		
	}
}