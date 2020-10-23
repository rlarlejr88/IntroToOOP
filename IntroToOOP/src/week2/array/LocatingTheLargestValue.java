package week2.array;


public class LocatingTheLargestValue {


  public static void main(String[] args) {
    int[] y = new int[10];
    int j;
    int max = y[0];
    int s = 0;

    System.out.print("Array:\t");
    for (int i = 0; i < y.length; i++) {
      j = (int) (Math.random() * 100);
      y[i] = j;
      System.out.print(y[i] + "\t");
    }

    for (int i = 0; i < y.length; i++) {
      if (max < y[i]) {
        max = y[i];
        if (s < i){
          s = i;
        }
      }

    }
    System.out.println();
    System.out.println();
    System.out.println("THe largest val  " + max);
    System.out.println("It is in slot "+s);


//
//    boolean b = false;
//    for(int i = 0; i < y.length; i ++ ){
//      if (s < y[i] ){
//        System.out.println(s);
//        b = true;
//      }
//    }

//    int m;
//    for(int i = 0; i < y.length; i++){
//      j = (int)(Math.random() * 100) +1;
//      y[i] = j;
//      if (m < y[i]){
//      }







  }


}