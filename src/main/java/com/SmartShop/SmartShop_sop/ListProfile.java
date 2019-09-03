package com.SmartShop.SmartShop_sop;

public class ListProfile {
//    private static List<Product> Product = new ArrayList<>();

    private static ProductCoffee[] AddProduct = new ProductCoffee[]{
            new ProductFactory().createCoffee(0,"956-LOP-78", "Amecano", 60.0, "Paleo Bean"),
            new ProductFactory().createCoffee(1,"956-LOP-78", "Amecano", 60.0, "Paleo Bean")
    };

    public static ProductCoffee[] getAllProduct() {
        return AddProduct;
    }

    public static ProductCoffee[] ProfileProduct(int ID){

        if(true){
            return null;
        }
        else{
            return null;
        }
    }

}
