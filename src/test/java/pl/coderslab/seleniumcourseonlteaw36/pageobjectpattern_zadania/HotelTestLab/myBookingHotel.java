package pl.coderslab.seleniumcourseonlteaw36.pageobjectpattern_zadania.HotelTestLab;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.coderslab.seleniumcourseonlteaw36.Tools;


import java.time.Duration;

public class myBookingHotel {
private WebDriver driver;
        @BeforeEach
        public void Setup() {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            this.driver = new ChromeDriver();
            this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
            this.driver.get("https://hotel-testlab.coderslab.pl/en/");
            //przed kazdym testem wchodze na stronę główną
        }


        @Test
        public void navigateToAndFillAndSubmitRegistrationForm() {
            HotelTestlabMainPage hotelMainPage = new HotelTestlabMainPage(driver);
            hotelMainPage.clickSignIn();

            final String randomEmail = Tools.generateRandomEmail();
            HotelTestlabAuthenticationPage hotelAuthPage = new HotelTestlabAuthenticationPage(driver);
            hotelAuthPage.submitCreateAnAccountForm(randomEmail);

            UserPersonalData userData = new UserPersonalData()
                    .setFirstName("Ala")
                    .setEmail(randomEmail)
                    .setLastName("Makota")
                    .setPassword("#passwd");

            HotelTestlabCreateAnAccountPage createAnAccountPage = new HotelTestlabCreateAnAccountPage(driver);
            createAnAccountPage.fillPersonalInformationForm(userData);
            createAnAccountPage.clickRegister();
        }

        @Test
        public void logInAndSearchHotel() {
            HotelTestlabMainPage hotelMainPage = new HotelTestlabMainPage(driver);
            hotelMainPage.clickSignIn();
            WebElement email = driver.findElement(By.id("email"));
            WebElement passwd = driver.findElement(By.id("passwd"));
            WebElement submitLogin = driver.findElement(By.id("SubmitLogin"));
            email.sendKeys("fa0e1a22-17d7-473a-9e1f-ddb591cd8e56@mail.pl");
            passwd.sendKeys("#passwd");
            submitLogin.click();

            WebElement homeButtonLeft = driver.findElement(By.cssSelector("a[title='Home']"));
            homeButtonLeft.click();

            WebElement hotelLocation = driver.findElement(By.id("hotel_location"));
            hotelLocation.sendKeys("Warsaw");




        }
    }
