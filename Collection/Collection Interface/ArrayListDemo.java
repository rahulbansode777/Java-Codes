import java.util.*;

class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add("Shashi");
		al.add("Ashish");
		al.add("Rahul");
		al.add("Kanha");
		al.add("Badhe");
		al.add("Ashish");

		System.out.println(al);

		ArrayList al2 = new ArrayList();

		al2.add("Madhur");
		al2.addAll(al);

		System.out.println(al2);
	}
}