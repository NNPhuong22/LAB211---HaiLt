package usermanagementsystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author QUANG THAI
 */
public class Validate {

    static Scanner sc = new Scanner(System.in);
    private final static String VALID_USERNAME = "^\\S{5,}$";
    private final static String VALID_PASSWORD = "^(?=.*\\w)(?=.*\\W)\\S{8,}$";

    public static int checkUserChoice(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < min || result > max) {
                    System.out.println("Please input number in range [" + min + ", " + max + "]");
                    System.out.print("Enter again: ");
                } else {
                    return result;
                }
            } catch (Exception e) {
                System.out.println("Invalid, accept integer number only!");
                System.out.print("Enter again: ");
            }
        }
    }

    public static String checkInputString() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.out.println("Need To Fill");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }

    public static boolean checkFileExist() {
        File file = new File("E:/Project/Java Project/Lab Java/UserManagementSystem/user.dat");
        if (!file.exists()) {
            try {
                System.out.println("File does not exist!");
                return false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return true;
    }

    public static String inputUsername() {
        System.out.print("Enter username: ");
        while (true) {
            String result = checkInputString();
            if (result.matches(VALID_USERNAME)) {
                return result;
            } else {
                System.out.println("Username must be at least 5 characters and no spaces.");
                System.out.print("Enter again: ");
            }
        }
    }

    public static String inputPassword() {
        System.out.print("Enter password: ");
        while (true) {
            String result = checkInputString();
            if (result.matches(VALID_PASSWORD)) {
                return result;
            } else {
                System.out.println("Password must be at least 8 characters and no spaces, including special characters.");
                System.out.print("Enter again: ");
            }
        }
    }

    public static boolean checkUsernameExist(String username) {
        File file = new File("E:/Project/Java Project/Lab Java/UserManagementSystem/user.dat");
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] acc = line.split(";");
                if (username.equalsIgnoreCase(acc[0])) {
                    return false;
                }
            }
            br.close();
            fr.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return true;
    }

}
