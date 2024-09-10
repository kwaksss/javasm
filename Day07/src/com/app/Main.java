package com.app;

import com.db.*;

public class Main {
    public static void main(String[] args) {
        Db itemDb = new ItemDb();




        Db db = new CustomerDb();
        Db customerDb = new CustomerDb();
        Customer customer = new Customer("id01","pwd01","james");
        db.insert(customer);
        customerDb.delete(customer.getId());
        itemDb.delete(customer.getId());

    }
}
