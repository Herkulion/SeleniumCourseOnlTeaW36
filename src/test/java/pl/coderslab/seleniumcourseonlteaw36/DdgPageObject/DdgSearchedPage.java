package pl.coderslab.seleniumcourseonlteaw36.DdgPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DdgSearchedPage {
    private WebDriver driver;


    DdgSearchedPage(WebDriver driver) {
        this.driver = driver;
    }



    public void list() {
        WebElement whatSearched = this.driver.findElement(By.id("search_form_input"));
        String searchedWord = whatSearched.getAttribute("value");
        System.out.println("You searched: " +"'" + searchedWord + "'");
        System.out.println("This is what we found:");

        List<WebElement> searchResults = this.driver.findElements(By.cssSelector("div#links article h2 a span"));
        for (int i = 0; i < searchResults.size(); i++) {
            WebElement oneSearchResult = searchResults.get(i);
            String text = oneSearchResult.getText();
            System.out.println(text);
        }
        System.out.println();
    }

    public void searchThisAndSubmit(String searchThis) {
        WebElement searchInput = this.driver.findElement(By.id("search_form_input"));
        searchInput.clear();
        searchInput.sendKeys(searchThis);
        WebElement searchButton = this.driver.findElement(By.id("search_button"));
        searchButton.click();
    }


}