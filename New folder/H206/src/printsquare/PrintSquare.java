package printsquare;

import java.util.Scanner;

/**
 *
 * @author NNPhuong
 */
public class PrintSquare {

    /**
     * @param args the command line arguments
     */
    // J1.S.H206
    static Scanner sc = new Scanner(System.in);

    // check input
    public static int checkInput(int a) {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < a) {
                    System.out.println("Invalid!");
                    System.out.print("Enter again: ");
                } else {
                    return result;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void printSquare(int min, int max) {
        for (int i = min; i <= max; i++) {
            for (int j = i; j <= max; j++) {
                System.out.print(j);
            }
            for (int j = min; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        // 1, 5
        // 12345
        // 23451
        // 34512
        //
    }

    public static void main(String[] args) {
        System.out.print("Min: ");
        int min = checkInput(Integer.MIN_VALUE);
        System.out.print("Max: ");
        int max = checkInput(min);
        printSquare(min, max);
    }

}
