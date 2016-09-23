

import org.junit.*;
import org.junit.Assert;
import java.util.Locale;



/**
 * Created by Alex on 08.09.2016.
 */
public class GreetingTester {
    private Greet gr;
    
        @org.junit.Before
        public void setUp ()throws Exception {
        System.out.println("Greet create");
        gr = new Greet();

    }

        @After
        public void tearDown ()throws Exception {
        gr = null;
        System.out.println("tearDown");
    }

        @Test
        public void testfirst ()throws Exception {
        Assert.assertNotNull(" Object is null ", gr);
        gr.gethours();
        Assert.assertFalse(" Out of time border ", gr.hours < 0 || gr.hours > 23);
        System.out.println("hours test");
    }


        @Test
        public void testsecond ()throws Exception {
        gr = new Greet();
        gr.getLocale();
        Locale loc = new Locale("ru", "RU");
        Locale loc2 = new Locale("en", "US");
        Assert.assertTrue("Unknown local", gr.myLocale.equals(loc) || gr.myLocale.equals(loc2));
        System.out.println("Local test");
    }


        @Ignore
        @Test(expected = AssertionError.class)
        public void ignoreTest ()throws Exception {
        Assert.assertNotNull(" Locale is null ", gr.myLocale);
    }


}
