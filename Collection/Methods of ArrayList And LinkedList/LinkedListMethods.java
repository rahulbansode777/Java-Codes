import java.util.*;

class LinkedListMethods {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();

		ll.add("C");
		ll.add("Cpp");
		ll.add("Java");
		ll.add("Python");
		ll.add("Flutter");
		ll.add("Java");

		System.out.println(ll);

		//add(index,object)
		ll.add(4,"Networking");
		System.out.println(ll);

		//addFirst()
		ll.addFirst("React");
		System.out.println(ll);

		//addLast()
		ll.addLast("React");
		System.out.println(ll);

		//removeFirst()
		ll.removeFirst();
		System.out.println(ll);

		//indexOf(Object)
		System.out.println(ll.indexOf("Java"));

		//set(index,Object)	//replaces Object
		ll.set(6,"Android");
		System.out.println(ll);
	}
}