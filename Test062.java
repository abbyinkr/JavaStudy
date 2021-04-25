/*======================================================
 ■■■ 실행 흐름의 컨트롤(제어문) ■■■
 - 반복문 (for문) 실습
 - 별찍기 실습
======================================================*/

// ○ 과제
// 다음과 같은 내용이 출력될 수 있도록
// 반복문의 중첩구문을 작성하여 프로그램을 구현한다.

/*  

*********
 *******
  *****
   ***
    *

*/

/*
<해석>
① 공백이 두번째항부터 1씩 늘어감
② 별이 9부터 2씩 줄어감
③ 공백과 별이 다 출력되면 개행됨

*/

public class Test062
{
	public static void main(String[] args)
	{
		for (int i=1 ; i<=5; i++) // i<=5 : 개행, i가 5가 될때까지 반복 = 5번 개행
		{
			for (int j=1; j<i; j++) // i-j → 1-0 2-1 3-2 4-3 5-4 j가 i보다 작을때까지만 반복
			{
				System.out.print(" ");
			}
			for (int k=1; k<=(-2*i+11); k++) // i=1일때 k는 9번 출력되어야 함 → k=10이면 반복그만!
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/* [실행 결과]
*********
 *******
  *****
   ***
    *
계속하려면 아무 키나 누르십시오 . . .
*/