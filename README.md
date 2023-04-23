# Restaurant Application

## Frameworks and Languages used:
* `Java 17`
* `Maven 4.0.0`
* `Spring Boot 3.0.5`
*  `IntelliJ IDEA 2023.1 (Community Edition)`


## Data Flow:
### 1. Model:
   * Created Restaurant class along with data id,name,address,number,speciality,totalStaff and their constructor,getters and setters.
### 2. Controller:
   * Created RestaurantController class in which used the annotations like @GetMapping , @PostMapping , @PutMapping , @DeleteMapping. 
   * Created several mappings for end-points like add restaurant,get restaurant,get restaurant by id,update,and delete Restaurant.
   
### 3. Service:
   * Created RestaurantService class in which added the business logic for every end-points  methods.
### 4. Repository:
   * Created RestaurantDao class in which used ArrayList to manage the data of restaurants by performing CRUD operations.

## Data Structure Used:
Used ArrayList to store the Restaurant type data objects.

## Project Summary:
In this spring boot application I had created API's mapping for CRUD operations like create(add), read(get), update and delete restaurants.
