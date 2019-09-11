# Welcome to SmartShop_SOP !!!
### SOP Assignment 2 


# step 1 Create Schema
Create a new schema in mysql  
> Charset : utf_8
> Collation :  utf_8_unicode_ci
# step 2 Config Database
config  in floder  "src/main/resources/application.properties"

***MySQL jdbc connection url.***
>spring.datasource.url=jdbc:mysql://localhost:3306/**yourSchemaName**?useSSL=false 
>github : [url](https://github.com/apichart2425/SmartShop_SOP/blob/master/src/main/resources/application.properties]) 

***MySQL database username and password***
>spring.datasource.username=**your username in mysql**
spring.datasource.password=**your password in mysql**

## TIPs !
#### Guide method
|Method|URL|Parameter|Output|
|----------------|-------------------------------|----------------|----------------|
|POST|`127.0.0.1:8080/ProductCoffee/`     |None           |New data to mysql|
|PUT|`127.0.0.1:8080/ProductCoffee/`            |ID           |Update data by id|
|DELETE|`127.0.0.1:8080/ProductCoffee/`|ID|Delete by id|
|GET|`127.0.0.1:8080/ProductCoffee/all`|None|All data|
|GET|`127.0.0.1:8080/ProductCoffee/`|ID|Only data by id|

# step 3 Create data
>method=POST
URL : 127.0.0.1:8080/ProductCoffee/addCoffee
```
{
	"serialnumber":"1-53adw",
	"price":100.35,
	"name":"Alabica2",
	"coffeeBean" : "016"
}
```
### output
```
{
    "id": 5, <----- auto increment
    "name": "Alabica2",
    "serialnumber": "1-53adw",
    "price": 100.35,
    "coffeeBean": "016"
}
```

# step 4 Get data
###  4.1 Get all data in mysql
>method=GET
URL :  127.0.0.1:8080/ProductCoffee/all

### output
```
[
    {
        "id": 1,
        "name": "Alabica",
        "serialnumber": "1-53adw",
        "price": 100.35,
        "coffeeBean": "016"
    },
	.
	.
	.
    ,{
        "id": 5,
        "name": "Alabica2",
        "serialnumber": "1-53adw",
        "price": 100.35,
        "coffeeBean": "016"
    }
]
```

###  4.2 Get data by ID 
>method=GET 
URL : 127.0.0.1:8080/ProductCoffee/{ID} <-***Select your id in mysql***
```
URL : 127.0.0.1:8080/ProductCoffee/5
```
### output
```
{
    "id": 5, <----- select id 5
    "name": "Alabica2",
    "serialnumber": "1-53adw",
    "price": 100.35,
    "coffeeBean": "016"
}
```


# step 5 Update data
> method=PUT
URL : 127.0.0.1:8080/ProductCoffee/{ID} <-***Update data by id in mysql***
```
update id 5 
URL : 127.0.0.1:8080/ProductCoffee/5
{
	"serialnumber":"1-1153adw",
	"price":550.03,
	"name":"Arabica",
	"coffeeBean" : "america Bean"
}
```
### output
```
{
	"serialnumber":"1-1153adw ID5",
	"price":550.03,
	"name":"Arabica",
	"coffeeBean" : "america Bean"
}
```


# step 6 Delete data
method=Delete
URL : 127.0.0.1:8080/ProductCoffee/{ID} <-***Delete data by id in mysql***
```
delete id 5 
URL : 127.0.0.1:8080/ProductCoffee/4
```
### output
```
Delete product id "4 " Success
```

