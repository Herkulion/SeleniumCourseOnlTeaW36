package pl.coderslab.SeleniumSourceOnlTeaW36.Tasks.searching;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class myBookingHotel {
    @Test
    public void zad1(){
        WebDriver logging = new ChromeDriver();
        logging.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement hotelLocation = logging.findElement(By.id("hotel_location"));
        WebElement email = logging.findElement(By.id("newsletter-input"));
        WebElement searchButton = logging.findElement(By.id("search_room_submit"));
        hotelLocation.sendKeys("warsaw");
        email.sendKeys("test@test.com");
        assertNotNull(hotelLocation);

    }

    @Test
    public void zad2(){
        WebDriver logging = new ChromeDriver();
        logging.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement hotelLocation = logging.findElement(By.name("hotel_location"));
        WebElement email = logging.findElement(By.name("email"));
        WebElement searchButton = logging.findElement(By.name("search_room_submit"));

        hotelLocation.sendKeys("Warsaw");
        email.sendKeys("test@test.com");
        hotelLocation.submit();
    }

    @Test
    public void zad3() {
        WebDriver trySignIn = new ChromeDriver();
        trySignIn.get("https://hotel-testlab.coderslab.pl//en/");
        trySignIn.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        WebElement homepageSignIn = trySignIn.findElement(By.className("hide_xs"));
        homepageSignIn.click();

        WebElement inputEmail = trySignIn.findElement(By.className("is_required validate account_input form-control"));
        WebElement signInButton = trySignIn.findElement(By.className(""));

        inputEmail.sendKeys("byebye@kukiz.stad");
        signInButton.click();

    }
}
