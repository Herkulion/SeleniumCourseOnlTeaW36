package pl.coderslab.seleniumcourseonlteaw36.examples;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.UUID;

public class DuckDuckGo {

    @Test
    public void DuckDuckGo() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver drivers = new ChromeDriver();
        drivers.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));

        drivers.get("https://duckduckgo.com/");
        WebElement searchInput = drivers.findElement(By.id("search_form_input_homepage"));
        searchInput.sendKeys("coś neutralnego");
        WebElement searchButton = drivers.findElement(By.id("search_button_homepage"));
        searchButton.click(); //clicks search button


        List<WebElement> searchResults = drivers.findElements(By.cssSelector("div#links article h2 a span")); //# id, . klasa,
        for (int i = 0; i < searchResults.size(); i++) {
            WebElement oneSearchResult = searchResults.get(i);
            String text = oneSearchResult.getText();
            System.out.println(text);
        }
    }
}