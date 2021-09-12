class StringBufferDemo3 {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("Shashi");
		StringBuffer sb2 = new StringBuffer("Biencaps");

	//length()
		System.out.println(sb1.length());	//6

	//capacity()
		System.out.println(sb1.capacity());	//22

	//charAt()
		System.out.println(sb1.charAt(3));	//s

	//append()
		sb1.append("Bagal");		//append - String type
		System.out.println(sb1);	//ShashiBagal

		sb1.append(28);			//append - int type
		System.out.println(sb1);	//ShashiBagal28

		sb1.append(sb2);		//append - object type
		System.out.println(sb1);	//ShashiBagal28Biencaps

	//insert()
		sb1.insert(13,"Core2Web");
		System.out.println(sb1);	//ShashiBagal28Core2WebBiencaps

	//deleteCharAt()
		sb1.deleteCharAt(11);
		System.out.println(sb1);	//ShashiBagal8Core2WebBiencaps	

	//delete()
		sb1.delete(6,12);
		System.out.println(sb1);	//ShashiCore2WebBiencaps

	//reverse()
		sb1.reverse();
		System.out.println(sb1);	//spacneiBbeW2eroCihsahS

		sb1.reverse();

	//setLength()
		sb1.setLength(6);
		System.out.println(sb1);	
	}
}