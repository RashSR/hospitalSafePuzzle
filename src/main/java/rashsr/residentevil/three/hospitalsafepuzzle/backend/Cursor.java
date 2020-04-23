package rashsr.residentevil.three.hospitalsafepuzzle.backend;
/**
 * Creates the Cursor you are moving in the Hospital Safe Puzzle.
 */
public class Cursor {
    private boolean jumping;
    private boolean blinking;
    private CursorPosition cursorPosition;

    public Cursor(boolean jumping, boolean blinking){
        this.jumping = jumping;
        this.blinking = blinking;
        cursorPosition=CursorPosition.ZERO;
        System.out.println("Created a Cursor with jumping: "+jumping+" and blinking: "+blinking+".");
    }

    boolean isJumping(){
        return this.jumping;
    }
    boolean isBlinking(){
        return this.blinking;
    }
    public void setJumping(boolean jumping){
        this.jumping = jumping;
    }
    public void setCursorPosition(CursorPosition cp){
        this.cursorPosition=cp;
    }
    public CursorPosition getCursorPosition(){
        return this.cursorPosition;
    }
}
