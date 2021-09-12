import java.util.*;

class HashSetDemo {

	public static void main(String[] args) {

		Set s = new HashSet();

		s.add("Ashish");
		s.add("Kanha");
		s.add("Rahul");
		s.add("Rajesh");
		System.out.println(s.add("Badhe"));	//true
		System.out.println(s.add("Kanha")); 	//false
		System.out.println(s.add("Badhe")); 	//false

		System.out.println(s);
	}
}
