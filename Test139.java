/*=============================================
     ■■■ 자바의 주요(중요) 클래스 ■■■
	 - Calendar 클래스 
=============================================*/

// ○ 실습 문제
//    오늘을 기준으로...
//    입력받는 날짜만큼 후의 연, 월, 일, 요일을 확인하여
//    결과를 출력하는 프로그램을 구현한다.
//    단, Calendar 클래스를 활용하여 처리한다.

// 실행 예)
// 오늘 날짜 : 2021-3-8 월요일
// 몇 일 후의 날짜를 확인하고자 하십니까? : 200

// =========[확인결과]==========
// 200일 후 : 2021년-xx-xx x요일 
// =============================

// ※ 특정 날짜를 기준으로 날 수를 더하는 연산 메소드
//   『날짜객체.add(Calendar.DATE, 날 수)』

import java.util.Calendar;
import java.util.Scanner;

public class Test139 
{
	public static void main(String[] args)
	{
		/*
		// Calendar 클래스 생성
		Calendar cal = Calendar.getInstance();
		// 내가 이해한바로는 Calendar.getInstance()하면 
		// GregorianCalendar로 인스턴스 생성하여 Calendar로 업캐스팅하는 거같다.
		// 그래서 add() 메소드를 사용할수 있는듯!

		// 주요 변수 선언 
		int y, m, d, w;
		// 테스트
		System.out.println("연도 : " + cal.get(Calendar.YEAR));

		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MONTH)+1;
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK); // 1 → 일요일
		
		String day = "";
		
		switch (w)
		{
			case 1: {day = "일요일"; break;}
			case 2: {day = "월요일"; break;}
			case 3: {day = "화요일"; break;}
			case 4: {day = "수요일"; break;}
			case 5: {day = "목요일"; break;}
			case 6: {day = "금요일"; break;}
			case 7: {day = "토요일"; break;}
		}

		System.out.printf("오늘 날짜 : %4d-%d-%d %3s\n", y, m, d, day);

		// Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		System.out.print("몇 일 후의 날짜를 확인하고자 하십니까 ? : ");
		int afterday = sc.nextInt();
		
		// add() 메소드로 세팅된 날짜로 변경
		cal.add(Calendar.DATE, afterday);

		// 각 변수에 변경된 날짜의 값 담기
		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MONTH)+1;
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK); // 1 → 일요일

		switch (w)
		{
			case 1: {day = "일요일"; break;}
			case 2: {day = "월요일"; break;}
			case 3: {day = "화요일"; break;}
			case 4: {day = "수요일"; break;}
			case 5: {day = "목요일"; break;}
			case 6: {day = "금요일"; break;}
			case 7: {day = "토요일"; break;}
		}
		
		System.out.printf("\n=========[확인결과]==========\n");
		System.out.printf(" %d일 후 : %4d-%d-%d %3s\n", afterday, y, m, d, day);
		System.out.println("=============================");
		*/

		// [선생님 풀이]

		// Scanner 클래스 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		// Calendar 클래스 인스턴스 생성

		Calendar now = Calendar.getInstance();

		// 주요 변수 선언
		int nalsu;		//-- 사용자로부터 입력받은 날 수
		int y, m, d, w;	//-- 연, 월, 일, 요일
		String[] week = {"일", "월", "화", "수", "목", "금", "토"};

		// 현재의 연, 월, 일 요일 확인(가져오기 : get())
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH)+1;   //check~!!
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);
		
		// 현재의 연, 월, 일, 요일 확인결과 출력
		//System.out.println("오늘 날짜 : " + y + "-" + m + "-" + d + " "
		//					+ week[w-1] + "요일");
		//--==>> 오늘 날짜 : 2021-3-8 월요일
		System.out.printf("오늘 날짜 : %tF %tA\n", now, now);
		//--==>> 오늘 날짜 : 2021-03-08 월요일
		
		do
		{
			System.out.print("몇 일 후의 날짜를 확인하고자 하십니까? : ");
			nalsu = sc.nextInt();
		}
		while (nalsu<0);

		// 날 수 더하기 연산
		now.add(Calendar.DATE, nalsu);

		// 결과 출력
		System.out.println();
		System.out.println("=========[확인결과]==========");
		System.out.printf("%d일 후 : %tF %tA\n", nalsu, now, now);
		System.out.println("=============================");
		
	}
}

/* [실행 결과]
오늘 날짜 : 2021-03-08 월요일
몇 일 후의 날짜를 확인하고자 하십니까? : 200

=========[확인결과]==========
200일 후 : 2021-09-24 금요일
=============================
계속하려면 아무 키나 누르십시오 . . .

*/