package pl.coderslab.SeleniumSourceOnlTeaW36.Homework;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.WatchEvent;

public class Zad3 {

    @Test
    public void Surveys() {
        WebDriver fillSurvey = new ChromeDriver();
        fillSurvey.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
        WebElement firstname = fillSurvey.findElement(By.id("first-name"));
        firstname.sendKeys("Karol");
        //Wpisz imię Karol

        WebElement lastname = fillSurvey.findElement(By.id("last-name"));
        lastname.sendKeys("Kowalski");
        //Wpisz nazwisko Kowalski

        fillSurvey.findElement(By.xpath("//*[@id=\"infoForm\"]/div[3]/div/div/label[1]/input")).click();
        //Wybierz płeć Male

        WebElement date = fillSurvey.findElement(By.id("dob"));
        date.sendKeys("05/22/2010");
        //wpisz date w formacie miesiąc/dzień/rok

        WebElement address = fillSurvey.findElement(By.id("address"));
        address.sendKeys("Prosta 51");
        //wpisz adres

        WebElement email = fillSurvey.findElement(By.id("email"));
        email.sendKeys("karol.kowalski@mailinator.com");
        //wpisz email

        WebElement password = fillSurvey.findElement(By.id("password"));
        password.sendKeys("Pass123");
        //wpisz hasło

        WebElement company = fillSurvey.findElement(By.id("company"));
        company.sendKeys("Coders Lab");
        //wpisz nazwę firmy

        WebElement comment = fillSurvey.findElement(By.id("comment"));
        comment.sendKeys("To jest mój pierwszy automat testowy");
        //wpisz komentarz

        fillSurvey.findElement(By.id("submit")).click();
        //nacisnij wyślij
    }
}
