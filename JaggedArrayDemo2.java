class JaggedArrayDemo2 {

	public static void main(String[] args) {

		int[][] arr = {{1,2},{3,4,5},{6,7,8,9}};
		
		System.out.println("Array1");
		for(int i = 0; i < arr.length; i++) {

			for(int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		int[][] xarr = new int[3][];

		xarr [0] = new int[]{1,2};
		xarr [1] = new int[]{3,4,5};
		xarr [2] = new int[]{6,7,8,9};

		System.out.println("Array2");		
		for(int i = 0; i < xarr.length; i++) {

			for(int j = 0; j < xarr[i].length; j++) {

				System.out.print(xarr[i][j] + " ");
			}
			System.out.println();
		}
	}
}