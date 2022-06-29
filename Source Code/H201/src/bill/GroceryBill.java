package bill;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NNPhuong
 */
public class GroceryBill {
    
    private Employee clerk;
    private List<Item> list = new ArrayList<Item>();
    private double total = 0.0;
    
    // constructs a GroceryBill object for the given clerk
    public GroceryBill(Employee clerk) {
        this.clerk = clerk;
    }
    
    // adds i to this bill's total
    public void add(Item i) {
        list.add(i);
        total += i.getPrice();
    }
    
    // returns the cost of these items
    public double getTotal() {
        return total;
    }
    
    // prints a list of items
    public void printReceipt() {
        System.out.println("List of Items: ");
        for (Item o : list) {
            System.out.println(o.toString());
        }
    }
}
