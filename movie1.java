// import
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;

// 변수명 담는 클래스
class Record 
{
  static Integer sel;      //-- 메뉴 선택 값을 담는 변수
  static Scanner sc;       //-- Scanner 메모리 할당
}

// 클래스 객체를 여러개 생성해야되는 것은 static 변수로 선언하면
// 가장 마지막 값으로 덮어씌워지게 된다. 그래서 static은 빼야한다.
//getter, setter 역시 this.변수로 작성해야 한다.

/*
2021-03-18
김아별:
관리자-재고관리 클래스 완성
사용자-메인메뉴 클래스 완성
 - 메인메뉴/ 이전메뉴 복귀 기능은 담당한 클래스 모두 틀 잡은 후에 구상 예정
사용자-회원가입 클래스 완성
사용자-영화 예매 클래스 미완성
*/

//-----------------------------------------------------관리자 : 재고관리 변수 클래스
class StocksVO
{
   // 음료, 팝콘 변수들
   private static int cida;
   private static int coke=cida=100;
   private static int popcorn = 50;
   private static int paper = 300;

   // getter, setter 메소드
   public int getCoke()
   { return coke; }
   
   public void setCoke(int coke)
   { StocksVO.coke += coke; }

   public int getCida()
   { return cida; }

   public void setCida(int cida)
   { StocksVO.cida += cida; }

   public int getPop()
   { return popcorn; }

   public void setPop(int popcorn)
   { StocksVO.popcorn += popcorn; }

   // 용지 재고량 반환 메소드
   public int getPaper()
   { return paper; }

   public void setPaper(int paper)
   { StocksVO.paper += paper; }

}//end class StockVO


//--------------------------------------------------관리자 : 재고관리 클래스 <완성>
class Stocks extends Record // 김아별, 심혜진
{
   StocksVO asv = new StocksVO();
   
   // 재고관리 메인 메뉴 출력 메소드
   public void menuStocks() 
   {
      //sc = new Scanner(System.in);
      System.out.println("\n===========================");
      System.out.println(" 1. 콜라 재고 확인/충전");
      System.out.println(" 2. 사이다 재고확인/충전");
      System.out.println(" 3. 팝콘 재고 확인/충전");
      System.out.println(" 4. 관리자 메뉴로 돌아가기");
      System.out.println("===========================");
      System.out.print("  번호를 입력하세요(1~4) : ");
   }
  
   // 재고관리 메뉴 호출 메소드
   public void menuRun() throws IOException
   {
      switch (sel)
      {
      case 1: addCoke(); break;
      case 2: addCida(); break;
      case 3: addPop(); break;
      //case 4: break; ★ 관리자메뉴 호출메서드 입력 필요
      default: System.out.println("입력 오류입니다."); break;
      }
   }
   
   // 콜라 재고확인 및 충전 메소드
   public void addCoke() throws IOException
   {
      sc = new Scanner(System.in);
      
      System.out.println();
      System.out.printf("현재 콜라캔의 재고는 %d개입니다.\n", asv.getCoke());
      System.out.print("재고를 충전하시겠습니까?(Y/N): ");
      char sel;
      sel = (char)System.in.read();

      if (sel=='y' || sel =='Y')
      {
         
         System.out.print("충전할 수량을 입력하세요 : ");
         int n = sc.nextInt();

         if (n+asv.getCoke()>300)
            System.out.println("보유 재고량은 300개를 초과할수 없습니다.");
         else
         {
            asv.setCoke(n);
            System.out.println("충전이 완료되었습니다.");
            System.out.printf("현재 콜라의 재고는 %d입니다.\n", asv.getCoke());
            System.out.println();
         }   
      }
   }//end addCoke()

   // 사이다 재고확인 및 충전 메소드
   public void addCida() throws IOException
   {
      sc = new Scanner(System.in);
      
      System.out.println();
      System.out.printf("현재 콜라캔의 재고는 %d개입니다.\n", asv.getCida());
      System.out.print("재고를 충전하시겠습니까?(Y/N): ");
      char sel;
      sel = (char)System.in.read();

      if (sel=='y' || sel =='Y')
      {
         
         System.out.print("충전할 수량을 입력하세요 : ");
         int n = sc.nextInt();

         if (n+asv.getCida()>300)
            System.out.println("보유 재고량은 300개를 초과할수 없습니다.");
         else
         {
            asv.setCida(n);
            System.out.println("충전이 완료되었습니다.");
            System.out.printf("현재 콜라의 재고는 %d입니다.\n", asv.getCida());
            System.out.println();
         }   
      }
   }//end addCida()


