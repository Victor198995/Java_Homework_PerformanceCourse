package com.epam.test.automation.java.practice6;

public class Main {
    public static void main(String[] args) {


        Manager man1 = new Manager("Man1", 2500, 100);
        Manager man2 = new Manager("Man2", 2500, 101);
        Manager man3 = new Manager("Man3", 2500, 201);

        SalesPerson sp1 = new SalesPerson("Sp1", 1500, 80);
        SalesPerson sp2 = new SalesPerson("Sp2", 1500, 180);
        SalesPerson sp3 = new SalesPerson("Sp3", 1500, 280);

        //Created objects:
        System.out.println(man1);
        System.out.println(man2);
        System.out.println(man3);
        System.out.println(sp1);
        System.out.println(sp2);
        System.out.println(sp3);

//setBaseBonus to obj
        man1.setBaseBonus(100);
        man2.setBaseBonus(100);
        man3.setBaseBonus(100);

        sp1.setBaseBonus(200);
        sp2.setBaseBonus(200);
        sp3.setBaseBonus(200);
//Set calculated bonus to obj
        man1.trueSetBonus();
        man2.trueSetBonus();
        man3.trueSetBonus();

        sp1.trueSetBonus();
        sp2.trueSetBonus();
        sp3.trueSetBonus();
//Print objects after calculate bonus
        System.out.println();
        System.out.println("Base bonus has been set:");
        System.out.println(man1);
        System.out.println(man2);
        System.out.println(man3);

        System.out.println(sp1);
        System.out.println(sp2);
        System.out.println(sp3);

        System.out.println();
        System.out.println("To pay:");
        System.out.println(man1.toPay());
        System.out.println(man2.toPay());
        System.out.println(man3.toPay());

        System.out.println(sp1.toPay());
        System.out.println(sp2.toPay());
        System.out.println(sp3.toPay());

        //create an array and add obj to an array
        Company company = new Company(6);
        company.addRectangle(man1);
        company.addRectangle(man2);
        company.addRectangle(man3);
        company.addRectangle(sp1);
        company.addRectangle(sp2);
        company.addRectangle(sp3);

        company.giveEverybodyBonus(50);
        man1.trueSetBonus();
        man2.trueSetBonus();
        man3.trueSetBonus();

        sp1.trueSetBonus();
        sp2.trueSetBonus();
        sp3.trueSetBonus();

        System.out.println("Array:");
        company.printArray();

        System.out.println(company.nameMaxSalary());
        System.out.println(company.totalToPay());

    }
}
