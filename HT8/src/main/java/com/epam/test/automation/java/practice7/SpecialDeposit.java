package com.epam.test.automation.java.practice7;


public class SpecialDeposit extends Deposit implements Prolongable{


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

    @Override
    public boolean canToProlong() {
        if(super.Amount<1000){return false;}
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
