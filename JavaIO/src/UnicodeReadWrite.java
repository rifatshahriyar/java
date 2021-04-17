import java.io.*;

public class UnicodeReadWrite {
    public static void main(String args[]) throws Exception {
        Reader reader = new InputStreamReader(new FileInputStream("unicode.txt"), "UTF-8");
        BufferedReader br = new BufferedReader(reader);
        Writer writer = new OutputStreamWriter(new FileOutputStream("unicodeout.txt"), "UTF-8");
        BufferedWriter bw = new BufferedWriter(writer);
        String s;
        while (true) {
            s = br.readLine();
            if (s == null) break;
            System.out.println(s);
            bw.write(s);
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
