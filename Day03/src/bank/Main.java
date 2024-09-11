package bank;

import bank.Exception.InException;
import bank.Exception.zeroException;

public class Main {
    public static void main(String[] args) {

        Account account1 = new Account("111",1000.0);
        System.out.println(account1);
        account1.deposit(5000);
        System.out.println(account1);

        try {
            account1.withdraw(5000);
        }

        catch (zeroException e) {
            System.out.println(e.getMessage());
        } catch (InException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(account1);


    }
}
