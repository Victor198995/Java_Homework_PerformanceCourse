package com.epam.test.automation.java.practice7;


public class LongDeposit extends Deposit {


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


}
