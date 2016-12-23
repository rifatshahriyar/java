package tcpstring;

import util.NetworkUtil;

public class Client {
	public static void main(String args[]) {
		try {
			String serverAddress = "127.0.0.1";
			int serverPort = 33333;
			NetworkUtil nc = new NetworkUtil(serverAddress,serverPort);
			new ReadThread(nc);
			new WriteThread(nc,"Client");		
		} catch(Exception e) {
			System.out.println (e);
		}
	}
}

