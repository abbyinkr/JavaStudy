/*=======================================
 ■■■ 실행 흐름의 컨트롤(제어문) ■■■
 - 반복문 (while문) 실습
=======================================*/
// ○ 과제
// 사용자로부터 임의의 정수를 입력받아
// 1부터 그 수 까지의 전체 합과, 짝수의 합과, 홀수의 합을 
// 각각 결과값으로 출력하는 프로그램을 구현한다.

// 실행 예)
// 임의의 정수 입력 : 284
// >> 1 ~ 284 까지 정수의 합 : xxx
// >> 1 ~ 284 까지 짝수의 합 : xxx
// >> 1 ~ 284 까지 홀수의 합 : xxx
// 계속하려면 아무 키나...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test052
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 주요 변수 선언
		int n=1;		// 1씩 증가할 변수,
		int num;		//  사용자 입력값 담을 변수
		int sum, even, odd;
		sum=even=odd=0;	// 누적합

		System.out.print(" 임의의 정수 입력 : ");
		num = Integer.parseInt(br.readLine());
	
		while (n<=num)
		{
			sum += n;
			if (n%2==0)			// 짝수 누적합
				even += n;
			else				// 홀수 누적합
				odd += n;
			n++;
		}

		System.out.printf(" >> 1 ~ %d 까지 정수의 합 : %d\n", num, sum);
		System.out.printf(" >> 1 ~ %d 까지 짝수의 합 : %d\n", num, even);
        System.out.printf(" >> 1 ~ %d 까지 홀수의 합 : %d\n", num, odd);
	}
}

/* [실행 결과]
 임의의 정수 입력 : 10
 >> 1 ~ 10 까지 정수의 합 : 55
 >> 1 ~ 10 까지 짝수의 합 : 30
 >> 1 ~ 10 까지 홀수의 합 : 25
계속하려면 아무 키나 누르십시오 . . .
*/