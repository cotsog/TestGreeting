
import org.apache.log4j.Logger;

import java.util.ResourceBundle;

/**
 * Created by Alex on 07.09.2016.
 */
 public class Main {

    public static Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        log.info("Create Greet object");
        Greet gr = new Greet();
        gr.getLocale();
        gr.gethours();
        ResourceBundle bundle = ResourceBundle.getBundle("Bundle", gr.myLocale);
        log.info("Switch language");
        gr.showMessage(bundle);
        log.info("Conclusion greetings");
        log.info("Terminate program");

    }
}
