class TernaryDemo {

	public static void main(String[] args) {

		int x = 30;
		int y = 50;
		int z = 80;

		int ans = 0;

		ans = (x > y) ? ((x>z) ? x : z) : ((y>z) ? y :z);
		System.out.println(ans);
	}
}