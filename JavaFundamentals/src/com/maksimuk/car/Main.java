package com.maksimuk.car;

public class Main {
    public static void main(String[] args) {
Car car1 = new Car("Camaro 2SS","Chevy", 10000, 0.10F );
Car car2 = new Car("Mustang GT","Ford", 30000, 0.50F );
Car car3 = new Car("Hellcat","Dodge", 100, 0.90F );


car1.printInfo();
car2.printInfo();
car3.printInfo();
    }

}
