
import java.io.*;

class CheckedDemo {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println(br.readLine());

		br.close();

		try {

			System.out.println(br.readLine());
		} catch(IOException obj) {

			System.out.println("Buffered pipe already closed");
		}
	}
}