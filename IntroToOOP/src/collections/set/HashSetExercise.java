package collections.set;

import java.util.HashSet;

public class HashSetExercise {

  public static void main(String[] args) {
    System.out.println(distinctYear(1987)); // 2013
    System.out.println(distinctYear(999)); // 1023
  }

  HashSet<Integer> year = new HashSet<>();


  /**
   * Returns the next year with distinct digits
   * @param year int 0 <= year <= 10000
   * @return the next year with distinct digits
   */
  public static int distinctYear(int year) {
    for (int y = year +1; y < 10235; y++) {
      String yearStr = String.valueOf(y);
      HashSet<Character> set = new HashSet<>();
      for (Character ch : yearStr.toCharArray()) {
        if (!set.add(ch)) {
          break;
        }
      }

      if(set.size()== yearStr.length()){
        return Integer.parseInt(yearStr);
      }
    }
    return 0; // 아무일도 없음
  }



//  public static int
}