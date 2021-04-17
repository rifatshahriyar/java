package tcpdiff;

import java.util.Scanner;

import util.NetworkUtil;

public class WriteThreadClient implements Runnable {

	private Thread thr;
	private NetworkUtil nc;
	String name;

	public WriteThreadClient(NetworkUtil nc, String name) {
		this.nc = nc;
		this.name=name;
		this.thr = new Thread(this);
		thr.start();
	}
	
	public void run() {
		try {
			Scanner input=new Scanner(System.in);

			while(true) {
				String s=input.nextLine();
				System.out.println();
				nc.write(name+":"+s);
			}
		} catch(Exception e) {
			System.out.println (e);
		}			
		nc.closeConnection();
	}
}



