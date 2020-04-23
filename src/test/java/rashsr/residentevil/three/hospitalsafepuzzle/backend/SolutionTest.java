package rashsr.residentevil.three.hospitalsafepuzzle.backend;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void checkSolutionTest(){
        Riddle r = new Riddle();
        boolean noMatch = Riddle.checkSolution(Riddle.loadSolution("src/test/resourcesTest/dataTest/solutionTestLong.txt"));
        Assert.assertEquals("Does not return false for the wrong solution", false, noMatch);
        boolean match = Riddle.checkSolution(Riddle.loadSolution("resources/data/solution.txt"));
        Assert.assertEquals("Does not return true for the right solution", true, match);
    }
}
