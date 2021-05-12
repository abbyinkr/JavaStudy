/*=======================================
 ■■■ 실행 흐름의 컨트롤(제어문) ■■■
 - switch문 실습
=======================================*/

// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 해당 연산의 처리 결과를 출력하는 프로그램을 구현한다.
// 단, switch문을 활용하여 처리할 수 있도록 하며,
// 연산 결과는 편의상 정수 형태로 처리한다.

// 실행 예)
// 첫 번째 정수 입력	: 10
// 두 번째 정수 입력	: 31
// 연산자 입력(+ - * /) : +

// >> 10 + 31 = 41
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test042
{
	public static void main(String[] args) throws IOException
	{		
		
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, op;

		System.out.print("첫 번째 정수 입력  :  ");
		a = Integer.parseInt(br.readLine());
		
		System.out.print("두 번째 정수 입력  :  ");
		b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력(+ - * /)		: ");
		op = System.in.read();

		System.in.skip(2);

		//연산자 아스키코드 출력 테스트 
		System.out.println("op : " + op);
		// + → 47, - → 45, * → 42, / → 47
	

	
		switch (op)
		{
		case 42:
			System.out.printf(" >> %d * %d = %d\n", a, b, (a*b));
			break;

		case 43:
			System.out.printf(" >> %d + %d = %d\n", a, b, (a+b));
			break;

		case 45:
			System.out.printf(" >> %d - %d = %d\n", a, b, (a-b));
			break;

		case 47:
			System.out.printf(" >> %d / %d = %d\n", a, b, (a/b));
			break;
		
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, result;
		char op;

		System.out.print("첫 번째 정수 입력		:   ");
		a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력		:   ");
		b = Integer.parseInt(br.readLine());
		System.out.print("연산자 입력(+ - * /)	  : ");
		op = (char)System.in.read();

		
		switch (op)
		{
			case '+': result=a+b; break;
			case '-': result=a-b; break;
			case '*': result=a*b; break;
			case '/': result=a/b; break;
			default : return;	//--메소드 종료 → main() 메소드 종료 → 프로그램 종료
		}

		// ※ 『return』 : 1. 값의 반환
		//				   2. 메소드의 종료

		System.out.println();
		System.out.printf(">> %d %c %d = %d\n", a, op, b, result);
		
	}
}