package com.epam.test.automation.java.practice7;


public class BaseDeposit extends Deposit{


    public BaseDeposit(double amount, int period) {
        super(amount, period);
    }

    @Override
    public double Income() {
        double sum = super.Amount;
        for(int i=1;i<=super.Period;i++){
           sum+= 0.05*sum;
        }
      return sum - super.Amount;
    }


    @Override
    public int compareTo(Deposit o) {
        return 0;
    }

    @Override
    public boolean canToProlong() {
        return false;
    }
}
