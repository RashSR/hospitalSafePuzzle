package rashsr.residentevil.three.hospitalsafepuzzle.gui;

import rashsr.residentevil.three.hospitalsafepuzzle.backend.Cursor;
import rashsr.residentevil.three.hospitalsafepuzzle.backend.CursorPosition;

import javax.swing.*;

public class CursorGUI {
    private static JLabel cursorLabel = new JLabel(new ImageIcon("resources/pictures/cursor.png"));

    public static void initGUICursor(){
        cursorLabel.setBounds(0,450,200,200);
        GUI.addComponent(cursorLabel);
    }
    public static void drawCursor(Cursor cursor){
       CursorPosition moveTo = cursor.getCursorPosition();
       cursorLabel.setVisible(false);

       switch (moveTo){
           case ZERO: cursorLabel.setBounds(0,455,200,200); break;
           case ONE: cursorLabel.setBounds(90,455,200,200); break;
           case TWO: cursorLabel.setBounds(170,455,200,200); break;
           case THREE: cursorLabel.setBounds(250,455,200,200); break;
           case FOUR: cursorLabel.setBounds(330,455,200,200); break;
           case FIVE: cursorLabel.setBounds(410,455,200,200); break;
           case QUIT: cursorLabel.setBounds(480, 455, 200, 200); break;
       }
       cursorLabel.setVisible(true);
    }
}
