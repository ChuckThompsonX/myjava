package com.test;

public class Bytes {
    public static void main(String[] args) {

        byte[] data = {10, 20, 30, 40, 50};
        data = new byte[5];
        data[0] = 10;
        data[1] = 20;
        data[2] = 30;
        data[3] = 40;
        data[4] = 50;

        for (byte b : data) {
            System.out.println(b);
        }

        byte myByte = 100;
        // Convert byte to int
        int numInt = myByte;
        // Convert int to byte (explicit casting)
        int anotherInt = 200;
        byte anotherByte = (byte) anotherInt; // Value will be -56 due to overflow
        System.out.println("Byte value: " + anotherByte);
        // Convert byte to String
        String byteString = Byte.toString(myByte);
        System.out.println("Byte as String: " + byteString);
        // Convert String to byte
        String str = "120";
        byte parsedByte = Byte.parseByte(str);
        System.out.println("Parsed byte value: " + parsedByte);

        byte a = 5;   // 00000101
        byte b = 3;   // 00000011

        byte andResult = (byte) (a & b);  // 00000001 (1)
        byte orResult = (byte) (a | b);   // 00000111 (7)
        byte xorResult = (byte) (a ^ b);  // 00000110 (6)
        byte notResult = (byte) ~a;    // 11111010 (-6)

        System.out.println("AND result: " + andResult);
        System.out.println("OR result: " + orResult);
        System.out.println("XOR result: " + xorResult);
        System.out.println("NOT result: " + notResult);

        Byte byteObject = Byte.valueOf(myByte);
        int intValue = byteObject.intValue();

        // Creating Byte objects
        Byte byte1 = Byte.valueOf((byte) 10); // using constructor
        Byte byte2 = Byte.valueOf("120"); // using valueOf() method
        Byte byte3 = Byte.valueOf((byte) -5);

        // Basic operations
        System.out.println("Byte 1 value: " + byte1);
        System.out.println("Byte 2 value: " + byte2);
        System.out.println("Byte 3 value: " + byte3);

        // Converting Byte to primitive byte
        byte primitiveByte = byte1.byteValue();
        System.out.println("Primitive byte value: " + primitiveByte);

        // Comparing Byte values
        int comparisonResult = byte1.compareTo(byte2);
        if (comparisonResult == 0) {
            System.out.println("Byte 1 and Byte 2 are equal.");
        } else if (comparisonResult < 0) {
            System.out.println("Byte 1 is less than Byte 2.");
        } else {
            System.out.println("Byte 1 is greater than Byte 2.");
        }

        // Byte overflow
        byte maxByte = Byte.MAX_VALUE; //127
        byte overflowedByte = (byte) (maxByte + 1);
        System.out.println("Original max byte value: " + maxByte);
        System.out.println("Byte value after overflow: " + overflowedByte); // Output: -128

        // Byte underflow
        byte minByte = Byte.MIN_VALUE; //-128
        byte underflowedByte = (byte) (minByte - 1);
        System.out.println("Original min byte value: " + minByte);
        System.out.println("Byte value after underflow: " + underflowedByte); // Output: 127
    }
}
