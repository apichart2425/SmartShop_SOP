package com.SmartShop.SmartShop_sop.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;


@Entity
@Table(name = "Coffee")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
        allowGetters = true)
public class CoffeeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
//    @Size(min =5, max = 100, message = "Please provide Serialnumber size between 5 - 100")
    private String Serialnumber;

    @NotNull
//    @Size(min =5, max = 100, message = "Please provide Name CoffeeBean size between 5 - 100")
    private String Name;

    @NotNull
//    @Min(value = 0, message = "Please provide Price >= 0")
    private Double Price;

    @NotNull
    private String CoffeeBean;

    public CoffeeModel() {
    }

    public CoffeeModel(CoffeeModel coffee) {
        this.Serialnumber = coffee.Serialnumber;
        this.Name = coffee.Name;
        this.Price = coffee.Price;
        this.CoffeeBean = coffee.CoffeeBean;
    }


    public CoffeeModel(String serialnumber, String name, Double price, String coffeeBean) {
        Serialnumber = serialnumber;
        Name = name;
        Price = price;
        CoffeeBean = coffeeBean;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSerialnumber() {
        return Serialnumber;
    }

    public void setSerialnumber(String serialnumber) {
        Serialnumber = serialnumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public String getCoffeeBean() {
        return CoffeeBean;
    }

    public void setCoffeeBean(String coffeeBean) {
        CoffeeBean = coffeeBean;
    }

}