package tcpobject;

import util.NetworkUtil;

import java.io.IOException;

public class ReadThread implements Runnable {
    private Thread thr;
    private NetworkUtil networkUtil;

    public ReadThread(NetworkUtil networkUtil) {
        this.networkUtil = networkUtil;
        this.thr = new Thread(this);
        thr.start();
    }

    public void run() {
        try {
            while (true) {
                Object o = networkUtil.read();
                if (o != null) {
                    if (o instanceof Data) {
                        Data obj = (Data) o;
                        System.out.println("Received: " + obj.getId() + ", " + obj.getValue());
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



