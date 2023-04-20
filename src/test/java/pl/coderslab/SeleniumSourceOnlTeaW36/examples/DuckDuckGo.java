package pl.coderslab.SeleniumSourceOnlTeaW36.examples;

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
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        WebDriver drivers = new ChromeDriver();
        drivers.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));

        drivers.get("https://duckduckgo.com/");
        WebElement searchInput = drivers.findElement(By.id("search_form_input_homepage"));
        searchInput.sendKeys("coś neutralnego");
        WebElement searchButton = drivers.findElement(By.id("search_button_homepage"));
        searchButton.click(); //klika wybrany button
        //searchInput.submit(); //działa tak jakbym kliknął enter w polu wpisywania


        List<WebElement> searchResults = drivers.findElements(By.cssSelector("div#links article h2 a span")); //# id, . klasa,
        for(int i = 0; i < searchResults.size(); i++) {
            WebElement oneSearchResult = searchResults.get(i);
            String text = oneSearchResult.getText();
            System.out.println(text);
        }
    }


    @Test
    public void fillSignIn() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement signInBtn = driver.findElement(By.cssSelector("ul.navbar-nav li a.user_login"));
        signInBtn.click();
        WebElement emailInput = driver.findElement(By.cssSelector("#email_create"));
        String randomEmail = UUID.randomUUID().toString() + "@mail.pl";
        emailInput.sendKeys(randomEmail);
        String Email = randomEmail;
        WebElement submitButton = driver.findElement(By.cssSelector("#SubmitCreate"));
        submitButton.click();


    }
}
