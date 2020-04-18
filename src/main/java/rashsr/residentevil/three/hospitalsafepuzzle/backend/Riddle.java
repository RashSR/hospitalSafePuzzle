package rashsr.residentevil.three.hospitalsafepuzzle.backend;
/**
 * All what you want to create the Hospital Puzzle with the Safe in Resident Evil 3 - Nemesis.
 */
public class Riddle {
    private String solution;
    private int digits;

    public Riddle(String solution){
        if(onlyNumbers(solution)) {
            this.digits = calcDigits(solution);
        }else{
            return;
        }
        this.solution=solution;
        System.out.println("Created a Puzzle with "+ digits + " digits.");
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


}
