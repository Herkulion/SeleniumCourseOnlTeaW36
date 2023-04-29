package pl.coderslab.seleniumcourseonlteaw36.Tasks.functions;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Assertions;


import java.time.Duration;
import java.util.UUID;

public class Zad1 {
    @Test
    public void registerCheck() {
        WebDriver Chrome = new ChromeDriver();
        Chrome.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement signInButton = Chrome.findElement(By.className("hide_xs"));
        signInButton.click();

        WebElement emailType = Chrome.findElement((By.id("email_create")));
        String randomEmail = UUID.randomUUID().toString() + "@mail.pl";
        emailType.sendKeys(randomEmail);

        WebElement submitBtn = Chrome.findElement(By.id("SubmitCreate"));
        submitBtn.click();
        Chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));


        WebElement customerFirstname = Chrome.findElement(By.id("customer_firstname"));
        WebElement customerLastname = Chrome.findElement(By.id("customer_lastname"));
        WebElement passwd = Chrome.findElement(By.id("passwd"));
        WebElement email = Chrome.findElement(By.id("email"));

        Assertions.assertTrue(customerFirstname.isDisplayed());
        Assertions.assertTrue(customerLastname.isDisplayed());
        Assertions.assertTrue(passwd.isDisplayed());
        Assertions.assertTrue(email.isDisplayed());

        customerLastname.sendKeys("lastname");
        customerFirstname.sendKeys("firstname");
        passwd.sendKeys("password");

        WebElement submitAccount = Chrome.findElement(By.id("submitAccount"));
        submitAccount.click();

        WebElement logOut = Chrome.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[7]/ul/li/ul/li[3]/a"));
        logOut.click();


    }
}


//Będąc na stronie rejestracji nowego użytkownika
//First Name
//Last Name
//Email
//Password
//Potwierdź rejestrację nowego użytkownika (wcześniej sprawdzając, czy przycisk jest widoczny).