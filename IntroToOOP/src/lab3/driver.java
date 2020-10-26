package lab3;
import java.util.ArrayList;
public class driver {
  // 가로 세로 8*8 =  64칸 만들기
  // 흰색 검정색 순차 배열
  // 왼쪽 아래서 위로 올라갈떄는 1~8로 표현
  //왼쪽 아래에서 오른쪾으로 이동할떄는 a~h로 표현


  public static void main(String[] args) {

    ArrayList<piece> arr = new ArrayList<>();
    piece k = new King();
    piece q = new Queen();
    piece r = new Rook();
    piece b = new Bishop();
    piece knight = new Knight();
    piece pawn = new Pawn(true,true,"Queen");
    arr.add(k);
    arr.add(q);
    arr.add(r);
    arr.add(b);
    arr.add(knight);
    arr.add(pawn);
    for(int i =0; i < arr.size(); i ++){
      arr.get(i).move();
    }
    piece p1 = new Pawn(true,true,"Queen");
    piece p2 = new Pawn(true,false,"null");
    piece p3 = new piece(1,false,false,"null");
    piece p4 = new piece(1,false,true,"Queen");
    piece p5 = new piece(1,true,true,"Knight");
    System.out.println(p1.equals(p2));
    System.out.println(p1.equals(p4));
    System.out.println(p1.equals(p5));
    System.out.println(p2.equals(p3));
    System.out.println(p4.equals(p5));




  }
}