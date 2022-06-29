/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0066;

/**
 *
 * @author quang
 */
public class Car {

    private String name;
    private String[] color;
    private int[] price;
    private String[] soldOn;

    public Car() {
    }

    public Car(String name, String[] color, int[] price, String[] soldOn) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.soldOn = soldOn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getColor() {
        return color;
    }

    public void setColor(String[] color) {
        this.color = color;
    }

    public int[] getPrice() {
        return price;
    }

    public void setPrice(int[] price) {
        this.price = price;
    }

    public String[] getSoldOn() {
        return soldOn;
    }

    public void setSoldOn(String[] soldOn) {
        this.soldOn = soldOn;
    }

}
