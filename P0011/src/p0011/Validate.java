/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0011;

import java.util.Scanner;

/**
 *
 * @author quang
 */
public class Validate {

    static Scanner sc = new Scanner(System.in);
    private final static String BIN_VALID = "[0-1]+";
    private final static String OCT_VALID = "[0-7]+";
    private final static String DEC_VALID = "\\d+";
    private final static String HEX_VALID = "[0-9A-Fa-f]+";

    public static int checkUserChoice(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < min || result > max) {
                    System.out.println("Please input number in range [" + min + ", " + max + "]");
                    System.out.print("Enter again: ");
                } else {
                    return result;
                }
            } catch (Exception e) {
                System.out.println("Invalid, accept integer number only!");
                System.out.print("Enter again: ");
            }
        }
    }
    
    public static String checkNum(String mess, String base, String messOut) {
        System.out.println(mess);
        String result;
        while (true) {
            result = sc.nextLine().trim();
            if (result.matches(base)) {
                return result;
            } else {
                System.out.println(messOut);
                System.out.print("Enter again: ");
            }
        }
    }

    public static String checkBin() {
        System.out.print("Enter binary number: ");
        String result;
        while (true) {
            result = sc.nextLine().trim();
            if (result.matches(BIN_VALID)) {
                return result;
            } else {
                System.out.println("Must be enter 0 or 1!!!");
                System.out.print("Enter again: ");
            }
        }
    }

    public static String checkOct() {
        System.out.print("Enter octal number: ");
        String result;
        while (true) {
            result = sc.nextLine().trim();
            if (result.matches(OCT_VALID)) {
                return result;
            } else {
                System.out.println("Must be enter 0-7!!!");
                System.out.print("Enter again: ");
            }
        }
    }

    public static String checkDec() {
        System.out.print("Enter decimal number: ");
        String result;
        while (true) {
            result = sc.nextLine().trim();
            if (result.matches(DEC_VALID)) {
                return result;
            } else {
                System.out.println("Must be enter 0-9!!!");
                System.out.print("Enter again: ");
            }
        }
    }

    public static String checkHex() {
        System.out.print("Enter hexadecimal number: ");
        String result;
        while (true) {
            result = sc.nextLine().trim();
            if (result.matches(HEX_VALID)) {
                return result;
            } else {
                System.out.println("Must be enter 0-9 A-F!!!");
                System.out.print("Enter again: ");
            }
        }
    }

}
