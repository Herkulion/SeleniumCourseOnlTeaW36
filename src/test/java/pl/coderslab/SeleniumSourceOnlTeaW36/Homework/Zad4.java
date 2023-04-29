package pl.coderslab.SeleniumSourceOnlTeaW36.Homework;

import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Text;

import java.util.concurrent.TimeUnit;

public class Zad4 {

    @Test
    public void Search() {
        WebDriver reSearch = new ChromeDriver();
        reSearch.get("https://mystore-testlab.coderslab.pl/index.php?controller=authentication&create_account=1");
        reSearch.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement socialTitle = reSearch.findElement(By.xpath("//*[@id=\"customer-form\"]/div/div[1]/div[1]"));
        WebElement firstName = reSearch.findElement(By.xpath("//*[@id=\"field-firstname\"]"));
        WebElement lastName = reSearch.findElement(By.xpath("//*[@id=\"field-lastname\"]"));
        WebElement email = reSearch.findElement(By.xpath("//*[@id=\"field-email\"]"));
        WebElement password = reSearch.findElement(By.xpath("//*[@id=\"field-password\"]"));
        WebElement show = reSearch.findElement(By.xpath("//*[@id=\"customer-form\"]/div/div[5]/div[1]/div/span/button"));
        WebElement birthday = reSearch.findElement(By.xpath("//*[@id=\"field-birthday\"]"));
    }
}
