package com.epam.test.automation.java.practice7;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Client implements Iterator<Deposit> {
    List<Deposit> list=new ArrayList<Deposit>();
    Iterator<Deposit> iterator = list.iterator();


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

    //  interface Iterator<Deposit> methods
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Deposit next() {
        return null;
    }

   public void sortDeposits(){
        for (int i = 0; i < deposits.length; i++) {
            list.add(deposits[i]);
        }
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    public int countPossibleToProlongDeposit(){
        int trueCounter=0;
        for(int i=0;i<deposits.length;i++){
            if(deposits[i].canToProlong()==true){trueCounter++;}
        }

        return trueCounter;
    }
}
