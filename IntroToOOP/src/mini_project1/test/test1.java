package mini_project1.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class test1 {


  public static void main(String[] args) throws FileNotFoundException {
    File f = new File("C:\\Users\\kimkd\\IdeaProjects\\IntroToOOP\\src\\mini_project1\\city.txt");

    System.out.println("Here's the question");
    Scanner sc = new Scanner(f);
    Scanner input = new Scanner(System.in);

    ArrayList<String> word = new ArrayList<>();
    while (sc.hasNext()) {
      word.add(sc.nextLine());
    }

    String hidden_text = word.get((int) Math.random() * word.size());
    char[] textArray = hidden_text.toCharArray();

    char[] myAnswer = new char[textArray.length];
    for (int i = 0; i < textArray.length; i++) {
      myAnswer[i] = '?';
    }

    boolean finished = false;
    int count = 0;

    while (finished == false) {
      System.out.println("_________");
//  변수 인풋 확인 씨발
      String letter = input.next();
      while (letter.length() != 1 || Character.isDigit(letter.charAt(0))) {
        System.out.println("에러다 씨발 인풋 에러 씨바거");
        letter = input.next();
      }
// letter가 단어면 확인
      boolean found = false;
      for (int i = 0; i < textArray.length; i++) {
        if (letter.charAt(0) == textArray[i]) {
          myAnswer[i] = textArray[i];
          found = true;
        }
      }

      if (!found) {
        count++;
      }

      boolean done = true;
      for (int i = 0; i < myAnswer.length; i++) {
        if (myAnswer[i] == '?') {
          System.out.print("_");
          done = false;
        } else {
          System.out.print("You are guessing: " + myAnswer[i]);
        }
      }
      System.out.println("\nYou have guessed ("+count+")wrong letters:" + "여기에 틀린 글씨 저장");


//      게임 끝
      if (done) {
        System.out.println("You win!");
        System.out.println("\nYou have guessed"+myAnswer+"correctly");
        finished = true;
      }
      if (count == 10) {
        System.out.println("You lose!");
        System.out.println("The correct word was"+ Math.random()+"!" );
        finished = true;
      }
    }


    }
}
