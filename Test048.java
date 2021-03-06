/*=======================================
 ■■■ 실행 흐름의 컨트롤(제어문) ■■■
 - 반복문 (while문) 실습
=======================================*/

// 1/2 + 2/3 + 3/4 + ... + 9/10

// n/(n+1) 

// (n-1)/n

// 실행 예)
// 연산 결과 : xxxx ← 데이터 형태 ? ← 실수
// 계속하려면 아무 키나...


public class Test048
{
	public static void main(String[] args)
	{
		
		/* 내가 푼 내용 
		int n1=1; n2=2;
		double sum=0;
		
		while (n1<10)
		{
		sum += (float)n1/n2;
									
		n1++;
		n2++;

		sum += (float)n1/(n1+1);
		n1++;
		}
		System.out.println("연산 결과 : " + sum);
		*/
	
		// 같이 푼 내용

		// ○ 주요 변수 선언 및 초기화
		int n=0;			//--1부터 1씩 증가하게 될 변수(0으로 초기화)
		double sum=0;		//--누적합을 담을 변수(데이터타입: 실수 형태)

		// ○ 연산 및 처리(반복문 구성)
		while (n<=8)		// while (n<9)
		{
			// 증감식 구성 → 최종적으로 반복문의 조건을 무너뜨리게 되는 열쇠
			n++;
			// 연산 수행
			sum += (double)n/(n+1); // *의미 체크 : n을 double 형으로 바꾼다음에 n+1로 나누겠다!
			//-- 정수 기반의 나눗셈 연산은 몫을 반환하기 때문에
			//	 실수 기반의 연산을 수행할 수 있도록 만들기 위해
			//	 나눗셈 연산자를 중심으로 피연산자 중 하나를
			//	 실수 형태로 만들어 주는 것이 중요하다.
		
		}

		// ○ 결과 출력
		//System.out.println("연산 결과 : " + sum);
		System.out.printf("연산 결과 : %f\n", sum);
		
	}
}

/*
연산 결과 : 7.071032
계속하려면 아무 키나 누르십시오 . . .
*/