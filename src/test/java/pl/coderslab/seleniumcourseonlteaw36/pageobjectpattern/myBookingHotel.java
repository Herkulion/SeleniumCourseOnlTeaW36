package pl.coderslab.seleniumcourseonlteaw36.pageobjectpattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


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

            HotelTestlabCrerateAnAccountPage createAnAccountPage = new HotelTestlabCrerateAnAccountPage(driver);
            createAnAccountPage.fillPersonalInformationForm(userData);
            createAnAccountPage.clickRegister();
        }
    }
