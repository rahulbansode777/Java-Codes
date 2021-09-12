import java.util.*;

class ArrayListMethods {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add("Amazon");
		al.add("Microsoft");
		al.add("Apple");
		al.add("Flipkart");
		al.add("Amazon");

		System.out.println(al);

		//add(index,object)
		al.add(2,"Oracle");
		System.out.println(al);

		//indexOf(object)
		System.out.println(al.indexOf("Amazon"));

		//lastIndexOf(object)
		System.out.println(al.lastIndexOf("Amazon"));

		//size()
		System.out.println(al.size());

		//remove(int)
		al.remove(3);
		System.out.println(al);

		//remove(object)
		al.remove("Amazon");	
		System.out.println(al);

		//clone(return type is Object)
		ArrayList al2 = (ArrayList)al.clone();
		System.out.println(al2);

		//clear()
		al.clear();
		System.out.println(al);
		System.out.println(al2);
	}
}