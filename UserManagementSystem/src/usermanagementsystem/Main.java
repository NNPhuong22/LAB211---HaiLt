package usermanagementsystem;

/**
 *
 * @author QUANG THAI
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (true) {
            int choice = Manage.menu();
            switch (choice) {
                case 1:
                    Manage.createNewAcc();
                    break;
                case 2:
                    Manage.loginSystem();
                    break;
                case 3:
                    return;
            }
        }
    }

}
