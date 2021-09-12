
class Zomato {

	int x = 10;
	static int y = 20;

	void order() {

		System.out.println("In Order method");

		class Hotels {

			String hotelName = null;

			Hotels(String hotelName) {

				this.hotelName = hotelName;
			}

			void orderPlaced() {

				System.out.println("Order Placed at Hotel = " + hotelName);
				System.out.println(x);
				System.out.println(y);
			}
		}

		Hotels h = new Hotels("GreenPark");
		h.orderPlaced();
	}
	
	public static void main(String[] args) {

		Zomato z = new Zomato();
		z.order();
	}
}