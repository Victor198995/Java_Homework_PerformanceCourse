package com.epam.test.automation.java.practice7;


public abstract class Deposit {


    public double Amount;
    public int Period;


    public Deposit(double depositAmount , int depositPeriod) {
        Amount = depositAmount;
        Period = depositPeriod;
    }

    public abstract double Income();

    @Override
    public String toString() {
        return "Deposit{" +
                "Amount=" + Amount +
                ", Period=" + Period + " Income "+Income()+
                '}';
    }
}
