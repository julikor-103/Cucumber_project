package hellocucumber.pages;

import hellocucumber.utils.Waiters;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchByKeyWordPage extends BasePage {

        public SearchByKeyWordPage(WebDriver driver) {
            super(driver);
        }

        @FindBy(id="search_query_top")
        private WebElement searchInput;

        @FindBy(name="submit_search")
        private WebElement submitBtn;

        @Step("Search by key word")
        public SearchByKeyWordPage search(String text){
            searchInput.sendKeys(text);
            submitBtn.submit();
            Waiters.waitForVisibilityByCssSelector(driver, Waiters.LSearchResultForClothes);
            return new SearchByKeyWordPage(driver);
        }
    }

