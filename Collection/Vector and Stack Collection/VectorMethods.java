import java.util.*;

class VectorMethods {

	public static void main(String[] args) {

		Vector v = new Vector();

		v.addElement("Shashi");
		v.addElement("Ashish");
		v.addElement("Kanha");
		v.addElement("Rahul");
		v.addElement("Badhe");

		System.out.println(v);

		//capacity()
		System.out.println(v.capacity());	//10

		//size()
		System.out.println(v.size());		//5

		//isEmpty()
		System.out.println(v.isEmpty());	//false

		//elementAt()
		System.out.println(v.elementAt(2));	//Kanha

		//setElementAt()			//replace element
		v.setElementAt("Rajesh",4);
		System.out.println(v);

		//removeElementAt()
		v.removeElementAt(3);
		System.out.println(v);

		//removeElement(Object);
		v.removeElement("Shashi");
		System.out.println(v);
/*
		//removeRange(int,int)
		v.removeRange(0,2);
		System.out.println(v);

		VectorMethods.java:42: error: removeRange(int,int) has protected access in Vector
                v.removeRange(0,2);
*/
	}
}
