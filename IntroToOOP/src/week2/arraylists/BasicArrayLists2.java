package week2.arraylists;
import java.util.ArrayList;

public class BasicArrayLists2 {

  public static void main(String[] args) {

    ArrayList<Integer> arr = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      arr.add(-133);
      // arr[i] = -133
    }
    for (int i = 0; i < arr.size(); i++) {
      System.out.printf("%d is slot and the number is %d \n",i,arr.get(i));
    }
  }
}
