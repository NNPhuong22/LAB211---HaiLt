package account;

/**
 *
 * @author NNPhuong
 */
public class FilteredAccount extends Account {

    private int total;
    private int zero;

    public FilteredAccount(Client c) {
        super(c);
        this.total = 0;
        this.zero = 0;
    }

    @Override
    public boolean process(Transaction t) {
        total++;
        if (t.getValue() == 0) {
            zero++;
            return true;
        } else {
            return super.process(t);
        }
    }

    public double percentFiltered() {
        if (total == 0) {
            return 0.0;
        } else {
            return 100.0 * zero / total;
        }
    }

}
