import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;

import java.lang.Thread;
import java.io.IOException;

class Record
{
	static Integer sel;      //-- 메뉴 선택 값을 담는 변수
	static Scanner sc;       //-- Scanner 메모리 할당
	static int snackPayTot, moviePayTot, payCash, payCard, payHap;	//-- 음료/팝콘에서의 총금액, 영화에서의 총금액
	static int rNum;						//-- 예매번호
}

//===============================================================================================================

/*
	Title	 : Admin
	Function : 비밀번호 입력 후 관리자 메뉴를 제공
	author	 : 김서현, 조은선
*/

class AdminVO
{
	private static String notice = "환영합니다. CGV입니다!\n";
	
	public String getNotice()
	{ return notice; }

	public void setNotice(String notice)
	{ this.notice = notice; }

	public void addNotice(String notice)
	{ this.notice += notice; }
}


// 관리자 메뉴 선택값만을 담는 클래스 
class AdminMenu
{
  // 상수화된 변수들(메뉴)
  static final int ADMIN_CASH = 1;		// 시재관리(현금 충전)
  static final int ADMIN_MOVIE = 2;		// 영화 등록
  static final int ADMIN_ADDPAPER = 3;	// 용지 충전
  static final int ADMIN_SELPRICE = 4;	// 판매 관리
  static final int ADMIN_SNACK = 5;		// 음료/팝콘 충전
  static final int ADMIN_NOTICE = 6;	// 공지 변경
  static final int ADMIN_SALES_ON = 7;	// 전원 관리
}

class Admin extends Record
{
	void pw() throws IOException
	{
		System.out.println("\n\n");

		Scanner sc = new Scanner(System.in);
		System.out.print("\t관리자 비밀번호를 입력하세요 : ");
		String pw = sc.next();

		do
		{
			if (pw.equals("1234"))
			{
				System.out.println("\t>> 관리자 로그인되었습니다.");
				break;
			}
			System.out.println("\t>> 잘못된 비밀번호를 입력했습니다. 다시 입력해주세요.");
			System.out.print("\t관리자 비밀번호를 입력하세요 : ");
			pw = sc.next();
		}
		while (true);

		do
		{
			AdminMenuDisp();
			menuSelect();
			AdminMenuRun();
		}
		while (true);	
	}

	// 관리자 메뉴 출력 메소드
	public static void AdminMenuDisp()
	{
        
		System.out.println("\n\n\t[ 관리자 메뉴 ]");
		System.out.println("\t====================================");
		System.out.println("\t1. 시재 관리");
		System.out.println("\t2. 영화 관리");
		System.out.println("\t3. 용지 관리");
		System.out.println("\t4. 판매 금액 정산");
		System.out.println("\t5. 스낵 관리");
		System.out.println("\t6. 공지 관리");
		System.out.println("\t7. 판매 시작/종료\n");

		System.out.print("\t>> 메뉴 선택(1~6) : ");
	}

	// 메뉴 선택 메소드
	public static void menuSelect()
	{
		Scanner sc = new Scanner(System.in);
		sel = sc.nextInt();
	}

	public static void AdminMenuRun() throws IOException
    {
		AdminCash ac = new AdminCash();

        switch (sel)
        {
        /*
			case 2 : break;
			case 3 : break;
			case 4 : break;
			case 5 : break;
		*/
		case 1 : ac.menuCash(); break;
        case 6 : editNotice(); break;
        case 7 : adminSalesON(); break;
	    default: System.out.println("\t잘못된 메뉴를 입력했습니다. 다시 입력해주세요.");      
        }
    }


	// 공지 편집 메소드
	public static void editNotice() throws IOException
    {
		Scanner sc = new Scanner(System.in);
		AdminVO ad = new AdminVO();

		char answer;

		System.out.println("\n\n\t[ 공지 변경 ]");
		System.out.println("\t====================================");
		System.out.println("\t***현재 공지***");
		System.out.print("\t" + ad.getNotice());

		System.out.print("\n\t변경하시겠습니까? (Y/N) : ");
		answer = (char)System.in.read();
		System.in.skip(2);
		
		if (answer=='Y' || answer=='y')
		{
			System.out.print("\t>> 변경할 공지를 입력해주세요\n\t : ");
			String edit = sc.nextLine();
			ad.setNotice(edit);
			System.out.println("\t====================================");
	    	System.out.println("\n\n\t[ 변경된 공지 ]");
			System.out.println("\t====================================");
			System.out.println("\t" + ad.getNotice());
		}
	}

