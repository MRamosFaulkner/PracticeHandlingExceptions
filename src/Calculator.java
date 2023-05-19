public class Calculator {

    public static int factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is undefined for negative numbers");
        }

        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static int binomialCoefficient(int setSize, int subsetSize) {
        if (setSize < 0 || subsetSize < 0 || subsetSize > setSize) {
            throw new IllegalArgumentException("Invalid parameters for binomial coefficient calculation");
        }

        return factorial(setSize) / (factorial(subsetSize) * factorial(setSize - subsetSize));
    }
}
