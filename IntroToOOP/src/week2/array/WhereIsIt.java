package week2.array;

import java.util.Scanner;

public class WhereIsIt {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int j;
    int[] array = new int[10];

    System.out.print("Array: ");
    for (int i = 0; i < array.length;i++){
      j = (int)(Math.random() * 50);
      array[i] = j;
      System.out.print(array[i]+"\t");
    }
    System.out.println();
    System.out.print("Value to find: ");
    int v = sc.nextInt();
    boolean check = false;
    for (int i = 0; i < array.length; i++){
      if (v == array[i]){
        System.out.printf("%d is in slot %d",v,i);
        check = true;

    }
  }
//     if(check == false){
//       System.out.printf("%d is not in the array", v);
//     }

  }
}
