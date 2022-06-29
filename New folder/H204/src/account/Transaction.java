package account;

/**
 *
 * @author NNPhuong
 */
public class Transaction {
    
    private int value;
    private boolean approved;

    public Transaction(int value) {
        this.value = value;
    }
    
    public boolean getApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public int getValue() {
        return value;
    }
    
}
