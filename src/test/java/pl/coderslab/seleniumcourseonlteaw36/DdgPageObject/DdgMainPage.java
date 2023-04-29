package pl.coderslab.seleniumcourseonlteaw36.DdgPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DdgMainPage {
    private final WebDriver driver;

    DdgMainPage(WebDriver driver){
        this.driver = driver;
    }

    public void searchThisAndSubmit (String searchThis) {
        WebElement searchInput = this.driver.findElement(By.id("search_form_input_homepage"));
        searchInput.clear();
        searchInput.sendKeys(searchThis);
        WebElement searchButton = this.driver.findElement(By.id("search_button_homepage"));
        searchButton.click();
    }
}
