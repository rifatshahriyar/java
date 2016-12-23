package tcpstring;

import java.util.*;
import util.NetworkUtil;

public class WriteThread implements Runnable {
	
	private Thread thr;
	private NetworkUtil nc;
	String name;

	public WriteThread(NetworkUtil nc,String name) {
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
				nc.write(name+":"+s);																
			}
		} catch(Exception e) {
			System.out.println (e);
		}			
		nc.closeConnection();
	}
}



