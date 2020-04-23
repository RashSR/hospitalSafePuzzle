package rashsr.residentevil.three.hospitalsafepuzzle.backend;

import org.junit.Assert;
import org.junit.Test;

public class IORiddleTest {
    @Test
    public void loadSolutionTest() {
        String shortString = Riddle.loadSolution("src/test/resourcesTest/dataTest/solutionTestShort.txt");
        Assert.assertEquals("Does not load correctly for short Strings.", "12", shortString);
        String longString = Riddle.loadSolution("src/test/resourcesTest/dataTest/solutionTestLong.txt");
        Assert.assertEquals("Does not load correctly for long Strings.", "12fghjr412", longString);
    }
    @Test
    public void saveSolutionTest(){

    }
}
