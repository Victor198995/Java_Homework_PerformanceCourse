package com.epam.test.automation.java.practice6;

/**
 * <summary>
 * Implement code according to description of task.
 * </summary>
 */
public abstract class Employee {

    private String lastName;
    private int salary;
    private int bonus;
    private int baseBonus;
    //public int test;

    //constructor
    public Employee(String lastName, int salary) {
        this.lastName = lastName;
        this.salary = salary;
        this.bonus = setBonus(baseBonus);

    }

    //settersGetters
    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

//    public void setBonus(int bonus) {
//        this.bonus = bonus;
//    }

    public abstract int setBonus(int bonus);

    public void setBaseBonus(int bon) {
        this.baseBonus = bon;
    }

    public void trueSetBonus() {
        this.bonus = setBonus(baseBonus);
    }


    //methods
    public int toPay() {
        return salary + setBonus(baseBonus);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", baseBonus=" + baseBonus + ", calculatedBonusSetToObj=" + bonus + " toPay= " + toPay() +
                '}';
    }


}
