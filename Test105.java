/*=========================================
     ■■■ 정렬(Sort) 알고리즘 ■■■
=========================================*/

// ○ 실습 문제
//	  사용자로부터 여러 학생의 성적 데이터를 정수 형태로 입력받아
//	  점수가 높은 순으로 등수를 부여하여 결과를 출력하는 프로그램을 구현한다.
//    단, 배열과 정렬 알고리즘을 활용하여 작성할 수 있도록 한다.

// 실행 예)
// 인원 수 입력 : 5
// 이름 점수 입력(1) : 박정준 90
// 이름 점수 입력(2) : 선혜연 80
// 이름 점수 입력(3) : 소서현 85
// 이름 점수 입력(4) : 심혜진 75
// 이름 점수 입력(5) : 안정미 95

//==================
// 1등 안정미 95
// 2등 박정준 90
// 3등 소서현 85
// 4등 선혜연 80
// 5등 심혜진 75
//==================
// 계속하려면 아무 키나...

import java.util.Scanner;

public class Test105
{
	public static void main(String[] ags)
	{
		Scanner sc = new Scanner(System.in);
		
		int inwon;			// 인원수
		String[] names;		// 이름 배열(String)
		int[] scores;		// 점수 배열(int)
		
		// 사용자에게 인원수 입력 안내 메세지 출력과 배열의 방 갯수 결정
		do
		{
			System.out.print("인원 수 입력 : ");
			inwon = sc.nextInt();
			names = new String[inwon];
			scores = new int[inwon];
		}
		while (inwon<1);
		
		
		// 이름과 성적배열에 각각 값 담기
		for (int i=0; i<inwon ; i++)
		{
			System.out.printf("이름 점수 입력(%d) : ", i+1);
			names[i] = sc.next();
			scores[i] = sc.nextInt();
		}

		//------------여기까지 하면 이름이랑 성적 저장 완료~!!!
		
		// 향상된 버블 정렬 활용
		int pass=0;
		boolean flag=false;
		String temp;
		// String temp = new String[inwon]; 
		// temp는 출력안해서 초기화안해도 괜찮았음.

		do
		{
			pass++;
			flag = false;
			for (int j=0; j<scores.length-pass; j++)
			{
				if (scores[j] < scores[j+1])		// 내림차순 정렬
				{
					scores[j] = scores[j]^scores[j+1];
					scores[j+1] = scores[j]^scores[j+1];
					scores[j] = scores[j]^scores[j+1];

					/* 비트열 연산은 문자열이니까 안됨!
					names[i] = names[i]^names[i+1];
					names[i+1] = names[i+1]^names[i];
					names[i] = names[i]^names[i+1];
					*/
					

					temp = names[j];
					names[j] = names[j+1];
					names[j+1] = temp;

					// 스왑이 이루어지면 flag에 true로 변경
					flag = true;
				}
			}
		}
		while (flag);

		// 테스트
		//System.out.print("Sorted Data 점수 : ");
		//for (int n : scores)
		//	System.out.print(n + " ");
		//System.out.println();

		//System.out.print("Sorted Data 이름 : ");
		//for (String n : names)
		//	System.out.print(n + " ");
		//System.out.println();

		// 결과 출력
		
		/*
		System.out.println("===================");
		for (int j=0; j<inwon; j++)
			System.out.printf("%3d등 %3s %3d\n", (j+1), names[j], scores[j]);
		System.out.println("===================");
		*/



	}
}