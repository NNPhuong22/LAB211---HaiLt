/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0011;

/**
 *
 * @author quang
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String inputBase = Manager.inputBase();
        String outputBase = Manager.outputBase(inputBase);
        String inputValue = Manager.inputValue(inputBase);
        String outputValue = Manager.convertInputValue(inputValue, inputBase, outputBase);
        Manager.printOutput(inputValue, outputValue, inputBase, outputBase);
    }

}
