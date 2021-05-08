
//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class CircleTest
{
	// 내가 푼 내용
	/*
	int r;  // 전역 변수

	void input() // 입력 메소드
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름 입력 : ");
		r = sc.nextInt();
		System.out.println(); //개행
	}

	double calArea() // 원의 넓이 계산 메소드
	{
		double result = r * r * 3.141592;
		return result;
	}

	double calLength() // 원의 둘레 계산 메소드
	{
		return r * 2 * 3.141592;
	}

	void print(double a, double l) // 결과 출력 메소드
	{
		System.out.printf(">> 반지름이 %d 인 원의\n", r);
		System.out.printf(">> 넓이 : %.2f\n", a);
		System.out.printf(">> 둘레 : %.2f\n", l);
	}
	*/

	// 같이 푼 내용
	
	private int r;						//-- 반지름
	//double pi = 3.141592;
	final double PI = 3.141592;		//-- 원주율
	//--『final』 : 변수의 상수화
		
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("반지름 입력 : ");
		r = Integer.parseInt(br.readLine());
	}

	double calArea()
	{
		double result;
		// result = 반지름 * 반지름 * 3.141592;
		result = r * r * PI;
		return result;
	}

	double calLength() // 연산에 필요한 데이터가 없을때 = 매개변수로 받아와야 함, 멤버변수로 있을땐 괜춘 
	{
		// 둘레 = 반지름 * 2 * 3.141592
		double result;
		result = r * 2 * PI;
		return result;
	}

	void print(double a, double l)
	{
		System.out.printf("\n>> 반지름이 %d인 원의\n", r);
		System.out.printf(">> 넓이 : %.2f\n", a);
		System.out.printf(">> 둘레 : %.2f\n", l);
	}
}//end class Circletest
