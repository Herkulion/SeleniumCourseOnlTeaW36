package pl.coderslab.seleniumcourseonlteaw36.Homework;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zad1 {
    @Test
    public void Navigation() {
        WebDriver navigation = new ChromeDriver();
        navigation.get("https://mystore-testlab.coderslab.pl/index.php");
        WebElement logInPage = navigation.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a"));
        logInPage.click();
        WebElement noAccount = navigation.findElement(By.className("no-account"));
        noAccount.click();
        navigation.navigate().back();
        navigation.navigate().back();
    }
}
