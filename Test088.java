/*=============================
   ■■■ 배열 (array) ■■■
   - 배열의 배열(2차원 배열)
=============================*/

// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열(5x5)를 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)

/*
  1  2  3  4  5
  2  3  4  5  6
  3  4  5  6  7
  4  5  6  7  8
  5  6  7  8  9
 계속하려면 아무 키나..
*/

/*
  1  2  3  4  5		→ i==0
  6  7  8  9 10		→ i==1
 11 12 13 14 15		→ i==2
 16 17 18 19 20		→ i==3
 21 22 23 24 25		→ i==4

*/

public class Test088 
{
	public static void main(String[] args)
	{
		/*
		int n;
		
		// 배열의 배열 선언과 메모리 할당
		int[][] arr;
		arr = new int[5][5];
		
		// 배열의 배열 구성
		for (int i=0; i<arr.length; i++)
		{
			n = (i+1);
			for (int j=0; j<arr[i].length; j++)
			{
				arr[i][j] = n;
				n++;
			}
		}

		// 배열의 배열 출력

		for (int i=0 ; i<arr.length; i++)
		{
			for (int j=0 ; j<arr[i].length; j++)
			{
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		*/

		// 배열의 배열 선언 및 메모리 할당
		int[][] arr = new int[5][5];

		int n;

		// 웅~ 
		for (int i=0; i<arr.length; i++)	// i → 0 1 2 3 4 
		{
			n = i + 1;
			// 쑝~
			for (int j=0; j<arr[i].length; j++) // j → 0 1 2 3 4 / 0 1 2 3 4 / ...
			{
				arr[i][j] = n;
				n++;
			}
		}

		// 배열의 배열 요소 전체 출력

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
				System.out.printf("%3d", arr[i][j]); // 1줄이니까 {} 생략가능 
			System.out.println(); 
		}
	}//end main
}

/* [실행 
  1  2  3  4  5
  2  3  4  5  6
  3  4  5  6  7
  4  5  6  7  8
  5  6  7  8  9
계속하려면 아무 키나 누르십시오 . . .
*/