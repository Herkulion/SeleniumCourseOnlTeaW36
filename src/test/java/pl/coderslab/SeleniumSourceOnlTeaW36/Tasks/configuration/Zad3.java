package pl.coderslab.SeleniumSourceOnlTeaW36.Tasks.configuration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zad3 {
    @Test
    public void goThrough2() {
        WebDriver next = new ChromeDriver();
        next.get("https://www.google.com");
        next.get("https://coderslab.pl/pl");
        next.navigate().back();
        next.get("https://mystore-testlab.coderslab.pl/index.php");
        next.navigate().back();
        next.navigate().forward();
        next.navigate().refresh();

    }
}