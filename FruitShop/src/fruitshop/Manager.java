package fruitshop;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author QUANG THAI
 */
public class Manager {
    
    private static ArrayList<Fruit> lf = new ArrayList<>();
    
    //display menu
    public static int menu() {
        System.out.println("FRUIT SHOP SYSTEM");
        System.out.println("\t1. Create Fruit");
        System.out.println("\t2. Update Fruit");
        System.out.println("\t3. View orders");
        System.out.println("\t4. Shopping(for buyer)");
        System.out.println("\t5. Exit");
        System.out.println("(Please choose 1 to create product, 2 to update product,"
                + " 3 to view order, 4 for shopping, 5 to Exit program).");
        int choice = Validate.checkUserChoice(1, 5);
        return choice;
    }
    
    // create fruit
    public static void createProduct() {
        while (true) {            
            System.out.print("Enter fruit ID: ");
            String id = Validate.checkInputString();
            if (!Validate.checkIdExist(lf, id)) {
                System.out.println("ID exist!");
                break;
            }
            System.out.print("Enter fruit name: ");
            String name = Validate.checkInputString();
            System.out.print("Enter price: ");
            double price = Validate.checkInputDoub();
            System.out.print("Enter quantity: ");
            int quantity = Validate.checkInputInt();
            System.out.print("Enter origin: ");
            String origin = Validate.checkInputString();
            lf.add(new Fruit(id, name, price, quantity, origin));
            System.out.print("Do you want to continue (Y/N)? ");
            if (!Validate.checkInputYN()) {
                break;
            }
        }
    }
    
    // update fruit
    public static void updateFruit() {
        System.out.print("Enter fruit ID: ");
        String id = Validate.checkInputString();
        if (!Validate.checkIdExist(lf, id)) {
            Fruit fr = new Fruit();
            System.out.print("Update quantity: ");
            fr.setQuantity(Validate.checkInputInt());
        } else {
            System.out.print("Do you want to create product (Y/N)? ");
            if (!Validate.checkInputYN()) {
                return;
            } else {
                createProduct();
            }
        }
    }
    
}
