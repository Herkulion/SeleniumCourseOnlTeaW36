package pl.coderslab.seleniumcourseonlteaw36.DdgPageObject;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.UUID;

public class DuckDuckGo {

    private WebDriver driver;

    @BeforeEach
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        this.driver.get("https://duckduckgo.com/");

    }
    @Test
    public void DuckDuckGo() {
    DdgMainPage main = new DdgMainPage(driver);
    main.searchThisAndSubmit("Gdziekolwiek");
    DdgSearchedPage searched = new DdgSearchedPage(driver);
    searched.list();
    searched.searchThisAndSubmit("Cokolwiek");
    searched.list();
    }
    @AfterEach
    public void terminate() {
        this.driver.quit();
    }

}