package stepdefinitions;

import com.microsoft.playwright.Page;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.PlaywrightFactory;

public class Hooks {
    public static Page page;  // Shared static field
    private PlaywrightFactory pf;

    @Before
    public void setUp() {
        pf = new PlaywrightFactory();
        page = pf.initBrowser();
    }

    @After
    public void tearDown() {
        if (pf != null) {
            pf.close();
        }
    }
}
