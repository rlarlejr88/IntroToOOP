package week1.keyboardinput;

import java.util.Scanner;

public class NameAgeSalary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello.  What is your name?");
        String name = in.nextLine();
        System.out.printf("Hi, %s!  How old are you?",name);
        int age = in.nextInt();
        System.out.printf("So you're %d, eh?  That's not old at all!", age);
        System.out.printf("How much do you make, %s?",name);
        double salay = in.nextDouble();
        System.out.printf("%.1f!  I hope that's per hour and not per year! LOL!",salay);
    }
}
