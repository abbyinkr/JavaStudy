/*============================================
   ■■■ 클래스와 인스턴스 ■■■
   - 클래스 개념 적용 및 클래스 설계 실습
============================================*/

// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 사칙 연산을 수행하는 프로그램을 구현한다.
// 단, 클래스와 인스턴스의 개념을 적용하여 작성할 수 있도록 한다.

// 실행 예)
// 임의의 두 정수 입력(공백 구분) : 30 15
// 임의의 연산자 입력(+ - * /)    : +
// >> 30 + 15 = 45
// 계속하려면 아무 키나...


import java.util.Scanner;
import java.io.IOException; // <- System.in.read() 사용

class Calculate
{

	/*
	// ○ 주요 속성 구성
	int su1, su2;
	char op;

	void input() throws IOException			// 입력 메소드
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		su1 = sc.nextInt();
		su2 = sc.nextInt();
		System.out.print("임의의 연산자 입력(+ - * /)    : ");
		op = (char)System.in.read();
	}

	int operate()		// 연산 메소드 
	{
		int result=0;

		if (op=='+')
		{
			result = su1 + su2;
		}
		else if (op=='-')
		{
			result = su1 - su2;
		}
		else if (op=='*')
		{
			result = su1 * su2;
		}
		else if (op=='/')
		{
			result = su1 / su2;
		}

		return result;
	}

	void print(int r)			// 출력 메소드
	{
		System.out.printf(">> %d %c %d = %d\n", su1, op, su2, r);
	}
	*/
	
	// ○ 주요 속성 구성
	int su1, su2;
	char op;

	// ○ 입력 메소드 정의
	void input() throws IOException // <- System.in.read() 사용
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		su1 = sc.nextInt();
		su2 = sc.nextInt();

		System.out.print("임의의 연산자 입력(+ - * /)    : ");
		op = (char)System.in.read();
	}

	// ○ 연산 메소드 정의
	int cal()
	{
		int result = 0;

		switch (op)								// if문 대신 switch문으로 쓸 수 있음! check!
		{
		case '+': result=su1+su2; break;
		case '-': result=su1-su2; break;
		case '*': result=su1*su2; break;
		case '/': result=su1/su2; break;
		}
		return result;
	}
	// ○ 출력 메소드 정의

	void print(int r)
	{
		System.out.printf(">> %d %c %d = %d\n", su1, op, su2, r);
	}

}//end class Calculate


public class Test073
{
	public static void main(String[] args) throws IOException
	{
		/*
		// 인스턴스 생성
		Calculate cal = new Calculate();

		cal.input();
		int sum = cal.operate();		// int result = cal.operate() 도 됨 (지역변수)
		cal.print(sum);					// cal.print(result)
		*/

		// Caculate 클래스 기반의 인스턴스 생성
		Calculate ob = new Calculate();

		// 생성한 인스턴스를 통한 입력 메소드 호출
		ob.input();

		// 생성한 인스턴스를 통한 연산 메소드 호출
		int result = ob.cal();

		// 생성한 인스턴스를 통한 출력 메소드 호출
		ob.print(result);
	}
}

/* [실행 결과}
임의의 두 정수 입력(공백 구분) : 10 25
임의의 연산자 입력(+ - * /)    : +
>> 10 + 25 = 35
계속하려면 아무 키나 누르십시오 . . .

임의의 두 정수 입력(공백 구분) : 2
5
임의의 연산자 입력(+ - * /)    : +
>> 2 + 5 = 7
계속하려면 아무 키나 누르십시오 . . .

*/