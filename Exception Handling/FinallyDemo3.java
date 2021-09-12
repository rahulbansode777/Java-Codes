import java.io.*;

class FinallyDemo3 {

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		try {

			System.out.println("In try");		

			System.out.println(br.readLine());		
		} catch(Exception e) {				

			System.out.println("In catch");			
		} finally {

			System.out.println("In finally");
			br.close();			
		}
	}
}

//"finally" is a "clean up code" - used to close the sockets/connections.
//multiple "finally" are not allowed without "try" block
//i.e.(finally chya nntr lagech dusra finally nahi yeu shakat. It comes with try)
//i.e. try {} finally {} finally{} -> Is not allowed