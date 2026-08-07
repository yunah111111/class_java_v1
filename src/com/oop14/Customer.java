package com.oop14;

public class Customer {

    int customerID;
    String customerName;
    String customerGrade;
    int bonusPoint;
    double bonusRatio;

    Customer(int customerID, String customerName, String customerGrade, int bonusPoint, int bonusRatio) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerGrade = customerGrade;
        this.bonusPoint = bonusPoint;
        this.bonusRatio = bonusRatio;
    }

    private int calcPrice() {
        System.out.println("계산");
        return calcPrice();
    }

    private String showCustomerInfo() {
        System.out.println("회원정보 조회");
        return showCustomerInfo();
    }

}
