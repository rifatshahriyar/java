package tcpobject;

import util.NetworkUtil;

public class ReadThread implements Runnable {
	private Thread thr;
	private NetworkUtil nc;

	public ReadThread(NetworkUtil nc) {
		this.nc = nc;
		this.thr = new Thread(this);
		thr.start();
	}
	
	public void run() {
		try {
			while(true) {
				Object o=nc.read();
				if(o!= null) {
					if(o instanceof Data) {
						Data obj=(Data)o;
						System.out.println(obj.getElement());
					}
				}	
			}
		} catch(Exception e) {
			System.out.println (e);                        
		}
		nc.closeConnection();
	}
}



