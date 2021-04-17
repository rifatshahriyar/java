package others;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class TestHttpURL {
    public static void main(String[] args) {
        HttpURLConnection connection = null;
        try {
            URL url = new URL("https://rifatshahriyar.github.io");
            connection = (HttpURLConnection) url.openConnection();
            connection.connect();
            InputStream is = connection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            /*while (true) {
                int c = is.read();
                if (c == -1) break;
                System.out.print((char)c);
            }*/
            String s;
            while (true) {
                s = br.readLine();
                if (s == null) break;
                System.out.println(s);
            }
            // do something with the input stream here
        } catch (MalformedURLException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        } finally {
            if (null != connection) {
                connection.disconnect();
            }
        }
    }
}

