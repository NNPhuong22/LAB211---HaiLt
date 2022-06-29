package countcoin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author NNPhuong
 */
public class CountCoin {

    /**
     * @return
     */
    // J1.S.H209
    // check file is exist or not
    public static boolean checkFile() {
        File file = new File("E:/Project/Java Project/Lab Java/CountCoin/CoinList.txt");
        if (!file.exists()) {
            try {
                System.out.println("File does not exist!");
                file.createNewFile();
                System.out.println("File create successfully!");
                return true;
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return true;
    }

    public static void countCoins(Scanner sc) {
        double total = 0;
        if (!sc.hasNext()) {
            System.out.println("File is empty!");
        }
        while (sc.hasNext()) {
            double amount;
            try {
                amount = sc.nextDouble();
            } catch (Exception e) {
                System.out.println("Please check your data!");
                return;
            }
            String type = sc.next();
            if (type.equalsIgnoreCase("pennies")) {
                total += amount;
            } else if (type.equalsIgnoreCase("nickels")) {
                total += 5 * amount;
            } else if (type.equalsIgnoreCase("dimes")) {
                total += 10 * amount;
            } else if (type.equalsIgnoreCase("quarters")) {
                total += 25 * amount;
            } else {
                    System.out.println("Wrong type: " + type);
            }
        }
        System.out.println("Total money: $" + String.format("%.2f", total / 100));
    }

    public static void main(String[] args) {
        File file = new File("E:/Project/Java Project/Lab Java/CountCoin/CoinList.txt");
        try {
            if (!checkFile()) {
                return;
            }
            Scanner sc = new Scanner(file);
            countCoins(sc);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

}
