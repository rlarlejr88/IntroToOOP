package week2.arraylists;

import java.util.ArrayList;

public class GettingTheLargestValue {

  public static void main(String[] args) {
    ArrayList<Integer> ar = new ArrayList<>();
    int j;

    System.out.print("ArrayList: ");
    System.out.print("[");

    for (int i = 0; i < 10; i++) {
      j = (int) (Math.random() * 100) + 1;
      ar.add(j);
      System.out.print(j + "\t");
    }
    System.out.print("]");

    int k = 0;
    for (int y = 0; y < ar.size(); y++) {
      if (k < ar.get(y)) {
        k = ar.get(y);
      }
    }
    System.out.println();
    System.out.print("The largest value is " + k);


  }
}
