package Chapter01;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract (int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("calculator.add(5,2) = " + calculator.add(5,2));
        System.out.println("calculator.add(5,2) = " + calculator.subtract(5,2));
        System.out.println("calculator.add(5,2) = " + calculator.multiply(5,2));
        System.out.println("calculator.add(5,2) = " + calculator.divide(5,2));
    }
}
