/*=======================================
 ■■■ 실행 흐름의 컨트롤(제어문) ■■■
 - 반복문 (while문) 실습
=======================================*/

// 사용자로부터 임의의 두 정수를 입력받아
// 작은 수 부터 큰 수 까지의 합을 구하여
// 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 첫 번째 정수 입력 : 10
// 두 번재 정수 입력 : 10
// >> 10 ~ 20 까지의 합 : xxxx
// 계속하려면 아무 키나...

// 첫 번째 정수 입력 : 10
// 두 번째 정수 입력 : 2
// 2 ~ 10까지의 합 : xxx

// 첫 번째 정수 입력 : 10
// 두 번째 정수 입력 : 10
// 10 ~ 10까지의 합 : 10

// 계속하려면 아무 키나...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test051
{
	public static void main(String[] args) throws IOException
	{

		// 내가 푼 방법 
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		 int n1, n2; // 1, 6
		// 사용자에게 입력 안내 메세지 출력 및 입력된 두 정수 값 저장
		System.out.print("첫 번째 정수 입력 : ");
		n1 = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		n2 = Integer.parseInt(br.readLine());

		if (n1>n2)
		{
			n1=n1^n2; n2=n2^n1; n1=n1^n2;		// n1>n2 일경우 값 맞바꾸기
		}

		int c = n1;		// 맨 처음 입력된 n1 값 담기

		int sum = n1;	// sum = 1              
		
		// 반복문 수행 
		while (n1<n2)	// 1 < 6        2<6
		{	
			n1++;		// 2			3
			sum+= n1;	// 1 += 2      (1+2)+=3
		}

		sum += n2;
		System.out.printf(" >> %d ~ %d 까지의 합 : %d\n", c, n2, sum);

		if (n1==n2)
		{
			System.out.printf(" >> %d ~ %d 까지의 합 : %d\n", n1, n2, n1);
		}
		*/

		//  같이 푼 방법

		// ○ 주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n, su1, su2, result=0;
		//-- 루프변수, 첫 번째 입력값, 두 번째 입력값, 결과값(누적합 연산 결과)

		// ○ 연산 및 처리
		//	 ·사용자에게 안내 메세지 출력 및 입력값 담아내기
		System.out.print("첫 번째 정수 입력 : ");
		su1 = Integer.parseInt(br.readLine());
			System.out.print("두 번째 정수 입력 : ");
		su2 = Integer.parseInt(br.readLine());

		//	 · 누적합 연산에 들어가기 앞서
		//		입력받은 두 수의 크기 비교 및 자리 바꿈
		//		즉, su1 이 su2 보다 클 경우 두 수의 자리를 바꿀 수 있도록 처리
		if (su1>su2)
		{
			// 두 수의 자리 바꿈
			su1=su1^su2; su2=su2^su1; su1=su1^su2;
		}

		n = su1; // ★★

		while (n<=su2)     // 1 6
		{
			result += n;
			n++;
		}

		// ○ 결과 출력

		System.out.printf(" >> %d ~ %d 까지의 합 : %d\n", su1, su2, result);
		
	}
}


/*
첫 번째 정수 입력 : 1
두 번째 정수 입력 : 100
 >> 1 ~ 100 까지의 합 : 5050
계속하려면 아무 키나 누르십시오 . . .

첫 번째 정수 입력 : 10
두 번째 정수 입력 : 10
 >> 10 ~ 10 까지의 합 : 10
계속하려면 아무 키나 누르십시오 . . .

첫 번째 정수 입력 : 20
두 번째 정수 입력 : 10
 >> 10 ~ 20 까지의 합 : 165
계속하려면 아무 키나 누르십시오 . . .


*/