/*=============================
   ■■■ 배열 (array) ■■■
   - 배열의 기본적인 활용
=============================*/

// ○ 실습 문제
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
// 이정헌 010-1111-1111 
// 이희주 010-1111-1111 
// 소서현 010-1111-1111 
// --------------------
// 계속하려면 아무 키나...

import java.util.Scanner;
import java.io.IOException;

public class Test083_1 // 클래스-메소드
{
	// 주요 변수 선언
	int n;

	void inputSu() throws IOException
	{
	// sc 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		
		// 학생 수 입력 안내 메세지 및 저장
		System.out.print("입력 처리할 학생 수 입력(명, 1~10) : ");
		n = sc.nextInt();
	}//end inputSu()

	String makeName()
	{
		
		// 배열 생성하여 이름, 전화번호 저장
		String[] name = new String[n];
		String[] number = new String[n];  
	
	}// end name

	public static void main(String[] args) throws IOException
	{
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

	
// --------------------
// 전체 학생 수 : 3명
// --------------------
// 이름       전화번호
// 이정헌 010-1111-1111 
// 이희주 010-1111-1111 
// 소서현 010-1111-1111 
// --------------------
// 계속하려면 아무 키나...
		

	}//end main
}//end class Test083