   // 팝콘 재고확인 및 충전 메소드
   public void addPop() throws IOException
   {
      sc = new Scanner(System.in);
      
      System.out.println();
      System.out.printf("현재 콜라캔의 재고는 %d개입니다.\n", asv.getPop());
      System.out.print("재고를 충전하시겠습니까?(Y/N): ");
      char sel;
      sel = (char)System.in.read();

      if (sel=='y' || sel =='Y')
      {
         
         System.out.print("충전할 수량을 입력하세요 : ");
         int n = sc.nextInt();

         if (n+asv.getPop()>300)
            System.out.println("보유 재고량은 300개를 초과할수 없습니다.");
         else
         {
            asv.setPop(n);
            System.out.println("충전이 완료되었습니다.");
            System.out.printf("현재 콜라의 재고는 %d입니다.\n", asv.getPop());
            System.out.println();
         }    
      }
   }//end addPop()

   // 용지 세팅 및 충전 메소드
   public void addPaper() throws IOException
   {
      sc = new Scanner(System.in);

      System.out.printf("\t현재 용지의 재고량은 %d장입니다.\n", asv.getPaper());
      System.out.print("\t재고를 충전하시겠습니까?(Y/N): ");
      char sel;
      sel = (char)System.in.read();
 
      if (sel=='y' || sel =='Y')
      {
         
         System.out.print("충전할 수량을 입력하세요 : ");
         int n = sc.nextInt();

         if (n+asv.getPaper()>1000)
            System.out.println("보유 재고량은 1000개를 초과할수 없습니다.");
         else
         {
            asv.setPaper(n);
            System.out.println("충전이 완료되었습니다.");
            System.out.printf("현재 용지의 재고량은 %d장입니다.\n", asv.getPaper());
            System.out.println();
         }    
      }
   }//end addPaper()

}//end class Stocks

//---------------------------------------------------------사용자 : 영화 예매 클래스
class ReserveTikets // 김서현, 김아별
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


    // 예매한 좌석 □→■ 바꾸기

    char[] st = new char[50];
    ㅁㅁㅁㅁㅁ ㅁㅁㅁㅁㅁㅁ
     ㅁㅁㅁㅁ ㅁㅁㅁㅁㅁㅁ
     ㅁㅁㅁㅁ ㅁㅁㅁ
     사용자가 예매한 좌석 인덱스값 받아서 □ → ■ 로 바꿔줄수있다!
    */
}


//---------------------------------------------사용자 : 메인 메뉴 User 클래스 <완성>
class User extends Record // 김아별, 소서현 
{
   // 주요 변수 선언 및 인스턴스 생성
   static Scanner sc = new Scanner(System.in);

   // 관리자 공지메소드 수행 
   //Admin.notice();

   //-예매 확인/영화 예매/음료,팝콘 구매/회원 가입/관리자모드로 이동(switch)
   // 메뉴 출력 메소드 --- 완성 
   public static void menuDisp()
   {
      System.out.println("\n\n");
      System.out.println("\t=========메뉴  선택=========");
      System.out.println("\t    1.  영화 예매     ");
      System.out.println("\t    2.  예매 확인     ");
      System.out.println("\t    3. 음료/팝콘 구매 ");
      System.out.println("\t    4.  회원 가입     ");
      System.out.println("\t===========================");
      System.out.print("\t>> 메뉴 선택(1~4) : "); 
      // 관리자메뉴는 1004번(히든)
   }// end menuDisp()

   // 메뉴 선택 메소드 --- 완성(다른 클래스에서 쓸수있음 → User.menuSelect();)
   public static void menuSelect()
   {
      sel = sc.nextInt();
   }// end menuSelect


   //-초기화면/이전화면 이동 메소드 → 보류 ★


   // 선택된 메뉴 실행에 따른 기능 호출 메소드
   public static void menuRun()
   { 
      /*
      switch (sel)
      {
      //영화 예매 메소드 1번
      case UserMenuSel.RESERVE_TICKETS : reserveTikets(); break;
      // 예매 확인 메소드 2번
      case UserMenuSel.CONFIRM_TICKETS : ConfirmReservation(); break;

      // 음료, 팝콘 구입 메소드 3번
      case UserMenuSel.BUY_SNACKS : 
      
      // 회원가입 메소드 4번
      case UserMenuSel.SIGN_IN : 
      
      // 관리자메뉴(히든메뉴) 1004번
      case UserMenuSel.ADMIN : 
      default: System.out.println("1~4번을 선택해주세요."); break;
      }
      */
      
   }// end menuRun()
}//end User class

 
// 유저 메뉴 선택값만 담는 클래스
class UserMenuSel
{
  // 상수화된 변수들(메뉴)
  final static int RESERVE_TICKETS = 1;
  final static int CONFIRM_TICKETS = 2;
  final static int BUY_SNACKS = 3;
  final static int SIGN_IN = 4;
  private static final int ADMIN = 1004;  //히든
}

