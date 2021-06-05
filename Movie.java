// import
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


// 변수명 
class Record 
{
  /*
  // 시재 변수
  int cardMovie, cardSnacks, cardCancel, cashMovie, cashSnacks, cashCancel;
  // 거스름돈 변수
  int manwon, ochenwon, chenwon;
  // 음료, 팝콘 변수들
  int Coke, Cida, popcon;
  // 영화 정보 담는 변수들
  mTitle, mGenre, mOpenDate, mEndDate, mStory, mAge, mTime, 
  mStar,
  영화 제목/장르/개봉및종영날짜/줄거리/관람가능연령/러닝타임/평점
  // 티켓 가격
  mPrice;
상영관
   mRoom;
상영시작시간
   mStart;
상영일 /할인 -> 사용안할수도 있음
   runningDate;
공지
   String notice;
예매번호
   rNum;
인원
   inwon;
좌석번호 
   seatNum;
회원번호(전화번호)/주민번호/이름
   tel, id, name;
*/

//★ 추가한 변수(공유하기) 
static Integer sel;      //-- 메뉴 선택 값을 담는 변수
static Scanner sc;       //-- Scanner 메모리 할당
}

//------------관리자 클래스--------------------

// 관리자 메뉴 선택값만을 담는 클래스 

class Admin // 김서현, 조은선
{

}

class AdminCash // 소서현, 김서현
{
  // 시재관리, 판매금액 정산 메소드
}


class AdminMovie // 조은선, 심혜진
{
}

// 재고관리 클래스
class Stocks extends Record// 김아별, 심혜진
{

  
}

//------------------사용자 클래스-----------------------



class User // 김아별, 소서현 
{
}

 
// 유저 메뉴 선택값만 담는 클래스
class UserMenuSel
{
 
}

// 영화 예매 확인 클래스
class ConfirmTickets //심혜진, 소서현
{
}

// 영화 예매 클래스
class reserveTikets // 김서현, 김아별
{

   /*
	-날짜 출력 및 입력
	-영화목록필터선택+영화입력+영화정보출력
	-관람시간대 입력 
	-예매진행 확인 
	-인원 입력 
	-예매 가능 좌석 출력
	-좌석 입력 
	-예매확인 출력 
	-회원/비회원 확인 및 검사 호출
    */
	
}

// 영화 예매 확인 클래스
class ConfirmTickets //심혜진, 소서현
{
   	-번호 입력 및 매칭 확인 
	-확인 결과 출력 
	-예매 취소(삭제)
}

// 회원 관리 클래스 
class 회원관리 // 조은선, 김아별
{	
	-회원/비회원 확인 및 검사
	-가입시 정보 입력
	-휴대폰번호/주민번호 중복 및 유효성 검사 
	-적립하기 
	-적립금 사용 
}


//음료/팝콘 구매 클래스
class BuySnacks // 조은선, 소서현
{
   -음료/팝콘 메뉴판 출력 
	-음료/팝콘 구매 확인 
	-할인 안내 출력
	-적립하기/적립금사용 호출
	-결제 호출
}

// 결제 클래스(영화, 스낵) // 심혜진 김서현
class 결제
{
	-결제수단 입력 및 결제결과 출력
	-로딩 및 광고 출력 
	-영화표/교환권/영수증 출력 
}


public class Movie

// main() 메소드
public static void main(String[] args) throws IOException
{

// 관리자


// 유저
 

}





