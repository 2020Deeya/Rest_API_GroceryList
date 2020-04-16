package com.groceryList.GroceryList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private int price;
    private float gst;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getgst() {
        return this.gst;
    }

    public void setGst(float gst) {
        this.gst = gst;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
