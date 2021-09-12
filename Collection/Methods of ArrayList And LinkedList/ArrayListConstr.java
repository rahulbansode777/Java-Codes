import java.util.*;

class ArrayListConstr {

	public static void main(String[] args) {

		ArrayList al1 = new ArrayList();
		//System.out.println(al1.capacity());	//Error(it doesn't have capacity() method)
		//System.out.println(al1.size());		//0

		al1.add(10);
		al1.add(10);
		al1.add(10);
		al1.add(10);
		al1.add(10);

		System.out.println(al1);

		ArrayList al2 = new ArrayList(al1);
		al1.add(20);
		al1.add(20);

		System.out.println(al1);
	}
}