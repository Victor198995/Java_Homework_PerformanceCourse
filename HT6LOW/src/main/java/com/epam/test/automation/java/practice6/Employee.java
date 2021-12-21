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
//constructor
    public Employee(String lastName, int salary, int bonus) {
        this.lastName = lastName;
        this.salary = salary;
        this.bonus = bonus;

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

    public abstract int setBonus(int bonus);


//methods
    public int toPay(){
        return this.salary+this.setBonus(this.bonus);
    }



    public static void main(String[] args) {

        Manager man1 = new Manager("Man1",2500,100,100);
        Manager man2 = new Manager("Man2",2500,101,100);
        Manager man3 = new Manager("Man3",2500,201,100);

        SalesPerson sp1 = new SalesPerson("Sp1",1500,80,100);
        SalesPerson sp2 = new SalesPerson("Sp2",1500,180,100);
        SalesPerson sp3 = new SalesPerson("Sp3",1500,280,100);

        System.out.println("managers objects:");
        System.out.println(man1.setBonus(100));
        System.out.println(man2.setBonus(100));
        System.out.println(man3.setBonus(100));
        System.out.println("managers to pay:");
        System.out.println(man1.toPay());
        System.out.println(man2.toPay());
        System.out.println(man3.toPay());

        System.out.println("sp objects:");
        System.out.println(sp1.setBonus(100));
        System.out.println(sp2.setBonus(100));
        System.out.println(sp3.setBonus(100));
    }
}
