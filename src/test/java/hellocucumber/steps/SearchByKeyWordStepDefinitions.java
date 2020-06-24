package hellocucumber.steps;

import hellocucumber.pages.SearchByKeyWordPage;
import hellocucumber.utils.Waiters;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;

import static hellocucumber.steps.Hooks.*;
import static hellocucumber.steps.Hooks.googleSearchPage;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SearchByKeyWordStepDefinitions {

    SearchByKeyWordPage searchByKeyWordPage = new SearchByKeyWordPage(getDriver());

    @Given("Google search page is opened")
    public static void googleSearchPageIsOpened() {
        googleSearchPage.open();
    }

    @When("Searches with text")
    public void userSearchesWithText() {

        googleSearchPage.search("automationpractice");
    }

    @And("Open url by name")
    public void userOpenUrlByName() {
        googleResultPage.openUrlByName();
    }

    @And("Input in search field dress")
    public void userInputSearchField() {
        searchByKeyWordPage.search("dress");
    }

    @And("Press buton Search")
    public void pressButtonSearch() {

    }

    //@Then("Display menu items")
    //public void displayMenuItems() {

    //List<WebElement> menuItems = getDriver().findElements(By.cssSelector(Waiters.ListItemsForClothes));
    //Assert.assertEquals(menuItems.size(), 6);
    //}

    @Then("Display menu items")
    public void displayMenuItemsSecond() {

        //List<WebElement> menuItems = getDriver().findElements(By.cssSelector(Waiters.ListItemsForClothes));
        //assertThat(menuItems, hasSize(6));
        //assertThat(menuItems.size(), greaterThan(5)); //не менее 5 елементов на странице
        //assertThat(menuItems, contains("dress"));
        //assertThat(menuItems, allOf(notNullValue(), not(empty())));
        //}


        List<WebElement> menuItems = getDriver().findElements(By.cssSelector(Waiters.ListItemsForClothes));
        SoftAssert asert = new SoftAssert();
        //asert.assertEquals(menuItems, hasSize(6), "dress");
        //asert.assertEquals(menuItems, 7, "brokedown");
        asert.assertEquals(5, 6, "Что-то пошло не так");
//
//        }
    }
}

