class StringBufferDemo2 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();			//1st Constructor - empty

		System.out.println(sb);					//empty
		System.out.println(sb.capacity());			//16

		sb.append("Core2Web");
		System.out.println(sb);					//Core2Web
		System.out.println(sb.capacity());			//16

		sb.append("Technologies");
		System.out.println(sb);					//Core2WebTechnologies
		System.out.println(sb.capacity());			//34

		StringBuffer sb1 = new StringBuffer("Shashi");		//2nd Constructor - String

		System.out.println(sb1);				//Shashi		
		System.out.println(sb1.capacity());			//22
	}
}