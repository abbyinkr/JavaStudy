/*===================================
   ■■■ 클래스와 인스턴스 ■■■
   - 클래스와 인스턴스 할용
===================================*/

// ○ 실습 문제
// 학생별로 국어점수, 영어점수, 수학점수를 입력받아
// 총점, 평균을 산출하는 프로그램을 구현한다.
// 단, 클래스의 개념을 활용하여 작성할 수 있도록 한다.
// 또한, 이 과정에서 배열을 적극적으로 활용할 수 있도록 한다.
// 마지막으로, 다음의 요구사항을 충족할 수 있도록 설계한다.

// 프로그램을 구성하는 클래스
// 1. Record 클래스
//	  - 속성만 존재하는 클래스로 설계할 것~!!! → 변수로만 구성된 클래스
// 2. Sungjuk 클래스
//	  - 인원 수를 입력받아, 입력받은 인원 수 만큼 
//	  이름, 국어점수, 영어점수, 수학점수를 입력받고
//	  총점과 평균을 산출하는 클래스로 설계할 것~!!!
//    - 속성 : 인원수, Record 형태의 배열 ex) Record[] rec
//	  - 기능 : 인원수 입력, 상세 데이터 입력, 총점/평균 산출, 결과 출력
// 3. Test094 클래스
//	  - main() 메소드가 존재하는 외부의 다른 클래스로 설계할 것~!!

// 실행 예)
// 인원 수 입력(1~100) : 105
// 인원 수 입력(1~100) : -7
// 인원 수 입력(1~100) : 3
// 1번째 학생의 이름 입력 : 박나현
// 국어 점수 : 90
// 영어 점수 : 80
// 수학 점수 : 70
// 2번째 학생의 이름 입력 : 이하림
// 국어 점수 : 82
// 영어 점수 : 72
// 수학 점수 : 62
// 3번째 학생의 이름 입력 : 이새롬
// 국어 점수 : 98
// 영어 점수 : 88
// 수학 점수 : 78

// 박나현 90 80 70 240 80.00	2
// 이하림 82 72 62 xxx xx.xx	3
// 이새롬 98 88 78 xxx xx.xx	1

// 계속하려면 아무 키나... 

/*  sungjuk 에서 했으면 할 필요 없다!!!!!
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
*/

public class Test094
{

	public static void main(String[] args)
	{
			/*
			// sungjuk 클래스 기반의 인스턴스 생성
			Sungjuk sj = new Sungjuk();

			// sungjuk 클래스의 메소드 호출
			sj.input();
			sj.sum();
			sj.avg();
			sj.print();
			*/

			// [함께 풀이한 내용]
			
			Sungjuk ob = new Sungjuk();
			ob.set();
			ob.input();
			ob.print();

			
	}

}

/* [실행 결과]
인원 수 입력(1~100) : 3
1번째 학생의 이름 입력 : 가
국어 점수 : 90
영어 점수 : 80
수학 점수 : 70
2번째 학생의 이름 입력 : 나
국어 점수 : 70
영어 점수 : 60
수학 점수 : 50
3번째 학생의 이름 입력 : 다
국어 점수 : 80
영어 점수 : 66
수학 점수 : 45

    가  90  80  70  240   80.00    1
    나  70  60  50  180   60.00    3
    다  80  66  45  191   63.67    2

인원 수 입력(1~100) : -3
인원 수 입력(1~100) : -11
인원 수 입력(1~100) : 1000
인원 수 입력(1~100) :
계속하려면 아무 키나 누르십시오 . . .
*/