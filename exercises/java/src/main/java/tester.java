import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class tester {

    public static void main(String[] args) {
        final String collect = IntStream.range(1, 101).boxed().map(number -> {
            String fizzBuzzValue = "";
            boolean isDivisible = false;
            if (number % 3 == 0) {
                isDivisible = true;
                fizzBuzzValue += "fizz ";
            }
            if (number % 5 == 0) {
                isDivisible = true;
                fizzBuzzValue += "buzz ";
            }
            if (!isDivisible) {
                fizzBuzzValue = number + " ";
            }
            return fizzBuzzValue;
        }).collect(Collectors.joining());
        System.out.println("collect = " + collect);
    }

}
