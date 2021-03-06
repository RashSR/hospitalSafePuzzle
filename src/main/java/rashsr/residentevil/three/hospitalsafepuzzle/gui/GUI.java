package rashsr.residentevil.three.hospitalsafepuzzle.gui;

import javax.swing.*;

public class GUI {
    private static JFrame f = new JFrame("Resident Evil 3 - Nemesis Hospital Safe Puzzle");
    private static JLabel backgroundSafe = new JLabel(new ImageIcon("resources/pictures/safe_CLOSE.jpg"));
    private static JLabel chooseDigit = new JLabel(new ImageIcon("resources/pictures/chooseDigits.png"));
    private final static int width = 755, height = 632;
    /**
     * Initialize the GUI.
     *
     * @author      Reinhold Schlager
     * @see         javax.swing
     */
    public static void initGUI(){
        initFrame();
        chooseDigit.setBounds(100, 130, 600, 500);
        backgroundSafe.add(chooseDigit);
        addComponent(chooseDigit);

        f.getContentPane().add(backgroundSafe);
        f.setVisible(true);
        f.addKeyListener(new KeyHandler());
    }
    /**
     * Initialize the Start-GUI.
     *
     * @author      Reinhold Schlager
     * @see         javax.swing
     */
    private static void initFrame(){
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(width , height);
        f.setResizable(false);
        f.setLayout(null);
        backgroundSafe.setBounds(0, -25, width, height);
    }
    /**
     * Change the Background to open the safe.
     *
     * @author      Reinhold Schlager
     * @see         javax.swing
     */
    public static void changeBackground(){
        backgroundSafe.setVisible(false);
        backgroundSafe = new JLabel(new ImageIcon("resources/pictures/safe_OPEN.jpg"));
        backgroundSafe.setBounds(0, -25, width, height);
        f.getContentPane().add(backgroundSafe);
    }

    public static void addComponent(JLabel jl){
        backgroundSafe.add(jl);
    }
    /*derText = new JLabel("some ein string");
        derText.setBounds(100,200,200,100);
        add(derText);*/

}
