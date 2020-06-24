package hellocucumber.steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

import static hellocucumber.pages.GoogleResultPage.URL_AUTOPRACTICE;
import static hellocucumber.steps.Hooks.*;
import static hellocucumber.utils.Waiters.TIME_TEN;
import static hellocucumber.utils.Waiters.implicitWait;


public class GoogleSearchStepDefinitions {


    @Given("Google Search page is opened")
    public static void googleSearchPageIsOpened() {
        googleSearchPage.open();
    }

    @When("User searches with text")
    public void userSearchesWithText() {
        googleSearchPage.search("automationpractice");
    }

    @And("User clicks on the search link")
    public void userClickSearchLink() { googleResultPage.openUrlByName();
    }

    @Then("automationpractice website is opened")
    public void automationpracticeWebsiteIsOpened() {
        Assert.assertEquals(URL_AUTOPRACTICE, getDriver().getCurrentUrl());
    }

}