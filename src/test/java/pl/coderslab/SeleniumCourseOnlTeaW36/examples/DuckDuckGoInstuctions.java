package pl.coderslab.SeleniumCourseOnlTeaW36.examples;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuckDuckGoInstuctions {
    WebDriver drivers = new ChromeDriver();
    //tworzę nowy obiekt drivers z klasy WebDriver i podklasy ChromeDriver
    //klasa WebDriver pozwala pobrać pliki konfiguracyjne dla przeglądarki
    //podklasa ChromeDriver pozwala pobrać pliki konfig dla Chrome
    //od teraz wszystkie komendy dotyczące przeglądarki będziemy poprzedzać tym obiektem
    //np drivers.command

    @Test
    public void Drivers() {
        drivers.get("https://duckduckgo.com/");
        //komenda get przenosi nas na wybrany adres
        WebElement searchInput = drivers.findElement(By.id("search_form_input_homepage"));
        //komenda findElement(By.id()) pozwala znaleźć element strony (teraz tzw. panel wyszukiwania)
        //przez id tego elementu, id sprawdzasz w devtoolsach.

        //wyrażenie "WebElement searchInput" tworzy nowy atrybut searchInput
        //klasy WebElement (klasa WebElement pozwala nam poprzez różne komendy
        //wchodzić w interakcję z elementami strony).

        //tworzymy nowy atrybut searchInput klasy WebElement w którym zawiera się to co po znaku równania =


        searchInput.sendKeys("coś neutralnego");
        //komenda .sendKeys użyta na searchInput pozwala nam coś wpisać w znalezionym elemencie

        //po wystartowaniu na stronie w panelu wyszukiwarki wpisze się fraza "coś neutralnego"

        WebElement searchButton = drivers.findElement(By.id("search_button_homepage"));
        //findElement ponownie pozwala znaleźć element (przycisk "search")
        //tworzymy nowy atrybut searchButton

        searchButton.click();
        //używamy atrybutu searchButton (za którym kryje się komenda znajdująca go na stronie)
        //dodajemy do niego komendę .click(), która klika na przycisk

        //wyszukiwarka wyszukuje i przenosi nas na stronę z wyszukaniem

        drivers.navigate().back();
        //używamy obiektu drivers z komendami .navigate które nawigują po przeglądarce
        //a następnie .back() aby znaleźć się na poprzedniej stronie

        drivers.quit();
        //używamy obiektu drivers z komendą .quit która pozwala nam zamknąć przeglądarkę
    }
}
