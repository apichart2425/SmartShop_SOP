package com.SmartShop.SmartShop_sop.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoffeeRepository extends CrudRepository<CoffeeModel, Integer> {
//    List<CoffeeModel> findByCoffeeBean(String CoffeeBean);
}