package rashsr.residentevil.three.hospitalsafepuzzle.gui;

import rashsr.residentevil.three.hospitalsafepuzzle.Main;
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
        } else if(e.getKeyCode() == KeyEvent.VK_1){
            Main.r.appendInputSolution("4");
        }else if(e.getKeyCode() == KeyEvent.VK_LEFT){
            System.out.println("left");
        }else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            System.out.println("right");
        }else if(e.getKeyCode() == KeyEvent.VK_ENTER){
            System.out.println("enter");
            if(Main.r.getCursor().getCursorPosition()== CursorPosition.FOUR){
                Main.r.appendInputSolution("4");
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
