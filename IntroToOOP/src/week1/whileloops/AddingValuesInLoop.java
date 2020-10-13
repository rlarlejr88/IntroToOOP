package week1.whileloops;

import java.util.Scanner;

public class AddingValuesInLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int temp = -1;
        while (temp != 0){
            temp = in.nextInt();
            num += temp;
            System.out.printf("number is %d", num);

        }

    }
}
