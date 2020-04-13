package com.groceryList.GroceryList;

import org.springframework.data.jpa.repository.JpaRepository;


public interface GroceryListRepository extends JpaRepository<Item, Integer> {


}