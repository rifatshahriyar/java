package tcpobject;

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
				Data d =new Data(name+":"+s);
				nc.write(d);																
			}
		} catch(Exception e) {
			System.out.println (e);
		}			
		nc.closeConnection();
	}
}



