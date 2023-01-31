import java.util.logging.*;

public class LoggerClass {

    public static Logger logger = Logger.getGlobal();
    static {
        try {
            LogManager.getLogManager().readConfiguration(Main.class.getResourceAsStream("log.config"));
        } catch (Exception ignore) {
            ignore.printStackTrace();
        }
    }
}
