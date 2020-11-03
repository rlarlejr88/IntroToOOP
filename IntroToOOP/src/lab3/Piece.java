package lab3;

public abstract class Piece {

  //킹은 모든방향 1칸이동 가능
  //퀸 모든방향 원하는 만큼 이동 가능, 뚫고 지나가는거 불가능
  //룩 앞뒤좌우 원하는 만큼 이동 가능
  //비숍 대각선 방향으로 원하는 만큼 이동가능,처음 설정된 칸 색만 이동 가능
  //나이트 2칸이동 후 그 칸 기준 90도 방향으로 선택 이동 가능
  //폰은 전진만 가능 1칸,처음 움직이는 폰은 2칸 전진 가능,잡을떄는 앞대각선으로만 잡음
  private int value;
  private boolean isWhite;

  public Piece(int value, boolean isWhite) {
    this.value = value;
    this.isWhite = isWhite;

  }

  public int getValue(){
    return value;
  }

  public void setValue(int value){
    this.value = value;
  }

  public boolean isWhite(){
    return isWhite;
  }

  public abstract  move();


  public boolean equals(Object o){
    if (this == o){
      return true;
    }
    if (o == null || getClass() != o.getClass()){
      return false;
    }
    Piece piece = (Piece) o;
    return value == piece.value && isWhite == piece.isWhite;
  }

  public String toString(){
    return "piece{" + "value+" + value + ", isWhite=" + isWhite +"}";
  }

}


