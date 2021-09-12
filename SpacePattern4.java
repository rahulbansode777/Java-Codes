/*
	_ _ _ A _ _ _
	_ _ B B B _ _
	_ C C C C C _
	D D D D D D D
*/

class SpacePattern4 {

	public static void main(String[] args) {

		char ch = 'A';

		for(int row = 1; row <= 4; row++) {

			for(int space = 3; space >= row; space--) {

				System.out.print("  ");
			}

			for(int col = 1; col <= row*2-1; col++) {

				System.out.print(ch+" ");
			}
			ch++;
			System.out.println();
		}
	}
}