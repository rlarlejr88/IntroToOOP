package oop.Basic;


public class Pokemon {
        // data fields ( instance variables
    String name;
    String type;
    int healthPoint;
    int attackPoint;

    // constructor: a special method to create an instance (object)
    // - default constructor: constructor without parameters
    // - default constructor: is given by the compiler if you don't define any constructors
    Pokemon(String name, String type, int healthPoint, int attackPoint) {
        // Initialize our date fields (instance variable)
        // 'this' (optional) : "self reference"
        // In this constructor, it's mandatory since param name == instance var name
        this.name = name;
        this.type = type;
        this.healthPoint = healthPoint;
        this.attackPoint = attackPoint;
    }

    // methods (behaviours)
    void attack(Pokemon enemy) {
        if (enemy.dodge()) {
            System.out.println(enemy.name + "dodge mt attack!");
        } else {
            System.out.println("Attack has been successful! - " + this.attackPoint);
            enemy.healthPoint -= this.attackPoint;
        }
    }

    boolean dodge() {
        // randomly you have 50% chance of dodge (randomly)
        // math.random(): returns a random double value from 0.0 to 1.0
        return Math.random() > 0.5;
    }

    void evolve() {
        System.out.println("I'm evolving...");
        attackPoint += 20;
        healthPoint += 20;
    }





}


