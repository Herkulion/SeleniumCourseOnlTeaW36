package pl.coderslab.seleniumcourseonlteaw36.pageobjectpattern_zadania.HotelTestLab;
import org.checkerframework.checker.signature.qual.FieldDescriptor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelTestlabAuthenticationPage {
    @FindBy (id = "email_create")
    private WebElement emailInput;
    @FindBy(id = "SubmitCreate")
    private WebElement submitButton;

    public HotelTestlabAuthenticationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void submitCreateAnAccountForm(String email) {
        emailInput.sendKeys(email);
        submitButton.click();
    }
}
