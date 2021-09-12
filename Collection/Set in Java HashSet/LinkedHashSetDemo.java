import java.util.*;

class LinkedHashSetDemo {

	public static void main(String[] args) {

		LinkedHashSet lh = new LinkedHashSet();
		//HashSet lh = new HashSet();

		lh.add("Apple");
		lh.add("Amazon");
		lh.add("Microsoft");
		lh.add("NVidia");

		System.out.println(lh);
	}
}

//insertion order is preserved by LinkedHashSet
//insertion order is not preserved by HashSet