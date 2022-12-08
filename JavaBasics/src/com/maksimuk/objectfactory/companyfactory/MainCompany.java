package com.maksimuk.objectfactory.companyfactory;

import com.maksimuk.objectfactory.FactoryUI;

public class MainCompany {
    public static void main(String[] args) {
        String name = FactoryUI.readString("Company Name: ");
        short yearEstablished = FactoryUI.readShort("Date of Establishment: ", (short) 100, (short) 2022);
        double marketCap = FactoryUI.readDouble("MarcetCap: ", 0, 100);

        Company company01 = new Company(name, yearEstablished, marketCap);
        System.out.println(company01);
    }
}
