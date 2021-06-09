import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;
import java.lang.Thread;
import java.util.Hashtable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
	Title	 : User
	Function : 
	author	 : 김아별, 소서현
*/

//-------------------------[ User 클래스 ]-------------------------

// 유저 메뉴 선택값만 담는 클래스
class UserMenus
{
	// 상수화된 변수들(메뉴)
	public static final int RESERVE_TICKETS = 1;	//-- 영화예매
	public static final int CONFIRM_TICKETS = 2;	//-- 예매확인
	public static final int BUY_SNACKS = 3;			//-- 음료/간식 구매
	public static final int SIGN_IN = 4;			//-- 회원가입				
	static final int ADMIN = 1004;					//-- 관리자 히든	
}

class Usersh extends Record													
{
	// 관리자 공지메소드 수행 
	//Admin.notice();
	
	// 메뉴 출력 메소드 
	public static void menuDisp() throws InterruptedException, IOException
	{
      System.out.println("\n\n");
      System.out.println("\t   ┌───메뉴  선택───┐");
      System.out.println("\t1. │   영화 예매    │");
      System.out.println("\t2. │     예매 확인  │");
      System.out.println("\t3. │ 음료/팝콘 구매 │");
      System.out.println("\t4. │    회원 가입   │ ");
      System.out.println("\t   └────────────────┘");
      // 관리자메뉴는 1004번(히든)

	}// end menuDisp()

	// 메뉴 선택 메소드
	public static void menuSelect() throws InterruptedException, IOException
	{
		// 주요 변수 선언 및 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		
		do
		{	
			System.out.print("\t>> 메뉴 선택(1~4) : "); 
			sel = sc.nextInt();
			
			if (sel==1004)
				Admin.pw();													

			if (sel>0)
			{
				if (sel==1 || sel==2 || sel==3 || sel==4)
					break;
				System.out.println("\t>> 잘못된 번호를 입력했습니다. 다시 입력해주세요.\n");
			}
		}
		while (sel<UserMenus.RESERVE_TICKETS || sel>UserMenus.SIGN_IN);	
	}

	// 예매 확인/영화 예매/음료,팝콘 구매/회원 가입/관리자모드로 이동(switch)
	public static void menuRun() throws InterruptedException, IOException
	{
		switch(sel)
		{
			//case UserMenus.RESERVE_TICKETS : ReserveTickets.메소드(); break;
			case UserMenus.CONFIRM_TICKETS : ConfirmReservation.conNum(); break;
			case UserMenus.BUY_SNACKS : BuySnacks.snackMenuDisp(); break;
			case UserMenus.SIGN_IN : Members.mMenuDisp(); break;
			case UserMenus.ADMIN : Admin.pw(); break;				
		}
	}// end menuRun()
}