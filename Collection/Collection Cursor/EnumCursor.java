import java.util.*;

class EnumCursor {

	public static void main(String[] args) {

		Vector v = new Vector();

		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(50);

		System.out.println(v);

		Enumeration e = v.elements();	//enum cursor

		while(e.hasMoreElements()) {

			Integer val = (Integer)e.nextElement();

			if(val % 4 == 0)
				System.out.println(val);
		}
	}
}
