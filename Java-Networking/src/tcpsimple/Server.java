package tcpsimple;

import util.NetworkUtil;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	private ServerSocket ServSock;
	
	Server() {
		try {
			ServSock = new ServerSocket(44444);
			int count = 1;
			while (true) {
				Socket clientSock = ServSock.accept();
				NetworkUtil nc = new NetworkUtil(clientSock);
				System.out.println(nc.read() + "," + count);
				nc.write("Hello Client : " + count);
				count++;
			}
		} catch(Exception e) {
			System.out.println("Server starts:"+e);
		}
	}
	
	public static void main(String args[]) {
		Server objServer = new Server();
	}
}

