import java.util.*;

class VectorDemo3 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add(20);
		al.add(20);
		al.add(20);
		al.add(20);
		al.add(20);

		Vector v = new Vector(al);

		System.out.println(v);

		v.addElement(10);
		v.addElement(10);
		v.addElement(10);
		v.addElement(10);
		v.addElement(10);

		System.out.println(v);		
	}
}