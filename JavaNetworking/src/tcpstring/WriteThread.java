package tcpstring;

import java.io.IOException;
import java.util.Scanner;

import util.NetworkUtil;

public class WriteThread implements Runnable {

    private Thread thr;
    private NetworkUtil networkUtil;
    String name;

    public WriteThread(NetworkUtil networkUtil, String name) {
        this.networkUtil = networkUtil;
        this.name = name;
        this.thr = new Thread(this);
        thr.start();
    }

    public void run() {
        try {
            Scanner input = new Scanner(System.in);
            while (true) {
                System.out.println("Enter a message to send: ");
                String s = input.nextLine();
                networkUtil.write(name + ":" + s);
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



