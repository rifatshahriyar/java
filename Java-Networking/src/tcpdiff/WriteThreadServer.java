package tcpdiff;

import java.util.*;

import util.NetworkUtil;

public class WriteThreadServer implements Runnable {

	private Thread thr;
	String name;
	public Hashtable<String, NetworkUtil> table;

	public WriteThreadServer(Hashtable<String, NetworkUtil> table, String name) {
		this.table = table;
		this.name = name;
		this.thr = new Thread(this);
		thr.start();
	}
	
	public void run() {
		try {
			Scanner input=new Scanner(System.in);
			while(true) {
				String s=input.nextLine();
				System.out.println(s);
				StringTokenizer st = new StringTokenizer(s);
				String cName = st.nextToken();
				NetworkUtil nc = table.get(cName);
				if (nc != null) {
						System.out.println();
						nc.write(name + ":" + s);
				}
			}
		} catch(Exception e) {
			System.out.println (e);
		}			
	}
}



