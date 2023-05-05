package pl.coderslab.seleniumcourseonlteaw36.pageobjectpattern_zadania.Qwant.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.coderslab.seleniumcourseonlteaw36.pageobjectpattern_zadania.Qwant.QwantMainPage;
import pl.coderslab.seleniumcourseonlteaw36.pageobjectpattern_zadania.Qwant.QwantSearchResultPage;

import java.time.Duration;
import java.util.List;

public class QwantSearchCucumberSteps {
    private WebDriver driver;

    @Given("Page {string} opened in browser")
    public void page_opened_in_browser(String pageurl) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        this.driver.get(pageurl);
    }
    @When("Phrase {string} entered in search input box")
    public void phraseEnteredInSearchInputBox(String arg0) {
        String phraseToSearch = arg0;
        QwantMainPage mainPage = new QwantMainPage(driver);
        mainPage.enterSearchPhrase(phraseToSearch);
    }
    @And("Search button clicked")
    public void searchButtonClicked() {
        QwantMainPage mainPage = new QwantMainPage(driver);
        mainPage.clickSearchButton();
    }
    @Then("first {int} results link texts contain phrase {string}")
    public void first_results_link_texts_contain_phrase(Integer int1, String string) {
        QwantSearchResultPage resultPage = new QwantSearchResultPage(driver);
        List<String> results = resultPage.getResultsLinkTexts();
        String phraseToContain = string;
        for(int i = 0; i < int1; i++) {
            String resultText = results.get(i);
            if (!resultText.toLowerCase().contains(phraseToContain)) {
                Assertions.fail("Search result must contain (case insensitive): " + phraseToContain + ", but was: " + resultText);
            }
        }
    }



}
