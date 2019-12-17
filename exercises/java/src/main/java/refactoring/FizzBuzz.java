package refactoring;

import javax.xml.bind.DatatypeConverter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

class FizzBuzz {

    private static final String BUZZ_HEX = "42757a7a";
    private static final String FIZZ_HEX = "46697a7a";
    public static final int MAXIMUM_FIZZ_BUZZ_LIMIT = Byte.MAX_VALUE - 27;
    public static final int FIZZ_LIMIT = 0b11;
    public static final int BUZZ_LIMIT = 0;
    public static final String EMPTY_VALUE = "";
    public static final int BUZZ_COUNT_START_VALUE = 5;
    public static final int FIZZ_COUNT_START_VALUE = 0;
    public static final String SPACE = " ";
    public static final Charset EIGHT_BIT_CHARSET = StandardCharsets.UTF_8;

    private int fizzBuzzCounter;
    private int fizzCounter;
    private int buzzCounter = BUZZ_COUNT_START_VALUE;

    String computeFizzBuzzUpTo100() {
        StringBuilder fizzBuzzBuilder = new StringBuilder();
        for (; fizzBuzzCounter < MAXIMUM_FIZZ_BUZZ_LIMIT; fizzBuzzCounter++) {
            fizzBuzzBuilder.append(calculateNextFizzBuzz(fizzBuzzCounter)).append(SPACE);
        }
        return fizzBuzzBuilder.substring(0, fizzBuzzBuilder.length() - 1);
    }

    private String calculateNextFizzBuzz(int nextStep) {
        incrementFizzCounter();
        decrementBuzzCounter();
        String fizzBuzzValue = String.valueOf(nextStep + 1);
        final boolean divisibleByThree = fizzCounter == FIZZ_LIMIT;
        final boolean divisibleByFive = buzzCounter == BUZZ_LIMIT;
        if (divisibleByThree || divisibleByFive){
            fizzBuzzValue = EMPTY_VALUE;
        }
        if (divisibleByThree) {
            resetFizzCounter();
            fizzBuzzValue += returnFizz();
        }
        if (divisibleByFive) {
            resetBuzzCounter();
            fizzBuzzValue += returnBuzz();
        }
        return fizzBuzzValue;
    }

    private void incrementFizzCounter() {
        fizzCounter++;
    }

    private void decrementBuzzCounter() {
        buzzCounter--;
    }

    private String returnBuzz() {
        return calculateNextFizzBuzzFromHex(BUZZ_HEX);
    }

    private String returnFizz() {
        return calculateNextFizzBuzzFromHex(FIZZ_HEX);
    }

    private void resetBuzzCounter() {
        buzzCounter = BUZZ_COUNT_START_VALUE;
    }

    private void resetFizzCounter() {
        fizzCounter = FIZZ_COUNT_START_VALUE;
    }

    private String calculateNextFizzBuzzFromHex(String hex) {
        return new String(DatatypeConverter.parseHexBinary(hex), EIGHT_BIT_CHARSET);
    }
}