	// 판매 시작 메소드 (판매시작 / 전원 OFF)
	public static void adminSalesON()
    {
		Scanner sc = new Scanner(System.in);

		int sel, n=0;  //-- 메뉴 선택을 담을 변수, do-while문을 다시 실행하면 출력구문 실행을 위한 변수 

		do
		{
			if (n>0)
				System.out.println("\t유효하지 않은 메뉴입니다. 다시 선택해주세요.");

			System.out.println("\n\n");
			System.out.println("\t전원 관리             0. 관리자 메뉴");
			System.out.println("\t====================================");
			System.out.println("\t1. 판매 시작");
			System.out.println("\t2. 종료");
			System.out.println();
			System.out.print("\t>> 메뉴 선택(1, 2) : ");
			sel = sc.nextInt();

			n++;
		}
		while (sel != 0 && sel!=1 && sel!=2);	// 0, 1, 2가 아니라면 다시 받아라 
		

		// 전원 ON
		if (sel == 1)
			System.out.println("\t사용자 메뉴 호출");
		// 전원 OFF
		else if (sel == 2)		
			System.exit(0);

		// sel == 0 일 시 전원관리 메소드 종료...
	}
}

//===============================================================================================================

//--------★스낵 추가 결제 확인용으로 가져옴★-------------------------------------------------------------------

//음료/팝콘 구매 클래스
class BuySnacksVO extends Record
{
	//음료/팝콘 재고
	static private int coke=300, cida=300, popcorn=300;
	
	//getter & setter 구성
	public int getCoke()
	{ return coke;}

	public void setCoke(int coke)  
	{ this.coke += coke; }
	
	public int getCida()
	{ return cida;}

	public void setCida(int cida)  
	{ this.cida += cida; }

	public int getPopcorn()
	{ return popcorn;}

	public void setPopcorn(int popcorn)  
	{ this.popcorn += popcorn; }
}

class BuySnacks extends Record
{	
	static String[] str = new String[3];
	static char answer;
	static String temp;
	static int sPayCash, sPayCard;

	// 음료/팝콘 메뉴 출력 및 입력
	public static void snackMenu() throws InterruptedException, IOException
	{
		BuySnacksVO bst = new BuySnacksVO();

		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("\n\n");
			System.out.println("\t메뉴판                   0. 초기화면");
			System.out.println("\t====================================");
			System.out.println("\t1. 콜라(2,000원)");
			System.out.println("\t2. 사이다(2,000원)");
			System.out.println("\t3. 팝콘(3,000원)");
			System.out.println();
			System.out.print("\t>> 각각 구매할 수량을 순서대로 입력해주세요(콤마 구분) : ");

			temp = sc.next();
			str = temp.split(",");	// 구분자 → 콤마

			int su[] = {bst.getCoke(), bst.getCida(), bst.getPopcorn()};
			String snacksName[] = {"콜라", "사이다", "팝콘"};

			for (int i=0; i<3; i++)
			{	
				if (Integer.parseInt(str[i])>su[i])
				System.out.printf("\n\t※ 현재 『%s』의 최대가능 구매수량은 『%d』입니다.\n\t   추가구매를 원하시면 관리자를 불러주세요.\n", snacksName[i], su[i]);
			}
		}
		while (Integer.parseInt(str[0])>bst.getCoke() || Integer.parseInt(str[1])>bst.getCida() || Integer.parseInt(str[2])>bst.getPopcorn());
		
