package com.epam.test.automation.java.practice7;


public class LongDeposit extends Deposit implements Prolongable {


    public LongDeposit(double amount, int period) {
        super(amount, period);
    }

    @Override
    public double Income() {
        double sum = super.Amount;
        for(int i=1;i<=super.Period;i++){
            if(i<7){sum = super.Amount;}
            else{sum+= 0.15*sum;}
        }
        return sum - super.Amount;
    }


    @Override
    public boolean canToProlong() {
        if(super.Period>36){return false;}
        return true;
    }

    @Override
    public int compareTo(Deposit dep) {
        if (super.Amount+this.Income() == dep.Amount+dep.Income()) {
            return 0;
        } else if (super.Amount+this.Income() < dep.Amount+dep.Income()) {
            return -1;
        } else {
            return 1;
        }
    }
}
