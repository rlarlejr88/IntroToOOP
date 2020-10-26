package lab3;

public class board {
  // 가로 세로 8*8 =  64칸 만들기
  // 흰색 검정색 순차 배열
  // 왼쪽 아래서 위로 올라갈떄는 1~8로 표현
  //왼쪽 아래에서 오른쪾으로 이동할떄는 a~h로 표현


  public static void main(String[] args, Object square) {
    piece p1 = new piece(1, true, true, "Queen");
    piece k = new King();
    k.move();
  }
}