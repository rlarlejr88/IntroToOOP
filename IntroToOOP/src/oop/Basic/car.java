package oop.Basic;

public class car {
    // set of instance variables (state)
    String color;
    String brand;
    int year;
    int horsePower;
    int seats;

    // constructor
    // - 'initialize' instance variables
    car() {
        this.color = "White";
        this.brand = "";
        this.year = 2020;
        this.horsePower = 0;
        this.seats = 5;
    }


    car(String c, String b, int year, int horsePower, int seats) {
        // 'this' refers to the instance that's bing used
        this.color = color;
        this.brand = brand;
        this.year = year;
        this.horsePower = horsePower;
        this.seats = seats;

    }

    // 'method overloading'
    // - create methods with the same name with different set of parameters
    void drive(int speed) {
        System.out.println("Driving" + this.brand + "at" + speed + "km/h");
    }

    // set of methods (behaviors)
    void drive() {
        System.out.println("Driving..." + this.brand);
    }

    void stop() {
        System.out.println("Stopping...");
    }


}




