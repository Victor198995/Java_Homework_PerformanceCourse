package com.epam.test.automation.java.practice6;

public class Company {

    private Employee employees[];
    private int count;

    public Company(int n) {
        employees = new Employee[n];
        count = 0;
    }

    //add employees
    public boolean addRectangle(Employee worker) {
        if (count > employees.length) {
            return false;
        } else {
            employees[count] = worker;
            count++;
        }
        return true;
    }

    public void giveEverybodyBonus(int companyBonus) {
        for (int i = 0; i < employees.length; i++) {
            // employees[i].setBonus(companyBonus);
            employees[i].setBaseBonus(companyBonus);
        }
    }

    public int totalToPay() {
        int totalAmount = 0;
        for (int i = 0; i < employees.length; i++) {
            totalAmount += employees[i].toPay();
        }
        return totalAmount;
    }

    public int nameMaxSalary() {
        int maxSalary = employees[0].getSalary();
        for (int i = 1; i < employees.length; i++) {
            if (maxSalary < employees[i].getSalary()) {
                maxSalary = employees[i].getSalary();
            }
        }
        return maxSalary;
    }

    public void printArray() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

}
