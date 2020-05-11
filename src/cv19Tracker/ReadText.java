package cv19Tracker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
public class ReadText {

    public static String[] readTextFromUrl(String urlString) {
        StringBuilder sb = new StringBuilder();
        try {
            URL url = new URL(urlString);
            BufferedReader r = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            while ((line = r.readLine()) != null) {
                sb.append(line);
                sb.append(System.getProperty("line.separator"));
            }
            r.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        String s =sb.toString();
        s=s.substring(1,s.length()-2);
        String[] sa = s.split(",");

        return sa;
    }
}
