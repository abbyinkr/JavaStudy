/*================================================
 ■■■ 실행 흐름의 컨트롤(제어문) ■■■
 - break;
   → 멈추고 + 가장 가까운 반복문 탈출
================================================*/

// 다음과 같은 처리가 이루어지는 프로그램을 구현한다.
// 단, 입력받는 정수는 1 ~ 1000 범위 안에서만
// 가능하도록 작성한다.

// 실행 예)
// 임의의 정수 입력(1~1000) : -10
// 임의의 정수 입력(1~1000) : 0
// 임의의 정수 입력(1~1000) : 2021
// 임의의 정수 입력(1~1000) : 10
// >> 1 ~ 10 까지의 합: 55
// 계속하시겠습니까(Y/N)? : y		(소문자)

// 임의의 정수 입력(1~1000) : 100
// >> 1 ~ 10 까지의 합: 5050
// 계속하시겠습니까(Y/N)? : N		(대문자)
// 계속하려면 아무 키나...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test064
{
	public static void main(String[] args) throws IOException
	{
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;
		int sum=0;
		int answer;
		 
		do
		{
			System.out.print("임의의 정수 입력(1~1000) : ");
			num = Integer.parseInt(br.readLine());
		}
		while (num<1 || num>1000);

		for (int n=1; n<=num; n++)
		{
			sum += n;
		}

		System.out.printf("1 ~ %d 까지의 합 : %d\n", num, sum);

		do
		{
			System.out.print("계속하시겠습니까(Y/N)? : ");
			answer = System.in.read();
			// Y : 89, y: 121 / N: 78, n: 110
			if (answer==89 || answer==121)			// 계속한다
			{
				
				do
				{
					System.out.print("임의의 정수 입력(1~1000) : ");
					num = Integer.parseInt(br.readLine());
				}
				while (num<1 || num>1000);

				for (int n=1; n<=num; n++)
				{
					sum += n;
				}


			}
			else if (answer==78 || answer==110)
			{
				return;
			}
		}
		while (answer!=89 || answer!=121 || answer!=78 || answer!= 110);

		*/
		
		// 함께 푼 내용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//int n, s=0, i;					//--사용자 입력값, 누적합, 루프변수
		int n, s, i;
		char ch;						//--계속 여부 입력값
		
		while (true)					//--무한 루프(반복)
		{
			do
			{
				System.out.print("임의의 정수 입력(1~1000) : ");
				n = Integer.parseInt(br.readLine()); //"\r\n" "200"
			}
			while (n<1 || n>1000);		// 반복을 수행할 조건~ 조건식=true일때 반복해라

			// 테스트
			//System.out.println("입력한 정수 : " + n);

			
			// 초기화 위치 check~!! (사용자가 끝낼때까지 반복해야하기 때문에 누적합 실행 전 초기화!)
			s = 0;

			for (i=1; i<=n; i++)
			{
				s += i;
			}

			// 테스트
			//System.out.println("누적합 : " + s);
			System.out.printf("\n>> 1 ~ %d 까지의 합 : %d\n", n, s);

			
			System.out.print("계속하시겠습니까(Y/N)? : ");
			ch =(char)System.in.read();		// y + \r + \n
			// 테스트
			//System.out.println("계속여부 : " + ch);

			// 입력값이 소문자 y가 아니다. 입력값이 대문자 Y가 아니다.
			// → ch!='y'                  → ch!='Y'

			// SCE
			if (ch!='y' && ch!='Y')
			{
				// 반복문 → 『while(true)』을 빠져나갈 수 있는 코드 작성 필요
				//-- 위와 같은 의사표현을 했다면
				//	 그동안 수행했던 반복문을 멈추고 빠져나가야 한다.
				break;
				//-- 멈춘다. (+ 그리고 빠져나간다.) check~!!!
			}

			// 엔터값(\r\n) 추가 처리
			System.in.skip(2);
			

		}//end while(true)
		
	}//end main()
}


/* [실행 결과]
임의의 정수 입력(1~1000) : -1
임의의 정수 입력(1~1000) : 10000
임의의 정수 입력(1~1000) : 10

>> 1 ~ 10 까지의 합 : 55
계속하시겠습니까(Y/N)? : y
임의의 정수 입력(1~1000) : 20

>> 1 ~ 20 까지의 합 : 210
계속하시겠습니까(Y/N)? : n
계속하려면 아무 키나 누르십시오 . . .
*/