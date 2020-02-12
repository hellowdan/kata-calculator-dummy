import org.junit.Assert;
import org.junit.Test;

public class StrCalcTest {

    private StrCalc strCalc = new StrCalc();

    @Test
    public void addTestZero(){
        Assert.assertEquals(0, strCalc.add(""));
    }

    @Test
    public void addTestSecond(){
        Assert.assertEquals(1, strCalc.add("1"));
    }

    @Test
    public void sumTwoNumbers() {
        Assert.assertEquals(3, strCalc.add("1,2"));
    }

    @Test
    public void sumMultipleNumbers() {
        Assert.assertEquals(16, strCalc.add("1,2,5,8"));
    }

    @Test
    public void sumMultipleNumbersWithEmptyStrings() {
        Assert.assertEquals(16, strCalc.add("1,,2,,5,8"));
    }
}
