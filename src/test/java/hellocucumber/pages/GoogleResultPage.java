package hellocucumber.pages;

import hellocucumber.utils.Waiters;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class GoogleResultPage extends BasePage {


    public static final String URL_AUTOPRACTICE = "http://automationpractice.com/index.php";
    @FindBy(xpath = "")
    private WebElement clickBySearchLink;

    public GoogleResultPage(WebDriver driver) {
        super(driver);
    }

    public void openUrlByName() {
        clickBySearchLink.sendKeys(Keys.ENTER);
        Waiters.waitForUrl(driver, Waiters.TIME_FIVE, URL_AUTOPRACTICE);
    }
}

