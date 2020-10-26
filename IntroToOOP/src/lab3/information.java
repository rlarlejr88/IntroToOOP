package lab3;

public class information {
  //16개의 말이 필요(킹,퀸,2룩,2나이트,2비숍,8핀)
  // 오브젝트에 체크메이트
  // 말이 말을 잡을떄 비슷하거나 더 강한것을 잡아야함(이거 설정하라는 이야기)
  // 체크메이트 말고도 시간부족 또는 상대가 게임포기하면 이기고 무승부 설정도 있어야됨
  // 아래쪽에서 위로 올라갈떄는 1~8을 왼쪽에서 오른쪽으로는 a~h로 표시
  // 흰색 어두운색을 사용해서 체스판을 구현
  // 피스는 부모 클래스
  // 피스 오브젝은 인스턴화 하지말고 애들은 피스에 대한 오버드라이브 준비
  // 폰1 나이트2 비숍3 룩5 퀸9 킹 1000   포인트 만큼 중요
  // 피스 클래스에 부울로 흰색인지 검은색인지 나타내야됨 / isWhite
  // 피스 클래스에는 리턴 method존재, 각 피스열에는 toString으로 오버라이드 리턴
  // 폰,나이트,비숍,룩,퀸,킹은 오버라이드 toString method우선

  // @Override,
  //public String toString()  {
  // return " King{value='" + value + '\'' + '}';
  // }

  //서브 스트링으로 피스가 어떻게 움직이는지 프린트 구현
  // method 를 상속 받을때는 @override를 써주기
  // 두개의 말 정보가 같은 값과 색을 가질경우 같은 말로 간주
  // 캐슬링 엔패션 프로모션 체크
  // 프로모션 : 폰이 판 체스판 끝에 도달하면 승격함 퀸,룩,비숍,나이트중 선택 1
  //          보통은 퀸으로 선택 하지만 다른걸 선택하면 언더 프로모션이라 지칭
  // 승격은 제한이 없다 그래서 2퀸이 될수도 있다 / 폰클래스에 인스턴스변수 추가

  // boolean promoted;
  // piece newPiece;

  // public void promote(piece newPiece) 이거 추가
  //승격하면 폰은 그 method임 이거 설정해야된다 폰이 아니야 승격하면

  //Create an ArrayList<Piece> to include all types of pieces.
  //Using for-each loop, call move() method on each Piece to print the moves.
  //Create the following Pawns,
  //  Use equals() method to compare the following:







}