class MembersVO
{
   // 이름, 핸드폰번호, 아이디, 포인트
   private String name; 
   private String tel;
   private String id;
   private String point;

   // 생성자
   public MembersVO()
   {
      
   }

   // 사용자 정의 생성자
   public MembersVO(String name, String tel, String id, String point)
   {
      this.name = name;
      this.tel = tel;
      this.id = id;
      this.point = point;
   }

   // getter, setter
   // 이름 
   public String getName()
   {
      return this.name;
   }

   public void setName(String name)
   {
      this.name = name;
   }
   
   // 핸드폰번호
   public String getTel()
   {
      return this.tel;
   }

   public void setTel(String tel)
   {
      this.tel = tel;
   }

   //주민등록번호
   public String getId()
   {
      return this.id;
   }

   public void setId(String id)
   {
      this.id = id;
   }
   
   // 적립금
      public String getPoint()
   {
      return this.point;
   }

   public void setPoint(String point)
   {
      this.point = point;
   }


}// end MembersVO

// 회원관리 메뉴 선택값만 담는 클래스
class memMenuSel
{
  // 상수화된 변수들(메뉴)
  final static int SIGN_IN = 1;
  final static int CONFIRM_MEMBER = 2;
  final static int MAIN_MENU = 3;
}



//-------------------------------------------------사용자 : 회원 가입 클래스 <완성>
class Members extends Record // 조은선, 김아별
{
   //  MemebersVO 기반으로 생성된 객체만 data에 담을 수있다.
   ArrayList<MembersVO> mData = new ArrayList<MembersVO>();

   // 회원관리 메뉴 
   public static void mMenuDisp()
   {
      System.out.println("\n");
      System.out.println("=========회원 등록 메뉴=========");
      System.out.println("    1.  회원      가입     ");
      System.out.println("    2.  회원 정보 조회   ");
      System.out.println("    3.    메인 메뉴   ");
      System.out.println("================================");
      System.out.print(">> 메뉴 선택(1~3) : "); 
   }// end memMenuDisp()

   // 선택된 메뉴 실행에 따른 기능 호출 메소드
   public void mMenuRun() throws IOException
   { 
      switch (sel)
      {
      //회원가입 메소드 1번
      case memMenuSel.SIGN_IN : signIn(); break;
      // 회원정보조회 메소드 2번
      case memMenuSel.CONFIRM_MEMBER : checkMem(); break;

      // 메인메뉴 메소드 3번 (★다른 클래스 메뉴 불러오는거 어떻게??)
      //case memMenuSel.MAIN_MENU : User.menuDisp();  break;
      
      default: System.out.println("1~3번을 선택해주세요."); break;
      }
   }// end memMenuRun()


   // 기존 회원 정보 추가 메소드 -- 완성
   public void oldMem()
   {
      //성인 회원
      mData.add(new MembersVO("김아별","010-1111-1111","760411-2575452","2500"));
      mData.add(new MembersVO("김서현","010-2222-2222","651126-2127984","5000"));
      mData.add(new MembersVO("조은선","010-3333-3333","610125-2066131","10000"));
      mData.add(new MembersVO("심혜진","010-4444-4444","641014-2211410","500"));
      //청소년 회원
      mData.add(new MembersVO("청소년","010-5555-5555","071022-1639841","2000"));
      mData.add(new MembersVO("소서현","010-1212-1212","080118-2250820","6000"));
   
      // 회원수 테스트
      //System.out.println("회원수 : " + mData.size());
      //--==>> 회원수 : 6
     
      // 회원들 이름출력 → get() 사용
      
      /*
      for (int i=0 ; i < mData.size(); i++)
      {
         System.out.println(mData.get(i).getName());
      }
      //--==>>
      /*
      김아별
      김서현
      조은선
      심혜진
      청소년
      소서현
      */
   }//end oldMem() 

