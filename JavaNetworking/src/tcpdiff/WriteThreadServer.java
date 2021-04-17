package tcpdiff;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

import util.NetworkUtil;

public class WriteThreadServer implements Runnable {

    private Thread thr;
    String name;
    public HashMap<String, NetworkUtil> clientMap;

    public WriteThreadServer(HashMap<String, NetworkUtil> map, String name) {
        this.clientMap = map;
        this.name = name;
        this.thr = new Thread(this);
        thr.start();
    }

    public void run() {
        try {
            Scanner input = new Scanner(System.in);
            while (true) {
                String s = input.nextLine(); // format: clientName message
                StringTokenizer st = new StringTokenizer(s);
                String clientName = st.nextToken();
                NetworkUtil networkUtil = clientMap.get(clientName);
                if (networkUtil != null) {
                    networkUtil.write(name + ":" + s);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}



