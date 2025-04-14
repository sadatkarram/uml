package org.example.bidirection.association;

public class Order {
    Customer customer;

    public void setCustomer(Customer customer) {
        this.customer = customer;   //  Association
    }

    public void confirmOrder() {
        System.out.println("Order confirmed for " + customer);
    }
}
