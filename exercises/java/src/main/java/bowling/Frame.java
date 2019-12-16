package bowling;

public class Frame {

    private int roll1;
    private int roll2;
    private FrameType frameType;
    private Frame nextFrame;

    private Frame(int roll1, int roll2/*, Frame nextFrame*/) {
        this.roll1 = roll1;
        this.roll2 = roll2;
        //this.nextFrame = nextFrame;
        frameType = produceFrameType(roll1, roll2);
    }

    public static Frame setAllRolls(int roll1, int roll2/*, Frame nextFrame*/) {
        return new Frame(roll1, roll2/*, nextFrame*/);
    }

    private FrameType produceFrameType(int roll1, int roll2) {
        if (roll1 == 10) {
            return FrameType.STRIKE;
        }else if (roll1 + roll2 == 10) {
            return FrameType.SPARE;
        }
        return FrameType.NONE;
    }

    public int getScore() {
        if (frameType.equals(FrameType.STRIKE)) {

        }
        return roll1 + roll2;
    }

    public FrameType getFrameType() {
        return frameType;
    }

    public int getRoll1() {
        return roll1;
    }

    public int getRoll2() {
        return roll2;
    }
}
