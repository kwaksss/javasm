package com.db;

public interface Db {
    void insert(Object obj);//argument를 Object으로 선언해주면 모든게 들어갈 수 있음.
    void update(Object obj);
    void delete(Object obj);
    //앞에 public abstract생략.
}
