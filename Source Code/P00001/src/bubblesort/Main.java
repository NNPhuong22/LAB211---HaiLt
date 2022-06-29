package bubblesort;

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
    
    // J1.S.P0001
    
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
    
    // generate random integer
    private static int[] generateInteger(int n) {
        Random generator = new Random();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = generator.nextInt(n) + 1;
        }
        return a;
    }
    
    // print out the array
    public static void printArray(int []a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.print("\b\b");
        System.out.println("]");
    }
    
    // sort array
    private static void sortArray(int []a) {
        System.out.print("Unsorted array: [");
        printArray(a);
        
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if(a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
         
        System.out.print("Sorted array: [");
        printArray(a);
    }
    
    public static void main(String[] args) {
        System.out.print("Enter number of array: ");
        int n = checkInput(2);
        int []a = generateInteger(n);
        sortArray(a);
    }
    
}
