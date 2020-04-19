package rashsr.residentevil.three.hospitalsafepuzzle.backend;

import rashsr.residentevil.three.hospitalsafepuzzle.io.FileLoader;

import java.util.ArrayList;

/**
 * All what you want to create the Hospital Puzzle with the Safe in Resident Evil 3 - Nemesis.
 */
public class Riddle {
    private String solution;
    private int digits;
    private final String filePath= "resources/data/solution.txt";

    public Riddle(){
        String loadedSolution = loadSolution(filePath);
        if(onlyNumbers(loadedSolution)) {
            this.digits = calcDigits(loadedSolution);
            if(digits>4){
                System.out.println("Don't use more than 5 digits!");
                return;
            }
        }else{
            return;
        }
        this.solution=loadedSolution;
        System.out.println("Created a Puzzle with "+ digits + " digits.");
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
    public static boolean onlyNumbers(String solution){
        if (solution == null || solution.equals("")) {
            System.out.println("Your String is empty!");
            return false;
        }
        if(solution.contains("f")||solution.contains("d")){
            System.out.println("Please use only numbers!");
            return false;
        }
        if(solution.contains("6")||solution.contains("7")||solution.contains("8")||solution.contains("9")){
            System.out.println("Please only use Numbers from 0 to 5!");
            return false;
        }
        try {
            double d = Double.parseDouble(solution);
        } catch (NumberFormatException nfe) {
            System.out.println("Please use only numbers!");
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
    public static int calcDigits(String solution){
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

    public void startGUI(){

    }

}
