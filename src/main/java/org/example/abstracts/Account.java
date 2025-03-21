package org.example.abstracts;

public abstract class Account {

    private Double balance;

    public Double getBalance() {

        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public abstract void printReport();
}
