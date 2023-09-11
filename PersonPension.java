package org.example;

import org.example.mainPerson;

public class PersonPension {

public class pensionFund extends Person {

    private double pensionFund;

    public pensionFund(String name, int age, double height, double weight, int money, double pensionFund) {
        super(name, age, height, weight, money);
        this.pensionFund = pensionFund;
    }

    public double getPensionFund() {
        return pensionFund;
    }

    public void setPensionFund(double pensionFund) {
        this.pensionFund = pensionFund;
    }

    @Override
    public void die () {
        System.out.println("Die before pension, his/her profit:"  + (age - 50) +pensionFund);
    }

}
};