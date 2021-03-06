/*=======================================
 ■■■ 실행 흐름의 컨트롤(제어문) ■■■
 - 반복문 (while문) 실습
=======================================*/

// 1부터 100까지 정수의 합 : xxxx
// 1부터 100까지 짝수의 합 : xxxx
// 1부터 100까지 홀수의 합 : xxxx
// 계속하려면 아무 키나...

public class Test046
{
	public static void main(String[] args)
	{
		// ○ 주요 변수 선언
		//int n=1, sum=0, even=0, odd=0;
		int n=1, sum, even, odd;
		sum=even=odd=0; // 0을 odd에 대입하고 even에 odd(0)을 대입하고...
		
		// ○ 연산 및 처리(반복문 구성)
		while (n<=100)	// 1<=100 2<=100
		{
			// 연산 수행 
			// ·반복문이 수행되는 동안
			//	→ sum을 n만큼 증가시켜라...
			sum += n;			// 0 += 1  1 += 2

			// ·n이 짝수일 경우...
			//	→ even을 n 만큼 증가시켜라..
			if (n%2==0)
				even += n;		// 0 += 2
			// ·n이 홀수일 경우...
			//	→ odd를 n 만큼 증가시켜라...
			else				
				odd += n;		// 0 += 1
			
			n++;				// 1 2 3 4 ... 100
		}

		/*
		while () 짝수  이렇게 연산하는건 리소스 낭비, 비효율적
		{
		}
		while () 홀수 
		{}
		*/

		// ○ 결과 출력
		System.out.println("1부터 100까지 정수의 합 : " + sum);
		System.out.println("1부터 100까지 짝수의 합 : " + even);
		System.out.println("1부터 100까지 홀수의 합 : " + odd);

	}
}

/* [실행 결과]
1부터 100까지 정수의 합 : 5050
1부터 100까지 짝수의 합 : 2550
1부터 100까지 홀수의 합 : 2500
계속하려면 아무 키나 누르십시오 . . .
*/