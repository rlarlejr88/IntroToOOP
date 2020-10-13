package week1.keyboardinput;

import java.util.Scanner;

public class AgeInFiveYears {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Hello.  What is your name?");
        String name = in.nextLine();
        System.out.printf("Hi, %s!  How old are you? ",name);
        int age = in.nextInt();
        System.out.printf("Did you know that in five years you will be %d years old?And five years ago you were %d! Imagine that!",age + 5, age - 5);
    }
}
