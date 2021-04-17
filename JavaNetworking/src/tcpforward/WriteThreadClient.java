package tcpforward;

import util.NetworkUtil;

import java.io.IOException;
import java.util.Scanner;

public class WriteThreadClient implements Runnable {

    private Thread thr;
    private NetworkUtil networkUtil;
    String name;

    public WriteThreadClient(NetworkUtil networkUtil, String name) {
        this.networkUtil = networkUtil;
        this.name = name;
        this.thr = new Thread(this);
        thr.start();
    }

    public void run() {
        try {
            Scanner input = new Scanner(System.in);
            while (true) {
                String from = name;
                System.out.print("Enter name of the client to send: ");
                String to = input.nextLine();
                System.out.print("Enter the message: ");
                String text = input.nextLine();
                Message message = new Message();
                message.setFrom(from);
                message.setTo(to);
                message.setText(text);
                networkUtil.write(message);
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



