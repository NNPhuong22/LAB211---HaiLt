/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab0071;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author NNPhuong
 */
public class Validate {

    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    final static Scanner sc = new Scanner(System.in);

    public static Integer CheckInt(String msg, int min, int max, String ignore) {
        int i;
        String str;
        do {
            System.out.print(msg);
            try {
                str = sc.nextLine();
                if (str != null && str.trim().equalsIgnoreCase(ignore)) {
                    return null;
                }
                i = Integer.parseInt(str);
                if (i >= min && i <= max) {
                    return i;
                } else {
                    System.out.println("Out of range, Plz enter from " + min + " to " + max);
                }

            } catch (Exception e) {
                System.out.println("Invalid, accept number only!");
            }
        } while (true);
    }

    public static Double getDouble(String msg, String err, double min, double max, String ignore) {
        double i;
        String str;
        do {
            System.out.print(msg);
            try {
                str = sc.nextLine();
                if (str != null && str.trim().equalsIgnoreCase(ignore)) {
                    return null;
                }
                i = Double.parseDouble(str);
                if (i >= min && i <= max && i%0.5==0) {
                    return i;
                } else {
                    System.out.println(err);
                }

            } catch (Exception e) {
                System.out.println("Invalid, accept double only!");
            }
        } while (true);
    }
    public static String getString(String msg, String ignore) {
        String str;
        do {
            System.out.print(msg);
            str = sc.nextLine();
            if (str != null && str.trim().equalsIgnoreCase(ignore)) {
                return null;
            }
            if (!str.trim().equals("")) {
                return str;
            }
            System.err.println("String must have atleast 1 character");
        } while (true);
    }

    public static Date CheckDate(String msg, String ignore) {
        Date date = new Date();
        SimpleDateFormat SDF = new SimpleDateFormat("MMM-dd-yyyy");
        SDF.setLenient(false);
        do {
            System.out.print(msg);
            String sDate = sc.nextLine();

            try {
                if (sDate != null && sDate.trim().equalsIgnoreCase(ignore)) {
                    return null;
                }
                date = SDF.parse(sDate);
                return date;
            } catch (Exception e) {
                System.out.println("Wrong input, please enter date by following: MMM-dd-yyyy");
            }
        } while (true);

    }
}
