/*============================================
   ■■■ 클래스와 인스턴스 ■■■
   - 클래스 개념 적용 및 클래스 설계 실습
============================================*/

// 사용자로부터 임의의 정수를 입력받아
// 1부터 입력받은 수 까지의 합을 연산하여
// 결과를 출력하는 프로그램을 구현한다.

// 단, 클래스와 인스턴스의 개념을 활용하여 처리할 수 있도록 한다.
// 또한, 입력 처리 과정에서 BufferedReader 의 readLine()을 사용하며,
// 입력받은 데이터가 1보다 작거나 1000보다 큰 경우
// 다시 입력받을 수 있는 처리를 포함하여 프로그램을 구성할 수 있도록 한다.

// 실행 예)
// 임의의 정수 입력(1~1000) : 1002
// 임의의 정숭 입력(1~1000) : -20
// 임의의 정수 입력(1~1000) : 100
// >> 1 ~ 100까지의 합 : 5050
// 계속하려면 아무 키나...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Hap
{
	/* -- 내가 풀이한 내용
	int num;
	int sum;
	
	void input() throws IOException			// 입력 메소드
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			System.out.print("임의의 정수 입력(1~1000) : ");
			num = Integer.parseInt(br.readLine());
		}
		while (num<1 || num>1000);
	}

	int plus()								// 1 ~ 입력받은 값 더하기 메소드
	{
		// sum=0;  전역변수는 자바가 알아서 0으로 초기화해줌!

		for (int i=1; i<=num; i++)
		{
			sum += i;
		}
		return sum;
	}

	void print(int s) // 출력 메소드
	{
		System.out.printf(">> 1 ~ %d 까지의 합 : %d\n", num, sum);
	}
	*/

	// 함께 풀이한 내용
		
	// ○ 주요 변수 선언(사용자의 입력값을 담아둘 변수)
	int su;
	// int result; <-광역변수, 0으로 초기화됨

	// ○ 입력 메소드 정의
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do
		{
			System.out.print("임의의 정수 입력(1~1000) : ");
			su = Integer.parseInt(br.readLine());
		}
		while (su<1 || su>1000); 
	} //--여기까지 입력했을 때 오류안나면 su에 제대로 값이 담긴 것.

	// ○ 연산 메소드 정의
	int caculate()
	{
		int result = 0;

		for (int i=1 ; i<=su ; i++)
			result += i;

		return result;
	}

	// 결과 출력 메소드 정의
	// >> 1 ~ 100 까지의 합 : 5050
	void print(int sum)
	{
		System.out.printf(">> 1 ~ %d 까지의 합 : %d\n", su, sum);
	}

}//end class Hap

// 클래스들 사이에 import 끼워넣을 수 없다~!!

public class Test072
{
	public static void main(String[] args) throws IOException

	{
		/* -- 내가 풀이한 내용
		Hap h = new Hap();
		h.input();
		int tot = h.plus();			
		//→ int tot = sum <- 값을 놓고옴
		h.print(tot);
		*/ 

		// 같이 풀이한 내용

		// Hap 클래스 기반의 인스턴스 생성 (ob)
		Hap ob = new Hap();		// ob 는 참조변수

		// 생성한 인스턴스를 통해 입력 메소드 호출~!! → throws IOException 처리
		ob.input();
		
		// 생성한 인스턴스를 통해 연산 메소드 호출~!! → int형 결과값 반환 → 받아 낼 수 있는 처리
		int s = ob.caculate();

		// 생성한 인스턴스를 통해 출력 메소드 호출~!! → 매개변수 전달
		ob.print(s);

		
	}//end main

}//end class Test072


/* [실행 결과]

임의의 정수 입력(1~1000) : -5
임의의 정수 입력(1~1000) : 2000
임의의 정수 입력(1~1000) : 500
>> 1 ~ 500 까지의 합 : 125250
계속하려면 아무 키나 누르십시오 . . .

*/
