
import com.sun.xml.internal.ws.policy.AssertionSet;
import org.junit.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import java.util.Locale;
import org.apache.log4j.Logger;

/**
 * Created by Alex on 08.09.2016.
 */
public class GreetingTester {
    public Greet gr;
    @Before
    public void init() {

        gr = new Greet();

    }

    @After
    public void tearDown() {
        gr = null;
    }

    @Test
    public void hours() {
        Assert.assertNotNull(" Object is null ", gr);
        gr.gethours();
        Assert.assertFalse(" Out of time border ", gr.hours < 0 || gr.hours > 23);
    }

    @Test
    public void local() {
        gr.getLocale();
        Locale loc = new Locale("ru","RU");
        Locale loc2 = new Locale("en","US");
        Assert.assertTrue("Unknown local",gr.myLocale.equals(loc) || gr.myLocale.equals(loc2));
    }


    @Ignore
    @Test(expected = AssertionError.class)
    public void ignrTest() {
        Assert.assertNotNull(" Locale is null ", gr.myLocale);
    }




}
