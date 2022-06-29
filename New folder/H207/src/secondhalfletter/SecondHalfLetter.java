package secondhalfletter;

import java.util.Scanner;

/**
 *
 * @author NNPhuong
 */
public class SecondHalfLetter {

    /**
     * @param args the command line arguments
     */
    
    // J1.S.H207
    
    static Scanner sc =  new Scanner(System.in);
    
    // check string input
    public static String checkInput() {
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
    
    public static int secondHalfLetters(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.toLowerCase(s.charAt(i)) >= 'n' && Character.toLowerCase(s.charAt(i)) <= 'z') {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        System.out.print("Enter the String: ");
        String s = checkInput();
        System.out.println("The numbers of letters in the "
                + "string come from the second half of the alphabet: " + 
                secondHalfLetters(s));
    }

}
