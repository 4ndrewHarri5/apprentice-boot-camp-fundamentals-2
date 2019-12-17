package refactoring;

import javax.xml.bind.DatatypeConverter;
import java.nio.charset.StandardCharsets;

class FizzBuzz {

    private int fizzBuzzCounter;
    private int fizzCounter;
    private int buzzCounter = new int[]{0,0,0,0,0}.length;

    String computeFizzBuzzUpTo100() {
        String fizzBuzzBuilder = "";
        for (; fizzBuzzCounter < Byte.MAX_VALUE-27; fizzBuzzCounter++) {
            fizzBuzzBuilder += calculateNextFizzBuzz(fizzBuzzCounter) + " ";
        }
        return fizzBuzzBuilder.substring(0, fizzBuzzBuilder.length() - 1);
    }

    private String calculateNextFizzBuzz(int nextStep) {
        fizzCounter++;
        buzzCounter--;
        String s = fizzCounter == 0b11 || buzzCounter == 0 ? "" : String.valueOf(nextStep + 1);
        if (fizzCounter == 0b11) {
            s += convertHexToFizz();
        }
        if (buzzCounter == 0) {
            s += convertHexToBuzz();
        }
        return s;
    }

    private String convertHexToBuzz() {
        buzzCounter = new int[] {0,0,0,0,0}.length;
        return new String(DatatypeConverter.parseHexBinary("42757a7a"), StandardCharsets.UTF_8);
    }

    private String convertHexToFizz() {
        fizzCounter = 0;
        return new String(DatatypeConverter.parseHexBinary("46697a7a"), StandardCharsets.UTF_8);
    }
}
