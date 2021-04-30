/*========================================
   ■■■ 정렬(Sort) 알고리즘 ■■■
   - 선택 정렬(Selection Sort)
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

public class Test102
{
	public static void main(String[] args)
	{
		int[] a = {52, 42, 12, 62, 60};
		/*
		42, 52, 12, 62, 60			→ 0 1 
		======
		
		12, 52, 42, 62, 60			→ 0 2
		==      == 

		12, 52, 42, 62, 60			→ 0 3 
		==          ==
		12, 52, 42, 62, 60          → 0 4
		==              ==
		
		------------------------------------- 1회전
		
		12, 42, 52, 62, 60          → 1 2
		    ======

		12, 42, 52, 62, 60          → 1 3
		    ==      == 

		12, 42, 52, 62, 60          → 1 4
		    ==          == 
		------------------------------------- 2회전

		12, 42, 52, 62, 60          → 2 3
		        ====== 

		12, 42, 52, 62, 60          → 1 4
				==      ==

		------------------------------------- 3회전

		12, 42, 52, 60, 62          → 3 4
		            ======
		------------------------------------- 4회전
		*/
		
		/*
		System.out.print("Source Data : ");
		for (int i=0 ; i<a.length; i++)
			System.out.printf("%3d", a[i]);
		System.out.println();

		for (int i=0 ; i<4 ; i++)    // 기준데이터 i : 0 1 2 3
		{
			for (int j=i+1; j<a.length; j++)	// 비교데이터 j : 1 2 3 4 
			{
				if (a[i]>a[j])
				{
					a[i]=a[i]^a[j]; a[j]=a[j]^a[i]; a[i]=a[i]^a[j]; // 기준데이터와 비교데이터의 자리를 바꾼다
				}	// ※ 한줄코드로 보고 {}안쳤다. 주의할 것!!!!!!!!!
			}
			
			
			//a[0]>a[1] 이면 
			//a[1]와 a[0]의 자리 바꿈 42 52 12 62 0
			//a[0]>a[2] 42 > 12
			//a[2] a[0] 자리 바꿈 12 52 42 
			
		}

		System.out.print("Sorted Data : ");
		for (int i=0 ; i<a.length ; i++)
			System.out.printf("%3d", a[i]);
		System.out.println();
		
		*/

		int i, j;
		System.out.print("Source Data : ");
		/*
		for (i=0 ; i<a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		*/

		// 향상된 for문 → forEach 구문
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();
		//--==>> Source Data : 52 42 12 62 60

		// Selection Sort 구현
		for (i=0; i<a.length-1; i++)		// i → 0 1 2 3 → 비교 기준데이터 인덱스
		{	
			//System.out.println("웅");
			for (j=i+1; j<a.length; j++)	// j → 0 - 1 2 3 4 → 
			{								//      1 - 2 3 4
				//System.out.println("숑");	//      2 - 3 4
											//      3 - 4
				 if (a[i] > a[j])				//-- 오름차순 조건 구성
				 {								// 내림차순구성은 > → < 만 바꿈
					// 자리 바꾸기
					a[i] = a[i]^a[j];
					a[j] = a[j]^a[i];
					a[i] = a[i]^a[j];
				 }
			
			}                               

		}

		// 결과물 출력
		System.out.print("Sorted Data : ");
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();
	
		
	}

}

/* [실행 결과]
Source Data : 52 42 12 62 60
Sorted Data : 12 42 52 60 62
계속하려면 아무 키나 누르십시오 . . .
*/