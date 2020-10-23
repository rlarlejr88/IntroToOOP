package week2.array;

public class CopyingArrays {

  public static void main(String[] args) {
    int[] iarray1 = new int[10];
    int[] iarray2 = new int[10];
    int i =0;
//    iarray1[10] = -7;
//    iarray1(-1, new int[10]{-7});

    System.out.print("Array1:\t");
    for (i = 0; i < iarray1.length; i++) {
      int j = (int) (Math.random() * 100);
      if(i == iarray1.length-1){
        iarray1[iarray1.length - 1] = -7;
      }
     else {
        iarray1[i] = j;
        iarray2[i] = iarray1[i];
      }
      System.out.print(iarray1[i]+"\t");
    }
    iarray1[iarray1.length - 1] = -7;
    System.out.println();
    System.out.print("Array2:\t");
    for (i = 0; i < iarray2.length; i++){

      System.out.print(iarray2[i]+"\t");
    }


  }
}

