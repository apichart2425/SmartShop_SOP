package com.SmartShop.SmartShop_sop;

import java.util.List;

public class ListProfile {
//    private static List<Product> Product = new ArrayList<>();
    private static ProductCoffee[] AddProduct = new ProductCoffee[]{
            new ProductFactory().createCoffee(0,"956-CB-00", "Arabica", 360.0, "Paleo Bean"),
            new ProductFactory().createCoffee(1,"956-CB-01", "Robusta", 760.0, "Paleo Bean"),
            new ProductFactory().createCoffee(2,"956-CB-02", "Excelsa", 560.0, "Paleo Bean"),
            new ProductFactory().createCoffee(3,"956-CB-03", "Liberica", 160.0, "Paleo Bean"),
    };

    public static ProductCoffee[] getAllProduct() {
        return AddProduct;
    }

    public static ProductCoffee ProfileProduct(int ID){
        for(ProductCoffee coffeeID : AddProduct ){
            if (coffeeID.getID() == ID){
                return coffeeID;
            }
        }
        return null;
    }


    public static List<ProductCoffee> Order(){
        return Cart.Order();
    }
    public static List<ProductCoffee> AddCart(int ID){
        return Cart.AddCart(ID, AddProduct );
    }
    public static List<ProductCoffee> DeleteCart(int ID){
        return Cart.DeleteCart(ID);
    }
}
