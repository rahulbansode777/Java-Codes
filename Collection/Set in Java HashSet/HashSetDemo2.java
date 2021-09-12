import java.util.*;

class HashSetDemo2 {

	public static void main(String[] args) {

		HashSet h = new HashSet();

		h.add("Virat Kohli");
		h.add("MS Dhoni");
		h.add("Rohit Sharma");
		h.add("Rishabh Pant");
		h.add("Hardik Pandya");

		Iterator itr = h.iterator();

		while(itr.hasNext()) {

			System.out.println(itr.next());
		}

		//contains
		System.out.println(h.contains("Shreyash Iyer"));

		//size
		System.out.println(h.size());

		//remove
		h.remove("Rishabh Pant");
		System.out.println(h);

		h.clear();

		System.out.println(h);	
	}
}