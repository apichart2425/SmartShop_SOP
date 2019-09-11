package com.SmartShop.SmartShop_sop.model;

import com.SmartShop.SmartShop_sop.ProductFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoffeeService {

    @Autowired
    private CoffeeRepository coffeeRepository;

    public List<CoffeeModel> retrieveCoffee() {
        return (List<CoffeeModel>) coffeeRepository.findAll();
    }

    public Optional<CoffeeModel> retrieveCoffeeID(int id) {
        return coffeeRepository.findById(id);
    }

    public CoffeeModel createCoffee(CoffeeModel coffee) {
        return coffeeRepository.save(coffee);
    }

    public Optional<CoffeeModel> updateCoffee(int id, CoffeeModel coffee) {
        Optional<CoffeeModel> customerOptional = coffeeRepository.findById(id);
        if(!customerOptional.isPresent()) {
            return customerOptional;
        }
        coffee.setId(id);
        return Optional.of(coffeeRepository.save(coffee));
    }

    public void deleteCoffee(int id) {
        coffeeRepository.deleteById(id);
    }
}
