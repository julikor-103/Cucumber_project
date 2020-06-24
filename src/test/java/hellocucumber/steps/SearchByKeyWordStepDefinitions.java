package hellocucumber.steps;

import hellocucumber.pages.SearchByKeyWordPage;
import hellocucumber.utils.Waiters;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import java.util.List;
import static hellocucumber.steps.Hooks.*;
import static hellocucumber.steps.Hooks.googleSearchPage;
import static org.hamcrest.Matchers.*;

public class SearchByKeyWordStepDefinitions {

    SearchByKeyWordPage searchByKeyWordPage = new SearchByKeyWordPage(getDriver());
    List<WebElement> menuItems;
    SoftAssert asert;

    @Flaky
    @Severity(SeverityLevel.CRITICAL)
    @Description ("Test Passed")
    @Epic("epic_1146")

    @Step ("search page is open")
    @Given("Google search page is opened")
    public static void googleSearchPageIsOpened() { googleSearchPage.open(); }

    @Step ("Searches with text")
    @When("Searches with text")
    public void userSearchesWithText() { googleSearchPage.search("automationpractice"); }

    @Step ("open url by name")
    @And("Open url by name")
    public void userOpenUrlByName() { googleResultPage.openUrlByName(); }

    @Step ("input in search field dress")
    @And("Input in search field dress")
    public void userInputSearchField() { searchByKeyWordPage.search("dress"); }

    @And("Press button Search")
    public void pressButtonSearch() {
    }

    @Step ("menu items are display")
    @Then("Display menu item")
    public void displayMenuItemsSecond() {

       initTest();
       asert.assertEquals(menuItems.size(), hasSize(7), "failed");
       asert.assertEquals(menuItems.size(), greaterThan(5), "что-то пошло не так");
       asert.assertEquals(menuItems, contains("dress"));
       asert.assertEquals(menuItems, allOf(notNullValue(), not(empty())));
       asert.assertAll();
   }

    public void initTest() {

        menuItems = getDriver().findElements(By.cssSelector(Waiters.ListItemsForClothes));
        asert = new SoftAssert();
    }
}


// @Then("Display menu item")
// public void displayMenuItemsSecond() {
//assertThat(menuItems.size(), greaterThan(5)); //не менее 5 елементов на странице
//assertThat(menuItems, contains("dress"));
//assertThat(menuItems, allOf(notNullValue(), not(empty())));


//     @And("More than 5 items")
//     public void moreThenFiveItems(){
//
//         List<WebElement> menuItems = getDriver().findElements(By.cssSelector(Waiters.ListItemsForClothes));
//         SoftAssert asert = new SoftAssert();
//         asert.assertEquals(5, 6, "Что-то пошло не так");
//         asert.assertAll();
//
//    }




//@Then("Display menu items")
//public void displayMenuItems() {

//List<WebElement> menuItems = getDriver().findElements(By.cssSelector(Waiters.ListItemsForClothes));
//Assert.assertEquals(menuItems.size(), 6);
//}

//      @Then("Display menu items")
//      public void displayMenuItemsSecond() {

//List<WebElement> menuItems = getDriver().findElements(By.cssSelector(Waiters.ListItemsForClothes));
//assertThat(menuItems, hasSize(6));
//assertThat(menuItems.size(), greaterThan(5)); //не менее 5 елементов на странице
//assertThat(menuItems, contains("dress"));
//assertThat(menuItems, allOf(notNullValue(), not(empty())));
//}
