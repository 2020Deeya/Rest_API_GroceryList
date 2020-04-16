package com.groceryList.GroceryList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface GroceryListRepository extends CrudRepository<Item, Integer> {

}