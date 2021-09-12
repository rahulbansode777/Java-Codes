

import java.util.*;

class IteratorCursor {

	public static void main(String[] args) {

		Vector v = new Vector();

		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(50);

		System.out.println(v);		//[10,20,30,40,50]

		Iterator e = v.iterator();	//Iterator cursor

		while(e.hasNext()) {

			Integer val = (Integer)e.next();

			if(val % 4 == 0)
				e.remove();
		}

		System.out.println(v);		//[10,30,50]
	}
}
