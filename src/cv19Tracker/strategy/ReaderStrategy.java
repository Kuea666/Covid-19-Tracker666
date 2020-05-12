package cv19Tracker.strategy;

/**
 * An interface for strategies to get data from the url.
 * @author Siravit 6210546048
 */
public interface ReaderStrategy {
    /**
     *Select and return items from the url
     * @param urlString is url thai contain data
     * @return string arrays in text or number
     */
    String[] reader(String urlString);

}
