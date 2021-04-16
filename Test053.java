/*=======================================
 ■■■ 실행 흐름의 컨트롤(제어문) ■■■
 - 반복문 (while문) 실습
=======================================*/

// ○ 과제
// 사용자로부터 원하는 단(구구단)을 입력받아
// 해당하는 구구단을 출력하는 프로그램을 구현한다.
// 단, 1단 ~ 9단 사이의 수를 입력받은 상황이 아니라면
// 프로그램을 종료해버릴 수 있도록 처리한다. --> return 이용

// 실행 예)
// 원하는 단(구구단) 입력 : 8
// 8 * 1 = 8
// 8 * 2 = 16
//   :
// 8 * 9 = 72
// 계속하려면 아무 키나...

// 원하는 단(구구단) 입력 : 11
// 1부터 9까지의 정수만 입력 가능합니다.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test053
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 주요 변수 선언
		int n, num;		// 루프 변수 n, 사용자 입력 정수 num
		n = 1;
		
		System.out.print("원하는 단(구구단) 입력 : ");
		num = Integer.parseInt(br.readLine());

		if (num<=9)
		{
			while (n<=9)
			{
;
				System.out.printf("%d * %d = %d\n", num, n, (num*n));

				n++;
			}
		}
		else
			System.out.println("1부터 9까지의 정수만 입력 가능합니다.");
			return;
		
	}
}

/* [실행 결과] 
원하는 단(구구단) 입력 : 3
3 * 1 = 3
3 * 2 = 6
3 * 3 = 9
3 * 4 = 12
3 * 5 = 15
3 * 6 = 18
3 * 7 = 21
3 * 8 = 24
3 * 9 = 27
계속하려면 아무 키나 누르십시오 . . .

원하는 단(구구단) 입력 : 11
1부터 9까지의 정수만 입력 가능합니다.
계속하려면 아무 키나 누르십시오 . . .


*/