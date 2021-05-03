/*=============================
   ■■■ 배열 (array) ■■■
   - 배열의 기본적인 활용
=============================*/

// ○ 과제
// 사용자로부터 학생 수를 입력받고, 그 만큼의 정수(정수형태)를 입력받아
// 전체 학생 점수의 합, 평균, 편차를 구하여 결과를 출력하는 프로그램을 구현한다.

// 실행 예) 
// 학생 수 입력 : 5
// 1번 학생의 점수 입력 : 90
// 2번 학생의 점수 입력 : 82
// 3번 학생의 점수 입력 : 64
// 4번 학생의 점수 입력 : 36
// 5번 학생의 점수 입력 : 98

// >> 합   : 370
// >> 평균 : 74.0 //<- 실수
// >> 편차 : 
// 90 : -16.0
// 82 : -8.0
// 64 : 10.0
// 36 :38.0
// 98 :-24.0
// 계속하려면 아무 키나...

import java.util.Scanner;

public class Test085
{
	public static void main(String[] args)
	{
		// Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		int n; // 루프 변수

		// 사용자에게 안내 메세지 출력

		System.out.print("학생 수 입력 : ");
		n = sc.nextInt();

		// n개방의 배열 생성
		int[] score = new int[n];	

		// n번 학생까지의 점수 배열에 담기
		for (int i=0; i<n; i++)
		{
			System.out.printf("%d번 학생의 점수 입력 : ", (i+1));
			score[i] = sc.nextInt();
		}
		// 테스트
		/*
		for (int i=0; i<score.length; i++)
		{
			System.out.printf(" %d번 학생 점수 : %d\n", (i+1), score[i]);
		}
		*/

		// 구하고자 하는 값 연산(합, 평균 ,편차)
		int sum=0;	// 누적합 0으로 초기화
		double avg;	// 

		double[] dev = new double[n];	// 개별 점수에 대한 편차를 구해야하므로 배열로 생성

		// 반복문을 통해 누적합 sum 구하기
		for (int i=0; i<n; i++)
		{
			sum += score[i];
		}
		
		// 평균 구하기
		avg = sum/n;

		// 각 점수의 편차 구하기
		for (int i=0; i<n; i++)
		{
			dev[i] = avg-score[i];
		}

		// 결과 출력

		System.out.println(); 
		System.out.printf(">> 합   : %d\n", sum);
		System.out.printf(">> 평균 : %.1f\n", avg);
		System.out.println(">> 편차 : "); 
		
		for (int i=0; i<n; i++)
		{
			System.out.printf("%3d : %5.1f\n", score[i], dev[i]);
		}
		
	} //end main
}// end class Test085

/* [실행 결과]
학생 수 입력 : 5
1번 학생의 점수 입력 : 20
2번 학생의 점수 입력 : 50
3번 학생의 점수 입력 : 30
4번 학생의 점수 입력 : 76
5번 학생의 점수 입력 : 57

>> 합   : 233
>> 평균 : 46.0
>> 편차 :
 20 :  26.0
 50 :  -4.0
 30 :  16.0
 76 : -30.0
 57 : -11.0
계속하려면 아무 키나 누르십시오 . . .
*/