import org.apache.log4j.Logger;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Alex on 08.09.2016.
 */
public class Greet {
    public static Logger log = Logger.getLogger(Main.class);
    public Date d = new Date();
    int hours;
    Locale myLocale;

    public void gethours() {

        hours = this.d.getHours();
        log.info("Get current time in hours " + hours);
    }

    public void showMessage(ResourceBundle bundle) {
        log.info("Search for a suitable greeting");
        if (hours >= 6 && hours < 9) {
            System.out.println(bundle.getString("morning"));
            log.info("Output greeting message" + " " + bundle.getString("morning"));
        }
        if (hours >= 9 && hours < 19) {
            System.out.println(bundle.getString("day"));
            log.info("Output greeting message" + " " + bundle.getString("day"));
        }
        if (hours >= 19 && hours < 23) {
            System.out.println(bundle.getString("evening"));
            log.info("Output greeting message" + " " + bundle.getString("evening"));
        }
        if (hours == 23 || hours < 6) {
            System.out.println(bundle.getString("night"));
            log.info("Output greeting message" + " " + bundle.getString("night"));
        }
        System.out.println();
    }

    public void getLocale() {
       myLocale = Locale.getDefault();
        log.info("Get current locale");
    }
    public Logger getLog()
    {
        return this.log;
    }

}
