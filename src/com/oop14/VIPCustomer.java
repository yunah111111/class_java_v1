package com.oop14;

public class VIPCustomer extends Customer {

    VIPCustomer(int customerID, String customerName, String customerGrade, int bonusPoint, int bonusRatio) {
        super(customerID, customerName, customerGrade, bonusPoint, bonusRatio);
    }

    public void VIPCustomer() {
        System.out.println("VIP 고객입니다.");
    }

    public int getAgentID() {
        return getAgentID();
    }

}
