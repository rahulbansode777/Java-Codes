/*	1 2 3 4
	A B C
	5 6
	D
*/

class PatternDemo4 {

	public static void main(String[] args) {

		int num = 1;
		char ch = 'A';

		for(int i = 1; i <= 4; i++) {

			for(int j = 4; j >= i; j--) {

				if(i == 1 || i == 3) {
					System.out.print(num+" ");
					num++;
				} else {
					System.out.print(ch+" ");
					ch++;
				}
			}
				System.out.println();
		}
	}
}