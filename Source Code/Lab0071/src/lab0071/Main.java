/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab0071;

import java.io.IOException;

/**
 *
 * @author NNPhuong
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Manager manager = new Manager();
        while (true) {
            System.out.println("========= Task program =========\n"
                + "1. Add Task\n"
                + "2. Update Task\n"
                + "3. Delete task\n"
                + "4. Display Task\n"
                + "5. exit");
            int option = Validate.CheckInt("Enter your option: ", 1, 5, null);
            switch (option) {
                case 1:
                    manager.addTask();
                    break;
                case 2:
                    manager.updateTask();
                    break;
                case 3:
                    manager.deleteTask();
                    break;
                case 4:
                    manager.getDataTasks();
                    break;
                case 5:
                    return;
            }
        }
    }
    
}
