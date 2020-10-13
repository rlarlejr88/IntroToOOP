package week1.ifstatements;

import java.util.Scanner;

public class HowOldAreYouSpecifically {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hey, what's your name? (Sorry, I keep forgetting.)");
        String name = in.nextLine();
        System.out.printf("Ok, %s, how old are you?", name);
        int age = in.nextInt();
        if (age >= 25){
            System.out.println("You can do pretty much anything.");
        }
        else if (age >=18 && age <=24){
            System.out.println("You can vote but not rent a car.");
        }
        else if (age >=16 && age <= 17){
            System.out.println("You can drive but not vote.");
        }
        else {
            System.out.println("You can't drive.");
        }

    }
}
