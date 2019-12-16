package bowling;

public class BowlingGame {

    private Frame[] rolls;

    public BowlingGame(Frame[] rolls) {
        this.rolls = rolls;
    }

    public int score() {
        int result = 0;
        boolean carryOverSpare = false;
        for (Frame frame : rolls) {
            result += frame.getScore();
            if (carryOverSpare){
                result += frame.getRoll1();
                carryOverSpare = false;
            }
            if (frame.getRoll1() + frame.getRoll2() == 10) {
                carryOverSpare = true;
            }
        }
        return result;
    }

}
