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
public class Manager {

    public static String inputBase() {
        System.out.println("========== Base Input ==========");
        System.out.println("1. Convert from Binary");
        System.out.println("2. Convert from Octal");
        System.out.println("3. Convert from Decimal");
        System.out.println("4. Convert from Hexadecimal");
        System.out.println("5. Exit");
        System.out.print("> Choose: ");
        int choice = Validate.checkUserChoice(1, 5);
        String inputBase = "";
        switch (choice) {
            case 1:
                inputBase = "bin";
                break;
            case 2:
                inputBase = "oct";
                break;
            case 3:
                inputBase = "dec";
                break;
            case 4:
                inputBase = "hex";
                break;
        }
        return inputBase;
    }

    public static String outputBase(String inputBase) {
        int choice;
        String outputBase = "";
        System.out.println("========== Base Number ==========");
        if (inputBase.equalsIgnoreCase("bin")) {
            System.out.println("1. Convert to Octal");
            System.out.println("2. Convert to Decimal");
            System.out.println("3. Convert to Hexadecimal");
            System.out.print("> Choose: ");
            choice = Validate.checkUserChoice(1, 3);
            switch (choice) {
                case 1:
                    outputBase = "oct";
                    break;
                case 2:
                    outputBase = "dec";
                    break;
                case 3:
                    outputBase = "hex";
                    break;
            }
        } else if (inputBase.equalsIgnoreCase("oct")) {
            System.out.println("1. Convert to Binary");
            System.out.println("2. Convert to Decimal");
            System.out.println("3. Convert to Hexadecimal");
            System.out.print("> Choose: ");
            choice = Validate.checkUserChoice(1, 3);
            switch (choice) {
                case 1:
                    outputBase = "bin";
                    break;
                case 2:
                    outputBase = "dec";
                    break;
                case 3:
                    outputBase = "hex";
                    break;
            }
        } else if (inputBase.equalsIgnoreCase("dec")) {
            System.out.println("1. Convert to Binary");
            System.out.println("2. Convert to Octal");
            System.out.println("3. Convert to Hexadecimal");
            System.out.print("> Choose: ");
            choice = Validate.checkUserChoice(1, 3);
            switch (choice) {
                case 1:
                    outputBase = "bin";
                    break;
                case 2:
                    outputBase = "oct";
                    break;
                case 3:
                    outputBase = "hex";
                    break;
            }
        } else if (inputBase.equalsIgnoreCase("hex")) {
            System.out.println("1. Convert to Binary");
            System.out.println("2. Convert to Octal");
            System.out.println("3. Convert to Decimal");
            System.out.print("> Choose: ");
            choice = Validate.checkUserChoice(1, 3);
            switch (choice) {
                case 1:
                    outputBase = "bin";
                    break;
                case 2:
                    outputBase = "oct";
                    break;
                case 3:
                    outputBase = "dec";
                    break;
            }
        }
        return outputBase;
    }

    public static String inputValue(String inputBase) {
        String inputValue = "";
        if (inputBase.equalsIgnoreCase("bin")) {
            inputValue = Validate.checkBin();
        } else if (inputBase.equalsIgnoreCase("dec")) {
            inputValue = Validate.checkDec();
        } else if (inputBase.equalsIgnoreCase("oct")) {
            inputValue = Validate.checkOct();
        } else if (inputBase.equalsIgnoreCase("hex")) {
            inputValue = Validate.checkHex();
        }
        return inputValue;
    }

    public static String convertInputValue(String inputValue, String inputBase, String outputBase) {
        String outputValue = "";
        if (inputBase.equalsIgnoreCase("bin")) {
            if (outputBase.equalsIgnoreCase("oct")) {
                outputValue = ConvertNumber.binToOct(inputValue);
            } else if (outputBase.equalsIgnoreCase("dec")) {
                outputValue = ConvertNumber.binToDec(inputValue);
            } else if (outputBase.equalsIgnoreCase("hex")) {
                outputValue = ConvertNumber.binToHex(inputValue);
            }
        } else if (inputBase.equalsIgnoreCase("oct")) {
            if (outputBase.equalsIgnoreCase("bin")) {
                outputValue = ConvertNumber.octToBin(inputValue);
            } else if (outputBase.equalsIgnoreCase("dec")) {
                outputValue = ConvertNumber.octToDec(inputValue);
            } else if (outputBase.equalsIgnoreCase("hex")) {
                outputValue = ConvertNumber.octToHex(inputValue);
            }
        } else if (inputBase.equalsIgnoreCase("dec")) {
            if (outputBase.equalsIgnoreCase("bin")) {
                outputValue = ConvertNumber.decToBin(inputValue);
            } else if (outputBase.equalsIgnoreCase("oct")) {
                outputValue = ConvertNumber.decToOct(inputValue);
            } else if (outputBase.equalsIgnoreCase("hex")) {
                outputValue = ConvertNumber.decToHex(inputValue);
            }
        } else if (inputBase.equalsIgnoreCase("hex")) {
            if (outputBase.equalsIgnoreCase("bin")) {
                outputValue = ConvertNumber.hexToBin(inputValue);
            } else if (outputBase.equalsIgnoreCase("oct")) {
                outputValue = ConvertNumber.hexToOct(inputValue);
            } else if (outputBase.equalsIgnoreCase("dec")) {
                outputValue = ConvertNumber.hexToDec(inputValue);
            }
        }
        return outputValue;
    }

    public static void printOutput(String inputValue, String outputValue, String inputBase, String outputBase) {
        System.out.println(" => " + inputValue + "(" + inputBase + ") = " + outputValue + "(" + outputBase + ")");
    }

}
