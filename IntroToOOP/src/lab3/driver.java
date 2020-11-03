package lab3;
import java.util.ArrayList;
public class driver {
  // 가로 세로 8*8 =  64칸 만들기
  // 흰색 검정색 순차 배열
  // 왼쪽 아래서 위로 올라갈떄는 1~8로 표현
  //왼쪽 아래에서 오른쪾으로 이동할떄는 a~h로 표현


  public static void main(String[] args) {

    ArrayList<Piece> arr = new ArrayList<>();
    King k = new King(true);
    Queen q = new Queen(true);
    Rook r = new Rook(true);
    Bishop b = new Bishop(true);
    Knight knight = new Knight(true);
    Pawn pawn = new Pawn(true);

    ArrayList<Piece> piece = new ArrayList<>();
    arr.add(k);
    arr.add(q);
    arr.add(r);
    arr.add(b);
    arr.add(knight);
    arr.add(pawn);

    for (Piece piece : pieces){
      piece.move();
    }

    Piece p1 = new Pawn(true,true,new Queen(true));
    Piece p2 = new Pawn(true,false,null);
    Piece p3 = new Pawn(false,false,null);
    Piece p4 = new Pawn(false,true,new Queen(true));
    Piece p5 = new Pawn(true,true,new Knight(true));
    System.out.println(p1.equals(p2));
    System.out.println(p1.equals(p4));
    System.out.println(p1.equals(p5));
    System.out.println(p2.equals(p3));
    System.out.println(p4.equals(p5));




  }
}