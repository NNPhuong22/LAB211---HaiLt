package p0059;

/**
 *
 * @author NNPhuong
 */
public class Main {

    public static void main(String[] args) {
        while (true) {
            int choice = Manage.menu();
            switch (choice) {
                case 1:
                    Manage.findInfo();
                    break;
                case 2:
                    Manage.coppyNewFile();
                    break;
                case 3:
                    return;
            }
        }
    }
}
