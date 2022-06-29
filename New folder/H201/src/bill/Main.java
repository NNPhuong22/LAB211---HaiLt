package bill;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NNPhuong
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Item i = new Item("Candy" , 1.0, 0.2);
        Item i1 = new Item("Cake" , 20, 5.0);
        Item i2 = new Item("Wine" , 300.0, 50.0);
        
        Employee e = new Employee("NNPhuong");
        DiscountBill d = new DiscountBill(e, false);
        
        d.add(i);
        d.add(i1);
        d.add(i2);
        d.printReceipt();
        System.out.println("===============================================");
        System.out.println("Number of Discount: " + d.getDiscountCount());
        System.out.println("Total Discount: " + d.getDiscountAmount());
        System.out.println("Percent of Discount: " + String.format("%.2f", d.getDiscountPercent()) + "%");
        System.out.println("Total Price: " + d.getTotal());
    }

}
