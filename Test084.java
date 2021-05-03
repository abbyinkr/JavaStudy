/*=============================
   ■■■ 배열 (array) ■■■
   - 배열의 기본적인 활용
=============================*/

// ○ 과제
// 사용자로부터 임의의 정수를 임의의 갯수만큼 입력받아
// 입력받은 수 중에서 가장 큰 수를 출력하는 프로그램을 구현한다.
// 단, 배열을 활용하여 처리할 수 있도록 한다.

// 실행 예)
// 입력할 데이터의 갯수 : 10
// 데이터입력(공백구분) : 47 92 73 11 2 61 23 62 88 15 // → 배열 구성
// 가장 큰 수 → 92
// 계속하려면 아무 키나...

import java.util.Scanner;

public class Test084
{
	public static void main(String[] args)
	{
		// 스캐너 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		int n=0;

		do			// 사용자에게 입력안내 메세지 출력(1이상 정수)
		{
			System.out.print("입력할 데이터의 갯수 : ");
			n = sc.nextInt();
		}
		while (n<=0);

		// 배열 선언 및 메모리 할당
		int[] arr = new int[n];

		// 배열 구성요소 채우기 
		System.out.print("데이터입력(공백구분) : ");
		for (int i=0; i<n; i++)
			arr[i] = sc.nextInt();

		int max = arr[0];		// arr[0]을 최댓값이라고 가정하고 다음 배열요소와 비교

		for (int i=1; i<arr.length; i++)	// i=1 : arr[1]부터 arr[0]와 비교(반복줄이기)
		{
			if (max<arr[i])		
				max = arr[i];	// arr[i]를 max에 대입
		}

		System.out.printf("가장 큰 수 → %d\n", max);
	}
}

/* [실행 결과]
입력할 데이터의 갯수 : 10
데이터입력(공백구분) : 1 2 4 5 3 2 2 5 4 10
가장 큰 수 → 10
계속하려면 아무 키나 누르십시오 . . .
*/