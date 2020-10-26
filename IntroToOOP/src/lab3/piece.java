package lab3;

import java.util.ArrayList;
import java.util.Objects;

public class piece {

  //킹은 모든방향 1칸이동 가능
  //퀸 모든방향 원하는 만큼 이동 가능, 뚫고 지나가는거 불가능
  //룩 앞뒤좌우 원하는 만큼 이동 가능
  //비숍 대각선 방향으로 원하는 만큼 이동가능,처음 설정된 칸 색만 이동 가능
  //나이트 2칸이동 후 그 칸 기준 90도 방향으로 선택 이동 가능
  //폰은 전진만 가능 1칸,처음 움직이는 폰은 2칸 전진 가능,잡을떄는 앞대각선으로만 잡음
  private int value;
  private boolean isWhite;
  private boolean promoted;
  private String newPiece;

  public piece(int value, boolean isWhite, boolean promoted, String newPiece) {

    this.value = value;
    this.isWhite = isWhite;
    this.promoted = promoted;
    this.newPiece = newPiece;

  }

  public piece() {

  }

  public void move() {
  }

  public String toString() {
    return "";

  }
  public boolean equals(piece p2){
    if(p2.isWhite == isWhite && p2.value == value && p2.newPiece == newPiece){
      return true;
    }
    else{
      return false;
    }
  }
}
  class King extends piece{
    @Override
    public void move(){
      System.out.println("One square");
    }
    @Override
    public String toString() {
      return "King{value= '" + 1000+"' }";
    }

  }

  class Queen extends piece {

    @Override
    public void move(){
      System.out.println("Like bishop and rook");
    }
    @Override
    public String toString() {
      return "Queen{value= '" + 9+"' }";
    }
  }

  class Rook extends piece {

    @Override
    public void move(){
      System.out.println("Horizontally or vertically");
    }

    @Override
    public String toString() {
      return "Rook{value= '" + 5+"' }";
    }

  }

  class Bishop extends piece {

    @Override
    public void move(){
      System.out.println("Diagonally");
    }

    @Override
    public String toString() {
      return "Bishop{value= '" +3 +"' }";
    }
  }

  class Knight extends piece {

    @Override
    public void move(){
      System.out.println("Like an L");
    }

    @Override
    public String toString() {
      return "Knight{value= '" + 2+"' }";
    }


  }

  class Pawn extends piece {
    boolean promoted;
    public Pawn(boolean iswhite,boolean promoted,String newpiece){
      super(1,iswhite,promoted,newpiece);
    }

    @Override
    public void move(){
      System.out.println("One square");
    }
    @Override
    public String toString() {
      return "Pawn{value= '" + 1+"' }";
    }

  }


