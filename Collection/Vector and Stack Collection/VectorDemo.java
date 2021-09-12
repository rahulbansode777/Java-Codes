import java.util.*;

class VectorDemo {

	public static void main(String[] args) {

		Vector v = new Vector();
		System.out.println(v.capacity());	//10

		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(10);

		System.out.println(v);
		System.out.println(v.capacity());	//10

		v.addElement(60);
		v.addElement(70);
		v.addElement(80);
		v.addElement(90);
		v.addElement(100);

		System.out.println(v);
		System.out.println(v.capacity());	//10

		v.addElement(80);
		System.out.println(v);
		System.out.println(v.capacity());	//20 (capacity * 2)

		System.out.println();
		System.out.println("Vector Elements are: ");

		Enumeration e = v.elements();

		while(e.hasMoreElements()) {

			System.out.println(e.nextElement());
		}
	}
}
