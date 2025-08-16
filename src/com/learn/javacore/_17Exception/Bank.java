package com.learn.javacore._17Exception;

public class Bank {

    private double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    public void withdrow(double amount) throws CustomeException{
        if(amount > balance){
            throw new CustomeException();
        }
        balance-=amount;
    }

}
