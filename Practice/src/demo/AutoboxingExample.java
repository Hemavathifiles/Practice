package demo;

public class AutoboxingExample {
    public static void main(String[] args) {
        // byte to Byte
        byte primitiveByte = 1;
        Byte wrapperByte = primitiveByte; // Autoboxing
        System.out.println("Autoboxed Byte: " + wrapperByte);

        // short to Short
        short primitiveShort = 2;
        Short wrapperShort = primitiveShort; // Autoboxing
        System.out.println("Autoboxed Short: " + wrapperShort);

        // int to Integer
        int primitiveInt = 3;
        Integer wrapperInt = primitiveInt; // Autoboxing
        System.out.println("Autoboxed Integer: " + wrapperInt);

        // long to Long
        long primitiveLong = 4L;
        Long wrapperLong = primitiveLong; // Autoboxing
        System.out.println("Autoboxed Long: " + wrapperLong);

        // float to Float
        float primitiveFloat = 5.5f;
        Float wrapperFloat = primitiveFloat; // Autoboxing
        System.out.println("Autoboxed Float: " + wrapperFloat);

        // double to Double
        double primitiveDouble = 6.6;
        Double wrapperDouble = primitiveDouble; // Autoboxing
        System.out.println("Autoboxed Double: " + wrapperDouble);

        // char to Character
        char primitiveChar = 'a';
        Character wrapperChar = primitiveChar; // Autoboxing
        System.out.println("Autoboxed Character: " + wrapperChar);

        // boolean to Boolean
        boolean primitiveBoolean = true;
        Boolean wrapperBoolean = primitiveBoolean; // Autoboxing
        System.out.println("Autoboxed Boolean: " + wrapperBoolean);
    }
}
