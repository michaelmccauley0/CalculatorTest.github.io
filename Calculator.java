public class Calculator {
    
    // Addition function
    public static int add(int a, int b) {
        return a + b;
    }

    // Subtraction function
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication function
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Division function (returns 0 if divided by zero to prevent errors)
    public static int divide(int a, int b) {
        return b != 0 ? a / b : 0;
    }
}
