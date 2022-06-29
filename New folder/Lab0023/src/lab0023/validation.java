/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab0023;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NNPhuong
 */
public class validation {

    private static final Scanner sc = new Scanner(System.in);

    public static int checkRange(int min, int max) {
        while (true) {
            try {
                int result = checkInt();
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (Exception e) {
                System.out.println("Please input number in range [" + min + ", " + max + "]");
                System.out.println("Re input: ");
            }
        }
    }

public static String checkString( String err, String regex) {
        while (true) {
            try {
                String str = sc.nextLine();
                if (str.matches(regex)) {
                    return str;
                }
            } catch (Exception e) {
                System.out.println(err);
            }
            System.out.println(err);
            System.out.println("Enter again");
        }
    }
    public static int checkInt() {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result>0) {
                  return result;  
                }
                System.out.println("Input positive number");
            } catch (NumberFormatException e) {
                System.out.println("Input integer only!");
            }
        }
    }

    public static double checkDouble() {
        while (true) {
            try {
                double result = Double.parseDouble(sc.nextLine().trim());
                if (result>0) {
                  return result;  
                }
                System.out.println("Input positive number");
            } catch (Exception e) {
                System.out.println("Input double only!");
            }
        }
    }

    public static boolean checkYN(String mess) {
        System.out.print(mess);
        while (true) {
            String result = checkString("Input y/Y or n/N only!", "^[a-zA-Z ]+");
            if (result.equalsIgnoreCase("y")) {
                return true;
            }
            if (result.equalsIgnoreCase("n")) {
                return false;
            }
            System.err.println("Input y/Y or n/N only!");
        }
    }

    public static int isExist(ArrayList<Fruit> list, int fruitId) {
        while (true) {
            for (Fruit fruit : list) {
                if (fruitId == fruit.getFid()) {
                    return fruitId;
                }
            }
            return -1;
        }
    }

    

    public static boolean checkItem(ArrayList<Fruit> lo, int id) {
        for (Fruit list : lo) {
            if (list.getFid()==id) {
                return false;
            }
        }
        return true;
    }
}
