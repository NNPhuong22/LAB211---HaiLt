/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0063;

import java.util.Scanner;

/**
 *
 * @author quang
 */
public class Validate {

    static Scanner sc = new Scanner(System.in);

    public static String checkString() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.out.println("Fill the blank!");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }

    public static int checkInt() {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result <= 0) {
                    System.out.println("Must be greater than 0!");
                    System.out.print("Enter again: ");
                } else {
                    return result;
                }
            } catch (NumberFormatException e) {
                System.out.println("You must input digit!");
                System.out.print("Enter again: ");
            }
        }
    }
    
    

}
