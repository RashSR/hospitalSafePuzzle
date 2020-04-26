package rashsr.residentevil.three.hospitalsafepuzzle.backend;

import rashsr.residentevil.three.hospitalsafepuzzle.gui.CursorGUI;

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
        CursorGUI.initGUICursor();
    }
    /**
     * Changes the CursorPosition to the right and draws an new one.
     *
     * @author      Reinhold Schlager
     * @see         rashsr.residentevil.three.hospitalsafepuzzle.gui
     */
    public void turnCursorRight(){
        cursorPosition=cursorPosition.toRight(this);
        CursorGUI.drawCursor(this);
        System.out.println("ich male ihn nach rechts "+cursorPosition);
    }
    /**
     * Changes the CursorPosition to the left and draws an new one.
     *
     * @author      Reinhold Schlager
     * @see         rashsr.residentevil.three.hospitalsafepuzzle.gui
     */
    public void turnCursorLeft(){
        cursorPosition=cursorPosition.toLeft(this);
        CursorGUI.drawCursor(this);
        System.out.println("ich male ihn nach links "+cursorPosition);
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
