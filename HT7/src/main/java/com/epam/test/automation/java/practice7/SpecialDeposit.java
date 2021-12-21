package com.epam.test.automation.java.practice7;


public class SpecialDeposit extends Deposit{


    public SpecialDeposit(double amount, int period) {
        super(amount, period);
    }

    @Override
    public double Income() {
        double sum = super.Amount;
        double incPerc = 1;
        for(int i=1;i<=super.Period;i++){
            sum+=sum*(incPerc/100);
            incPerc++;
        }
        return sum - super.Amount;
    }

}
