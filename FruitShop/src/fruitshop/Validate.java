package fruitshop;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author QUANG THAI
 */
public class Validate {
    
    static Scanner sc = new Scanner(System.in);
    
    // check user's choice
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
    
    // check input string
    public static String checkInputString() {
        while (true) {            
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.out.println("Need to fill!");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }
    
    // check input integer
    public static int checkInputInt() {
        while (true) {  
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                return result;
            } catch (Exception e) {
                System.out.println("Invalid, accept integer number only!");
                System.out.print("Enter again: ");
            }
        }
    }
    
    // check input double
    public static double checkInputDoub() {
        while (true) {            
            try {
                double result = Double.parseDouble(sc.nextLine().trim());
                return result;
            } catch (Exception e) {
                System.out.println("Invalid, accept double number only!");
                System.out.print("Enter again: ");
            }
        }
    }
    
    // check input Y/N
    public static boolean checkInputYN() {
        while (true) {            
            String result = checkInputString();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            }
            if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.out.println("Please enter Y or N");
            System.out.print("Enter again: ");
        }
    }
    
    // check if id exist or not
    public static boolean checkIdExist(ArrayList<Fruit> lf, String id) {
        for (Fruit o : lf) {
            if (id.equalsIgnoreCase(o.getId())) {
                return false;
            }
        }
        return true;
    }
    
}