		snackCheck();
	}
		
	// 음료/팝콘 구매 확인 
	public static void snackCheck() throws InterruptedException, IOException
	{	
		System.out.println("\n\t===================================================");
		System.out.printf("\n\t콜라 %d개, 사이다 %d개, 팝콘 %d개를 선택하셨습니다.\n", Integer.parseInt(str[0]), Integer.parseInt(str[1]), Integer.parseInt(str[2]));

		System.out.print("\t수량을 변경하시겠습니까?(Y/N) : ");
		answer = (char)System.in.read();
		System.in.skip(2);
	
		snackPayTot = 2000*(Integer.parseInt(str[0]) + Integer.parseInt(str[1])) + 3000*Integer.parseInt(str[2]);
	
		//Pay p = new Pay(Integer.parseInt(str[0]), Integer.parseInt(str[1]), Integer.parseInt(str[2])); -- 생성자 만들 시 사용
		Pay p = new Pay();

		if (answer == 'y' || answer == 'Y')
				snackMenu();

		if (answer == 'n' || answer == 'N')
		{
			System.out.printf("\n\t총 결제 금액은 %d입니다.", snackPayTot);
			System.out.println("\n\t===================================================");
			//결제호출	
			p.selPay();	// 결제클래스에서 생성자 만들어준거 확인하기
		}
	}
}

//--------★스낵 추가 결제 확인용으로 가져옴★-------------------------------------------------------------------

//===============================================================================================================

/*
	Title	 : AdminCash
	Function : 현금 초기 세팅, 판매 금액 정산
	author	 : 김서현, 소서현
*/

class AdminCashVO
{
   // 시재 변수
   static private int cardMovie, cardSnacks, cashMovie, cashSnacks;

   // 변수 추가 ★
   static private int omanwon, manwon, ocheonwon, cheonwon;

   AdminCashVO() {}
   
   // getter,setter 생성
   //static private int cardMovie, cardSnacks, cashMovie, cashSnacks;
   public int getCardMovie()
   { return cardMovie;}

   public void setCardMovie(int cardMovie)  
   { this.cardMovie += cardMovie; }

   public int getCardSnacks()
   { return cardSnacks;}

   public void setCardSnacks(int cardSnacks)  
   { this.cardSnacks += cardSnacks; }

   public int getCashMovie()
   { return cashMovie;}

   public void setCashMovie(int cashMovie)  
   { this.cashMovie += cashMovie; }

   public int getCashSnacks()
   { return cashSnacks;}

   public void setCashSnacks(int cashSnacks)  
   { this.cashSnacks += cashSnacks; }

   //static private int omanwon, manwon, ocheonwon, cheonwon;
   public int getOmanwon()
   { return omanwon;}

   public void setOmanwon(int omanwon)  
   { this.omanwon += omanwon; }

   public int getManwon()
   { return manwon;}

   public void setManwon(int manwon)  
   { this.manwon += manwon; }

   public int getOcheonwon()
   { return ocheonwon;}

   public void setOcheonwon(int ocheonwon)  
   { this.ocheonwon += ocheonwon; }

   public int getCheonwon()
   { return cheonwon;}

   public void setCheonwon(int cheonwon)  
   { this.cheonwon += cheonwon; }

}

class AdminCash extends Record
{
	AdminCashVO ac = new AdminCashVO();
	boolean flag;
	
	// 메뉴 선택
	public void menuCash() 
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		do
		{	
			System.out.println("\n1. 시재 세팅하기");
			System.out.println("2. 금액 정산하기\n");
			System.out.print("번호를 선택하세요 : ");
			choice = sc.nextInt();
		}
		while (choice>2 || choice<1);
		
		if (choice == 1)
			setCash();

