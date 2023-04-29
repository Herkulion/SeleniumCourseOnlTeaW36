package pl.coderslab.SeleniumCourseOnlTeaW36.PageObjectPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HotelTestlabCrerateAnAccountPage {
    private final WebDriver driver;

    public HotelTestlabCrerateAnAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillPersonalInformationForm(UserPersonalData userdata) {
        WebElement firstNameInput = driver.findElement(By.cssSelector("#customer_firstname"));
        WebElement lastNameInput = driver.findElement(By.cssSelector("#customer_lastname"));
        WebElement passwordInput = driver.findElement(By.cssSelector("#passwd"));
        firstNameInput.sendKeys(userdata.getFirstName());
        lastNameInput.sendKeys(userdata.getLastName());
        passwordInput.sendKeys(userdata.getPassword());



    }

    public void clickRegister(){
        WebElement registrationSubmitButton = driver.findElement(By.cssSelector("#submitAccount"));
        registrationSubmitButton.click();
    }
}
