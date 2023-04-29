package pl.coderslab.seleniumcourseonlteaw36.examples;

import org.junit.jupiter.api.*;

public class JunitExample {

    @Test //każdy test jest niezależny, nie mogą na sobie polegać, nie mogą być zależne
    public void firstTest() {
        System.out.println("first test");
    }

    @Test
    public void secondTest() {
        System.out.println("second test");
    }

    @Disabled
    @Test
    public void thirdTest() {
        System.out.println("third test");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("run before each");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("run after each");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("raz na końcu");
    }
}
