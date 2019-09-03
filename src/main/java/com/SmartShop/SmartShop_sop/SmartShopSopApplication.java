package com.SmartShop.SmartShop_sop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@SpringBootApplication
public class SmartShopSopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartShopSopApplication.class, args);
	}

    @RequestMapping("/")
    String Home(){
            return "Hi everyone WE ARE COFFEE BEAN \n" +
                    "Path\n"+
                    "All Product : /ProductCoffee \n" +
                    "Select Profile Product : /ProductCoffee/{id}   <-- id the Profile \n"+
                    "AddOrder : /ProductCoffee/AddOrder/{id}   <-- id the Profile"
//                   + "\n"+
//                    "\n"
                    ;
    }

	@RequestMapping("/ProductCoffee")
	public static ProductCoffee[] Hone(){
		return ListProfile.getAllProduct();
	}

	@RequestMapping(value = "/ProductCoffee/{id}", method = RequestMethod.GET)
    public ProductCoffee ProfileProduct(@PathVariable int id){
		return ListProfile.ProfileProduct(id);
	}

    @RequestMapping(value = "/ProductCoffee/Order", method = RequestMethod.GET)
    public List<ProductCoffee> AddOrder(){
        return ListProfile.Order();
    }

    @RequestMapping(value = "/ProductCoffee/AddOrder/{id}", method = RequestMethod.GET)
    public List<ProductCoffee> AddOrder(@PathVariable int id){
        return ListProfile.AddCart(id);
    }

    @RequestMapping(value = "/ProductCoffee/Order/{id}/Delete", method = RequestMethod.GET)
    public List<ProductCoffee> DeleatOrder(@PathVariable int id){
        return ListProfile.DeleteCart(id);
    }


}
