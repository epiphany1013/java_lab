package Chapter05;

public class Operators {

    public static void main(String[] args) {

        byte byteValue = 127;
        short shortValue = byteValue;

        shortValue++;
        System.out.println("shortValue = " + shortValue);
        byteValue=(byte)shortValue;
        System.out.println("byteValue = " + byteValue);

        byteValue = 127;
        shortValue = 256;
        System.out.println("shortValue = " + shortValue);
        byteValue = (byte)shortValue;
        System.out.println("byteValue = " + byteValue);
    }
}
