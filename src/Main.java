public class Main {

    public static void main(String[] args) {

        // 1. Addition "+", 2. Assignment "=".

        // Statement contains addition operator "+" and assignment operator "=".
        int result = 1 + 2;     // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        // Initializing variable with the current value of "result".
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);

        // Updating "result".
        result = result - 1;    // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);

        // "previousResult" still contains 3 as it was assigned with it (in line 12) BEFORE "result" got updated.
        System.out.println("previousResult = " + previousResult);

        // 3. Multiplication "*"
        result = result * 10;   // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        // 4. Division "/"
        result = result / 5;    // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        // 5. Modulus / Remainder "%"
        result = result % 3;    // Remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        // Abbreviating Operators

        // 1. Addition -> result = result + 1;
        result++;   // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        // 2. Subtraction -> result = result - 1;
        result--;   // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        // Abbreviating -> result = result + 2;
        result += 2;    // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        // 3. Multiplication -> result = result * 10;
        result *= 10;   // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        // 4. Division -> result = result / 3;
        result /= 3;    // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        // Abbreviating -> result = result - 2;
        result -= 2;    // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);
    }
}
