package com.db;

public class CustomerDb implements Db{

    public  void insert(Object obj){

        Customer c = (Customer)obj;
        System.out.println(c.getName());
        System.out.println("inserted:" + obj);
    }
    public  void update(Object obj){}

    @Override
    public void delete(Object obj) {

    }


}
