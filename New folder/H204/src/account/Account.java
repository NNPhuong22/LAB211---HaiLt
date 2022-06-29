package account;

/**
 *
 * @author NNPhuong
 */
public class Account {

    /**
     * @param args the command line arguments
     */
    
    private Client c;
    private Transaction t;

    public Account(Client c) {
        this.c = c;
    }
    
    public boolean process(Transaction t) {
        if (t.getApproved()) {
            return true;
        } else {
            return false;
        }
    }
    
    public int value() {
        return t.getValue();
    }

}
