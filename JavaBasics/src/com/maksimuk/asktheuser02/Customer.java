package com.maksimuk.asktheuser02;

public class Customer {



    private String userName;
    private byte userAge;
    private short userSalary;
    private int userFamilyBudget;
    private float userCreditScore;
    private long userPropertyPrice;
    private boolean userChildren;
    private double userPropertyArea;


    public Customer(String userName, byte userAge, short userSalary, int userFamilyBudget, float userCreditScore, long userPropertyPrice, boolean userChildren, double userPropertyArea) {
        this.userName = userName;
        this.userAge = userAge;
        this.userSalary = userSalary;
        this.userFamilyBudget = userFamilyBudget;
        this.userCreditScore = userCreditScore;
        this.userPropertyPrice = userPropertyPrice;
        this.userChildren = userChildren;
        this.userPropertyArea = userPropertyArea;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserAge(byte userAge) {
        this.userAge = userAge;
    }

    public void setUserSalary(short userSalary) {
        this.userSalary = userSalary;
    }

    public void setUserFamilyBudget(int userFamilyBudget) {
        this.userFamilyBudget = userFamilyBudget;
    }

    public void setUserCreditScore(float userCreditScore) {
        this.userCreditScore = userCreditScore;
    }

    public void setUserPropertyPrice(long userPropertyPrice) {
        this.userPropertyPrice = userPropertyPrice;
    }

    public void setUserChildren(boolean userChildren) {
        this.userChildren = userChildren;
    }

    public void setUserPropertyArea(double userPropertyArea) {
        this.userPropertyArea = userPropertyArea;
    }

    @Override
    public String toString() {
        return "Customer: " +
                "Name: " + userName + "\n" +
                "Age: " + userAge + "\n" +
                "Monthly Salary: " + userSalary + "\n" +
                "Monthly Family Budget: " + userFamilyBudget + "\n" +
                "Credit Score: " + userCreditScore + "\n" +
                "Property Price: " + userPropertyPrice + "\n" +
                "Children: " + userChildren + "\n" +
                "Property Area: " + userPropertyArea;
    }
}
