/*
	_ _ _ A
	_ _ B B
	_ C C C
	D D D D
*/

class SpacePattern2 {

	public static void main(String[] args) {

		char ch = 'A';

		for(int row = 1; row <= 4; row++) {

			for(int space = 3; space >= row; space--) {

				System.out.print("  ");
			}

			for(int col = 1; col <= row; col++) {

				System.out.print(ch+" ");
			}
			ch++;
			System.out.println();
		}
	}
}