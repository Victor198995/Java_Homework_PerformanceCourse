package com.epam.test.automation.java.practice6;

/**
 * <summary>
 * Implement code according to description of task.
 * </summary>
 */
public class SalesPerson extends Employee {

    private int percent;

    public SalesPerson(String lastName, int salary,int percent,int bonus) {
        super(lastName, salary,bonus);
        this.percent=percent;
    }

       @Override
    public int setBonus(int bonus) {
        if(this.percent>200){return bonus*3;}
        else if(this.percent>100){return bonus*2;}
        else return bonus;
    }
}
