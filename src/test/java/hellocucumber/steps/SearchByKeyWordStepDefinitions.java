package hellocucumber.steps;
import hellocucumber.pages.GoogleResultPage;
import hellocucumber.pages.SearchByKeyWordPage;
import hellocucumber.utils.Waiters;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import static hellocucumber.steps.Hooks.getDriver;

public class SearchByKeyWordStepDefinitions {

        GoogleResultPage googleResultPage;
        SearchByKeyWordPage searchByKeyWordPage = new SearchByKeyWordPage(getDriver());

            @Given("Open url by name")
            public void userOpenUrlByName() { googleResultPage.openUrlByName(); }

            @When("Input in search field dress")
            public void userInputSearchField() { searchByKeyWordPage.search("dress"); }

            @Then("Display menu items")
            public void displayMenuItems(){
            List<WebElement> menuItems = getDriver().findElements(By.cssSelector(Waiters.ListItemsForClothes));
            Assert.assertEquals(menuItems.size(), 7);
        }
    }


