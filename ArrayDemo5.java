import java.io.*;

class UserInput1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());

		int[] iarr = new int[x];

		for(int i = 0; i < iarr.length; i++) {

			System.out.print("Enter Element : ");
			iarr[i] = Integer.parseInt(br.readLine());
		}

		for(int i = 0; i < x; i++) {

			if(iarr[i] % 5 == 0)
				System.out.println(iarr[i] + " is Divisible by 5");
			else
				System.out.println(iarr[i] + " is not Divisible by 5");
		}
	}
}