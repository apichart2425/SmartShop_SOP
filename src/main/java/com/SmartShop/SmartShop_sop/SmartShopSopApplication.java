package com.SmartShop.SmartShop_sop;

import com.SmartShop.SmartShop_sop.model.CoffeeModel;
import com.SmartShop.SmartShop_sop.model.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ProductCoffee")
@SpringBootApplication
public class SmartShopSopApplication {

    @Autowired
//    CoffeeService coffeeService;
    CoffeeService coffeeService = new CoffeeService();

    public static void main(String[] args) {
		SpringApplication.run(SmartShopSopApplication.class,  args);
	}

    @RequestMapping("/")
    String Home(){
            return "Hi everyone WE ARE COFFEE BEAN <br>" +
                    "<h3>Path</H3>"+
                    "<b>All Product</b> : /all <br>" +
                    "<b>Select Profile Product </b>: /{id}   <-- id the Profile <br>"+
                    "<b>add</b> :/addCoffee<br>"+
                    "<b>delete </b>: /delete/{id}   <-- id the Profile<br>"+
                    "<b>update</b>/update/{id} <br>";
    }

	@RequestMapping("/all")
	public List<CoffeeModel> allProduct(){
	    return coffeeService.retrieveCoffee();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<CoffeeModel> profileProduct(@PathVariable int id){
		return coffeeService.retrieveCoffeeID(id);
	}


    @RequestMapping(value = "/addCoffee", method = RequestMethod.POST)
    public ResponseEntity<CoffeeModel> createCoffee(@RequestBody CoffeeModel coffee){
        CoffeeModel newCoffee = coffeeService.createCoffee(coffee);
//        return   coffeeService.createCoffee(coffee);
        return ResponseEntity.status(HttpStatus.CREATED).body(coffeeService.createCoffee(newCoffee));
//        return new ProductFactory().createCoffeeBean(coffee);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    String deleteProduct(@PathVariable int id){
        coffeeService.deleteCoffee(id);
        return "Delete product id \"" + id + " \" Success";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public Optional<CoffeeModel> updateProduct(@RequestBody CoffeeModel coffee, @PathVariable int id){
        return coffeeService.updateCoffee(id, coffee);
//        return coffee;
    }

//    @RequestMapping(value = "/ProductCoffee/Order", method = RequestMethod.GET)
//    public List<ProductCoffee> AddOrder(){
//        return ListProfile.Order();
//    }
//
//    @RequestMapping(value = "/ProductCoffee/AddOrder/{id}", method = RequestMethod.GET)
//    public List<ProductCoffee> AddOrder(@PathVariable int id){
//        return ListProfile.AddCart(id);
//    }
//
//    @RequestMapping(value = "/ProductCoffee/Order/{id}/Delete", method = RequestMethod.GET)
//    public List<ProductCoffee> DeleatOrder(@PathVariable int id){
//        return ListProfile.DeleteCart(id);
//    }
}
