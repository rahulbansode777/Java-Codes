import java.util.*;

class MultiArray {

	public static void main(String[] args) {

		int marr[][] = new int [3][3];

		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < 3; i++) {

			for(int j = 0; j < 3; j++) {

				marr[i][j] = sc.nextInt();
			}
		}

		System.out.println("Array Elements are : ");
		for(int i = 0; i < 3; i++) {

			for(int j = 0; j < 3; j++) {

				System.out.print(marr[i][j]+" ");
			}
			System.out.println();
		}		
	}
}