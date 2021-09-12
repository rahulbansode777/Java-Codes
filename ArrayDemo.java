class ArrayDemo {

	public static void main(String[] args) {

		int[] rahul = new int[5];

		rahul[0] = 10;
		rahul[1] = 20;
		rahul[2] = 30;
		rahul[3] = 40;
		rahul[4] = 50;

		for(int i = 0; i < 5; i++) {

			System.out.println(rahul[i]);
		}

		System.out.println(rahul.getClass());
	}
}

/* OUTPUT

D:\Java>java ArrayDemo
10
20
30
40
50
class [I        //It is a special type of class
		//It is a run time signature
		//This class contains integer variables
*/