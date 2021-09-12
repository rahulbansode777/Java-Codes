
interface MumbaiMarket {

	static void quality() {	//body to method in interface is not allowed but for newer versions it is allowed by 						//using keywords default or static

		System.out.println("Best Quality");
	}

	void price();
}

class SunilShop implements MumbaiMarket {

	public void price() {

		System.out.println("500-600");
	}
}

class TilakRoadShop implements MumbaiMarket {

	public void price() {

		System.out.println("800-900");
	}	
}

class Test {

	public static void main(String[] args) {

		MumbaiMarket obj1 = new SunilShop();
		obj1.quality();
		obj1.price();

		MumbaiMarket obj2 = new TilakRoadShop();
		obj2.quality();
		obj2.price();
	}
}