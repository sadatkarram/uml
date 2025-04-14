package org.example.bidirection.association;


// Solid Line (No Arrow) — Bidirectional Association
public class Customer {
    Order order; // Association : One class hold reference of another class.

    void placeOrder(Order order){
        this.order = order;
        order.setCustomer(this); // two-way reference : establish two-way link
    }
}

/*
Customer ────────────── Order

A plain solid line

No arrow → means both sides are aware of the relationship

* */
