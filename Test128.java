/*=============================================
     ■■■ 자바의 주요(중요) 클래스 ■■■
	 - Wrapper 클래스
=============================================*/
//Test127 와 비교
// 큰 소수
import java.math.BigDecimal;
import java.math.MathContext;

public class Test128
{
	public static void main(String[] args)
	{
		BigDecimal a = new BigDecimal("123456789.123456789");
	
		// movePointLeft() : 소수점을 왼쪽으로 이동
		BigDecimal b = a.movePointLeft(3);
		System.out.println("결과 확인 : " + b);
		//--==>> 결과 확인 : 123456.789123456789

		BigDecimal t1 = new BigDecimal("400.0");
		BigDecimal t2 = new BigDecimal("6.0");

		BigDecimal t3 = t1.divide(t2, 3);
		BigDecimal t4 = t1.divide(t2, 2);
		System.out.println("t3 : " + t3);
		System.out.println("t4 : " + t4);
		//--==>> t3 : 66.6
		//       t4 : 66.7

		// 나눗셈 (대체 속성 확인, 반올림 하지 않는다 → 절삭)
		BigDecimal c = a.divide(b, BigDecimal.ROUND_DOWN);
		// → 『BigDecimal c = a.divide(b, 1);』와 동일한 구문
		System.out.println("c : " + c);
		//--==>> c : 1000.000000000

		System.out.println(BigDecimal.ROUND_DOWN);
		//--==>> 1

		//ROUND_DOWN : 대문자, 클래스이름 그냥 부름 -> 클래스변수, final변수

		BigDecimal d = a.divide(b, 5);
		System.out.println("d : " + d);
		//--==>> d : 1000.000000000
	
		// 유효 자리 : 소수점 이하 5번째 자리(두 번째 인자값 5)
		BigDecimal e = a.divide(b, 5, BigDecimal.ROUND_DOWN);
		//BigDecimal e = a.divide(b, 5, 1);
		System.out.println("e : " + e);
		//--==>> e : 1000.00000

		System.out.println(BigDecimal.ROUND_CEILING);
		System.out.println(BigDecimal.ROUND_FLOOR);
		//--==>> 2
		//       3 

		/*
		
		static final PI = 3.141592;

		R * R * 3.141592;
		R * R * PI;
        
		*/

		// 추가 보충 정리~!!!

		//BigDecimal result = t1.divide(t2);
		//System.out.println("result : " + result);
		//--==>> 에러 발생(런타임 에러)
		
		System.out.println(MathContext.DECIMAL32);
		//--==>> precision=7 roundingMode=HALF_EVEN
		//       ----------- 유효한 자릿수(소수점 포함 전체자릿수)

		System.out.println(MathContext.DECIMAL64);
		//--==>> precision=16 roundingMode=HALF_EVEN
		//                    ------------ 반올림 방식

		System.out.println(MathContext.DECIMAL128);
		//--==>> precision=34 roundingMode=HALF_EVEN

		// t1.divide(t2);			// t1을 t2로 나눈 몫 → 나눗셈
									// 단, 몫이 떨어지지 않을 경우 예외 발생
		
		// t1.divide(t2, b);		// t1을 t2로 나눈 몫 → 나눗셈
									// 단, b 방식(모드)로 처리해라
									// 올림 / 버림(절삭) / 반올림
		// t1.divide(t2, 올림);
		// t1.divide(t2, 절삭);
		// t1.divide(t2, 반올림);

		// t1.divide(t2, a, b);

		System.out.println("BigDecimal.ROUND_UP : " +BigDecimal.ROUND_UP);
		System.out.println("BigDecimal.ROUND_DOWN : " +BigDecimal.ROUND_DOWN);
		System.out.println("BigDecimal.ROUND_CEILING : " +BigDecimal.ROUND_CEILING);
		System.out.println("BigDecimal.ROUND_FLOOR : " +BigDecimal.ROUND_FLOOR);
		System.out.println("BigDecimal.ROUND_HALF_UP : " +BigDecimal.ROUND_HALF_UP);
        System.out.println("BigDecimal.ROUND_HALF_DOWN : " +BigDecimal.ROUND_HALF_DOWN);
		System.out.println("BigDecimal.ROUND_HALF_EVEN : " +BigDecimal.ROUND_HALF_EVEN);
		System.out.println("BigDecimal.ROUND_UNNECESSARY : " +BigDecimal.ROUND_UNNECESSARY);
		//--==>>
		/*
		BigDecimal.ROUND_UP : 0
		BigDecimal.ROUND_DOWN : 1
		BigDecimal.ROUND_CEILING : 2
		BigDecimal.ROUND_FLOOR : 3
		BigDecimal.ROUND_HALF_UP : 4
		BigDecimal.ROUND_HALF_DOWN : 5
		BigDecimal.ROUND_HALF_EVEN : 6
		BigDecimal.ROUND_UNNECESSARY : 7
		*/

		/*
		ⓐ.divide(ⓑ);

		ⓐ.divide(ⓑ, 옵션); - BigDecimal

		ⓐ.divide(ⓑ, 자리, 옵션);
		ⓐ.divide(ⓑ, 미리설정된옵션); - MathContext
		              --------------
					  전체자리 + 옵션 
		*/
	}
}