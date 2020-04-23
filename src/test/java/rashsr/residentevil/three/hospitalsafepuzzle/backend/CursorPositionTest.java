package rashsr.residentevil.three.hospitalsafepuzzle.backend;

import org.junit.Assert;
import org.junit.Test;

public class CursorPositionTest {
    Cursor cursor;
    private CursorPosition[] positions = CursorPosition.values();

    @Test
    public void toLeftTest(){
        cursor = new Cursor(false, false );
        CursorPosition cp = CursorPosition.QUIT;
        for(int i = positions.length-1; i>0; i--){
            cursor.setCursorPosition(cp.toLeft(cursor));
            cp = cursor.getCursorPosition();
            Assert.assertEquals("Left value of "+positions[i]+" is not "+positions[i-1]+".", positions[i-1], cp);
            System.out.println("Left value of "+positions[i]+" is "+positions[i-1]+".");
        }
        cp = CursorPosition.ZERO;
        Assert.assertEquals("LEFT value of ZERO is not ZERO if jumping is false.", cp, cp.toLeft(cursor));
        cursor = new Cursor(true, false);
        Assert.assertEquals("LEFT value of ZERO is not QUIT if jumping is true.", CursorPosition.QUIT, cp.toLeft(cursor));
    }


    @Test
    public void toRightTest(){
        cursor = new Cursor(false, false);
        CursorPosition cp = cursor.getCursorPosition();
        for(int i = 0; i<positions.length-1; i++){
            cursor.setCursorPosition(cp.toRight(cursor));
            cp = cursor.getCursorPosition();
            Assert.assertEquals("Right value of "+positions[i]+" is not "+positions[i+1]+".", positions[i+1], cp);
        }
        cp = CursorPosition.QUIT;
        Assert.assertEquals("Right value of QUIT is not QUIT if jumping is false.", cp, cp.toRight(cursor));
        cursor = new Cursor(true, false);
        Assert.assertEquals("Right value of QUIT is not ZERO if jumping is true.", CursorPosition.ZERO, cp.toRight(cursor));
    }

    @Test
    public void initialValuesTest(){
        cursor = new Cursor(false, false);
        Assert.assertEquals("initial CursorPosition is not ZERO.", CursorPosition.ZERO, cursor.getCursorPosition());
    }


}
