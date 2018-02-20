package ch.ffhs.task.primzahlen.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void additionTest() {
        //given
        int a = 12;
        int b = 8;

        //when
        int result = new Calculator().addition(a, b);

        //then
        Assert.assertEquals(20, result);
        
    }
}
