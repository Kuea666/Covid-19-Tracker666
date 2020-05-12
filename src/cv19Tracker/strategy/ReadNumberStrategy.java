package cv19Tracker.strategy;
        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.net.URL;
/**
 *Read data from the url convert to number
 *
 * @author  Siravit 6210546048
 */
public class ReadNumberStrategy implements ReaderStrategy {
    /**
     * reader is method return number
     * @param urlString is url that contain data
     * @return stringArrays that contain number from url
     */
    public String[] reader(String urlString) {
        StringBuilder stringBuilder = new StringBuilder();
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
        String string = stringBuilder.toString();
        string =string.replaceAll("[^-?0-9]+", " ");
        String[] stringArrays =string.trim().split(" ");
        return stringArrays;
    }
}
