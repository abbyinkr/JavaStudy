/*==================================================
        ■■■ 변수와 자료형 ■■■
 - 퀴즈
   사전에 부여된 반지름 정보를 통해 
   원의 넓이와 둘레를 구하는 프로그램을 작성한다
   ·반지름 : 10
==================================================*/

// ※ 문제 인식 및 분석 
//    원의 넓이 = 반지름 * 반지름 * 3.141592
//    원의 둘레 = 반지름 * 2 * 3.141592

// 실행 예)
//넓이 : xxx
//둘레 : xxx
//계속하려면 아무 키나 누르세요..

public class Test010
{
	public static void main(String[] args)
	{
	
	/* 내가 풀이한 내용
	double r, a, b;
	r = 10.0;
	a = r * r * 3.141592;
	b = r * 2 * 3.141592;
	System.out.println("넓이 : " + a);
	System.out.println("둘레 : " + b);
	*/

	// 함께 풀이한 내용

	// 주요 변수 선언 
	int r = 10;              //-- 반지름
	//final double PI = 3.141592; 상수화된 변수
	double pi = 3.141592;    //-- 원주율
	
	// ※ 키워드 『final』 : 변수의 상수화~!

	double area, length;	//-- 넓이, 둘레

	// 연산 및 처리
	// ① 넓이 연산 
	// 원의 넓이 = 반지름 * 반지름 * 3.141592 
	   area = r * r * pi;
	// 원의 둘레 = 반지름 * 2 * 3.141592
	length = r * 2 * pi;

	// 결과 출력
	// 넓이 : xxxx
	// 둘레 : xxxx
	System.out.println("넓이 : " + area);
	System.out.println("둘레 : " + length);

	//System.out.println("넓이 : " + area + "\n둘레 : " + length);
	//System.out.printf("넓이 : ○\n둘레 : ○\n", area, length);
	System.out.printf("넓이 : %f\n둘레 : %f\n", area, length);
   
	}
}

/* [실행결과]
넓이 : 314.1592
둘레 : 62.83184
넓이 : 314.159200
둘레 : 62.831840
계속하려면 아무 키나 누르십시오 . . .
*/