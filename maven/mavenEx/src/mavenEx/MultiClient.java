package mavenEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MultiClient {

	public static void main(String args[]) throws IOException,
			UnknownHostException {
			
		Socket s = new Socket("127.0.0.1", 1953);
		PrintWriter sout = new PrintWriter(s.getOutputStream(), true);
		BufferedReader sin = new BufferedReader(new InputStreamReader(
				s.getInputStream()));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			while (true) {
				System.out.println("Enter string");
				String str = br.readLine();
				sout.println(str);
				System.out.println("server response");
				System.out.println(sin.readLine());
			}
		}

		catch (Exception e) {
		}

		finally {
			sout.close();
			sin.close();
			s.close();
		}
	}
}
