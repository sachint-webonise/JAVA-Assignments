package ChatApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

	public static void main(String args[]) throws IOException {

		Socket clientsocket = new Socket("127.0.0.1", 2345);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		BufferedReader brs = new BufferedReader(new InputStreamReader(
				clientsocket.getInputStream()));
		PrintWriter pw = new PrintWriter(clientsocket.getOutputStream(), true);

		String servermessage;
		String clientmessage = "";

		while (!clientmessage.equals("bye")) {
			clientmessage = br.readLine();
			pw.println(clientmessage);
			System.out.flush();

			if ((servermessage = brs.readLine()) != null) {
				System.out.println(servermessage);
			}
		}

		pw.close();
		clientsocket.close();

	}
}
