package com.oop20;

public class FullTimeEmployee extends Employee implements Bonusable {

    private int monthlySalary = 3200000;

    public FullTimeEmployee (String name, int id, int monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public int calculatePay() {
        return monthlySalary;
    }

    @Override
    public int calculateBonus() {
        return (monthlySalary) * 2;
    }
}
