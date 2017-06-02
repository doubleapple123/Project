package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Leon Chen on 5/24/2017.
 */
public class FromWebsite {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://stackoverflow.com/questions/6159118/using-java-to-pull-data-from-a-webpage#6159831");
        URLConnection con = url.openConnection();
        InputStream is = con.getInputStream();

        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line = null;

        while((line = br.readLine()) != null){
            System.out.println(line);

        }
    }

}
