public class Main {
    public static void main(String[] args){
        int myValue = 10000;

        /*
        A int has a width of 16 bits
         */
        int myMinIntValue = Integer.MIN_VALUE; // wrapper class
        int myMaxIntValue = Integer.MAX_VALUE; // wrapper class
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted Max Value = "  + (myMaxIntValue + 1)); // Overflow
        System.out.println("Busted Min Value = " +  (myMinIntValue - 1)); // Underflow

        int myMaxIntTest = 2_147_483_647; // underscore is acceptable

        /*
        A Byte has a width of 8 bits
         */
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        /*
        A short has a width of 16 bit
         */
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);


        /*
        A long has a width of 64 bit
         */
        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        Long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);
        /*
        Casting in Java Treat this like a byte instead of default
         */

        short myNewShortValue = (short) (myMaxShortValue / 2);
       /*
        Casting in Java Treat this like a short instead of default
         */

        /*
        Challenge
         */

        int challengeInt = 345600;
        byte challengeByte = (byte) (105);
        short challengeShort = (short) 32445;
        long challengeLong = 50000L + 10L * (challengeByte + challengeShort + challengeInt);
        System.out.println(challengeLong);

    }
}
