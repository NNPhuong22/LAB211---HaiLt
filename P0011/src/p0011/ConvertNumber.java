/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0011;

import java.math.BigInteger;

/**
 *
 * @author quang
 */
public class ConvertNumber {

    private final static String[] HEX_ARRAY = {"0", "1", "2", "3", "4", "5", "6",
        "7", "8", "9", "A", "B", "C", "D", "E", "F"};

    public static String decToBin(String inputNumber) {
        StringBuilder binNumber = new StringBuilder();
        BigInteger decNumber = new BigInteger(inputNumber);
        System.out.println("Convert " + inputNumber + "(DEC) to BIN");
        while (decNumber.compareTo(new BigInteger("0")) > 0) {
            System.out.print(decNumber + " : 2 = ");
            BigInteger remainder = decNumber.remainder(new BigInteger("2"));
            binNumber.append(remainder.toString());
            decNumber = decNumber.divide(new BigInteger("2"));
            System.out.println(decNumber + " remainder " + remainder);
        }
        return binNumber.reverse().toString();
    }

    public static String decToOct(String inputNumber) {
        StringBuilder octNumber = new StringBuilder();
        BigInteger decNumber = new BigInteger(inputNumber);
        System.out.println("Convert " + inputNumber + "(DEC) to OCT");
        while (decNumber.compareTo(new BigInteger("0")) > 0) {
            System.out.print(decNumber + " : 8 =");
            BigInteger remainder = decNumber.remainder(new BigInteger("8"));
            octNumber.append(remainder.toString());
            decNumber = decNumber.divide(new BigInteger("8"));
            System.out.println(decNumber + " remainder " + remainder);
        }
        return octNumber.reverse().toString();
    }

    public static String decToHex(String inputNumber) {
        StringBuilder hexNumber = new StringBuilder();
        BigInteger decNumber = new BigInteger(inputNumber);
        System.out.println("Convert " + inputNumber + "(DEC) to HEX");
        while (decNumber.compareTo(new BigInteger("0")) > 0) {
            System.out.print(decNumber + " : 16 = ");
            BigInteger remainder = decNumber.remainder(new BigInteger("16"));
            hexNumber.append(HEX_ARRAY[remainder.intValue()]);
            decNumber = decNumber.divide(new BigInteger("16"));
            System.out.println(decNumber + " remainder " + remainder);
        }
        return hexNumber.reverse().toString();
    }

    public static String binToDec(String inputNumber) {
        int lengthBinNumber = inputNumber.length();
        BigInteger decNumber = new BigInteger("0");
        System.out.println("Convert " + inputNumber + "(BIN) to DEC");
        for (int i = 0; i < lengthBinNumber; i++) {
            if (i != 0) {
                System.out.print(" + ");
            }
            System.out.print(inputNumber.charAt(i) + "*2^" + (lengthBinNumber - 1 - i));
            BigInteger valueIndex = new BigInteger(inputNumber.charAt(i) + "").
                    multiply(new BigInteger("2").pow(lengthBinNumber - 1 - i));
            decNumber = decNumber.add(valueIndex);
        }
        System.out.println(" = " + decNumber.toString());
        return decNumber.toString();
    }

    public static String binToOct(String inputNumber) {
        System.out.println("Convert " + inputNumber + "(BIN) to OCT");
        String decNumber = binToDec(inputNumber);
        String octNumber = decToOct(decNumber);
        return octNumber;
    }

    public static String binToHex(String inputNumber) {
        System.out.println("Convert " + inputNumber + "(BIN) to HEX");
        String decNumber = binToDec(inputNumber);
        String hexNumber = decToHex(decNumber);
        return hexNumber;
    }

    public static String octToDec(String inputNumber) {
        int lengthOctNumber = inputNumber.length();
        BigInteger decNumber = new BigInteger("0");
        System.out.println("Convert " + inputNumber + "(OCT) to DEC");
        for (int i = 0; i < lengthOctNumber; i++) {
            if (i != 0) {
                System.out.println(" + ");
            }
            System.out.print(inputNumber.charAt(i) + "*8^" + (lengthOctNumber - 1 - i));
            BigInteger valueIndex = new BigInteger(inputNumber.charAt(i) + "").
                    multiply(new BigInteger("8")).pow(lengthOctNumber - 1 - i);
            decNumber = decNumber.add(valueIndex);
        }
        System.out.println(" = " + decNumber.toString());
        return decNumber.toString();
    }

    public static String octToBin(String inputNumber) {
        System.out.println("Convert " + inputNumber + "(OCT) to BIN");
        String decNumber = octToDec(inputNumber);
        String binNumber = decToBin(decNumber);
        return binNumber;
    }

    public static String octToHex(String inputNumber) {
        System.out.println("Convert " + inputNumber + "(OCT) to HEX");
        String decNumber = octToDec(inputNumber);
        String hexNumber = decToHex(decNumber);
        return hexNumber;
    }

    public static String hexToDec(String inputNumber) {
        int lengthHexNumber = inputNumber.length();
        BigInteger decNumber = new BigInteger("0");
        System.out.println("Convert " + inputNumber + "(HEX) to DEC");
        for (int i = 0; i < lengthHexNumber; i++) {
            if (i != 0) {
                System.out.print(" + ");
            }
            System.out.print(inputNumber.charAt(i) + "*16^" + (lengthHexNumber - 1 - i));
            BigInteger valueIndex = new BigInteger(indexHexArray(inputNumber.charAt(i) + "")).
                    multiply(new BigInteger("16").pow(lengthHexNumber - 1 - i));
            decNumber = decNumber.add(valueIndex);
        }
        System.out.println(" = " + decNumber.toString());
        return decNumber.toString();
    }

    public static String indexHexArray(String characterIndex) {
        for (int i = 0; i < HEX_ARRAY.length; i++) {
            if (HEX_ARRAY[i].equalsIgnoreCase(characterIndex)) {
                return i + "";
            }
        }
        return null;
    }

    public static String hexToBin(String inputNumber) {
        System.out.println("Convert " + inputNumber + "(HEX) to BIN");
        String decNumber = hexToDec(inputNumber);
        String binNumber = decToBin(decNumber);
        return binNumber;
    }

    public static String hexToOct(String inputNumber) {
        System.out.println("Convert " + inputNumber + "(HEX) to OCT");
        String decNumber = hexToDec(inputNumber);
        String octNumber = decToOct(decNumber);
        return octNumber;
    }

}
