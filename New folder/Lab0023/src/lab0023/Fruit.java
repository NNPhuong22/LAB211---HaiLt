/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab0023;

/**
 *
 * @author NNPhuong
 */
public class Fruit {
    private int Fid;
    private String Fname;
    private double price;
    private int quantity;
    private String origin;

    public Fruit() {
    }

    public int getFid() {
        return Fid;
    }

    public void setFid(int Fid) {
        this.Fid = Fid;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Fruit(int Fid, String Fname, double price, int quantity, String origin) {
        this.Fid = Fid;
        this.Fname = Fname;
        this.price = price;
        this.quantity = quantity;
        this.origin = origin;
    }

    
    
}
