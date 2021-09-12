import java.io.*;

class Input1 {

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//String input = br.readLine();
		//System.out.println(input);

		System.out.println(br.readLine());
	}
}