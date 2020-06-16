package hellocucumber.steps;
import hellocucumber.pages.GoogleResultPage;
import hellocucumber.pages.GoogleSearchPage;
import hellocucumber.utils.BrowserFactory;
import hellocucumber.utils.Waiters;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class Hooks {
    private static WebDriver driver;
    protected static GoogleSearchPage googleSearchPage;
    protected static GoogleResultPage googleResultPage;

    public static WebDriver getDriver() {
        return driver;
    }

    @Before
    public static void setUp() {
        try {
            driver = BrowserFactory.CHROME.create();
            driver.manage().window().maximize();
            Waiters.implicitWait(driver, Waiters.TIME_TEN, TimeUnit.SECONDS);
        } catch (Exception e) {
            System.out.println("Some problems with driver occurred.");
        }
        googleSearchPage = new GoogleSearchPage(getDriver());
        googleResultPage = new GoogleResultPage(getDriver());
        }
    @After
        public static void tearDown () {
            driver.quit();
        }
    }

