package reverseword;

import java.util.Scanner;

/**
 *
 * @author NNPhuong
 */
public class ReverseWord {

    /**
     * @param args the command line arguments
     */
    
    // J1.S.H203
    
    static Scanner sc = new Scanner(System.in);
    
    // check input string
    public static String checkInputString() {
        while (true) {            
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.out.println("Need To Fill!");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }
    
    public static void reverse(String s) {
        String reverse = "";
        String []r = s.split("\\s+");
        for (int i = r.length - 1; i >= 0; i--) {
            reverse += r[i] + " ";
        }
        reverse = reverse.substring(0, 1).toUpperCase() + reverse.substring(1);
        System.out.println(reverse.trim());
    }
    
    public static void main(String[] args) {
        System.out.print("Enter String: ");
        String s = checkInputString();
        reverse(s);
    }

}
