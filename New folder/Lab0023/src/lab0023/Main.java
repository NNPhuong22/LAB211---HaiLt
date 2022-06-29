/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab0023;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
    * @author NNPhuong
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ArrayList<Fruit> fruitlist = new ArrayList<>();
    fruitlist.add(new Fruit(1, "a", 10, 5, "vn"));
    fruitlist.add(new Fruit(5, "b", 10, 5, "vn"));
    fruitlist.add(new Fruit(8, "c", 10, 5, "vn"));
    fruitlist.add(new Fruit(10, "d", 10, 5, "vn"));
    fruitlist.add(new Fruit(20, "e", 10, 5, "vn"));
    fruitlist.add(new Fruit(10, "f", 10, 5, "vn"));
          Hashtable<String, ArrayList<Fruit>> orderlist = new Hashtable<>();
        while (true) {   
        System.out.println("Fruit SHOP SYSTEM");
        System.out.println("1. Create Fruit");
        System.out.println("2. Update Fruit");
        System.out.println("3. View orders");
        System.out.println("4. Shopping (for buyer)");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        int choice = validation.checkRange(1, 5);      
            switch(choice){
                case 1:
                    Manager.createFruit(fruitlist);
                    break;
                case 2:
                    Manager.updateFruit(fruitlist);
                    break;
                case 3:
                    Manager.viewOrder(orderlist);
                    break;
                case 4:
                    Manager.shopping(fruitlist, orderlist);
                    break;
                case 5: 
                    return;
            }
        }

    }
    
}
