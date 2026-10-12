package algorithms;

public class RecursiveFactorial {

    public static long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException(
                    "Number must be non-negative."
            );
        }

        if (number == 0 || number == 1) {
            return 1;
        }

        return number * factorial(number - 1);
    }

    public static void main(String[] args) {
        int number = 5;

        long result = factorial(number);

        System.out.println(
                "Factorial of " + number + " = " + result
        );
    }
}
