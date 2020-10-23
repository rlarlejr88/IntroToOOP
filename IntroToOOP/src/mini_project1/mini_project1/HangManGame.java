package mini_project1;

import java.util.Scanner;
import java.io.*;
import java.util.Random;
import java.util.ArrayList;



public class HangManGame {

  public static void main(String[] args) throws FileNotFoundException {

    File f = new File("C:\\Users\\kimkd\\IdeaProjects\\IntroToOOP\\src\\mini_project1\\city.txt");
    Scanner in = new Scanner(f);
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    ArrayList<String> word = new ArrayList<>();
    ArrayList<String> guessed = new ArrayList<String>();

    int count = 0;


    System.out.println("Here's the question");
    // String array to store txt file keys

    while (in.hasNext()) {
      word.add(in.nextLine());
      count++;
    }
//    int random = r.nextInt(s.length);
    int random = rd.nextInt(word.size());
    String answer = word.get(random);

    for (int i = 0; i < answer.length(); i++) {
      System.out.print("_");
      if (i == answer.length() - 1) {
        System.out.println();
      }
    }
    int lettersleft = answer.length();
    String guess;


    // 겜 시작!!


    while (lettersleft != 0) {
      System.out.print("You are guessing: ");  // 여기가 정답 쓰고 뒤에 정답 저장
      guess = sc.nextLine();

      if (guessed.contains(guess) == false) {
        guessed.add(guess);
      }

      lettersleft = answer.length();

      for (int i = 0; i < answer.length(); i++) {
        int checker = 1;

        for (int j = 0; j < guessed.size(); j++) {

          if (guessed.get(j).charAt(0) == answer.charAt(i)) {
            System.out.print(guessed.get(j).charAt(0));
            lettersleft--;
            checker--;

          }
        }
        if (checker == 1) {
          System.out.print("_");
        }

      }
      System.out.println();

      System.out.print("You have guessed wrong letters"); // 틀린 글씨 저장 및 카운트
      for (int i = 0; i < guessed.size(); i++) {
        System.out.print(" " + guessed.get(i));
      }
      System.out.println();
    }


    boolean finished = false;
//    int count = 0;

    while (finished == false) {
      System.out.println("_________");
//  변수 인풋 확인 씨발
      String letter = in.next();
      while (letter.length() != 1 || Character.isDigit(letter.charAt(0))) {
//        System.out.println("에러다 씨발 인풋 에러 씨바거");
        letter = in.next();
      }
// letter가 단어면 확인
      boolean found = false;

      if (!found) {
        count++;
      }

      boolean done = true;
      System.out.print("You have guessed" + count +" wrong letters"); // 틀린 글씨 저장 및 카운트


//      게임 끝
      if (done) {
        System.out.println("You win!");
        System.out.println("\nYou have guessed"+in+"correctly");
        finished = true;
      }
      if (count == 10) {
        System.out.println("You lose!");
        System.out.println("The correct word was"+in+"!" );
        finished = true;
      }
    }




  }

}