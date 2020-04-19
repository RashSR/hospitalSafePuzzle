package rashsr.residentevil.three.hospitalsafepuzzle;

import org.junit.Assert;
import org.junit.Test;
import rashsr.residentevil.three.hospitalsafepuzzle.backend.Riddle;

public class IORiddleTest {
    @Test
    public void loadSolutionTest() {
        String shortString = Riddle.loadSolution("src/test/resourcesTest/dataTest/solutionTestShort.txt");
        Assert.assertEquals("Does not return false for mixed numbers and letters.", "12", shortString);
        String longString = Riddle.loadSolution("src/test/resourcesTest/dataTest/solutionTestLong.txt");
        Assert.assertEquals("Does not return false for mixed numbers and letters.", "12fghjr412", longString);
    }
    @Test
    public void saveSolutionTest(){

    }
}
