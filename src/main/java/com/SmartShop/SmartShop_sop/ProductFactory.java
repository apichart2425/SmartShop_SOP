package com.SmartShop.SmartShop_sop;

public class ProductFactory {

    public ProductCoffee createCoffee(int ID,String Serialnumber, String Name, Double Price, String CoffeeBean){
        return new ProductCoffee(ID,Serialnumber,Name,Price,CoffeeBean);
    }
}
