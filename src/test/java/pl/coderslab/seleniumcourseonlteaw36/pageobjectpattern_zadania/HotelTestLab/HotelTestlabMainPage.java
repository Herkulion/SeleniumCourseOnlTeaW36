package pl.coderslab.seleniumcourseonlteaw36.pageobjectpattern_zadania.HotelTestLab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelTestlabMainPage {
    @FindBy (css = "ul.navbar-nav li a.user_login")
    private WebElement signInBtn;
    public HotelTestlabMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickSignIn() {
        signInBtn.click();
    }
}
