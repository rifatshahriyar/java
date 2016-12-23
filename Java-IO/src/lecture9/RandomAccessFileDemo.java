package lecture9;

import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
    public static void main(String[] args) throws Exception {
        RandomAccessFile file = new RandomAccessFile("random.txt", "rw");
        // write something in the file
        file.writeUTF("Hello World\n");
        // set the file pointer at 0 position
        file.seek(0);
        // print the line
        System.out.println(file.readLine());
        // set the file pointer at 0 position
        file.seek(0);
        // write something in the file
        file.writeUTF("This is an example \n Hello World");
        // set the file pointer at 0 position
        file.seek(0);
        // print the line
        System.out.println(file.readLine());
        file.close();
    }
}
