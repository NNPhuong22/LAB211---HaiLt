package selectionsort;

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
    // J1.S.P0020
    static Scanner sc = new Scanner(System.in);

    // Check user input
    private static int checkInput(int a) {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < a) {
                    System.out.println("Size of array must be >= " + a + "!");
                    System.out.print("Enter again: ");
                } else {
                    return result;
                }
            } catch (NumberFormatException e) {
                System.err.println("Please input decimal number");
                System.out.print("Enter again: ");
            }
        }
    }

    // input elements
    public static int[] inputElements(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = checkInput(Integer.MIN_VALUE);
        }
        return a;
    }

    // print out the array
    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.print("\b\b");
        System.out.println("]");
    }

    // selection sort
    private static void selectionSort(int[] a) {
        System.out.print("Unsorted array: [");
        printArray(a);

        for (int i = 0; i < a.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min_idx]) {
                    min_idx = j;
                }
            }
            if (a[min_idx] == a[i]) {
                continue;
            }
            int temp = a[min_idx];
            a[min_idx] = a[i];
            a[i] = temp;
        }
        // 4 6 3 8 7 9
        // 3 6 4 8 7 9
        // 3 4 6 7 8 9

        System.out.print("Sorted array: [");
        printArray(a);
    }

    public static void main(String[] args) {
        System.out.print("Enter number of array: ");
        int n = checkInput(2);
        int[] a = inputElements(n);
        selectionSort(a);
    }

}
