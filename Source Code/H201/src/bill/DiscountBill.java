package bill;

/**
 *
 * @author NNPhuong
 */
public class DiscountBill extends GroceryBill {
    
    private int discountCount = 0;
    private double discountAmout = 0.0;
    private boolean preferred;
    
    // constructs discount bill for given clerk
    public DiscountBill(Employee clerk, boolean preferred) {
        super(clerk);
        this.preferred = preferred;
    }
    
    @Override
    public void add(Item i) {
        super.add(i);
        if (preferred == true && i.getDiscount() > 0) {
            discountCount++;
            discountAmout += i.getDiscount();
        }
    }
    
    // returns the number of items that were discounted, if any
    public int getDiscountCount() {
        return discountCount;
    }
    
    // returns the total discount for this list of items, if any
    public double getDiscountAmount() {
        return discountAmout;
    }
    
    @Override
    public double getTotal() {
        return super.getTotal() - discountAmout;
    }
    
    // returns the percent of the total discount as a percent of what the total would have been otherwise
    public double getDiscountPercent() {
        return 100.0 * discountAmout / super.getTotal();
    }
    
}