		if (choice == 2)
			calCash();
	}
	
	// 시재 세팅 및 충전
	public void setCash()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\n10000원권의 장수 : ");
		int a = sc.nextInt();
		ac.setManwon(a);

		System.out.print("5000원권의 장수  : ");
		int b = sc.nextInt();
		ac.setOcheonwon(b);

		System.out.print("1000원권의 장수  : ");
		int c = sc.nextInt();
		ac.setCheonwon(c);

		
		// 금액 입력받아서 기존 0원에서 더해가지고 세팅
		// 장수 입력받으면 금액으로 변환

		// 시재 출력
		System.out.printf("\n현재 50000원권 %d장, 10000원권 %d장, 5000원권 %d장, 1000원권 %d장 남아있습니다.\n", 
							ac.getOmanwon(), ac.getManwon(), ac.getOcheonwon(), ac.getCheonwon());

		payHap = (ac.getOmanwon())*50000 + (ac.getManwon())*10000 + (ac.getOcheonwon())*5000 + (ac.getCheonwon())*1000;
		//System.out.print("payHap : " + payHap);

		menuCash();
	}
	
	// 정산 출력
	public void calCash()
	{	
		System.out.println("\n\n\t\t\t     [ 정산 결과 ] "); 
		System.out.println("\t ┌─────────────────────────────────────────────────┐");
		System.out.println("\t │     │     영화     │     간식     │     합계    │");
		System.out.println("\t │─────────────────────────────────────────────────│");
		System.out.printf("\t │ 현금│%10d    │%10d    │%10d   │\n", ac.getCashMovie(), ac.getCashSnacks(), ac.getCashMovie()+ac.getCashSnacks());
		System.out.println("\t │─────────────────────────────────────────────────│"); 
		System.out.printf("\t │ 카드│%10d    │%10d    │%10d   │\n", ac.getCardMovie(), ac.getCardSnacks(), ac.getCardMovie()+ac.getCardSnacks());
		System.out.println("\t │─────────────────────────────────────────────────│"); 
		System.out.printf("\t │ 합계│%10d    │%10d    │%10d   │\n", ac.getCashMovie()+ac.getCardMovie(), ac.getCashSnacks()+ac.getCardSnacks(), ac.getCashMovie()+ac.getCardMovie()+ac.getCashSnacks()+ac.getCardSnacks());
		System.out.println("\t └─────────────────────────────────────────────────┘");
		System.out.println();

		menuCash();
	}
}

//===============================================================================================================

//--------★회원관리 확인용으로 가져옴★-------------------------------------------------------------------------

class MembersVO
{
   // 이름, 핸드폰번호, 아이디, 포인트
   private String name; 
   private String tel;
   private String id;
   private String point;

	// 리스트 받아오는 테스트
   private ArrayList<MembersVO> mData;

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


	// 리스트 받아오는 테스트
	
	public void setMemList(ArrayList<MembersVO> mData)
	{
        this.mData = mData;
    }

    public ArrayList<MembersVO> getMemList()
	{
	   return this.mData;
    }

	public void printList()
	{
		
	   System.out.println("회원수 : " + this.mData.size());
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

// ● 회원 관리 클래스 
class Members extends Record // 조은선, 김아별
{
   // ● MemebersVO 기반으로 생성된 객체만 data LinkedList에 담을 수있다.
   ArrayList<MembersVO> mData = new ArrayList<MembersVO>();
   MembersVO mb = new MembersVO();

   // 회원관리 메뉴 
   public void mMenuDisp()
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

	  mb.setMemList(mData);
   }//end oldMem()

   // 회원정보조회 메소드 2번
   public void recogMem() throws IOException 
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
   }// recogMem()

}

//--------★회원관리 확인용으로 가져옴★-------------------------------------------------------------------------

//================================================================================================================

/*
	Title	 : Pay
	Function : 티켓 가격 및 할인 적용, 결제수단 입력 및 결제 결과 출력, 로딩 및 광고 출력, 영화표/교환권/영수증 출력  
	author	 : 김서현, 심혜진
*/

// 회원/비회원 확인 및 할인 적용, 적립금 사용
class PayDisc extends Record
{
	//MembersVO mb = new MembersVO();		// 회원 인스턴스 생성

