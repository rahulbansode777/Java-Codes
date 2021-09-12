/*
	_ _ _ 1
	_ _ 1 2
	_ 1 2 3
	1 2 3 4
*/

class SpacePattern1 {

	public static void main(String[] args) {

		for(int row = 1; row <= 4; row++) {

			int num = 1;

			for(int space = 3; space >= row; space--) {

				System.out.print("  ");
			}

			for(int col = 1; col <= row; col++) {

				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}