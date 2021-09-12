import java.io.*;

class InputProgram2 {

	public static void main(String[] args) throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

	//	char input = (char)br.read();
	//	System.out.println(input);

	//	int num = Integer.parseInt(br.readLine());
	//	System.out.println(num);

		double num = Double.parseDouble(br.readLine());
		System.out.println(num);
	}
}