package pl.coderslab.seleniumcourseonlteaw36.pageobjectpattern;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HotelTestlabAuthenticationPage {
    private final WebDriver driver;

    public HotelTestlabAuthenticationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void submitCreateAnAccountForm(String email) {
        WebElement emailInput = driver.findElement(By.cssSelector("#email_create"));
        emailInput.sendKeys(email);
        WebElement submitButton = driver.findElement(By.cssSelector("#SubmitCreate"));
        submitButton.click();
    }
}
