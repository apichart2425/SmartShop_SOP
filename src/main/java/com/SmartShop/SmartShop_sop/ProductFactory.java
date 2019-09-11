package com.SmartShop.SmartShop_sop;

import com.SmartShop.SmartShop_sop.model.CoffeeModel;
import com.SmartShop.SmartShop_sop.model.CoffeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductFactory {
    public ProductCoffee createCoffee(int ID,String Serialnumber, String Name, Double Price, String CoffeeBean){
        return new ProductCoffee(ID,Serialnumber,Name,Price,CoffeeBean);
    }

}
