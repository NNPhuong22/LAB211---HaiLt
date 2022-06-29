package swapdigitspair;

import java.util.Scanner;

/**
 *
 * @author NNPhuong
 */
public class SwapDigitsPair {

    /**
     * @param args the command line arguments
     */
    
    // J1.S.H208
    
    static Scanner sc = new Scanner(System.in);
    
    // check input
    public static int checkInput() {
        while (true) {            
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input decimal number");
                System.out.print("Enter again: ");
            }
        }
    }
    
    public static int swapDigitPair(int n) {
        int result = 0;
        int m = 1;
        while (n > 0) {
            int d1 = n % 10;
            n /= 10;
            if (n == 0) {
                result += m * d1;
                break;
            }
            int d2 = n % 10;
            result += m * 10 * d1 + m * d2;
            n /= 10;
            m *= 100;
        }
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println(swapDigitPair(5));
    }

}
