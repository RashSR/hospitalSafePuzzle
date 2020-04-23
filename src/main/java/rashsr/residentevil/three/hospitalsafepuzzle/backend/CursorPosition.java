package rashsr.residentevil.three.hospitalsafepuzzle.backend;
/**
 * Handles all the Curser Positions.
 */
public enum CursorPosition {
    ZERO, ONE, TWO, THREE, FOUR, FIVE, QUIT;

    private static CursorPosition[] positions = CursorPosition.values();
    /**
     * Gives the right value of CursorPosition.
     *
     * @param  cursor The cursor we are looking at.
     * @return the right position of the CursorPosition.
     * @author      Reinhold Schlager
     * @see         rashsr.residentevil.three.hospitalsafepuzzle.backend
     */
    public CursorPosition toRight(Cursor cursor){
        if(this.ordinal()==6){
            if(cursor.isJumping()){
                return CursorPosition.ZERO;
            }else {
                return this;
            }
        }else{
            return positions[this.ordinal()+1];
        }
    }
    /**
     * Gives the left value of CursorPosition.
     *
     * @param  cursor The cursor we are looking at.
     * @return the left position of the CursorPosition.
     * @author      Reinhold Schlager
     * @see         rashsr.residentevil.three.hospitalsafepuzzle.backend
     */
    public CursorPosition toLeft(Cursor cursor){
        if(this.ordinal()==0){
            if(cursor.isJumping()){
                return CursorPosition.QUIT;
            }else {
                return this;
            }
        }else{
            return positions[this.ordinal()-1];
        }
    }

}
