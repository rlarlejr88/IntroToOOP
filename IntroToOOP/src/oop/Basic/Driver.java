package oop.Basic;

public class Driver {
    public static void main(String[] args) {
        // Car instance (object)
        // new car();  -> constructor (special method)
        // - if no constructor, java gives you 'default constructor'
        // - default constructor: constructor without parameters
//        car c1 = new car("Yellow", "Lamborghini" , 2020, 550, 2);  // create a new instance
//        c1.drive(180);
//        c1.drive();
//
//        c1.stop();
//        System.out.println(c1);
//
//        c1.drive();
//        c1.stop();
//
//        car c2 = new car();
//        c2.color = "";
//        c2.brand = "Ferrari";
//        c2.year = 2019;
//        c2.horsePower = 540;
//        c2.seats = 2;
//        c2.drive();
//        c2.stop();
        Pokemon pikachu = new Pokemon("Pikachu", "Electric", 35, 55);
        Pokemon mewtwo = new Pokemon("Mewtwo", "Psychic",50, 35);

        pikachu.attack(mewtwo);

        System.out.println(pikachu.name + "HP:" + pikachu.healthPoint);
        System.out.println(pikachu.name + "AP:" + pikachu.attackPoint);
        pikachu.evolve();
        System.out.println(pikachu.name + "HP:" + pikachu.healthPoint);
        System.out.println(pikachu.name + "AP:" + pikachu.attackPoint);

    }
}
