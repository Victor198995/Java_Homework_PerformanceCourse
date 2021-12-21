package com.epam.test.automation.java.practice6;

/**
 * <summary>
 * Implement code according to description of task.
 * </summary>
 */
public class SalesPerson extends Employee {

    private int percent;

    public SalesPerson(String lastName, int salary, int percent) {
        super(lastName, salary);
        this.percent = percent;
    }

    @Override
    public int setBonus(int bonus) {
        if (percent > 200) {
            return bonus * 3;
        } else if (percent > 100) {
            return bonus * 2;
        } else return bonus;
    }


}
