package tcpstring;

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
                String s = (String) networkUtil.read();
                if (s != null) {
                    System.out.println("Received: " + s);
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



