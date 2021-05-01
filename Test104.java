/*================================================
        ■■■ 정렬(Sort) 알고리즘 ■■■
   - 향상된 버블 정렬(Bubble Sort : 거품 정렬)
================================================*/

/*
※ 앞서 공부한 Selection Sort 나 Bubble Sort 의 성능은 같다. (반복횟수로 측정)
   하지만, 향상된 Bubble Sort는 대상이 되는 데이터의 구조에 따라
   일반 Bubble Sort 나 Slection Sort 보다 성능이 좋을 수 있다.

원본 데이터 = 61 15 20 22 30
			  15 20 22 30 61	-- 1회전 (스왑 발생)      → 다음 회전 ○
			  15 20 22 30 61	-- 2회전 (스왑 발생 안함) → 다음 회전 Ⅹ

==> 1회전 수행...2회전 수행...을 해 보았더니...
	2회전을 수행하는 과정에서 스왑(자리바꿈)이 전혀 일어나지 않았기 때문에
	불필요한 추가 연산(회전:반복)을 수행하지 않는다.
	즉, 더이상의 반복은 무의미한 것으로 판단한다.

*/


public class Test104
{
	
	public static void main(String[] args)
	{
		int[] a = {10, 50, 20, 33, 40};

		/*
		10, 50, 20, 33, 40			→ 0 1
		======

		10, 20, 50, 33, 40			→ 1 2
			======
			
		10, 20, 33, 50, 40			→ 2 3
		        ======

		10, 20, 33, 40, 50			→ 3 4
		            ======

		----------------------------------- 1회전

		10, 20, 33, 40, 50			→ 0 1
		======
			======					→ 1 2
				======				→ 2 3
		----------------------------------- 2회전
		X
		X
		X
   
		*/

		/*
		// 초기 데이터 출력
		System.out.print("Source Data : ");
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();

		// 향상된 Bubble Sort 구현
		
		int i, j;
		boolean flag;

		for (i=1; i<a.length; i++)
		{	
			//System.out.println("웅~");
			flag = false;				// 회전 마칠 때마다 초기화
			for (j=0; j<a.length-i ; j++)
			{	
				//System.out.println("쑝");
				if (a[j] > a[j+1])
				{
					a[j] = a[j]^a[j+1];
					a[j+1] = a[j+1]^a[j];
					a[j] = a[j]^a[j+1];
					flag = true;		// true 면 한번이라도 스왑이 된거임
				}
			}
			// 테스트
			//System.out.println(flag);
			if (flag==false)
				break;
		}

		// 결과 데이터 출력
		System.out.print("Sorted Data : ");
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();
		*/

		// [선생님 풀이]

		// 초기 데이터 출력
		System.out.print("Source Data : ");
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();

		// 향상된 Bubble Sort 구현
		int pass=0;
		boolean flag;

		do
		{
			pass++;
			flag = false;

			for (int i=0; i<a.length-pass; i++)
			{
				if (a[i] > a[i+1])
				{
					// 자리 바꾸기
					a[i] = a[i]^a[i+1];
					a[i+1] = a[i]^a[i+1];
					a[i] = a[i]^a[i+1];

					flag = true;	// 자리 바꿈이 일어났다는 사실 확인~!!!
				}
			}
		}
		while (flag);
		// 회전이 구분적으로 발생하는동안(웅~) 스왑(자리바꿈)이 일어나지 않은경우로
		// 더이상의 반복은 수행이 무의미한 것으로 판단~!!!

		System.out.print("Sorted Data : ");
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();
	
	}
}