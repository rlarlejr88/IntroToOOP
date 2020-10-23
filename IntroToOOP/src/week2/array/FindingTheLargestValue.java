package week2.array;

public class FindingTheLargestValue {


    public static void main(String[] args) {
      int[] array = new int[10];
      int j;

      System.out.print("Array:\t");
      for (int i = 0; i < array.length; i++){
        j = (int)(Math.random() * 100);
        array[i] = j;
        System.out.print(array[i]+"\t");
      }
      int max = array[0];
      for (int x = 0; x < array.length; x++){
        if ( max < array[x]){
          max = array[x];
        }
      }
      System.out.println();
      System.out.println("THe largest val  "+max);

    }

}
