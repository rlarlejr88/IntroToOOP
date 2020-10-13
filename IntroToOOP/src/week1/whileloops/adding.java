package week1.whileloops;

import java.util.Scanner;

public class adding{

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int num = 0;
            int temp = -1;
            System.out.println("I will add up the numbers you give me.");
            while (temp != 0){
                System.out.print("number is: ");
                temp = in.nextInt();
                num += temp;
                System.out.printf("The total so far is %d\n",num);
            }
            System.out.printf("The total is %d", num);
        }

}
