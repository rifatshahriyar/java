package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class DatagramClient implements Runnable {
    DatagramPacket pack;
    DatagramSocket sock;

    DatagramClient() {
        new Thread(this).start();
    }

    public void run() {
        while (true) {
            try {
                receive();
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public void receive() throws Exception {
        byte data[] = new byte[1000];
        pack = new DatagramPacket(data, data.length);
        sock = new DatagramSocket(8000);
        sock.receive(pack);
        System.out.println("Data::" + new String(pack.getData()));
        sock.close();
    }

    public static void main(String[] args) {
        new DatagramClient();
    }
}
