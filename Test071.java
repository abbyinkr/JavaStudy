/*============================================
   ■■■ 클래스와 인스턴스 ■■■
============================================*/

// ○ 실습 문제
// 원의 넓이와 둘레 구하기

// 원의 넓이와 둘레를 구할 수 있는 클래스를 독립적으로(별도로) 생성한다.
// (클래스명 : CircleTest) → CircleTest.java


// 원의 넓이 = 반지름 * 반지름 * 3.141592
// 원의 둘레 = 반지름 * 2 * 3.141592

// 실행 예)
// 반지름 입력 : xx

// >> 반지름이 xx 인 원의
// >> 넓이 : xxx.xx
// >> 둘레 : xxx.xx
// 계속하려면 아무 키나...

// 같은 위치(패키지)에 있기때문에 import 안해도 된다. 

import java.io.IOException;

public class Test071
{
	public static void main(String[] args) throws IOException
	{
		/*
		// CircleTest 인스턴스 생성
		CircleTest ct = new CircleTest();

		ct.input();					// 입력메소드 실행 -> 
		double a = ct.calArea();    // 넓이계산 메소드를 통해 반환된 값을 새 변수에 담음
		double l = ct.calLength();  // 둘레계산 메소드를 통해 반환된 값을 새 변수에 담음
		ct.print(a, l);
		*/	
		
		CircleTest ob = new CircleTest();
		ob.input();
		double area = ob.calArea();			// 메소드 정의할때 쓴 변수 이름(a,l)랑 같지
		double length = ob.calLength();		// 않아도 된다. 자료형만 같음 ok~~!
		
		/*
		System.out.println("area : " + area);
		System.out.println("length : " + length);
		*/

		ob.print(area, length);
	}
}

/*
반지름 입력 : 2

>> 반지름이 2인 원의
>> 넓이 : 12.57
>> 둘레 : 12.57
계속하려면 아무 키나 누르십시오 . . .
*/