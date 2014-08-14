package ChatApplication;

import java.io.*;
import java.sql.*;
import java.net.*;

class ServerThread implements Runnable {
	ServerSocket s;
	int id;
	Socket client;

	ServerThread(ServerSocket s, int id) {
		this.s = s;
		this.id = id;
	}

	public void run() {
		Connection con = null;
		PrintWriter sout= null;
		BufferedReader sin= null;
		try {

			client = s.accept();
			System.out.println("Connected to client no. " + id);
			sout = new PrintWriter(client.getOutputStream(), true);
			sin = new BufferedReader(new InputStreamReader(
					client.getInputStream()));
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			int port = client.getPort();
			int localport = client.getLocalPort();
			String address = client.getInetAddress().toString();
			String localaddress = client.getLocalAddress().toString();

			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/chatDB",
					"root", "mysql");

			Statement stmt = con.createStatement();
			String sql = "INSERT INTO users" + " VALUES ('" + id + "','" + port
					+ "','" + localport + "','" + address + "','"
					+ localaddress + "')";
			stmt.executeUpdate(sql);

			String line, response;
			while ((line = sin.readLine()) != null) {
				System.out.println("Client response "+line);
				response = br.readLine();
				sout.println("Client No. " + id + " " + response);

			}
		}

		catch (UnknownHostException e) {
			e.printStackTrace();
		}

		catch (IOException e) {
			e.printStackTrace();
		}

		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			try {
				con.close();
				sout.close();
				sin.close();
				client.close();
			} 
			
			catch (SQLException e) {
				e.printStackTrace();
			} 
			
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

public class MultiThreadServer {
	public static void main(String args[]) throws IOException {
		try {
			int count = 1;
			System.out.println("Creating Server Socket");
			ServerSocket s = new ServerSocket(1953);
			System.out.println("Waiting For Connections");
			while (count < 6) {

				ServerThread st = new ServerThread(s, count);
				new Thread(st).start();
				count++;
			}
		}

		catch (Exception e) {
		}
	}
}
