package refactoring;

import javax.xml.bind.DatatypeConverter;
import java.nio.charset.StandardCharsets;

class FizzBuzz {

    private static final String BUZZ_HEX = "42757a7a";
    public static final String BUZZ = calculateNextFizzBuzzFromHex(BUZZ_HEX);
    private static final String FIZZ_HEX = "46697a7a";
    public static final String FIZZ = calculateNextFizzBuzzFromHex(FIZZ_HEX);
    public static final int MAXIMUM_FIZZ_BUZZ_LIMIT = Byte.MAX_VALUE - 27;
    public static final int FIZZ_LIMIT = 0b11;
    public static final int BUZZ_LIMIT = 0;
    public static final int BUZZ_COUNT_START_VALUE = 5;
    public static final int FIZZ_COUNT_START_VALUE = 0;
    public static final String SPACE = " ";

    private int fizzBuzzCounter;
    private int fizzCounter;
    private int buzzCounter = BUZZ_COUNT_START_VALUE;

    String computeFizzBuzzUpTo100() {
        String fizzBuzzBuilder = "";
        for (; fizzBuzzCounter < MAXIMUM_FIZZ_BUZZ_LIMIT; fizzBuzzCounter++) {
            fizzBuzzBuilder += calculateNextFizzBuzz(fizzBuzzCounter) + SPACE;
        }
        return fizzBuzzBuilder.trim();
    }

    private String calculateNextFizzBuzz(int nextStep) {
        incrementFizzCounter();
        decrementBuzzCounter();
        return getFizzBuzzValue(nextStep);
    }

    private String getFizzBuzzValue(int nextStep) {
        String fizzBuzzValue = "";
        final boolean divisibleByThree = isDivisible(fizzCounter, FIZZ_LIMIT);
        final boolean divisibleByFive = isDivisible(buzzCounter, BUZZ_LIMIT);

        if (!(divisibleByThree || divisibleByFive)){
            fizzBuzzValue = String.valueOf(nextStep + 1);
        }
        if (divisibleByThree) {
            resetFizzCounter();
            fizzBuzzValue += FIZZ;
        }
        if (divisibleByFive) {
            resetBuzzCounter();
            fizzBuzzValue += BUZZ;
        }
        return fizzBuzzValue;
    }

    private boolean isDivisible(int counter, int limit) {
        return counter == limit;
    }

    private void incrementFizzCounter() {
        fizzCounter++;
    }

    private void decrementBuzzCounter() {
        buzzCounter--;
    }

    private void resetBuzzCounter() {
        buzzCounter = BUZZ_COUNT_START_VALUE;
    }

    private void resetFizzCounter() {
        fizzCounter = FIZZ_COUNT_START_VALUE;
    }

    private static String calculateNextFizzBuzzFromHex(String hex) {
        return new String(DatatypeConverter.parseHexBinary(hex), StandardCharsets.UTF_8);
    }
}
