package base;

import com.microsoft.playwright.Page;
import utils.PlaywrightFactory;

public class BaseTest {
    protected Page page;
    protected PlaywrightFactory pf;

    public Page initBrowser() {
        pf = new PlaywrightFactory();
        page = pf.initBrowser();
        return page;
    }

    public void tearDown() {
        if (pf != null) pf.close();
    }
}