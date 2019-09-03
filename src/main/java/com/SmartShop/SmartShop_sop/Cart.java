package com.SmartShop.SmartShop_sop;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Cart{

    private static List<ProductCoffee> OrderInCart = new ArrayList<>();


    public static List<ProductCoffee> Order(){
        return  OrderInCart;
    }

    public static List<ProductCoffee> AddCart(int ID, ProductCoffee[] ListProduct){
        for(ProductCoffee coffeeID : ListProduct){
            if (coffeeID.getID() == ID){
               OrderInCart.add(coffeeID);
            }
        }
        return  OrderInCart;
    }

    public static List<ProductCoffee> DeleteCart(int ID){
//        List<ProductCoffee> delete = new ArrayList();
//        for(ProductCoffee coffeeID : OrderInCart){
            Predicate<ProductCoffee> condition = Order -> Order.getID()  == ID;
            OrderInCart.removeIf(condition);
            return  OrderInCart;
//        }
//        return  null;
    }


}
