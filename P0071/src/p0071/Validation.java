/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0071;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author quang
 */
public class Validation {

    static Scanner sc = new Scanner(System.in);

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

    public static String checkInputString() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.out.println("Need To Fill");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }

    public static double checkDoule(double min, double max) {
        while (true) {
            try {
                double result = Double.parseDouble(sc.nextLine().trim());
                if (result < min || result > max) {
                    System.out.println("Please input number in range [" + min + ", " + max + "]");
                    System.out.print("Enter again: ");
                } else {
                    return result;
                }
            } catch (Exception e) {
                System.out.println("Invalid, accept double number only!");
                System.out.print("Enter again: ");
            }
        }
    }

    public static Date GetDate(String msg) {
        Date date = new Date();
        SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");
        SDF.setLenient(false);
        do {
            System.out.println(msg);
            String sDate = sc.nextLine();
            try {
                date = SDF.parse(sDate);
                return date;
            } catch (Exception e) {
                System.out.print(e);
            }
        } while (true);

    }

}
