package ChatApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String args[]) throws IOException {

		ServerSocket serversocket = new ServerSocket(2345);
		Socket clientsocket = null;

		clientsocket = serversocket.accept();
		System.out.println("CONNECTED");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader brs = new BufferedReader(new InputStreamReader(clientsocket.getInputStream()));
		PrintWriter pw = new PrintWriter(clientsocket.getOutputStream(), true);

		String clientresponse,serverresponse;

		while ((clientresponse = brs.readLine())!= null) {
			System.out.println(clientresponse);
			serverresponse = br.readLine();
			pw.println(serverresponse);
			System.out.flush();
		
		}
		
		pw.close();
		clientsocket.close();

	}
}