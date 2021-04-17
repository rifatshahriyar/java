package tcpforward;

import util.NetworkUtil;

import java.io.IOException;
import java.util.HashMap;

public class ReadThreadServer implements Runnable {
    private Thread thr;
    private NetworkUtil networkUtil;
    public HashMap<String, NetworkUtil> clientMap;


    public ReadThreadServer(HashMap<String, NetworkUtil> map, NetworkUtil networkUtil) {
        this.clientMap = map;
        this.networkUtil = networkUtil;
        this.thr = new Thread(this);
        thr.start();
    }

    public void run() {
        try {
            while (true) {
                Object o = networkUtil.read();
                if (o != null) {
                    if (o instanceof Message) {
                        Message obj = (Message) o;
                        String to = obj.getTo();
                        NetworkUtil nu = clientMap.get(to);
                        if (nu != null) {
                            nu.write(obj);
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                networkUtil.closeConnection();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}



