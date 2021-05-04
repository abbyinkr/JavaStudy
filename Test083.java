/*=============================
   ■■■ 배열 (array) ■■■
   - 배열의 기본적인 활용
=============================*/

// ○ 과제
// 사용자로부터 인원 수를 입력받고
// 이렇게 입력받은 인원수 만큼의 학생 이름과 전화번호를 입력받아
// 입력받은 내용을 전체 출력하는 프로그램을 구현한다.
// 단, 배열을 활용하여 처리할 수 있도록 한다.

// 실행 예)
// 입력 처리할 학생 수 입력(명, 1~10) : 3
// 이름, 전화번호 입력[1](공백 구분) : 이정헌 010-1111-1111
// 이름, 전화번호 입력[2](공백 구분) : 이희주 010-1111-1111
// 이름, 전화번호 입력[3](공백 구분) : 소서현 010-1111-1111 // 이름 배열과 전화번호 배열을 구분해서 처리

// --------------------
// 전체 학생 수 : 3명
// --------------------
// 이름       전화번호
// 이정헌 010-1111-1111				// 0으로 시작하는 숫자는 입력된 수를 숫자타입(정수,실수)로 받으면 안됨!!
// 이희주 010-1111-1111 
// 소서현 010-1111-1111 
// --------------------
// 계속하려면 아무 키나...

import java.util.Scanner;
import java.io.IOException;

public class Test083
{

	public static void main(String[] args) throws IOException
	{
		/*
		// 주요 변수 선언
		int n;
		// sc 인스턴스 생성
		Scanner sc = new Scanner(System.in);	// 공백구분해서 받아오는거는 Scanner!! 아스키코드는 System.in.read~~~ 외우자
	
		// 학생 수 입력 안내 메세지 및 저장

		System.out.print("입력 처리할 학생 수 입력(명, 1~10) : ");
		n = sc.nextInt();				// int n = 3

		// 배열 생성하여 이름, 전화번호 저장
		String[] name = new String[n];	  // String[] name = new String[3];			 왜 String을 Spring으로 쓰는거지... 주의!
		String[] number = new String[n];  // String[] number = new String[3];
		// 테스트 System.out.println("name.length : "+ name.length);

		for (int i=0 ; i<n; i++)	// for문 쓸때 ()안에 자료형 쓰기! ex) int										
		{
			System.out.printf("이름, 전화번호 입력[%d](공백 구분) : ", (i+1));
			name[i] = sc.next();
			number[i] = sc.next();
		}

		// 결과 출력

		System.out.println("--------------------");
		System.out.printf("전체 학생 수 : %2d명\n", n);
		System.out.println("--------------------");
		System.out.println(" 이름      전화번호 ");
		for (int i=0; i<n; i++)
		{
			System.out.printf("%3s %13s\n", name[i], number[i]);
		}
		System.out.println("--------------------");
		*/

		// 같이 푼 내용

		// Scanner 클래스 기반 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		// 사용자가 입력하는 학생수를 담아둘 변수
		int memCount = 0;

		// ○ 사용자 입력값 받아오기

		do
		{
			System.out.print("입력 처리할 학생 수 입력(명, 1~10) : ");
			memCount = sc.nextInt();
		}
		while (memCount <1 || memCount>10);				// 1~10 사이의 수 입력하라는 조건 까먹;; 

		// 테스트
		//System.out.println("입력 처리할 학생 수 입력(명, 1~10) : " + menCount);

		// ○ 이름 저장 배열 구성 → 입력받은 인원 수 만큼의 배열방 갯수
		String[] names = new String[memCount];

		// ○ 전화 번호 배열 구성 → 입력받은 인원 수 만큼의 배열방 갯수
		String[] tels = new String[memCount]; // String[] tels = new String[names.length];
		
		// ○ 반복문을 활용하여 사용자의 입력데이터를 배열에 담아내기
		for (int n=0; n<memCount; n++) // memCount == names.length == tels.length
		{
			System.out.printf("이름, 전화번호 입력[%d](공백 구분) : ",(n+1));
			// 이정헌 010-1111-1111
			names[n] = sc.next();
			tels[n] = sc.next();
		}

		// ○ 최종 결과(이름, 전화번호) 출력
		System.out.println("----------------------");
		System.out.printf("전체 학생 수 : %2d명\n", memCount);
		System.out.println("----------------------");
		System.out.println(" 이름      전화번호 ");

		for (int m=0; m<memCount; m++)
		{
			System.out.printf("%3s %14s\n", names[m], tels[m]);
		}
		System.out.println("----------------------");

		

	}//end main
}//end class Test083

/* [실행 결과]

입력 처리할 학생 수 입력(명, 1~10) : 2
이름, 전화번호 입력[1](공백 구분) : 김가영 111-2222-3333
이름, 전화번호 입력[2](공백 구분) : 이새롬 000-1111-2222
----------------------
전체 학생 수 :  2명
----------------------
 이름      전화번호
김가영  111-2222-3333
이새롬  000-1111-2222
----------------------
계속하려면 아무 키나 누르십시오 . . .

*/