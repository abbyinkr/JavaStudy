/*=============================
   ■■■ 배열 (array) ■■■
   - 배열의 복사
=============================*/

// ○ 실습 문제
// 임의의 배열(a, b)에 들어있는 숫자들의 합집합을 출력하는 프로그램을 구현한다.
// 단, 중복이 제거된 상태의 합집합을 출력할 수 있도록 한다.
// 또한, 배열 복사 개념을 적용시켜 처리할 수 있도록 한다.

// ex) 임의의 두 배열
// int[] a = {2, 3, 7, 10, 11}
// int[] b = {3, 6, 10, 14}

// 실행 예)
/*
// 첫 번째 배열 요소를 입력하세요(공백 구분) : 2 3 7 10 11
// 두 번째 배열 요소를 입력하세요(공백 구분) : 3 6 10 14
*/

// 2 3 7 10 11 6 14
// 계속하려면 아무 키나..

import java.util.Scanner;

public class Test099
{
	public static void main(String[] args)
	{
		/*
		int[] a = {2, 3, 7, 10, 11};
		int[] b = {3, 6, 10, 14};  
		
		
		Scanner sc = new Scanner(System.in);

		
		System.out.print("첫 번째 배열 요소를 입력하세요(5개, 공백 구분) :");
		for (int i=0; i<a.length; i++)
			a[i] = sc.nextInt();
		
		
		System.out.print("두 번째 배열 요소를 입력하세요(4개, 공백 구분) :");
		for (int i=0; i<b.length; i++)
			b[i] = sc.nextInt();


		// 중복값 제거 및 합집합 배열 길이 정하기
		int n1 = a.length + b.length;
		
		for (int i=0; i<a.length; i++)
		{
			for (int j=0; j<b.length; j++)
			{
				if (a[i]==b[j])
				{
					a[i]=0;
					b[i]=0;

				}
			}
		}

		int[] temp;
		temp = copyArray(a);

		for (int i=0 ; i<temp.length; i++)
		{
			System.out.print(temp[i] + " ");
		}

		//  복사배열 2개 만들어서 0빼고 출력하면 될거같은디...
		*/

		// [선생님 풀이]
		// 임의의 두 배열
		int[] a = {2, 3, 7, 10, 11};
		int[] b = {3, 6, 10, 14};

		// 방법 ①
		/*
		// - 집합 a 의 전체 요소 출력
		for (int i=0; i<a.length; i++)
			System.out.printf("%3d", a[i]);

		// - 집합 b 의 요소 출력
		//	 단, 집합 b는 집합 a의 요소와 중복되는 데이터를 
		//	 제거하면서 출력
		for (int i=0 ; i<b.length ; i++)		// 4회전 → 3, 6, 10, 14 (선택적 출력)
		{
			boolean flag = false;

			for (int j=0; j<a.length; j++)		// 5회전 → 2, 3, 7, 10, 11
			{
				if (b[i]==a[j])	
				{
					flag = true;
					break;						// 멈춘다 그리고 빠져나간다(j 관련 반복문)
				}
			}

			if (flag)							// flag가 true라면...
				continue;						// 뒷부분 무시하고 계속해라
	
			System.out.printf("%3d", b[i]);		// 뒷부분!
		}
		System.out.println();
		*/
		
		// 방법 ②
		// - 임시 배열을 만들고
		//int[] temp = new int[????];
		int[] temp = new int[a.length + b.length]; // 중복값이 하나도 없더라도 다 표현할수있도록

		// - 만들어진 임시 배열에 중복되지 않은 배열 요소를 채운 다음
		// check~!!!
		int n;							//-- 변수의 선언 위치 중요~!!

		for (n=0; n<a.length; n++)
			temp[n] = a[n];
		// 테스트 
		//System.out.println(n);
		//--==>> 5

		for (int k=0; k<b.length; k++)
		{
			boolean flag = false;

			for (int m=0; m<a.length; m++)
			{
				if (b[k] == a[m])
				{
					flag = true;
					break;
				}
			}

			if(flag)
				continue;

			temp[n]= b[k];		//-- 뒷부분~!!!
			n++;				//
		}

		// - 그렇게 구성된 임시 배열을 출력(채워진만큼...)

		for (int h=0; h<n; h++)
			System.out.printf("%4d", temp[h]);

		System.out.println();

	}

	/*
	public static int[] copyArray(int[] os)
	{
		int[] temp= new int[os.length];
		for (int i=0; i<os.length; i++)
		{
			temp[i] = os[i];
		}
		return temp;
	}
	*/

}

/* [실행 결과]
   2   3   7  10  11   6  14
계속하려면 아무 키나 누르십시오 . . .
*/