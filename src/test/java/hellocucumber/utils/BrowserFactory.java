package hellocucumber.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public enum BrowserFactory {
    CHROME {
        public WebDriver create() {
            System.setProperty("webdriver.chrome.driver", "/Users/julikor/Documents/Cucumber_project/src/test/java/hellocucumber/utils/chromedriver-1");
                    return new ChromeDriver();
        }
    };

    public WebDriver create() { return null; }
}