	// 회원 확인
	void checkMem()
	{
		do
		{
			Scanner sc = new Scanner(System.in);

			System.out.print("\n\t=================================");
			System.out.print("\n\t1.회원 / 2.비회원");
			System.out.print("\n\t=================================");
			System.out.print("\n\t해당하는 번호를 입력해주세요 : ");
			sel = sc.nextInt();

			if (sel>0)
			{
				if (sel==1 || sel==2)
					break;
				System.out.println(">> 잘못된 번호를 입력했습니다. 다시 입력해주세요.\n");
			}
		}
		while (sel<1 || sel>2);

		if (sel==1)
		{
			System.out.println("\n\n\t[ 회원 정보 확인 ]");
			System.out.println("\t====================================");
			System.out.println("\t전화 번호를 입력해주세요.(xxx-xxxx-xxxx)\n\t:");
			System.out.println(m.getMemList().isEmpty());
			
			
		}
		else if(sel==2)
			System.out.print("\t비회원");
	}

	void checkTel()
	{
	}

}

// 할인 적용된 금액 + 스낵 추가구매 확인 및 최종금액 결제 클래스
class Pay extends Record
{
	AdminCashVO ac = new AdminCashVO(); // 결제 관련 VO 인스턴스 생성
	
	int moviePayTot = 20000;
	int payTot = moviePayTot + snackPayTot;
	int a, b, c, d, inputTot, chaCash; // 지폐를 입력받아 시재에 반영하기 위한 a,b,c,d 변수
								  // 입력한 값 총합, 거스름돈(changeCash)

	public static boolean flag = false;

	// 스낵 추가 구매 확인 및 결제
	void selSnack() throws InterruptedException,IOException
	{
		BuySnacks bst = new BuySnacks(); // 스낵 관련 VO 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		char answer;

		System.out.print("\n>> 팝콘/음료 추가 구매 하시겠습니까?(Y/N) : ");
		answer = (char)System.in.read();
		
		if (answer=='Y' || answer=='y')
		{
			bst.snackMenu();
		}
		else
			selPay();
	}

	// 결제 수단 선택 메소드
	void selPay() throws InterruptedException,IOException
	{
		System.out.print("\n\t=================================");
		System.out.printf("\n\t최종 결제 금액은 %d입니다.", payTot);
		System.out.print("\n\t=================================");
		do
		{
			Scanner sc = new Scanner(System.in);

			System.out.println("\n\t1. 현금");
			System.out.println("\t2. 카드");
			System.out.print("\t결제 방법을 입력해주세요 : ");

			sel = sc.nextInt();

			if (sel>0)
			{
				if (sel==1 || sel==2)
					break;
				System.out.println("\t>> 잘못된 번호를 입력했습니다. 다시 입력해주세요.\n");
			}
		}
		while (sel<1 || sel>2);

		if (sel==1)
			payCash();
		else if(sel==2)
			payCard();

	} // end selPay() 결제 수단 선택 메소드

	// 현금 결제
	void payCash() throws InterruptedException,IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\t결제할 금액을 지폐별로 입력해주세요.");

		do
		{
			flag = false;
			System.out.print("\n\t50000원권 : ");
			a = sc.nextInt();
			System.out.print("\t10000원권 : ");
			b = sc.nextInt();
			System.out.print("\t5000원권  : ");
			c = sc.nextInt();
			System.out.print("\t1000원권  : ");
			d = sc.nextInt();

			inputTot = 50000*a + 10000*b + 5000*c + 1000*d;

			System.out.printf("\n\t50000원권 %d장, 10000원권 %d장, 5000원권 %d장, 1000원권 %d장 \n\t총 [%d원] 투입했습니다.\n", a, b, c, d, inputTot);

			if (payTot>inputTot)
			{
				flag = true;
				System.out.printf("\n\t[총 결제 금액(%d)]보다 [%d원]적게 투입했습니다. 다시 입력해주세요.\n", payTot, payTot-inputTot);
			}
		}
		while (flag);

