import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class calTest {
    private Main uncalculator;
    @Before
    public void setUp() {
        uncalculator = new Main();
    }
    @Test
    public void addition() {
        int a = 2;
        int aa = 2;
        int expectedResult = 4;
        int result = uncalculator.addition(a,aa);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void substraction() {
        int a = 2;
        int aa = 2;
        int expectedResult = 0;
        int result = uncalculator.substraction(a,aa);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void multiplication()  {
        int a = 2;
        int aa = 2;
        int expectedResult = 4;
        int result = uncalculator.multiplication(a,aa);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void percentile() {
        int a = 2;
        int b = 5;
        int expectedResult = 2;
        int result = uncalculator.percentile(a,b);
        Assert.assertEquals(expectedResult, result);
    }
}