package com.epam.test.automation.java.practice7;


public class Client {
    private Deposit[] deposits;
    int count;

    //constructor
    public Client() {
        this.deposits = new Deposit[10];
        count = 0;
    }

    //methods
    public boolean AddDeposit(Deposit deposit) {
        if (count > deposits.length) {
            return false;
        } else {
            deposits[count] = deposit;
            count++;
        }
        return true;
    }


    public double TotalIncome() {
        double totalIncome = 0;
        for (int i = 0; i < deposits.length; i++) {
            totalIncome += deposits[i].Income();
        }
        return totalIncome;
    }

    public double MaxIncome() {
        double maxIncome = deposits[0].Income();
        for (int i = 1; i < deposits.length; i++) {
            if (maxIncome < deposits[i].Income()) {
                maxIncome = deposits[i].Income();
            }
        }
        return maxIncome;
    }

    public double GetIncomeByNumber(int number) {
        for (int i = 0; i < deposits.length; i++) {
            if (number == i) return deposits[i].Income();
        }
        return 0;
    }

    public void print() {
        System.out.println("Deposits array:");
        for (int i = 0; i < deposits.length; i++) {
            System.out.println(deposits[i]);
        }
    }
}
