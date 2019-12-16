package bowling;

public class BowlingGame {

    private Frame[] rolls;

    public BowlingGame(Frame[] rolls) {
        this.rolls = rolls;
    }

    public int score() {
        int result = 0;
        boolean carryOverSpare = false;
        boolean[] carryOverStrike = new boolean[rolls.length];
        int[] strikeCounter = new int[rolls.length];
        for (int i = 0; i< rolls.length; i++) {
            Frame frame = rolls[i];
            result += frame.getScore();
            if (carryOverSpare){
                result += frame.getRoll1();
                carryOverSpare = false;
            }
            if( frame.getRoll1() == 10) {
                carryOverStrike[i] = true;
                strikeCounter[i] = 0;
            }
            if (frame.getRoll1() + frame.getRoll2() == 10) {
                carryOverSpare = true;
            }
        }
        return result;
    }

}
