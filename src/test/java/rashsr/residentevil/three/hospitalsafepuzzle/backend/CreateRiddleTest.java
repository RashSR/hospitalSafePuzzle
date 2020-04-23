package rashsr.residentevil.three.hospitalsafepuzzle.backend;
import org.junit.Assert;
import org.junit.Test;
import rashsr.residentevil.three.hospitalsafepuzzle.backend.Riddle;

public class CreateRiddleTest {
    @Test
    public void onlyNumbersTest(){
        boolean onlyNumbersFalse = Riddle.onlyNumbers("42fr");
        Assert.assertEquals("Does not return false for mixed numbers and letters.", false, onlyNumbersFalse);
        boolean onlyNumbersTrue = Riddle.onlyNumbers("4443");
        Assert.assertEquals("Does not return true for only numbers.", true, onlyNumbersTrue);
        boolean digitValueGreaterFive = Riddle.onlyNumbers("4356");
        Assert.assertEquals("Does not have numbers between 0 and 5.", false, digitValueGreaterFive);
    }

    @Test
    public void calcDigitTest(){
        int digitValueFive = Riddle.calcDigits("04344");
        Assert.assertEquals("Does not have 5 digits.", 5, digitValueFive);
        int digitValueZero = Riddle.calcDigits("");
        Assert.assertEquals("Does not have 0 digits.", 0, digitValueZero);
        int digitValueThree = Riddle.calcDigits("12f");
        Assert.assertEquals("Does not have 3 digits and accepts float values.", 3, digitValueThree);
    }
}
