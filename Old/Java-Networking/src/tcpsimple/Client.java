package tcpsimple;

import util.NetworkUtil;

public class Client {
	public static void main(String args[]) {
		try {
			String serverAddress = "127.0.0.1";
			int serverPort = 44444;
			NetworkUtil nc = new NetworkUtil(serverAddress,serverPort);
			String name = "C";
			nc.write(name);
			System.out.println(nc.read());
		} catch(Exception e) {
			System.out.println (e);
		}
	}
}

