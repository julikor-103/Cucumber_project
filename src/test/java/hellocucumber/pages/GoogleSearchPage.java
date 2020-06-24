package hellocucumber.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchPage extends BasePage {
    public static final String GOOGLE_LINK = "https://www.google.com.ua/";

    @FindBy(name = "q")
    private WebElement searchField;

    public GoogleSearchPage(WebDriver driver) {
        super(driver);
    }

    @Step ("open google search")
    public GoogleSearchPage open() {
        driver.get(GOOGLE_LINK);
        //Waiters.implicitWait(driver, Waiters.TIME_TEN, TimeUnit.SECONDS);
        return this; }

    @Step ("google result search")
    public GoogleResultPage search(String text) {
        searchField.sendKeys(text);
        searchField.submit();
        return new GoogleResultPage(driver); // возвращает RESULT PAGE переходит на нее и по цепочке начинает инициализировать элементы
    }
}

