package com.SmartShop.SmartShop_sop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class SmartShopSopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartShopSopApplication.class, args);
	}

	@RequestMapping("/")
	public static ProductCoffee[] Hone(){
		return ListProfile.getAllProduct();
	}

	@RequestMapping("/product")
	String ListProduct(){
		return "ListProduct";
	}

	@RequestMapping(value = "/ProductCoffee/{ID}", method = RequestMethod.GET)
	String ProfileProduct(@PathVariable int ID){
		return ProfileProduct(ID);
	}
}
