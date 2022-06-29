package p0059;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author NNPhuong
 */
public class Manage {

    public static int menu() {
        System.out.println("=========== File Processing ==========");
        System.out.println("\t1. Find person info");
        System.out.println("\t2. Copy text to new file");
        System.out.println("\t3. Exit");
        System.out.print("> Choose: ");
        int choice = Validate.checkInt(1, 3);
        return choice;
    }

    public static void findInfo() {
        System.out.println("------------- Person info -------------");
        ArrayList<Person> list = new ArrayList<>();
        if (list == null) {
            System.out.println("List is empty!");
            return;
        }
        System.out.print("Enter path: ");
        String pathFile = Validate.checkPathFile();
        list = getPerson(pathFile);
        System.out.print("Enter money: ");
        double salary = Validate.checkSalary(100);
        displayPerson(list, salary);
    }

    public static ArrayList<Person> getPerson(String pathFile) {
        ArrayList<Person> list = new ArrayList<>();
        File file = new File(pathFile);
        if (!file.exists() || !file.isFile()) {
            System.out.println("Path doesn't exist!");
            return null;
        }
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] info = line.split(";");
                list.add(new Person(info[0], info[1], getMoney(info[2])));
            }
        } catch (IOException e) {
            System.out.println("Can't read file!");
        }
        return list;
    }

    private static double getMoney(String money) {
        double result = 0;
        try {
            result = Double.parseDouble(money);
        } catch (NumberFormatException e) {
            result = 0;
        }
        return result;
    }

    private static void displayPerson(ArrayList<Person> list, double money) {
        System.out.println("-------------- Result -------------");
        System.out.printf("%13s%13s%13s\n", "Name", "Address", "Money");
        for (Person person : list) {
            if (person.getSalary() >= money) {
                System.out.printf("%13s%13s%13.1f\n", person.getName(),
                        person.getAddress(), person.getSalary());
            }
        }
        Collections.sort(list);
        System.out.println("Max: " + list.get(0).getName());
        System.out.println("Min: " + list.get(list.size() - 1).getName());
    }

    public static void coppyNewFile() {
        System.out.println("------------- Copy Text --------------");
        System.out.print("Enter source: ");
        String pathFileInput = Validate.checkPathFile();
        System.out.print("Enter new file name: ");
        String pathFileOutput = Validate.checkPathFile();
        String content = getNewContent(pathFileInput);
        writeNewContent(pathFileOutput, content);
    }

    public static String getNewContent(String pathFileInput) {
        HashSet<String> newContent = new HashSet<>();
        File file = new File(pathFileInput);
        try {
            Scanner input = new Scanner(file);
            int count = 0;
            while (input.hasNext()) {
                String word = input.next();
                newContent.add(word + " ");
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Can’t read file");
        }
        String content = "";
        for (String line : newContent) {
            content += line;
        }
        return content;
    }

    public static void writeNewContent(String pathFileOutput, String content) {
        File file = new File(pathFileOutput);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
            fw.close();
            System.out.println("Copy done...");
        } catch (IOException ex) {
            System.out.println("Can’t write file");
        }
    }

}
