package week2.arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class FindingValueInArrayList {

  public static void main(String[] args) {
    ArrayList<Integer> ar = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    System.out.print("ArrayList; ");
    System.out.print("[");

    int j;
    for (int i =0; i <10; i++){
      j = (int)(Math.random()*50)+1;
      ar.add(j);
      System.out.print(j + "\t");
    }
    System.out.print("]");
    System.out.println();

    System.out.print("Value to fine: ");

    int q = sc.nextInt();
    boolean b = false;
    for (int i = 0; i < ar.size(); i++){
      if ( q == ar.get(i)){
        System.out.println();
        System.out.printf("%d is in the ArrayList",q,"\n");
        System.out.printf("\n%d is in the ArrayList",q);
        System.out.printf("\n%d is in the ArrayList",q);
        b = true;
      }
    }
    if (b == false){
      System.out.printf("");
    }

  }

}
