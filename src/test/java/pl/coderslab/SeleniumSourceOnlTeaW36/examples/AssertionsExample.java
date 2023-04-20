package pl.coderslab.SeleniumSourceOnlTeaW36.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionsExample {

    @Test
    public void assertionsExample() {
        //given
        int a= 3;
        int b = 40;
        //when
        int actual = a + b;
        //then
        Assertions.assertEquals(42, 42);
    }

    @Test
    public void someMore() {
        Assertions.assertEquals(4, 4);
        Assertions.assertEquals("color","color");
        Assertions.assertEquals(0.3, 0.1 + 0.21, 0.1);
        //delta, ile miejsc po przecinku porównujemy
        Assertions.assertTrue(true);
        Assertions.assertFalse(false);
    }


}
