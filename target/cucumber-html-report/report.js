$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CucumberFirstTest.feature");
formatter.feature({
  "name": "cucumber first test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Google search Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@cucumber"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Google Search page is opened",
  "keyword": "Given "
});
formatter.match({
  "location": "hellocucumber.steps.GoogleSearchStepDefinitions.googleSearchPageIsOpened()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searches with text",
  "keyword": "When "
});
formatter.match({
  "location": "hellocucumber.steps.GoogleSearchStepDefinitions.userSearchesWithText()"
});
formatter.result({
  "error_message": "org.openqa.selenium.InvalidSelectorException: invalid selector: An invalid or illegal selector was specified\n  (Session info: chrome\u003d83.0.4103.106)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/invalid_selector_exception.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MacBook-Pro\u0027, ip: \u0027fe80:0:0:0:4d8:ce36:146d:9521%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.5\u0027, java.version: \u002714.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.106, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: /var/folders/xm/4c9lm27j5zn...}, goog:chromeOptions: {debuggerAddress: localhost:49612}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 94c91e4cdd23ffb7679cb5302cd4f497\n*** Element info: {Using\u003did, value\u003d}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy20.sendKeys(Unknown Source)\n\tat hellocucumber.pages.GoogleSearchPage.search(GoogleSearchPage.java:24)\n\tat hellocucumber.steps.GoogleSearchStepDefinitions.userSearchesWithText(GoogleSearchStepDefinitions.java:21)\n\tat ✽.User searches with text(file:///Users/julikor/Documents/Cucumber_project/src/test/resources/features/CucumberFirstTest.feature:6)\n",
  "status": "failed"
});
formatter.step({
  "name": "User clicks on the search link",
  "keyword": "And "
});
formatter.match({
  "location": "hellocucumber.steps.GoogleSearchStepDefinitions.userClickSearchLink()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "automationpractice website is opened",
  "keyword": "Then "
});
formatter.match({
  "location": "hellocucumber.steps.GoogleSearchStepDefinitions.automationpracticeWebsiteIsOpened()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});