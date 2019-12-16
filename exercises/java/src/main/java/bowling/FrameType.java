package bowling;

public enum FrameType {

    NONE(0),
    SPARE(0),
    STRIKE(0);

    private int typeCount;

    FrameType(int typeCount) {
        this.typeCount = typeCount;
    }

    public int getTypeCount() {
        return typeCount;
    }

    public void incrementCount() {
        this.typeCount++;
    }
}
