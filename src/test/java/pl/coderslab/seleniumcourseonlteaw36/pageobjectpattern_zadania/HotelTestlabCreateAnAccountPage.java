package pl.coderslab.seleniumcourseonlteaw36.pageobjectpattern_zadania;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelTestlabCreateAnAccountPage {
    @FindBy (id = "customer_firstname")
    private WebElement firstNameInput;
    @FindBy (id = "customer_lastname")
    private WebElement lastNameInput;
    @FindBy (id = "passwd")
    private WebElement passwordInput;
    @FindBy (id = "submitAccount")
    private WebElement registrationSubmitButton;

    public HotelTestlabCreateAnAccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void fillPersonalInformationForm(UserPersonalData userdata) {
        firstNameInput.sendKeys(userdata.getFirstName());
        lastNameInput.sendKeys(userdata.getLastName());
        passwordInput.sendKeys(userdata.getPassword());
    }

    public void clickRegister(){
        registrationSubmitButton.click();
    }


}
