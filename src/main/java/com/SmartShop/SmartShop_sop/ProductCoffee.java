package com.SmartShop.SmartShop_sop;

public class ProductCoffee {

    private int ID;
    private String Serialnumber;
    private String Name;
    private Double Price;
    private String CoffeeBean;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getSerialnumber() {
        return Serialnumber;
    }

    public void setSerialnumber(String serialnumber) {
        Serialnumber = serialnumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public String getCoffeeBean() {
        return CoffeeBean;
    }

    public void setCoffeeBean(String coffeeBean) {
        CoffeeBean = coffeeBean;
    }

    public ProductCoffee(int ID, String serialnumber, String name, Double price, String coffeeBean) {
        this.ID = ID;
        Serialnumber = serialnumber;
        Name = name;
        Price = price;
        CoffeeBean = coffeeBean;
    }
}
