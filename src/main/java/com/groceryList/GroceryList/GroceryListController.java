package com.groceryList.GroceryList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
public class GroceryListController {

    @Autowired
    GroceryListRepository groceryListRepository;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(path = "/items")
    public List<Item> getAllItems(){
        List<Item> items = new ArrayList<>();
        groceryListRepository.findAll().forEach(items :: add);
        return items;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(path = "/items/{id}")
    public Optional<Item> getNoteById(@PathVariable(value = "id") int id){
        return groceryListRepository.findById(id);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(path = "/items")
    public Item addItem(@RequestBody Item item){
        groceryListRepository.save(item);
        return item;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping(path = "/items/{id}")
    public void deleteItem(@PathVariable int id){
            groceryListRepository.deleteById(id);
    }
}
