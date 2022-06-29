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
public class Manager {

    static void createFruit(ArrayList<Fruit> lf) {
        while (true) {
            System.out.print("Enter fruit id: ");
            int fruitId = validation.checkInt();
            while (validation.isExist(lf, fruitId) != -1) {
                System.out.println("Existed!");
                fruitId = validation.checkInt();

            }
            System.out.print("Enter fruit name: ");
            String fruitName = validation.checkString("Fruit name can not have number", "^[a-zA-Z ]+");
            System.out.print("Enter price: ");
            double price = validation.checkDouble();
            System.out.print("Enter quantity: ");
            int quantity = validation.checkInt();
            System.out.print("Enter origin: ");
            String origin = validation.checkString("Origin can not have number", "^[a-zA-Z ]+");
            lf.add(new Fruit(fruitId, fruitName, price, quantity, origin));

            if (!validation.checkYN("Do you want to continue (Y/N)?")) {
                displayFruit(lf);
                return;
            }
        }
    }

    static void viewOrder(Hashtable<String, ArrayList<Fruit>> ht) {
        for (String name : ht.keySet()) {
            System.out.println("Customer: " + name.substring(name.indexOf("@"+1)));
            ArrayList<Fruit> lo = ht.get(name);
            displayOrder(lo);
        }
    }

    static ArrayList<Fruit> getFruitList(ArrayList<Fruit> lf) {
        ArrayList<Fruit> list = new ArrayList<>();
        for (Fruit o : lf) {
            if (o.getQuantity() != 0) {
                list.add(o);
            }

        }
        return list;
    }

    static void updateFruit(ArrayList<Fruit> lf) {
        System.out.print("Input ID: ");
        int item = validation.checkInt();
        int eID = validation.isExist(lf, item);
        if (eID != 1) {
            Fruit fruit = lf.get(eID);
            System.out.print("Update quantity: ");
            int quantity = validation.checkInt();
            fruit.setQuantity(quantity + fruit.getQuantity());
            System.out.println("Update successfull!");
            return;
        }
        if (validation.checkYN("Do you want to create fruit?")) {
            createFruit(lf);
        }
    }
//phải dùng số thứ tự và chọn theo số thứ tự

    static void shopping(ArrayList<Fruit> lf, Hashtable<String, ArrayList<Fruit>> ht) {
        if (lf.isEmpty()) {
            System.err.println("Fruit list empty!");
            return;
        }
        ArrayList<Fruit> fruitshop = new ArrayList<>();
        while (true) {
            ArrayList<Fruit> availableF = getFruitList(lf);
            displayFruit(availableF);
            System.out.print("Select Item: ");
            int item = validation.checkRange(1, availableF.size());
            Fruit fruit = availableF.get(item-1);
            System.out.println("You selected: " + fruit.getFname());
            System.out.print("Enter quantity: ");
            int quantity = validation.checkRange(1, fruit.getQuantity());
            fruit.setQuantity(fruit.getQuantity() - quantity);

            if (!validation.checkItem(fruitshop, fruit.getFid())) {
                updateOrder(fruitshop, fruit.getFid(), quantity);
            } else {
                fruitshop.add(new Fruit(fruit.getFid(), fruit.getFname(),
                        fruit.getPrice(), quantity, fruit.getOrigin()));
            }

            if (validation.checkYN("Do you want to order now(Y/N)")) {
                break;
            }
        }
        displayOrder(fruitshop);
        System.out.print("Enter name: ");
        String name = validation.checkString("Name can not have number", "^[a-zA-Z ]+$");
        name= ht.size()+"@" +name;
        ht.put(name, fruitshop);
        System.err.println("Shopping successfull");
    }

    static void updateOrder(ArrayList<Fruit> lf, int id, int quantity) {
        for (Fruit fruit : lf) {
            if (fruit.getFid() == id) {
                fruit.setQuantity(fruit.getQuantity() + quantity);
                return;
            }
        }
    }

    static void displayFruit(ArrayList<Fruit> lf) {
        System.out.format("%1s%15s%10s%10s\n", "Item", "Fruit name", "Origin", "Price");
        int index = 1;
        for (Fruit fruit : lf) {
            if (fruit.getQuantity() != 0) {
                System.out.format("%1s%15s%10s%10s$\n", index++,
                        fruit.getFname(), fruit.getOrigin(), fruit.getPrice());
            }

        }

    }

    static void displayOrder(ArrayList<Fruit> order) {
        double total = 0;
        System.out.printf("%1s%15s%15s%15s\n", "Product", "Quantity", "Price", "Amount");
        for (Fruit o : order) {
            System.out.printf("%1s%15s%15s$%15s\n", o.getFname(),
                    o.getQuantity(), o.getPrice(),
                    o.getPrice() * o.getQuantity());
            total += o.getPrice() * o.getQuantity();
        }
        System.out.println("Total: " + total);
    }

}
