import java.io.*;

class PlayerInfo {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Player Info");

		int jerNo = Integer.parseInt(br.readLine());
		char grade = (char)br.read();
		br.skip(2);
		String name = br.readLine();
		double avg = Double.parseDouble(br.readLine());
		
		System.out.println("Jersey number = "+jerNo);
		System.out.println("Grade = "+grade);
		System.out.println("Name = "+name);
		System.out.println("Average = "+avg);
	}
}