package tcpdiff;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Hashtable;

import util.NetworkUtil;

public class Server {

	private ServerSocket ServSock;
	public int i = 1;
	public Hashtable<String, NetworkUtil> table;
	
	Server() {
		table = new Hashtable<>();
		try {
			ServSock = new ServerSocket(33333);
			new WriteThreadServer(table, "Server");
			while (true) {
				Socket clientSock = ServSock.accept();
				NetworkUtil nc=new NetworkUtil(clientSock);
				table.put("c"+ i++, nc);
				new ReadThread(nc);
			}
		}catch(Exception e) {
			System.out.println("Server starts:"+e);
		}
	}
	
	public static void main(String args[]) {
		Server objServer = new Server();
	}
}


