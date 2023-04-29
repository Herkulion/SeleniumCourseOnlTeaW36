package pl.coderslab.seleniumcourseonlteaw36.DuckDuckGoPageObject;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestCaseSearchTwice {

    private WebDriver driver;

    @BeforeEach
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        this.driver.get("https://duckduckgo.com/");

    }
    @Test
    public void DuckDuckGo() throws InterruptedException {
    MainPageSearch main = new MainPageSearch(driver);
    main.searchThisAndSubmit("Gdziekolwiek");
    SearchesPage searched = new SearchesPage(driver);
    searched.list();
    searched.searchThisAndSubmit("Cokolwiek");
    searched.list();
    Thread.sleep(1);

    }
    @AfterEach
    public void terminate() {
        this.driver.quit();
    }

}