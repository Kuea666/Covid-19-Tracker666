package cv19Tracker.strategy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 *Read data from the url convert to text
 *
 * @author  Siravit 6210546048
 */
public class ReadTextStrategy implements ReaderStrategy {
    /**
     * reader is method return text
     * @param urlString is url that contain data
     * @return splitStringArray that contain text from url
     */
    public String[] reader(String urlString) {
    StringBuilder stringBuilder = new StringBuilder(); //create an object of StringBuilder
    try {
        URL url = new URL(urlString);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line);
            stringBuilder.append(System.getProperty("line.separator"));
        }
        bufferedReader.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
    String s =stringBuilder.toString();
    s=s.substring(1,s.length()-2);
    String[] splitStringArray = s.split(",");

    return splitStringArray;//return text
    }
}
