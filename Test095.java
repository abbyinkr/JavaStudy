/*===================================
   ■■■ 클래스와 인스턴스 ■■■
   - 클래스와 인스턴스 할용
===================================*/

// ○ 실습문제
// 1 ~ 3 사이의 정수 형태의 난수를 발생시켜
// 가위, 바위, 보 게임 프로그램을 구현한다.
// 단, 클래스의 개념을 활용하여 처리할 수 있도록 한다.
// 또한, 배열을 활용하여 처리할 수 있도록 한다.

// 기준 데이터 → 1: 가위, 2: 바위, 3:보

// 실행 예)
// 1:가위, 2:바위, 3:보 중 입력(1~3) : 4
// 1:가위, 2:바위, 3:보 중 입력(1~3) : -10
// 1:가위, 2:바위, 3:보 중 입력(1~3) : 2
// - 유저   : 바위
// - 컴퓨터 : 보	// 유저다음에 컴퓨터가 내는게 아니라 컴퓨터가 먼저!
// >> 승부최종결과 : 컴퓨터가 이겼습니다~!!!
// 계속하려면 아무 키나...

import java.util.Random;
import java.util.Scanner;

class RpsGame
{
	int user;
	int com;

	/*
	String[] rps = {"가위", "바위", "보"};
	String result = "무승부";

	private void comRps()
	{
		Random rd = new Random();			
		com = rd.nextInt(3)+1;		// com = 1 2 3 중 랜덤으로 하나가 담김.
	}

	
	// 사용자 입력 안내 및 사용자 가위바위보 값 저장 메소드
	public void input()
	{

		Scanner sc = new Scanner(System.in);
		//사용자에게 입력 안내 메세지 출력

		do
		{
			System.out.print("1:가위, 2:바위, 3:보 중 입력(1~3) : ");
			user = sc.nextInt(); 
			
		}
		while (user<1 || user>3); 

	}//end input()

	// 유저가 1(가위) 컴퓨터가 3(보) 면 이기고 1-2면 짐
	// 유저가 2(바위) 이고 컴퓨터가 3=이면 짐, 1이면 이김
	// 유저가 3(보)이고 컴퓨터가 1이면 짐 2이면 이김

	public void print()
	{
		System.out.printf("- 유저    : %s\n", rps[user-1]);
		System.out.printf("- 컴퓨터  : %s\n", rps[com-1]);

		if (user==1 && com==3 || user==3 && com==2 || user==2 && com==1)
		{
			result = "유저가 이겼습니다~!!";
			System.out.printf(">> 승부최종결과 : %s\n", result);
		}
		else if (user==1 && com==2 || user==2 && com==3 || user==3 && com==1)
		{
			result = "컴퓨터가 이겼습니다~!!";
			System.out.printf(">> 승부최종결과 : %s\n", result);
		}
		else if (user==com)
			System.out.printf(">> 승부최종결과 : %s입니다~!!\n", result);


	}//end print()
	*/ 

	// [함께 풀이한 내용]

	// 컴퓨터 가위바위보 메소드 private!
	private void runCom()
	{
		Random rd = new Random();
		com = rd.nextInt(3)+1;		// 0 1 2 → 1 2 3 
	}

	// 사용자 가위바위보 입력 메소드
	public void input()
	{
		runCom();	// → 컴퓨터가 사용자 전에 먼저 냄!

		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("1:가위, 2:바위, 3:보 중 입력(1~3) : ");
			user = sc.nextInt();
		}
		while (user<1 || user>3);
	}

	// 유저와 컴퓨터가 낸 값 → 가위 바위 보로 치환하는 메소드
	public void middleCalc()
	{
		String[] str = {"가위","바위","보"};

		System.out.println("- 유저   : " + str[user-1]);
		System.out.println("- 컴퓨터 : " + str[com-1]);
	}

	// 결과 판별 메소드
	public String resultCalc()
	{
		String result = "무승부";

		if (user==1&&com==3 || user==2&&com==1 || user==3&&com==2)
			result = "당신이 승리했습니다~!!!";
		if (user==1&&com==2 || user==2&&com==3 || user==3&&com==1)		
			result = "컴퓨터가 승리했습니다~!!!";
		// result = "무승부"로 초기화했으니까 둘다 봐야됨. else if (X)

		return result;
	}

	// 승부최종결과 출력 메소드
	public void print(String result)
	{
		System.out.println(">> 승부최종결과 : " + result);
	}


}

// ~동일 패키지 안~

public class Test095
{
	public static void main(String[] args)
	{
		/*
		// 인스턴스 생성
		RpsGame ob = new RpsGame();
		// 메소드 호출 
		ob.comRps();
		ob.input();
		ob.print();
		*/

		RpsGame ob = new RpsGame();
		ob.input();
		ob.middleCalc();
		String result = ob.resultCalc();
		ob.print(result);


	}
}

/* [실행 결과]

1:가위, 2:바위, 3:보 중 입력(1~3) : 2
- 유저   : 바위
- 컴퓨터 : 가위
>> 승부최종결과 : 당신이 승리했습니다~!!!
계속하려면 아무 키나 누르십시오 . . .

1:가위, 2:바위, 3:보 중 입력(1~3) : 3
- 유저   : 보
- 컴퓨터 : 가위
>> 승부최종결과 : 컴퓨터가 승리했습니다~!!!
계속하려면 아무 키나 누르십시오 . . .

1:가위, 2:바위, 3:보 중 입력(1~3) : 1
- 유저   : 가위
- 컴퓨터 : 보
>> 승부최종결과 : 당신이 승리했습니다~!!!
계속하려면 아무 키나 누르십시오 . . .

1:가위, 2:바위, 3:보 중 입력(1~3) : 2
- 유저   : 바위
- 컴퓨터 : 바위
>> 승부최종결과 : 무승부
계속하려면 아무 키나 누르십시오 . . .
*/