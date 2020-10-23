package week2.array;


public class BasicArrays2 {

  public static void main(String[] args) {
    int j;
    int[] y = new int[10];

    for (int i = 0; i < y.length; i++){
      j = (int)(Math.random() * 100) +1;
      y[i] = j;
      System.out.printf("Slot %d contains a %d",i, y[i]);
      System.out.println();
    }







  }

}
