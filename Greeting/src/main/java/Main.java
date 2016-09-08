
import java.util.ResourceBundle;


/**
 * Created by Alex on 07.09.2016.
 */
public class Main {



    public static void main(String[] args) {
        Greet.log.info("Create Greet object");
        Greet gr = new Greet();
        gr.getLocale();
        gr.gethours();
        ResourceBundle bundle = ResourceBundle.getBundle("Bundle", gr.myLocale);
        Greet.log.info("Switch language");
        gr.showMessage(bundle);
        Greet.log.info("Conclusion greetings");
        Greet.log.info("Terminate program");

    }
}
