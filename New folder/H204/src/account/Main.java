package account;

/**
 *
 * @author NNPhuong
 */
public class Main {
    public static void main(String[] args) {
        Client customer = new Client();
        customer.setName("NNPhuong");
        System.out.println("Customer: " + customer.getName());

        FilteredAccount acc = new FilteredAccount(customer);

        //constructor and add value 
        Transaction t1 = new Transaction(0);
        Transaction t2 = new Transaction(-50);
        Transaction t3 = new Transaction(100);
        Transaction t4 = new Transaction(-80);
        Transaction t5 = new Transaction(500);
        Transaction t6 = new Transaction(300);

        //transaction is accept?
        t1.setApproved(true);
        t2.setApproved(true);
        t3.setApproved(true);
        t4.setApproved(true);
        t5.setApproved(true);
        t6.setApproved(true);

        // process trans
        acc.process(t1);
        acc.process(t2);
        acc.process(t3);
        acc.process(t4);
        acc.process(t5);
        acc.process(t6);
        
        //dislay
        System.out.println("==============================================");
        System.out.println("Giao dịch 1:"+ t1.getValue() +"("+t1.getApproved()+")");
        System.out.println("Giao dịch 2:"+ t2.getValue()+"("+t2.getApproved()+")");
        System.out.println("Giao dịch 3:"+ t3.getValue()+"("+t3.getApproved()+")");
        System.out.println("Giao dịch 4:"+ t4.getValue()+"("+t4.getApproved()+")");
        System.out.println("Giao dịch 5:"+ t5.getValue()+"("+t5.getApproved()+")");
        System.out.println("Giao dịch 6:"+ t6.getValue()+"("+t6.getApproved()+")");
        System.out.println("==============================================");
        System.out.println("Tổng số giao dịch dương : " + acc.getFilteredTrans3());   
        System.out.println("Tổng số giao dịch : " + acc.getNumberOfTrans());       
        System.out.println("Tỷ lệ giao dịch có value >0 :  " + String.format("%,.1f", acc.percentFiltered3()) + "%");
        System.out.println("==============================================");
    }
}