		if (payTot<inputTot) // 총 금액보다 많이 투입했을 때 → 거스름돈
		{
			//----------------- 시재에 입력받은 값 반영
			ac.setOmanwon(a);
			ac.setManwon(b);
			ac.setOcheonwon(c);
			ac.setCheonwon(d);

			//----------------- 거스름돈 계산
			chaCash = inputTot-payTot;

			int oman = chaCash / 50000;
			int man = chaCash % 50000 / 10000;
			int ocheon = chaCash % 50000 % 10000 / 5000;
			int cheon = chaCash % 50000 % 10000 % 5000 / 1000;

			if (chaCash>payHap) // 거스름돈이 현재 돈통에 있는 금액보다 많을 때(=거슬러줄 수 없음)
			{
				AdminVO ad = new AdminVO(); // 공지에 추가하기 위한 AdminVO 인스턴스 생성
				String add = "\n\t※현재 기계 현금 부족으로 현금 결제를 진행할 수 없습니다. 카드 결제만 가능합니다※\n";
				ad.addNotice(add);


				System.out.print("\n\t죄송합니다. 현재 기계에 현금 부족으로 잔돈 반환이 불가하여 결제를 진행할 수 없습니다.");
				System.out.print("\n\t==========================================");
				System.out.print("\n\t1.카드로 결제하기 | 2. 예매 진행하지 않기");
				System.out.print("\n\t==========================================");
				System.out.print("\n\t>> 다른 방법을 입력해주세요 : ");
				sel = sc.nextInt();

				if (sel==1)
					payCard();
				else if (sel==2)
					System.out.print("\n\t사용자 메뉴 호출");
				else
					System.out.println("\t>> 잘못된 번호를 입력했습니다. 다시 입력해주세요.\n");
			}
			else
			{
				System.out.printf("\n\t자판기 하단에 거스름돈 [50000원권 %d장, 10000원권 %d장, 5000원권 %d장, 1000원권 %d장]", oman, man, ocheon, cheon);
				System.out.printf("\n\t총 [%d원] 받아가세요.",chaCash);
			}

			//----------------- 돌려준 거스름돈 시재에 반영(빼기)
			ac.setOmanwon(-(oman));
			ac.setManwon(-(man));
			ac.setOcheonwon(-(ocheon));
			ac.setCheonwon(-(cheon));
			ac.setCashMovie(moviePayTot);
			ac.setCashSnacks(snackPayTot);
		}
		else if (payTot==inputTot)
		{
			ac.setOmanwon(a);
			ac.setManwon(b);
			ac.setOcheonwon(c);
			ac.setCheonwon(d);
			ac.setCashMovie(moviePayTot);
			ac.setCashSnacks(snackPayTot);

			System.out.printf("\n%d원 결제 완.\n", inputTot);
		}
		
	}// end payCash() 현금 결제 메소드
	
	// 카드 결제
	void payCard() throws InterruptedException,IOException
	{
		System.out.print("\n\t단말기에 카드를 삽입해주세요.\n\t");

        for (int i = 0; i<3; i++) 
		{
            System.out.print("..");
            Thread.sleep(2000);
        }
        System.out.print("결제가 진행중이오니 카드를 제거하지마세요...\n\t");

		for (int i = 0; i<2; i++) 
		{
            System.out.print(".");
            Thread.sleep(2000);
        }
		System.out.println("\n\n\t결제가 완료됐습니다!\n\t카드를 제거해주세요.\n");
		ac.setCardMovie(moviePayTot);
		ac.setCardSnacks(snackPayTot);

		//printAd();
	} // end payCard() 카드 결제

	// 광고 및 출력 여부 확인
	void printAd() throws InterruptedException
	{
		System.out.println("\n\n====================================");
		System.out.print("영화 티켓 출력중입니다");
		for (int i = 0; i<3; i++) 
		{
            System.out.print(".");
            Thread.sleep(2000);
        }
		System.out.println("\n====================================");
		System.out.print("|영화 티켓 출력|");
		System.out.println("\n\n영수증을 출력하시겠습니까?(Y/N) : ");
		// 매점 구매했을 때 교환권도 추가해야 함.
		
	}
}

//==================================================================================================================


public class PayTest
{
	public static void main(String[] args) throws InterruptedException,IOException
	{	
		//Pay p = new Pay();
		PayDisc pd = new PayDisc();
		//AdminCash s = new AdminCash();

		// --- 아별 작성 ---- //
        Members m = new Members();
		
		//p.selSnack();
		pd.checkMem();
		//s.menuCash();

		Admin ob = new Admin();
		ob.pw();



	}
}