/*===================================
   ■■■ 클래스와 인스턴스 ■■■
   - 클래스 설계
   - 배열 활용
===================================*/

// ○ 실습 문제
// 아래의 클래스(WeekDay)를 완성한다.
// 사용자로부터 년, 월, 일을 입력받아
// 해당 날짜의 요일을 출력하는 프로그램을 구현한다.
// 단, 달력 클래스(calender)는 사용하지 않는다.
// 또한, 클래스의 개념을 활용하여 작성할 수 있도록 한다.
// 그리고, 배열의 개념도 적용시켜 작성할 수 있도록 한다.

// 실행 예)
// 년 월 일 입력(공백 구분) : 1997 10 6 

// 1997년 10월 6일 → 월요일
// 계속하려면 아무 키나...

// ※ 문제 인식 및 분석
//	  - 윤년 및 평년의 개념 적용 (윤년: 4의배수이면서 100의 배수가 아닌해 || 400의 배수인 해)
//	  - 1년 1월 1일 → 월요일 

import java.util.Scanner;

class WeekDay
{
	/*
	// 주요 변수 선언(속성 구성);
	private int y, m, d;
	private int sumMonth = 0;
	private int sumYear = 0;
	String[] day = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
	//배열 생성하는 법 잘 익히기

	// 메소드 정의(입력받기)

	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("년 월 일 입력(공백 구분) : ");
		y = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();
		
		for (int i=1; i<y; i++)
		{
			if ((i%4==0 && i%100!=0) || i%400==0)
				sumYear += 366;
			else 
				sumYear += 365;
		}
		//System.out.println("누적연도 : " + sumYear);

	}//end input()



	// 메소드 정의(요일 산출하기)

	String week()
	{
		// 월 누적합 구하기
		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		
		for (int i=1; i<m; i++)
		{
			if ((y%4==0 && y%100!=0) || y%400==0)		// 윤년 (366일)
			{
			// 1-31 2-29 3-31 4-30 5-31 6-30 7-31 8-31 9-30 10-31 11-30 12-31
				month[2] = 29;
				sumMonth += month[i];
			}

			else										// 평년
			{
				month[2] = 28;
				sumMonth += month[i];
				
			}//end else

		}//end for문
		
		int tot=0;
		tot = sumYear + sumMonth + d;

		//       0  + 0 + 1 -> 1년 1월 1일보고 맞추기
		if (tot%7==0)
		{
			return day[6];
		}
		else 
			return day[tot%7-1];
	}

	// 메소드 정의(결과 출력하기)
	void print(String day)
	{
		System.out.printf("%d년 %d월 %d일 → %s\n", y, m, d, day);	
	}

	*/

	// 같이 푼 내용

	// 주요 변수 선언(속성 구성);
	private int y, m, d;		//--사용자가 입력한 연, 월, 일 

	// 메소드 정의(입력 받기)
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("년 월 일 입력(공백 구분) : ");
		y = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();
	}

	// 메소드 정의(요일 산출하기)
	// void week()
	String week()
	{
		// 각 월의 마지막 날짜(각 월의 최대값)을 배열 형태로 구성
		int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		// 요일명에 대한 배열 구성
		String[] weekNames = {"일", "월", "화", "수", "목", "금", "토"};

		// 날 수를 종합할 변수, 루프 변수, 요일 변수
		int nalsu, i, w;

		// 윤년에 따른 2월의 날 수 계산
		// 윤년이라면... 2월의 마지막 날짜를 29일로 설정 → months[1] = 29;
		// 평년이라면... 2월의 마지막 날짜를 28일로 설정 → months[1] = 28;
		if (y%4==0 && y%100!=0 || y%400==0)		//-- 입력한 연도가 윤년이라면...
		{
			// 2월의 마지막 날짜를 29일로 설정
			months[1] = 29;
		}
		else										//-- 입력한 연도가 평년이라면...
		{
			months[1] = 28;
		}

		// ① 1년 1월 1일 부터 입력받은 년도의 ^이전 년도^ 12월 31일 까지의 날 수 계산
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;

		// ② 해당 년도의 1월 1일 부터 입력받은 월의 이전 월까지의 
		//	  날 수 계산 후 1번 결과에 더하는 연산

		for (i=0; i<(m-1); i++)		// m-1 체크 (1월이면 pass!) 배열을 바꾸는것보다 조건문을 고치는게 깔끔
		{
			nalsu += months[i];
		}
		//테스트
		//System.out.println(nalsu); <- void로 바꾸고 테스트 해야함
		//--==>> 729297
		// 1. 1. 1 ~ 1997. 9. 30

		// ③ 입력받은 일의 날짜만큼 날 수 계산 후 
		//	  2번 결과에 더하는 연산
		nalsu += d;		//-- 날 수를 d 만큼 증가시켜라!
		
		//------------------------------------------------------- 여기까지 수행하면 날수 연산 끝~!!!

		// 무슨 요일인지 확인하기 위한 연산

		w = nalsu % 7;		// 전체날수 % 7 = 0 → 일요일
							// 전체날수 % 7 = 1 → 월요일
							// 전체날수 % 7 = 2 → 화요일
							//				:			
							// 전체날수 % 7 = 6 → 토요일

		//테스트
		//System.out.println(w);
		//-- 1997 10 6 --==>> 1 → 월요일
		
		return weekNames[w];
	}


	// 메소드 정의(결과 출력하기)
	void print(String day)
	{
		System.out.printf("\n>> %d년 %d월 %d일 → %s요일\n", y, m, d, day);
	}


}


public class Test092
{
	public static void main(String[] args)
	{
		WeekDay wd = new WeekDay();

		//wd.week();
		wd.input();					//-- 입력 메소드 호출
		String result = wd.week();	//-- 요일 산출 메소드 호출
		wd.print(result);			//-- 결과 출력 메소드 호출 

	}//end main()


}

/* [실행 결과]
년 월 일 입력(공백 구분) : 1997 10 3
1997년 10월 3일 → 금요일
계속하려면 아무 키나 누르십시오 . . .

년 월 일 입력(공백 구분) : 1 1 1
1년 1월 1일 → 월요일
계속하려면 아무 키나 누르십시오 . . .


년 월 일 입력(공백 구분) : 1993 3 8

>> 1993년 3월 8일 → 월요일
계속하려면 아무 키나 누르십시오 . . .

*/