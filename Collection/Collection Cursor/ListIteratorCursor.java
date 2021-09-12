

import java.util.*;

class ListIteratorCursor {

	public static void main(String[] args) {

		Vector v = new Vector();

		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(50);

		System.out.println(v);			//[10,20,30,40,50]

		ListIterator e = v.listIterator();	//ListIterator cursor

		while(e.hasNext()) {

			Integer I = (Integer)e.next();

			if(I == 30) {

				e.set(60);
			}
		}

		while(e.hasPrevious()) {

			System.out.println(e.previous());
		}

	}
}
