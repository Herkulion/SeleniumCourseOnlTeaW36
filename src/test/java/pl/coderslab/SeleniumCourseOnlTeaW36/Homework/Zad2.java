package pl.coderslab.SeleniumCourseOnlTeaW36.Homework;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Zad2 extends Zad1 {
    @Test
    public void otherDriver() {
        WebDriver Edgy = new EdgeDriver();
        Edgy.get("https://duckduckgo.com/");
        WebElement searchFormInputHomepage = Edgy.findElement(By.id("search_form_input_homepage"));
        searchFormInputHomepage.sendKeys("some edgy shit");
        Edgy.findElement(By.id("search_button_homepage")).click();

    }
}
