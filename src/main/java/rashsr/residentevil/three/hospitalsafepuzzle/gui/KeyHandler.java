package rashsr.residentevil.three.hospitalsafepuzzle.gui;

import rashsr.residentevil.three.hospitalsafepuzzle.Main;
import rashsr.residentevil.three.hospitalsafepuzzle.backend.Cursor;
import rashsr.residentevil.three.hospitalsafepuzzle.backend.CursorPosition;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {
    /**
     * Invoked when a key has been typed.
     * See the class description for {@link KeyEvent} for a definition of
     * a key typed event.
     *
     * @param e
     */
    @Override
    public void keyTyped(KeyEvent e) {

    }

    /**
     * Invoked when a key has been pressed.
     * See the class description for {@link KeyEvent} for a definition of
     * a key pressed event.
     *
     * @param e
     */
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE){
            System.exit(0);
        }else if(e.getKeyCode() == KeyEvent.VK_LEFT){
            Main.r.getCursor().turnCursorLeft();

        }else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            Main.r.getCursor().turnCursorRight();
        }else if(e.getKeyCode() == KeyEvent.VK_ENTER){
            if(Main.r.getCursor().getCursorPosition()== CursorPosition.QUIT){
                System.out.println("Good bye and try again!");
                System.exit(0);
            }else{
                Main.r.appendInputSolution(Main.r.getCursor().getCursorPosition().getPositionNumber());
            }
        }

    }

    /**
     * Invoked when a key has been released.
     * See the class description for {@link KeyEvent} for a definition of
     * a key released event.
     *
     * @param e
     */
    @Override
    public void keyReleased(KeyEvent e) {

    }
}
