import lv.acodemy.classroom.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.Callable;

public class CalculatorTest {
    Calculator casio = new Calculator();

    @Test

    public void testSum() {
        //Calculator casio = new Calculator();
        //   System.out.println(casio.sum(5, 5));
        //   int sumNumber = casio.sum(5,5);
        Assert.assertEquals(casio.sum(10, 50), 60);
    }

    // if expected = real, test get passed
    public void testSubtract() {
        //   Calculator casio = new Calculator();
        Assert.assertEquals(casio.subtract(20, 7), 13);
    }

    public void testMultiply() {
        //      Calculator casio = new Calculator();
        Assert.assertEquals(casio.multiply(2, 3), 6);
    }

    public void testDivide() {
        //    Calculator casio = new Calculator();
        Assert.assertEquals(casio.divide(10, 2), 5);

    }
}
