
package cv19Tracker;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.net.URL;
        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;

        import static cv19Tracker.ConvertArraytoString.convertArrayToString;

public class UrlToInt {

    public static String[] readNumberFromUrl(String urlString) {
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
//        s=s.substring(1,s.length()-2);
//        String[] sa = s.split(",");
//        s=convertArrayToString(sa);
//        sa=s.split(":");
        s =s.replaceAll("[^-?0-9]+", " ");
        String[] sa =s.trim().split(" ");
        return sa;
    }
}
