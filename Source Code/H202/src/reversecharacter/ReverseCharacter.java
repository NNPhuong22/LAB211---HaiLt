package reversecharacter;

import java.util.Scanner;

/**
 *
 * @author NNPhuong
 */
public class ReverseCharacter {

    /**
     * @param args the command line arguments
     */
    
    // J1.S.H202
    
    static Scanner sc = new Scanner(System.in);

    public static void printReverse(String s) {
        if (s.isEmpty()) {
            return;
        }
        String reverse = "";
        for (int i = s.length() - 1; i > 0; i--) {
            reverse += s.charAt(i);
        }
        System.out.println("The reverse String: " + reverse);
    }

    public static void main(String[] args) {
        System.out.print("Enter the String: ");
        String s = sc.nextLine().trim();
        printReverse(s);
    }

}
