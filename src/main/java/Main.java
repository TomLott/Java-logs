import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.apache.commons.io.filefilter.AgeFileFilter;

public class Main {
    public static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        LOGGER.info("Hello world");
        LOGGER.error("Error");
    }
}
