package bank;
//계좌

import bank.Exception.InException;
import bank.Exception.zeroException;

public class Account {
    private String accNum;
    private double balance;

    public Account() { //default construct(기본 생성자.)
    }

    public Account(String accNum, double balance) {
            this.accNum = accNum;
            this.balance = balance;
    }

    public String getAccNum() {
        return accNum;
    }

    public double getBalance() {
        return balance;

    }//계좌 잔액조회

    @Override
    public String toString() {
        return "Account{" +
                "accNum='" + accNum + '\'' +
                ", balance=" + balance +
                '}';
    }//객체를 String화 시키는 함수.

    public void deposit(double amount) {
        this.balance += amount;

    }//입금.
    public void withdraw(double amount)throws zeroException, InException {
        if(amount <= 0){
            throw new zeroException("Amount must be greater than 0");
        }
        if(amount > this.balance) {
//            System.out.println("Insufficient balance");//Main에서는 모른다.
            throw new InException("Insufficient balance");

        }
        this.balance -= amount;

    }//출금.
}
