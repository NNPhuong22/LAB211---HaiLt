package fliplines;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author NNPhuong
 */
public class FlipLines {

    /**
     * @param args the command line arguments
     */
    
    // J1.S.H210
    
    // check File is exist or not
    public static boolean checkFile() {
        File file = new File("E:/Project/Java Project/Lab Java/FlipLines/FlipLines.txt");
        if (!file.exists()) {
            try {
                System.out.println("File does not exist!");
                file.createNewFile();
                return false;
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return true;
    }
    
    public static void flipLines(Scanner sc) {
        if (!sc.hasNextLine()) {
            System.out.println("File is empty!");
        }
        while (sc.hasNextLine()) {            
            String line = sc.nextLine();
            if (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            System.out.println(line);
        }
    }
    
    public static void main(String[] args) {
        File file = new File("E:/Project/Java Project/Lab Java/FlipLines/FlipLines.txt");
        try {
            if (!checkFile()) {
                return;
            }
            Scanner sc = new Scanner(file);
            flipLines(sc);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

}
