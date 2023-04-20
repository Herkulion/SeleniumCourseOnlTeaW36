package pl.coderslab.SeleniumSourceOnlTeaW36.Tasks.configuration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zad2 {
    @Test
    public void goThrough() {
        WebDriver chrome = new ChromeDriver();
        chrome.get("https://coderslab.pl/pl");
        chrome.get("https://mystore-testlab.coderslab.pl/index.php");
        chrome.get("https://hotel-testlab.coderslab.pl/en/");

    }
}