   // 회원 가입 메소드 -- 완성  
   public void signIn() throws IOException 
   { 
      sc = new Scanner(System.in);
      String name, tel, id, point, temp;
      System.out.println();
      System.out.println("\t[회원 가입]");
      System.out.println("하단의 정보를 입력하세요.");
      System.out.print("이름을 입력하세요 : ");
      name = sc.next();
      tel = "";
     
      // 중복되지 않은 전화받호 받기
      System.out.print("전화번호를 입력하세요(xxx-xxxx-xxxx) : ");
      temp = sc.next();
      for (int i=0 ; i<mData.size() ; i++)
      {
         if (temp.equals(mData.get(i).getTel()))
         {
            System.out.println("중복된 전화번호입니다.");
            System.out.print("전화번호를 입력하세요(xxx-xxxx-xxxx) : ");
            temp = sc.next();
         }
         else
            tel = temp;
      }

      // 중복되지 않은 주민등록번호 받고 유효성 검사후 회원가입
      System.out.print("주민등록번호를 입력하세요(xxxxxx-xxxxxxx) : ");
      temp = sc.next();
      for (int i=0 ; i<mData.size() ; i++)
      {
         if (temp.equals(mData.get(i).getId()))
         {
            System.out.println("중복된 주민등록번호입니다.");
            System.out.print("주민등록번호를 입력하세요(xxxxxx-xxxxxxx) : ");
            temp = sc.next();
         }
      }

      int[] chk = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5}; 
      int tot = 0;

      for (int i=0 ; i<13 ; i++) // i → 0 1 2 3 4 5 6 7 8 9 10 11 12
	  {
         if (i==6)
         {
             continue;			
         }
         tot += chk[i] * Integer.parseInt(temp.substring(i,i+1));
	  }
	
	  int su = 11 - tot % 11;
      su = su % 10;		

      // 최종 결과 출력

      if (su == Integer.parseInt(temp.substring(13)))
      {
          id = temp;
          // 가입 적립금 500원 지급
          point = "500";

          // 회원 추가
          mData.add(new MembersVO(name,tel,id,point));

          // 테스트
          //for (int i=0 ; i < mData.size(); i++)
          //  System.out.println(mData.get(i).getName());
         
          System.out.println("===================================");
          System.out.println("     가입해주셔서 감사합니다.");
          System.out.println("가입 적립금 500원이 적립되었습니다.");
          System.out.println("===================================");
          
      }  
      else
      {
          System.out.println("유효하지않은 주민등록번호입니다.");
      }

   }//end signIn()

   // 회원정보조회 메소드 2번
   public void checkMem() throws IOException 
   { 
      sc = new Scanner(System.in);
      System.out.println("\t[회원 정보 조회]");
      System.out.print("주민등록번호를 입력하세요(xxxxxx-xxxxxxx) : ");
      String temp = sc.next();
      String id, name, tel;
      tel = "";
      id = name = tel;

      boolean flag=false;
      int[] chk = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5}; 
      int tot = 0;

      for (int i=0 ; i<13 ; i++) // i → 0 1 2 3 4 5 6 7 8 9 10 11 12
	  {
         if (i==6)
         {
             continue;			
         }
         tot += chk[i] * Integer.parseInt(temp.substring(i,i+1));
	  }
	
	  int su = 11 - tot % 11;
      su = su % 10;		

      if (su == Integer.parseInt(temp.substring(13)))
      {
          id = temp;
      }  
      else
      {  
          System.out.println();
          System.out.println("유효하지않은 주민등록번호입니다.");
      }

      for (int i=0 ; i<mData.size() ; i++)
      {
         if (id.equals(mData.get(i).getId()))
         {
           flag = true;
           name = mData.get(i).getName();
           tel = mData.get(i).getTel();
           break;
         }     
      }

      if (flag)
      {
         System.out.println();
         System.out.println("회원정보가 확인되었습니다.");
         System.out.println();
         System.out.printf(" 이  름  : %4s\n", name);
         System.out.printf("전화번호 : %4s\n", tel);
         System.out.println("");
      }
      
      else
      {
         System.out.println();
         System.out.println("입력하신 주민등록번호는 회원가입 이력이 없습니다.");
      }
   }// checkMem()

}// end class Members


//=============================================○○○○===============================================//


public class movie1
{
   public static void main(String[] args) throws IOException
   {
      // 아직 클래스간 이동 구현 못함
      /*
       // 사용자 메인 메뉴
      do
      {
         User.menuDisp();
         User.menuSelect();
         User.menuRun();
      }
      while (true);
      */
      
      /*
      
      // 관리자 재고 관리 메뉴(음료/팝콘/용지)
      Stocks as = new Stocks();
      while (true)
      {
         as.menuStocks();
         User.menuSelect();
         as.menuRun();
      }
      */

      // 회원 정보 관리 메뉴 
      Members m = new Members();
      // 기존 회원 정보 등록 메소드
      m.oldMem();

      while (true)
      {
         m.mMenuDisp();
         User.menuSelect();
         m.mMenuRun();
      }
      
   }
}