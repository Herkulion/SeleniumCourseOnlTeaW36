package pl.coderslab.SeleniumSourceOnlTeaW36.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.UUID;

public class eksepryment {
    @Test
    public void registerCheck() {
        for (int i = 0; i < 5; i++) {

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
            Chrome.quit();
        }
    }
}


//Będąc na stronie rejestracji nowego użytkownika
//First Name
//Last Name
//Email
//Password
//Potwierdź rejestrację nowego użytkownika (wcześniej sprawdzając, czy przycisk jest widoczny).