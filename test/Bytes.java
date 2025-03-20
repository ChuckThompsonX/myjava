package com.test;

public class Bytes {
    public static void main(String[] args) {

        byte[] data = new byte[3]; // {10, 20, 30};
        data[0] = 10;
        data[1] = 20;
        data[2] = 30;

        for (byte b : data) {
            System.out.print(b + " ");
        }

        byte myByte = 100;
        int intVal = myByte;
        byte intByte = (byte) intVal;
        System.out.println("\nByte value: " + intByte);
        // convert byte to String
        String byteString = Byte.toString(myByte);
        System.out.println("Byte as String: " + byteString);
        // convert String to byte
        String str = "120";
        byte parsedByte = Byte.parseByte(str);
        System.out.println("Parsed byte value: " + parsedByte);

        byte a = 5; // 00000101
        byte b = 3; // 00000011
        byte and = (byte) (a & b); // 00000001 (1)
        byte or = (byte) (a | b); // 00000111 (7)
        byte xor = (byte) (a ^ b); // 00000110 (6)
        byte not = (byte) ~a; // 11111010 (-6)

        System.out.println("AND result: " + and);
        System.out.println("OR result: " + or);
        System.out.println("XOR result: " + xor);
        System.out.println("NOT result: " + not);

        // creating Byte objects
        Byte byteObject = Byte.valueOf(myByte);
        intVal = byteObject.intValue();
        Byte byte1 = Byte.valueOf((byte) 10);
        Byte byte2 = Byte.valueOf("120");
        System.out.println("Int value: " + intVal);
        System.out.println("Byte 1 value: " + byte1);
        System.out.println("Byte 2 value: " + byte2);

        // converting Byte to primitive byte
        byte primitiveByte = byte1.byteValue();
        System.out.println("Primitive byte value: " + primitiveByte);

        // comparing Byte values
        int compareResult = byte1.compareTo(byte2);
        if (compareResult == 0) {
            System.out.println("Byte 1 and Byte 2 are equal.");
        } else if (compareResult < 0) {
            System.out.println("Byte 1 is less than Byte 2.");
        } else {
            System.out.println("Byte 1 is greater than Byte 2.");
        }

        // byte overflow
        byte maxByte = Byte.MAX_VALUE; //127
        byte overflowByte = (byte) (maxByte + 1);
        System.out.println(maxByte + " overflowed to " + overflowByte); // -128

        // byte underflow
        byte minByte = Byte.MIN_VALUE; //-128
        byte underflowByte = (byte) (minByte - 1);
        System.out.println(minByte + " underflowed to " + underflowByte); // 127
    }
}
