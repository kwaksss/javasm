package repository;

import dto.Cust;
import frame.Db;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//Cust의 정보를 CustDb에 담는다.

public class CustDb implements Db<String, Cust> {
    @Override
    public void insert(Cust cust) {
        System.out.println("Insered:" + cust.getName());

    }

    @Override
    public void update(Cust cust) {
        System.out.println("Updated:" + cust.getName());

    }

    @Override
    public void delete(String s) {
        System.out.println("Deleted:" + s);

    }

    @Override
    public Cust select(String s) throws Exception {
        Cust cust = null;
        cust = new Cust(s,"ppp","이말숙");
        return cust;
    }

    @Override
    public List<Cust> select() throws Exception{
        List<Cust> custs = new ArrayList<Cust>();
        custs.add(new Cust("id01","pwd01","insung"));
        custs.add(new Cust("id02","pwd04","insung1"));
        custs.add(new Cust("id03","pwd04","insun2"));
        custs.add(new Cust("id04","pwd04","insung3"));
        return custs;
        //ArrayList를 만들어서 Cust객체 담아서 return
    }

    @Override
    public List<Cust> searchByName(String name) throws Exception {
        List<Cust> custs = new ArrayList<Cust>();
        custs.add(new Cust("id01","pwd01","insung"));
        custs.add(new Cust("id02","pwd04","insung1"));
        custs.add(new Cust("id03","pwd04","insun2"));
        custs.add(new Cust("id04","pwd04","insung3"));
        return custs;
    }
}
