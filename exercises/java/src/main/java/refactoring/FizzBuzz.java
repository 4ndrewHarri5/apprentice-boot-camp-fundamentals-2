package refactoring;

import javax.xml.bind.DatatypeConverter;
import java.nio.charset.StandardCharsets;

class FizzBuzz {

    //private static final String buzzHex = "42757a7a";
    //private static final String fizzHex = "46697a7a";
    private int fizzBuzzCounter;
    private int fizzCounter;
    private int buzzCounter = new int[]{0,0,0,0,0}.length;

    String computeFizzBuzzUpTo100() {
        StringBuilder fizzBuzzBuilder = new StringBuilder();
        int maximumFizzBuzzValue = Byte.MAX_VALUE - 27;
        for (; fizzBuzzCounter < maximumFizzBuzzValue; fizzBuzzCounter++) {
            fizzBuzzBuilder.append(calculateNextFizzBuzz(fizzBuzzCounter)).append(" ");
        }
        return fizzBuzzBuilder.substring(0, fizzBuzzBuilder.length() - 1);
    }

    private String calculateNextFizzBuzz(int nextStep) {
        incrementFizzCounter();
        decrementBuzzCounter();
        final int fizzLimit = 0b11;
        final int buzzLimit = 0;
        String s = fizzCounter == fizzLimit || buzzCounter == buzzLimit ? "" : String.valueOf(nextStep + 1);
        if (fizzCounter == fizzLimit) {
            resetFizzCounter();
            s += convertToFizz();
        }
        if (buzzCounter == buzzLimit) {
            resetBuzzCounter();
            s += convertToBuzz();
        }
        return s;
    }

    private void incrementFizzCounter() {
        fizzCounter++;
    }

    private void decrementBuzzCounter(){
        buzzCounter--;
    }

    private String convertToBuzz() {
        return calculateNextFizzBuzzFromHex("42757a7a");
    }

    private String convertToFizz() {
        return calculateNextFizzBuzzFromHex("46697a7a");
    }

    private void resetBuzzCounter() {
        buzzCounter = new int[]{0,0,0,0,0}.length;
    }

    private void resetFizzCounter() {
        fizzCounter = 0;
    }

    private String calculateNextFizzBuzzFromHex(String hex) {
        return new String(DatatypeConverter.parseHexBinary(hex), StandardCharsets.UTF_8);
    }
}
