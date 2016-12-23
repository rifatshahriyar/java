package tcpstring;

import java.net.ServerSocket;
import java.net.Socket;
import util.NetworkUtil;

public class Server {

	private ServerSocket ServSock;
	
	Server() {
		try {
			ServSock = new ServerSocket(33333);
			while (true) {
				Socket clientSock = ServSock.accept();
				NetworkUtil nc=new NetworkUtil(clientSock);
				new ReadThread(nc);
				new WriteThread(nc,"Server");
			}
		}catch(Exception e) {
			System.out.println("Server starts:"+e);
		}
	}
	
	public static void main(String args[]) {
		Server objServer = new Server();
	}
}
