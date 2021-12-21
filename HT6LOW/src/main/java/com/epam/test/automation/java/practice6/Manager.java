package com.epam.test.automation.java.practice6;

/**
 * <summary>
 * Implement code according to description of task.
 * </summary>
 */
public class Manager extends Employee {

    private int clientAmount;

        public Manager(String lastName, int salary,int clientAmount,int bonus) {
        super(lastName, salary, bonus);
        this.clientAmount =clientAmount;
    }

    @Override
    public int setBonus(int bonus) {
        if(this.clientAmount>150){return bonus+1000;}
        else if(this.clientAmount>100){return bonus+500;}
        else return bonus;
    }
}
