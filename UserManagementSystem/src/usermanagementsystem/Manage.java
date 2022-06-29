package usermanagementsystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author QUANG THAI
 */
public class Manage {

    public static int menu() {
        System.out.println("======USER MANAGEMENT SYSTEM======");
        System.out.println("1. Create a new account");
        System.out.println("2. Login system");
        System.out.println("3. Exit");
        System.out.print("> Choose: ");
        int choice = Validate.checkUserChoice(1, 3);
        return choice;
    }

    public static void createNewAcc() {
        if (!Validate.checkFileExist()) {
            return;
        }
        String username = Validate.inputUsername();
        if (!Validate.checkUsernameExist(username)) {
            System.out.println("Username already exist!");
            return;
        }
        String password = Validate.inputPassword();
        addAccountData(username, password);
    }

    public static void loginSystem() {
        if (!Validate.checkFileExist()) {
            return;
        }
        String username = Validate.inputUsername();
        if (!Validate.checkUsernameExist(username)) {
            String password = Validate.inputPassword();
            if (!password.equalsIgnoreCase(passwordByUsername(username))) {
                System.out.println("Password Incorrect!");
            } else {
                System.out.println("Login success!");
            }
        } else {
            System.out.println("Username is incorrect!");
        }
    }

    public static void addAccountData(String username, String password) {
        File file = new File("E:/Project/Java Project/Lab Java/UserManagementSystem/user.dat");
        try {
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(username + ";" + password);
            bw.newLine();
            bw.close();
            fw.close();
            System.out.println("Create successfully!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String passwordByUsername(String username) {
        File file = new File("E:/Project/Java Project/Lab Java/UserManagementSystem/user.dat");
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] acc = line.split(";");
                if (username.equalsIgnoreCase(acc[0])) {
                    return acc[1];
                }
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

}
