/*==================================
     ■■■ 클래스 고급 ■■■
	 - 상속(Inheritance)
==================================*/

// ○ 실습 문제
//	  다음과 같은 프로그램을 구현한다.
//	  단, 상속의 개념을 적용하여 작성할 수 있도록 한다.

// 실행 예)
// 임의의 두 정수 입력(공백 구분) : 20 15 
// 연산자 입력(+ - * /) : -
// >> 20 - 15 = 5
// 계속하려면 아무 키나...

//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// 부모클래스
class AClass
{
	protected int x, y;
	protected char op;

	// default 생성자
	AClass()
	{
		
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x , op, y, result);
	}
}

// 자식클래스
class BClass extends AClass
{
	// 상속받기
	/*
	protected int x, y;
	protected char op;

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x , op, y, result);
	}
	*/

	// [나의 풀이]
	/*void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.print("연산자 입력(+ - * /) : ");
		op = (char)System.in.read();
	}
	
	double calc()
	{	
		double result=0.0;
		switch (op)
		{
			case '+' : result = x + y; break;
			case '-': result = x - y; break;
			case '*': result = x * y; break;
			case '/': result = (double)x / y; break;
		}

		return result;
	}
	*/

	// [선생님 풀이] -- 새로운 접근법!!!!

	boolean input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("임의의 두 정수 입력(공백 구분) : ");					// 20 15
		String temp = br.readLine();											// "20 15"
		String[] str = temp.split("\\s");										// 구분자 → 공백 ex) \\s*\\s (구분자 *)
		// ※ 문자열.split("구분자");
		//	  ex) "사과 딸기 바나나 포도 수박".spilt();
		//	  반환 → 배열 → {"사과", "딸기", "바나나", "포도", "수박"}
		//	  ex) "1 23 456 7".split(공백);
		//    반환 → 배열 → {"1", "23", "456", "7"}

		//--==>> String[] str = {"20", "15"};

		if (str.length != 2)
			return false;	// 값의 반환 → false 그리고 ... 메소드 종료~!!! (메인메소드가 아니니까 프로그램 종료는 안됨)
		//  ======			   false(거짓)을 반환하며 메소드 종료
		// 1. 값의 반환 2. 메소드종료 
		// ^동시에^ 하는거고, return 뒤에 반환할 값이 없으면 메소드 종료만을 의미한다!!

		// ※ 이 조건문을 수행할 경우 아래에 코드가 남아있는 상황이더라도
		//	  더 이상 수행하지 않고 결과값을 반환하며 메소드는 종료된다.
		
		x = Integer.parseInt(str[0]);
		y = Integer.parseInt(str[1]);

		System.out.print("연산자 입력(+ - * /) : ");
		op = (char)System.in.read();
		
		if (op!='+' && op!='-' && op!='*' && op!='/')	// check~!! 다 부정이니까 논리연산자 && 사용
			return false;

		return true;
		
		/*
		if (op =='+' || op=='-' ||  op=='*' || op=='/')
			return true;
		return false;
		*/

	}//end input()

	double calc()
	{
		double result = 0;
		
		switch (op)
		{
			case '+': result = x + y; break;
			case '-': result = x - y; break;
			case '*': result = x * y; break;
			case '/': result = (double)x / y; break;
		}
		return result;
	
	}//end calc()
}

// main()메소드를 포함하고 있는 외부의 다른 클래스
public class Test108
{
	public static void main(String[] args) throws IOException
	{
		/*
		BClass ob = new BClass();
		ob.input();
		double result = ob.calc();
		ob.write(result);
		*/

		// [선생님 풀이]

		BClass ob = new BClass();
		
		
		if (!ob.input()) // ★ (!false)== true
		{
			System.out.println("Error...");
			return;		// 메인메소드의 종료 → 프로그램 종료~!!!
		}

		double result = ob.calc();
		ob.write(result);



	
	}

}

/* [실행 결과]
임의의 두 정수 입력(공백 구분) : 4 2
연산자 입력(+ - * /) : -
>> 4 - 2 = 2.00
계속하려면 아무 키나 누르십시오 . . .

임의의 두 정수 입력(공백 구분) : 2 8
연산자 입력(+ - * /) : *
>> 2 * 8 = 16.00
계속하려면 아무 키나 누르십시오 . . .
*/