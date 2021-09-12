import java.util.*;

class BigBazaar {

	String prodName = null;
	float price = 0.0f;

	BigBazaar(String prodName, float price) {

		this.prodName = prodName;
		this.price = price;
	}

	void disp() {

		System.out.println("Product : "+ prodName);
		System.out.println("Price : "+ price);
	}

}

class LinkedListConstr {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();

		ll.add(new BigBazaar("Gahoo",45.50f));
		ll.add(new BigBazaar("Tandul",50.50f));
		ll.add(new BigBazaar("Bajari",60.50f));
		ll.add(new BigBazaar("Jwari",55.50f));

		System.out.println(ll);

		Iterator itr = ll.iterator();

		while(itr.hasNext()) {

			BigBazaar obj = (BigBazaar)itr.next();
			obj.disp();
		}
	}
}