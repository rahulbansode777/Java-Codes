import java.util.*;

class VectorDemo2 {

	public static void main(String[] args) {

		//Vector v = new Vector(11);
		Vector v = new Vector(11,5);
		System.out.println(v.capacity());	//11

		v.addElement(10);
		v.addElement(10);
		v.addElement(10);
		v.addElement(10);
		v.addElement(10);
		v.addElement(10);
		v.addElement(10);
		v.addElement(10);
		v.addElement(10);
		v.addElement(10);
		v.addElement(10);

		System.out.println(v.capacity());	//11

		v.addElement(10);

		//System.out.println(v.capacity());	//22 (capacity * 2)
		System.out.println(v.capacity());	//16 (capacity + 5)
	}
}
