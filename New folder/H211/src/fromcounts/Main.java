package fromcounts;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author NNPhuong
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    //check input
    public static int checkInput(int min) {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < min || result % 2 != 0) {
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

    public static void main(String[] args) {
        System.out.print("Enter the size of array(must be even): ");
        int n = checkInput(2);
        int m = 0;
        Random rd = new Random();
        int[] a1 = new int[n];
        for (int i = 0; i < n; i++) {
            int e = rd.nextInt(30) - rd.nextInt(30);
            if (i % 2 == 0) {
                e = rd.nextInt(30);
                m += e;
            }
            a1[i] = e;
        }
        System.out.print("List 1: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a1[i] + " ");
        }
        
        System.out.println("\n==============================================");
        
        ArrayIntList list = new ArrayIntList(a1, n);
        int[] a2 = new int[m];
        a2 = list.fromCounts();
        System.out.print("List 2: ");
        for (int i = 0; i < m; i++) {
            System.out.print(a2[i] + " ");
        }
        System.out.println();
    }

}
