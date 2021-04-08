/*=======================================
 ■■■ 실행 흐름의 컨트롤(제어문) ■■■
 - if ~ else문 실습
=======================================*/

// ○ 과제
// 사용자로부터 임의의 연도를 입력받아
// 입력받은 연도가 윤년인지, 평년인지 판별하여
// 결과를 출력하는 프로그램을 구현한다.
// 단, if ~ else 조건문을 활용할 수 있도록 한다.

// 실행 예)
// 임의의 연도 입력 : 2020
// >> 2020 → 윤년
// 계속하려면 아무 키나...

// 임의의 연도 입력 : 2021
// >> 2021 → 평년
// 계속하려면 아무 키나...

//	※ 윤년의 판별 조건
//	연도가 4의 배수이면서 100의 배수가 아니거나
//	또는, 400의 배수이면 윤년~!!!
//	그렇지 않으면 평년~!!!

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int year;
		String strData;

		System.out.print("임의의 연도 입력 : ");
		year = Integer.parseInt(br.readLine());
		
		if (year%4 == 0 && year%100!= 0 || year%400 == 0)
			strData = "윤년";
		else if (year>0)
			strData = "평년";
		else
			strData= "값을 잘못 입력했습니다.";
		System.out.printf(">> %d → %s\n", year, strData);
	}
}

/* [실행 결과]
임의의 연도 입력 : 2020
>> 2020 → 윤년
계속하려면 아무 키나 누르십시오 . . .

임의의 연도 입력 : 2021
>> 2021 → 평년
계속하려면 아무 키나 누르십시오 . . .

*/