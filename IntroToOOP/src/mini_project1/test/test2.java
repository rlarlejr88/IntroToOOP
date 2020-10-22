//package mini_project1.test;
//
//import com.sun.org.apache.xpath.internal.operations.String;
//import java.util.*;
//
//public class test2 {
//
//  public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Hello fucking game");
//    java.lang.String word = sc.next();
//    int length = word.length();
//    java.lang.String line = numLine(length);
//    Random rd = new Random();
//    hanman(set, length, line.toCharArray(), word);
//  }
//
//  public static java.lang.String numLine(int length){
//    java.lang.String line = "";
//    for ( int i = 0; i <= length-1; i++){
//      line += "_";
//    }
//    return line;
//  }
//
//  public static void hanman(Random rd, int length, char[] line, String word){
//    String a = "_";
//    while (new String(line).contains(a)){
//      char alphabet = (char) (rd.nextInt(26) + 'a');
//      System.out.println("추축하는 단어:" + alphabet + "            ");
//      for (int i = 0; i <= length -1; i ++){
//        if (alphabet == word.charAt(i)){
//          line[i] = alphabet;
//        }
//        else if (alphabet != word.charAt(i)){
//        }
//      }
//      System.out.println(new String(line));
//    }
//  }
//}
