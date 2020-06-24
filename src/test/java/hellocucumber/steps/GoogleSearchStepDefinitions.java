package hellocucumber.steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.*;
import org.junit.Assert;
import static hellocucumber.pages.GoogleResultPage.URL_AUTOPRACTICE;
import static hellocucumber.steps.Hooks.*;


public class GoogleSearchStepDefinitions {
    @Severity(SeverityLevel.BLOCKER)
    @Description ("Test passed")
    @Epic("epic_1145")
    @Step ("open google search page")
    @Given("Google Search page is opened")
    public static void googleSearchPageIsOpened() {
        googleSearchPage.open();
    }

    @Step ("user search with text")
    @When("User searches with text")
    public void userSearchesWithText() {
        googleSearchPage.search("automationpractice");
    }

    @Step ("user click on the search link")
    @And("User clicks on the search link")
    public void userClickSearchLink() { googleResultPage.openUrlByName(); }

    @Step ("open web site")
    @Then("automationpractice website is opened")
    public void automationpracticeWebsiteIsOpened() {
        Assert.assertEquals(URL_AUTOPRACTICE, getDriver().getCurrentUrl());
    }
}