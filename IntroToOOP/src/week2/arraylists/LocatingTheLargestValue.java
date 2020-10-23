package week2.arraylists;
import java.util.ArrayList;

public class LocatingTheLargestValue {

  public static void main(String[] args) {
    ArrayList <Integer> x = new ArrayList<>();

    int j;
    System.out.print("ArrayList: ");
    for (int i =0; i < 10; i++){
      j = (int)(Math.random() * 50) +1;
      x.add (j);
      System.out.print(j+"\t");
    }
    System.out.println();
    System.out.println();
    int y= 0;
    int s=0;
    for (int i = 0; i < x.size(); i++){
      if (y < x.get(i)){
        y = x.get(i);
        if (s < x.get(i)){
          s = i;
        }
      }
    }
    System.out.printf("The largest value is  %d, which is in slot %d ",y,s);
  }
}
