
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

// 회원 관리 클래스 
class Members extends Record // 조은선, 김아별
{
   //  MemebersVO 기반으로 생성된 객체만 data에 담을 수있다.
   ArrayList<MembersVO> mData = new ArrayList<MembersVO>();

   // 회원관리 메뉴 
   public static void mMenuDisp()
   {
      System.out.println("\n\n");
      System.out.println("\t=========메뉴  선택=========");
      System.out.println("\t    1.  회원      가입     ");
      System.out.println("\t    2.  회원 정보 확인   ");
      System.out.println("\t    3.    메인 메뉴   ");
      System.out.println("\t===========================");
      System.out.print("\t>> 메뉴 선택(1~3) : "); 
   }// end memMenuDisp()

   // 선택된 메뉴 실행에 따른 기능 호출 메소드
   public void mMenuRun() throws IOException
   { 
      /*
      switch (sel)
      {
      //회원 가입 메소드 1번
      case memMenuSel.SIGN_IN : signIn(); break;
      // 회원정보 확인 메소드 2번
      //case memMenuSel.CONFIRM_MEMBER :  break;

      // 메인메뉴 메소드 3번
      case memMenuSel.MAIN_MENU :  break;
      
      default: System.out.println("1~3번을 선택해주세요."); break;
      }
      */
      
   }// end memMenuRun()


   // 기존 회원 정보 추가 메소드 -- 완성
   public void oldMem()
   {
      //성인 회원
      mData.add(new MembersVO("김아별","010-1111-1111","760411-2575452","2500"));
      mData.add(new MembersVO("김서현","010-2222-2222","651126-2127984","5000"));
      mData.add(new MembersVO("조은선","010-3333-3333","610125-2066131","10000"));
      mData.add(new MembersVO("심혜진","010-4455-5566","641014-2211410","500"));
      //청소년 회원
      mData.add(new MembersVO("청소년","010-2222-2222","071022-1639841","2000"));
      mData.add(new MembersVO("소서현","010-2121-1212","080118-2250820","6000"));
   
      // 회원수 테스트
      //System.out.println("회원수 : " + mData.size());
      //--==>> 회원수 : 6
     
      // 회원들 이름출력 → get() 사용
      for (int i=0 ; i < mData.size(); i++)
      {
         System.out.println(mData.get(i).getName());
      }
      
      
      
   }//end oldMem()
   
   // 회원 가입 메소드
   
   public void signIn() throws IOException
   { 
      /*
      sc = new Scanner(System.in);
      String name, tel, id, point;
      System.out.println();
      System.out.println("회원가입 메뉴에 들어오셨습니다.");
      System.out.println("하단의 정보를 입력하세요.");
      System.out.print("이름을 입력하세요 : ");
      name = sc.next();
      System.out.print("전화번호를 입력하세요(010-xxxx-xxxx) : ");
      tel = sc.next();
      System.out.print("주민등록번호를 입력하세요(xxxxxx-xxxxxxx): ");
      
      String temp = sc.next();

      int[] chk = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5}; 
      int tot = 0;

      if (temp.length() == 14)
      {
         id = temp;
      }
      else
      {
         System.out.println(">> 주민등록번호 입력오류입니다.");
         //signIn();
      }
      
      
      /*
      for (int j=0 ; j<13 ; j++) // i → 0 1 2 3 4 5 6 7 8 9 10 11 12
      {
         if (j==6)
             continue;

         tot += chk[j] * Integer.parseInt(str.substring(j,j+1)); // 뒷부분
         int su = 11 - tot % 11;
         su = su % 10;

         if (su == Integer.parseInt(str.substring(13)))
         {
          System.out.println(">> 유효한 주민번호입니다");
          info[2] = str;
         }
 
         else
          System.out.println(">> 주민등록번호가 유효하지 않습니다.");
      }
      continue;
      
      info[i] = sc.next().trim();
   

      info[3] = "500";
      System.out.println("가입해주셔서 감사합니다. 축하 적립금 500원이 적립되었습니다.");
   

      /*
      청소년 주민번호
      071022-1639841
      080118-2250820

       성인 주민번호
      760411-2575452
      651126-2127984
      761128-2376461
      610125-2066131
      641014-2211410
      */  

   }//end signIn()
   
   
   // 문자열 배열 생성
   
    /*
	-회원/비회원 확인 및 검사
	-가입시 정보 입력
	-휴대폰번호/주민번호 중복 및 유효성 검사
	-적립금 확인 
    */
}

class User extends Record
{
   public static void menuSelect()
   {
      sel = sc.nextInt();
   }// end menuSelect()
}//end class Members


////////////////////////////////////////////////////////////////////////////////
public class Movie2
{
   public static void main(String[] args) throws IOException
   {
      Members m = new Members();

      // ● 기존 회원 정보 등록 메소드
      m.oldMem();

      /*
      while (true)
      {
         m.mMenuDisp();
         User.menuSelect();
         m.mMenuRun();
      }
      */
   }
}