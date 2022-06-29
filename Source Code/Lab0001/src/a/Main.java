/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author NNPhuong
 */
public class Main {
static int CheckInt(String Mess) {
    Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println(Mess);
            try {
                num = Integer.parseInt(sc.nextLine());
                if (num > 0) {
                    break;
                } else {
                    System.out.println("Number of array must be positive number, reinput!");
                }
  } catch (NumberFormatException e) {
                System.out.println("Invalid, accept integer number only!");
            }
        } while (true);
        return num;
    }
  

    private static void bubbleSort(int a[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > i; j--) {
                if (a[j] < a[j - 1]) {
                    int t = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = t;
                }
            }
        }
    }
    //     i         j
    //  0  1   2  3  4
     // 5  10  1  7  3 
    //  5  10  1  3  7
    //  5  1   10 3  7
    //  1  5   10 3  7
    //  1  
    // 
    // 
    // 
    // 
    // 
    // 
    
private static void display(int a[], String mess) {
    System.out.print(mess);
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            if (i==a.length-1) {
             System.out.println(a[i]+"]");
             break;
            }
            System.out.print(a[i]+", ");  
        }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = CheckInt("Enter number of array");
        int[] a = new int[n];
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
              a[i] = rd.nextInt(n);
        }
        display(a,"Unsorted array: ");
        bubbleSort(a, n);
        display(a, "Sorted array: ");
    }
}
