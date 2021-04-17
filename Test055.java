/*=======================================
 ■■■ 실행 흐름의 컨트롤(제어문) ■■■
 - 반복문 (do ~ while문) 실습
=======================================*/

// 사용자로부터 여러 개의 정수를 입력받아
// 그 합을 계산하여 결과를 출력해주는 프로그램을 구현한다.
// 단, 입력 과정에서 사용자가 『-1』을 입력하게 되면
// 입력받는 행위를 중단하고, 그동안 입력받아둔 정수들의 합을 연산하여
// 출력할 수 있도록 구현한다.
// 입력받는 과정은 Scanner 인스턴스를 생성하여 처리한다.

// 실행 예)
// 1번째 정수 입력(-1 종료) : 10
// 2번째 정수 입력(-1 종료) : 52
// 3번째 정수 입력(-1 종료) : 8
// 4번째 정수 입력(-1 종료) : 9
// 5번째 정수 입력(-1 종료) : 46
// 6번째 정수 입력(-1 종료) : 24
// 7번째 정수 입력(-1 종료) : -1

// >> 현재까지 입력된 정수의 합 : 149
// 계속하려면 아무 키나...

import java.util.Scanner; 

public class Test055
{
	public static void main(String[] args)
	{

		/* 품~!
		Scanner sc = new Scanner(System.in);
		
		int n=1; // 출력구문에 사용되는 1씩 증가하는 변수
		int a;	 // 사용자가 입력하는 값 담을 변수
		int sum=0; // 누적합 담을 변수

		do
		{
			System.out.printf("%d번째 정수 입력(-1 종료) : ", n);   
			a = sc.nextInt(); 
			sum += a;
			n++;
		}
		while (a!=-1);  //a!=-1 가 트루일때까지 반복해라~~ (a==-1이면 그만해라~)

		System.out.println(" >> 현재까지 입력된 정수의 합 : " + (sum+1));

		*/

		// 같이 푼 내용

		// Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		// ○ 주요 변수 선언
		int num;			//-- 외부로부터 사용자 입력값을 담아둘 변수
		int sum=0;			//-- 누적합을 담을 변수
		int n=1;				//-- 몇 번째 입력값인지를 담아둘 변수

		// ○ 연산 및 처리
		do
		{
			System.out.printf("%d번째 정수 입력(-1 종료) : ", n);
			num = sc.nextInt();
			sum += num;
			n++;
		}
		while (num != -1);

		// ○ 결과 출력
		System.out.printf("\n>> 현재까지 입력된 정수의 합 : %d\n", (sum+1));
	}
}

/* [실행 결과]

1번째 정수 입력(-1 종료) : 10
2번째 정수 입력(-1 종료) : 12
3번째 정수 입력(-1 종료) : 10
4번째 정수 입력(-1 종료) : -1
 >> 현재까지 입력된 정수의 합 : 32
계속하려면 아무 키나 누르십시오 . . .

*/