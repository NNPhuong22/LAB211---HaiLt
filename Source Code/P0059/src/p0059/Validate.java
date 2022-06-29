package p0059;

import java.util.Scanner;

/**
 *
 * @author NNPhuong
 */
public class Validate {

    static Scanner sc = new Scanner(System.in);
    
    public static int checkInt(int min, int max) {
        while (true) {            
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < min || result > max) {
                    System.out.println("The input must be in the range [" + min + ", " + max + "]");
                    System.out.print("Enter again: ");
                } else {
                    return result;
                }
            } catch (NumberFormatException e) {
                System.out.println("Must be type an Integer number!");
                System.out.print("Enter again: ");
            }
        }
    }
    
    public static double checkSalary(double a) {
        System.out.print("Enter money: ");
        while (true) {            
            try {
                double result = Double.parseDouble(sc.nextLine().trim());
                if (result < a) {
                    System.out.println("The salary must be > " + a);
                    System.out.print("Enter again: ");
                } else {
                    return result;
                }
            } catch (NumberFormatException e) {
                System.out.println("Must be type a Double number!");
                System.out.print("Enter again: ");
            }
        }
    }
    
    public static String checkPathFile() {
        System.out.print("Enter path: ");
        while (true) {            
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.out.println("You must fill the blank!");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }
    
}
