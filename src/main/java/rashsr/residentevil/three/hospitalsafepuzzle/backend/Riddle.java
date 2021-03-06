package rashsr.residentevil.three.hospitalsafepuzzle.backend;

import rashsr.residentevil.three.hospitalsafepuzzle.Main;
import rashsr.residentevil.three.hospitalsafepuzzle.io.FileLoader;
import rashsr.residentevil.three.hospitalsafepuzzle.gui.GUI;

import java.util.ArrayList;

/**
 * All what you want to create the Hospital Puzzle with the Safe in Resident Evil 3 - Nemesis.
 */
public class Riddle {
    private static String solution;
    private int digits;
    private final String filePath= "resources/data/solution.txt";
    private Cursor cursor;
    private String inputSolution;
    private static String className = "[Riddle] ";

    public Riddle(){
        String loadedSolution = loadSolution(filePath);
        if(onlyNumbers(loadedSolution)) {
            this.digits = calcDigits(loadedSolution);
            if(digits>4){
                System.out.println(className+"Don't use more than 5 digits!");
                return;
            }
        }else{
            return;
        }
        inputSolution="";
        solution=loadedSolution;
        System.out.println(className+"Created a Puzzle with "+ digits + " digits.");
        cursor = new Cursor(false, false); //TODO: Aus Konfigdatei auslesen
        startGUI();
    }
    /**
     * Check if the String parameter contains only Numbers from 0 to 5.
     *
     * @param  solution String that we are checking. Is the solution for the puzzle.
     * @return      true if there are only numbers in the String, else it is false.
     * @author      Reinhold Schlager
     * @see         java.lang.String
     */
   static boolean onlyNumbers(String solution){
        if (solution == null || solution.equals("")) {
            System.out.println("[Riddle.onlyNumbers] Your String is empty!");
            return false;
        }
        if(solution.contains("f")||solution.contains("d")){
            System.out.println("[Riddle.onlyNumbers] Please use only numbers!");
            return false;
        }
        if(solution.contains("6")||solution.contains("7")||solution.contains("8")||solution.contains("9")){
            System.out.println("[Riddle.onlyNumbers] Please only use Numbers from 0 to 5!");
            return false;
        }
        try {
            double d = Double.parseDouble(solution);
        } catch (NumberFormatException nfe) {
            System.out.println("[Riddle.onlyNumbers] Please use only numbers!");
            return false;
        }
        return true;
    }
    /**
     * Calculates the number of Characters in the String
     *
     * @param  solution String that we are checking. Is the solution for the puzzle.
     * @return      the number of the Characters in the String.
     * @author      Reinhold Schlager
     * @see         java.lang.String
     */
    static int calcDigits(String solution){
        return solution.length();
    }
    /**
     * Load a solution from the file "solution.txt".
     *
     * @param  filePath At this Filepath we can find the file.
     * @return      the solution String.
     * @author      Reinhold Schlager
     * @see         rashsr.residentevil.three.hospitalsafepuzzle.io.FileLoader
     */
    public static String loadSolution(String filePath) {
        String possibleSolution="";
        FileLoader fl = new FileLoader(filePath);
        ArrayList<String> s = fl.readFile();
        int j=0;
        if(s!=null){
            for(String sr : s) {
                String[] parts = sr.split(";");
                for(int i = 0; i<parts.length; i++) {
                    if(i==parts.length-1) {
                        possibleSolution=parts[0];
                        j++;
                    }
                }
            }
        }
        return possibleSolution;
    }
    /**
     * Save a solution to the file "solution.txt".
     *
     * @param  filePath At this Filepath we can find the file.
     * @param  newSolution The new Combination for the next puzzle.
     * @author      Reinhold Schlager
     * @see         rashsr.residentevil.three.hospitalsafepuzzle.io.FileLoader
     */
    public static void saveSolution(String filePath, String newSolution){
    }
    /**
     * Start the GUI.
     *
     * @author      Reinhold Schlager
     * @see         rashsr.residentevil.three.hospitalsafepuzzle.gui
     */
    public void startGUI(){
        GUI.initGUI();
    }
    /**
     * Check the input from the user.
     *
     * @param  toCheck The solution from the user.
     * @return      return true if the input is correct
     * @author      Reinhold Schlager
     * @see         rashsr.residentevil.three.hospitalsafepuzzle.io.FileLoader
     */
    boolean checkSolution(String toCheck){
        System.out.println(className+"toCheck: "+toCheck +" Solution: "+solution);
        return toCheck.equals(solution);
    }
    /**
     * Append the next Number to the input String.
     *
     * @param  input The next Input from the user.
     * @author      Reinhold Schlager
     * @see         java.lang.String
     */
    public void appendInputSolution(String input){
        int number = calcDigits(inputSolution);
        if(number<=digits) {
            inputSolution += input;
            System.out.println(number + ". Letter is: " + input);
            checkWin();
        }
    }
    /**
     * Check if the Code is correct and do the next steps to delete the Riddle data.
     *
     * @author      Reinhold Schlager
     * @see         java.lang.Boolean
     */
    private void checkWin(){
        if(digits==inputSolution.length()){
            if(checkSolution(inputSolution)){
                System.out.println(className+"Code is right!");
                GUI.changeBackground();
            }else{
                System.out.println(className+"You did not input the Code correctly!");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.exit(0);
            }
        }
    }
    /**
     * Reset the Riddle for the next Time.
     *
     * @author      Reinhold Schlager
     * @see         rashsr.residentevil.three.hospitalsafepuzzle
     */
    public void resetRiddle(){
        //TODO: change input
        Main.r = new Riddle();
    }
    public Cursor getCursor(){
        return this.cursor;
    }

}
