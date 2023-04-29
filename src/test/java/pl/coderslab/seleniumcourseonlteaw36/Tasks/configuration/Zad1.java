package pl.coderslab.seleniumcourseonlteaw36.Tasks.configuration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Zad1 {

    @Test
    public void DuckDuckGo() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        WebDriver drivers = new ChromeDriver();
        drivers.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));

        drivers.get("https://duckduckgo.com/");
        WebElement searchInput = drivers.findElement(By.id("search_form_input_homepage"));
        searchInput.sendKeys("coś neutralnego");
        WebElement searchButton = drivers.findElement(By.id("search_button_homepage"));
        //searchButton.click(); //klika wybrany button
        //searchInput.submit(); //działa tak jakbym kliknął enter w polu wpisywania
    }



}
