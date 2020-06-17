package hellocucumber.pages;

import hellocucumber.utils.Waiters;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

import static hellocucumber.utils.Waiters.TIME_TEN;
import static hellocucumber.utils.Waiters.implicitWait;


public class GoogleResultPage extends BasePage {

    public static final String SITE_LINK_ELEMENT = "Automation Practice";
    public static final String URL_AUTOPRACTICE = "http://automationpractice.com/index.php";

    @FindBy(partialLinkText = SITE_LINK_ELEMENT)
    private WebElement clickBySearchLink;

    public GoogleResultPage(WebDriver driver) {
        super(driver);
    }

    public void openUrlByName() {
        implicitWait(driver, TIME_TEN, TimeUnit.SECONDS);
        clickBySearchLink.sendKeys(Keys.ENTER);
        Waiters.waitForUrl(driver, Waiters.TIME_FIVE, URL_AUTOPRACTICE);
    }
}

