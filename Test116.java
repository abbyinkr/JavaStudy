/*==================================
     ■■■ 클래스 고급 ■■■
     - 인터페이스(Interface)
==================================*/

// ○ 실습 문제
//    성적 처리 프로그램을 구현한다.
//    단, 인터페이스를 활용할 수 있도록 한다.

// 실행 예)
// 인원 수 입력(1~10) : 2
// 1번째 학생의 학번 이름 입력(공백 구분) : 2104256 박민지
// 국어 영어 수학 점수 입력   (공백 구분) : 90 100 85
// 2번째 학생의 학번 이름 입력(공백 구분) : 2104257 김서현
// 국어 영어 수학 점수 입력   (공백 구분) : 85 70 65

// 2104256 박민지 90 100  85     275     91
//                수  수  우 
// 2104257 김서현 85  70  65      220     73
//                우  미  양

// 계속하려면 아무 키나...

// 90 ~ 100 : 수
// 80 ~ 89  : 우
// 70 ~ 79  : 미
// 60 ~ 69  : 양
// 나머지   : 가

// 속성만 존재하는 클래스 → 자료형 활용

import java.util.Scanner;

class Record
{
	String hak, name;		//-- 학번, 이름
	int kor, eng, mat;		//-- 국어, 영어, 수학 점수
	int tot, avg;	        //-- 총점, 평균(편의상 정수처리)

}

//인터페이스
interface Sungjuk
{
	public void set();
	public void input();
	public void print();
}

// 문제 해결 과정에서 설계해야 할 클래스
class SungjukImpl implements Sungjuk
{
	private int inwon;
	private Record[] arr;

	// ① 인원수 입력
	@Override
	public void set()
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("인원 수 입력(1~10) : ");
			inwon = sc.nextInt();
		}
		while (inwon<1 || inwon>10);

		//Record타입의 배열 arr 길이 인원수 만큼 생성

		arr = new Record[inwon];
	}

	// 학번, 이름, 성적 입력후 총점, 평균(정수 형태) 산출 메소드 재정의 
	@Override
	public void input()
	{
		Scanner sc = new Scanner(System.in);

		for (int i=0; i<inwon; i++)
		{
			arr[i] = new Record();

			System.out.printf("%d번째 학생의 학번 이름 입력(공백 구분) : ", i+1);
			arr[i].hak = sc.next();
			arr[i].name = sc.next();
			
			System.out.print("국어 영어 수학 점수 입력   (공백 구분) : ");
			arr[i].kor = sc.nextInt();
			arr[i].eng = sc.nextInt();
			arr[i].mat = sc.nextInt();

			arr[i].tot += arr[i].kor + arr[i].eng + arr[i].mat;
			arr[i].avg = arr[i].tot/3;		
		}
	}
	
	// 출력 메소드 재정의
	@Override
	public void print()
	{
		// 결과값 담을 배열의 배열 만들기
		String[][] result = new String[inwon][3];	// 0 1 2 : 국어, 영어, 수학

		for (int i=0 ; i<inwon; i++)
		{
			switch (arr[i].kor/10)
			{
			case 10: case 9: result[i][0] = "수"; break;
			case 8: result[i][0] = "우";  break;
			case 7: result[i][0] =  "미"; break;
			case 6: result[i][0] = "양"; break;
			default: result[i][0] = "가";
			}

			switch (arr[i].eng/10)
			{
			case 10: case 9: result[i][1] = "수"; break;
			case 8: result[i][1] = "우";  break;
			case 7: result[i][1] =  "미"; break;
			case 6: result[i][1] = "양"; break;
			default: result[i][1] = "가";
			}

			switch (arr[i].mat/10)
			{
			case 10: case 9: result[i][2] = "수"; break;
			case 8: result[i][2] = "우";  break;
			case 7: result[i][2] =  "미"; break;
			case 6: result[i][2] = "양"; break;
			default: result[i][2] = "가";	
			}
		}//end 결과값 담기 

		
		// 출력
		for (int i=0 ; i<arr.length ; i++)
		{
			System.out.printf(" %s %s ", arr[i].hak, arr[i].name);
			System.out.printf("%3d %3d %3d %4d %3d",arr[i].kor, arr[i].eng, arr[i].mat, arr[i].tot, arr[i].avg);
			System.out.println();
			System.out.printf("%18s %2s %2s",result[i][0], result[i][1], result[i][2]);
			System.out.println();
		}	

	}//end print()
}//end class SungjukImpl

public class Test116
{
	public static void main(String[] args)
	{
		// check~!!!
		// Sungjuk 은 인터페이스
		//Sungjuk ob;
		// 인터페이스는 객체생성 불가능
		
		// 인터페이스를 구현한 클래스 기반의 인스턴스 생성
		// SungjukImpl ob = new SungjukImpl();

		Sungjuk ob = new SungjukImpl();	// 업캐스팅

		// 문제 해결 과정에서 작성해야 할 ob 구성
		ob.set();
		ob.input();
		ob.print();

	}
}