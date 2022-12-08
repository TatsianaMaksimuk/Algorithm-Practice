package com.maksimuk.asktheuser01;

public class User {

    private byte age;

    private short salary;
    private int familyBudget;
    private float creditScore;
    private long propertyPrice;
    private double propertyArea;
    private boolean children;
    private String fullName;


    public User(byte age, short salary, int familyBudget, float creditScore, long propertyPrice, double propertyArea, boolean children, String fullName) {
        this.age = age;
        this.salary = salary;
        this.familyBudget = familyBudget;
        this.creditScore = creditScore;
        this.propertyPrice = propertyPrice;
        this.propertyArea = propertyArea;
        this.children = children;
        this.fullName = fullName;
    }

    public byte getAge() {
        return age;
    }

    public short getSalary() {
        return salary;
    }

    public int getFamilyBudget() {
        return familyBudget;
    }

    public float getCreditScore() {
        return creditScore;
    }

    public long getPropertyPrice() {
        return propertyPrice;
    }

    public double getPropertyArea() {
        return propertyArea;
    }

    public boolean isChildren() {
        return children;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", salary=" + salary +
                ", familyBudget=" + familyBudget +
                ", creditScore=" + creditScore +
                ", propertyPrice=" + propertyPrice +
                ", propertyArea=" + propertyArea +
                ", children=" + children +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}


