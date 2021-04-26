/*=============================
   ■■■ 배열 (array) ■■■
   - 배열과 난수 처리
=============================*/

// 사용자로부터 임의의 정수를 입력받아
// 그 정수의 갯수만큼 난수(1~100)를 발생시켜서 배열에 담고
// 배열에 담겨있는 데이터들 중 
// 가장 큰 값과 가장 작은 값을 선택하여 출력하는 프로그램을 구현한다.

// 실행 예)
// 발생시킬 난수의 갯수 입력 : 3
// (52 21 17 → 무작위로 발생한 정수들... → 배열에 담아내기(배열 구성))
// 가장 큰 값 : 52, 가장 작은 값 : 17
// 계속하려면 아무 키나...

import java.util.Scanner;
import java.util.Random;	// 난수 생성 클래스

public class Test090
{
	public static void main(String[] args)
	{
		// Scanner 클래스 기반 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		// 안내 메세지 출력
		System.out.print("발생시킬 난수의 갯수 입력 : ");
		int size = sc.nextInt();

		// size 변수에 담아낸 수 만큼의 배열방 만들기
		// (배열 선언 및 메모리 할당)
		int[] arr = new int[size];

		// 무작위 숫자(난수)를 발생시키기 위해서는
		// 난수 발생 전용 객체가 필요하다.
		// → 『java.util.Random』
		Random rd = new Random();

		// 테스트
		//System.out.println("발생한 난수 : " + rd.nextInt(100)); // 0 ~ 99 
		// ※ 『Random』클래스의 『nextInt()』메소드
		//	   0 ~ 매개변수로 넘겨받은 정수-1 까지의 수 중
		//	   무작위 정수(난수) 1개를 발생시킨다.

		for (int i=0 ; i<size; i++)	// for (int i=0 ; i<arr.length; i++)
		{	arr[i] = rd.nextInt(100)+1; // (0~99)+1 → 1~100
			System.out.printf("%4d", arr[i]); // 대입된 arr 배열 구성요소 확인
		}
		System.out.println();

		

		 /*
		 for(int i=0, n=1; (i+n)<arr.length; i++, n++)   // i=0
		 {
			 if(arr[i]<arr[i+n])				// arr[0]<arr[1]   1 < 2 3 -> 2  1  3  
			 {
				arr[i]= arr[i]^arr[i+n];		// arr[0]=arr[0]^arr[1]
				arr[i+n]= arr[i+n]^arr[i];		// arr[1]=arr[1]^arr[0]
				arr[i]= arr[i]^arr[i+n];		// arr[0]=arr[0]^arr[1]
				n++;
			 }
		 }
		 */
			 
			 // 자리바꾸기는 아닌거같음
		/*
			 for (int i=0 ; (i+1)<size; i++)
			 {
				 if (arr[i] < arr[i+1])
				 {
					arr[i] = arr[i+1];
				 }
			
			 }
		*/
		

		// 같이 푼 내용

		// ex)  56  61  36  83  53  35  53  80  45  98

		int max, min;		//-- 최대값, 최소값
		//min = arr[0];
		//max = arr[0];
		max = min = arr[0]; //-- max==min==56 으로 임시 대입! (계속 비교 할거니까)

		for (int i=1; i<arr.length; i++) // 이미 arr[0]으로 초기화했으니까 반복줄이기 위해 i=1부터 반복
		{
			// max 와 i번째 요소의 크기 비교 → i가 더 큰 상황 → max 에 i 대입
			if (max<arr[i])
				max = arr[i];
			
			// min 과 i번째 요소의 크기 비교 → i가 더 큰 상황 → min 에 i 대입
			if (min>arr[i])				// else if 아니고 한번 더 검사해야되니까 if
				min = arr[i];
		}

		// 결과 출력
		System.out.printf("가장 큰 값 : %d, 가장 작은 값 : %d\n", max, min);

		
	}

}


/* [실행 결과] 
발생시킬 난수의 갯수 입력 : 10
  32  92  65  32   5  75  87  11  75  94
가장 큰 값 : 94, 가장 작은 값 : 5
계속하려면 아무 키나 누르십시오 . . .

*/