package week2.arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class WhereIsIt {

  public static void main(String[] args) {
    ArrayList<Integer> ar = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    System.out.print("ArrayList: ");
    System.out.print("[");
    int j;
    for (int i = 0; i < 10; i++){
      j = (int)(Math.random()*50)+1;
      ar.add(j);
      System.out.print(j+ "\t");
    }
    System.out.println("]");
    System.out.println();
    System.out.printf("Value to fine : ");

    boolean b = false;
    int q = sc.nextInt();
    int max= ar.size();
    for(int i = 0;i < ar.size();i++){
      if(q == ar.get(i)){
        System.out.printf("%d is in slot %d",q,i);
        b = true;
      }
    }
    if (b == false){
      System.out.printf("%d is not in the ArrayList",q);
    }


  }

}
