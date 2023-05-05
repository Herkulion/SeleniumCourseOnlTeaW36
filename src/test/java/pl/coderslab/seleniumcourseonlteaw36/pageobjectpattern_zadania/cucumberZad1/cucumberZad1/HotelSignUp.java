package pl.coderslab.seleniumcourseonlteaw36.pageobjectpattern_zadania.cucumberZad1.cucumberZad1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HotelSignUp {
    public WebDriver driver;

    @Given("Page {string} opened in browser")
    public void pageOpened(String string) {
        this.driver = new ChromeDriver();
        driver.get(string);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Given("Button Sign in clicked")
    public void button_sign_in_clicked() {
        WebElement signIn = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[7]/ul/li/a"));
        signIn.click();
    }

    @Given("Email {string} written in input")
    public void email_written_in_input(String email) {
        WebElement emailInput = driver.findElement(By.id("email_create"));
        emailInput.sendKeys(email);
    }

    @Given("Button Create an account opened")
    public void createAccountButtonClick() throws InterruptedException {
        WebElement submitCreate = driver.findElement(By.id("SubmitCreate"));
        submitCreate.click();
    }

    @When("Filled the survey with First Name {string} and Last Name {string} and password {string}")
    public void filled_the_survey_with_any_data(String firstName, String lastName, String password) {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement FirstName = driver.findElement(By.id("customer_firstname"));
        WebElement LastName = driver.findElement(By.id("customer_lastname"));
        WebElement passwd = driver.findElement(By.id("passwd"));

        FirstName.sendKeys(firstName);
        LastName.sendKeys(lastName);
        passwd.sendKeys(password);

    }

    @When("Clicked button Register")
    public void clicked_button_register() {
        WebElement submitAccount = driver.findElement(By.id("submitAccount"));
        submitAccount.click();
    }

    @Then("You are signed in in Hotel TestLab")
    public void you_are_signed_in_in_hotel_test_lab() {
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
        WebElement Name = driver.findElement(By.xpath("//*[@id=\"user_info_acc\"]/span[1]"));
        String text = Name.getText();
        System.out.println(text);
    }

    @Given("Logged with Email {string} and password {string}")
    public void loggingIn(String email, String password){
        driver.manage().timeouts().implicitlyWait(200,TimeUnit.MILLISECONDS);
        WebElement emailInput = driver.findElement(By.id("email"));
        WebElement passwdInput = driver.findElement(By.id("passwd"));
        emailInput.sendKeys(email);
        passwdInput.sendKeys(password);
        WebElement submitLogin = driver.findElement(By.id("SubmitLogin"));
        submitLogin.click();
    }

    @When("Button My Addresses clicked")
    public void button_my_addresses_clicked() {
        WebElement myAddresses = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div/ul/li[3]/a"));
        myAddresses.click();
    }

    @When("button add a new address clicked")
    public void button_add_a_new_address_clicked() {
        WebElement addAddress = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[2]/a"));
        addAddress.click();
    }

    @When("Address {string} filled")
    public void address_filled(String address) {
        WebElement address1 = driver.findElement(By.id("address1"));
        address1.sendKeys(address);
    }
    @When("Zip\\/Postal Code {string} filled")
    public void zip_postal_code_filled(String postalCode) {
        WebElement postcode = driver.findElement(By.id("postcode"));
        postcode.sendKeys(postalCode);
    }
    @When("City {string} filled")
    public void city_filled(String city) {
        WebElement city1 = driver.findElement(By.id("city"));
        city1.sendKeys(city);
    }
    @When("Country {string} filled")
    public void country_filled(String country) {
        WebElement idCountry = driver.findElement(By.id("id_country"));
        idCountry.sendKeys(country);

    }
    @When("Mobile phone {string} filled")
    public void mobile_phone_filled(String number) {
        WebElement phone = driver.findElement(By.id("phone"));
        phone.sendKeys(number);
    }
    @When("address title {string} filled")
    public void address_title_filled(String nameOfAddress) {
        WebElement alias = driver.findElement(By.id("alias"));
        alias.clear();
        alias.sendKeys(nameOfAddress);
    }
    @When("Button Save clicked")
    public void button_save_clicked() {
        WebElement submitAddress = driver.findElement(By.id("submitAddress"));
        submitAddress.click();
    }
    @Then("New address is created")
    public void new_address_is_created() {
        WebElement fullAddress = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/div/div/ul"));
        String address = fullAddress.getText();
        System.out.println(address);
    }

}