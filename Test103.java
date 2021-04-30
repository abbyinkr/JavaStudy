/*========================================
   ■■■ 정렬(Sort) 알고리즘 ■■■
   - 버블 정렬(Bubble Sort : 거품 정렬)
========================================*/

/*
○ 정렬
   : 데이터를 특정한 규칙(기준)에 맞게 순서대로 나열(오름차순, 내림차순)

○ 정렬의 목적
   : 데이터 처리 과정의 편의성이나 가독성을 높이기 위함
     → 보기 좋게... 검색하기 위함

※ 정렬은... 리소스 소모가 심하다.

○ 정렬의 종류
   : 선택 정렬, 버블 정렬, 삽입 정렬, 힙 정렬, 퀵 정렬, 쉘 정렬, ....

*/

public class Test103
{
	public static void main(String[] args)
	{
		int[] a = {52, 42, 12, 62, 60};
		/*
		42, 52, 12, 62, 60			→ 0 1
		======

		42, 12, 52, 62, 60			→ 1 2
			======
		
		42, 12, 52, 62, 60			→ 2 3
		        ======

		42, 12, 52, 60, 62			→ 3 4
					======

		-------------------------------------- 1회전

		42, 12, 52, 60, 62			→ 0 1
		======

		12, 42, 52, 60, 62			→ 1 2
			======
		
		12, 42, 52, 60, 62			→ 2 3
		        ======

		-------------------------------------- 2회전

		12, 42, 52, 60, 62			→ 0 1
		======

		12, 42, 52, 60, 62			→ 1 2
			======

		-------------------------------------- 3회전


		12, 42, 52, 60, 62			→ 0 1
		======

		-------------------------------------- 4회전

		*/

		/*
		
		// 원본 데이터 출력(forEach구문)

		System.out.print("Source Data : ");
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();

		// Bubble Sort for문

		int i, j;
							//a.length=5
		for (i=1; i<a.length; i++)		
		{
			//System.out.println("웅");
			for (j=0; j+i<a.length; j++)  // 1- 4번 2-3번 3-2번 4-1번
			{
				if (a[j] > a[j+1])	//--오름차순 정렬
				{
					a[j]=a[j]^a[j+1];
					a[j+1]=a[j+1]^a[j];
					a[j]=a[j]^a[j+1];
				}
				//System.out.println("쑝!");
			}
			
			
			// i=0
			// a[0] a[1]
			// a[1] a[2]
			// a[2] a[3]
			// a[3] a[4]

			// i=0 일때 j의 최댓값 3 → i+j = 3

			// i=1
			// a[0] a[1]
			// a[1] a[2]
			// a[2] a[3]

			//i = 1 일때 j의 최댓값 2 → i+j = 3
		
		}

		결과 데이터 출력 
			System.out.print("Sorted Data : ");
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();

		*/

		// [선생님 풀이]

		int i, j;

		// 초기 데이터 출력
		System.out.print("Source Data : ");
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();

		// Bubble Sort 구현

		for (i=1; i<a.length; i++)		// i → 1 2 3 4
		{								//      → 뒤에서 뺄셈을 수행해주는 역할
			for (j=0; j<a.length-i; j++)  // j → 0 1 2 3 / 0 1 2 / 0 1 / 0
			{
				// 01 12 23 34 
				// 01 12 23
				// 01 12
				// 01

				if (a[j] > a[j+1])	// 오름차순 정렬
				{
					// 자리 바꾸기
					a[j] = a[j]^a[j+1];
					a[j+1] = a[j+1]^a[j];
					a[j] = a[j]^a[j+1];
				}
			}
		}

		System.out.print("Sorted Data : ");
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();
		
	}
}

/* [실행 결과]
Source Data : 52 42 12 62 60
Sorted Data : 12 42 52 60 62
2021-02-25
*/