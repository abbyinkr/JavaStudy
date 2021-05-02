//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;

import java.util.Scanner;

public class Sungjuk 
{
	/*
	int n;				// 입력받은 학생수
	Record[] objArr;	// Record타입의 배열 선언


	// 값 입력받는 메소드 생성
	void input() throws IOException
	{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			System.out.print("인원 수 입력(1~100) : ");
			n = Integer.parseInt(br.readLine());
		}
		while (n<1 || n>100); // → 원하는 값의 범위인 1<=n<=100 의 대우

		objArr = new Record[n]; 
		//입력한 학생수가 3명이면 3개의 방

		for (int i=0; i<objArr.length; i++) 
		{
			objArr[i] = new Record(); // 방마다 인스턴스 생성
			
			System.out.printf("%d번째 학생의 이름 입력 : ", i+1);

			objArr[i].name = br.readLine();
	
			System.out.print("국어 점수 : ");
			objArr[i].score[0] = Integer.parseInt(br.readLine());
			System.out.print("영어 점수 : ");
			objArr[i].score[1] = Integer.parseInt(br.readLine());	
			System.out.print("수학 점수 : ");
			objArr[i].score[2] = Integer.parseInt(br.readLine());
				
		}
	}

	// 총합 점수 연산 메소드 생성 -- 값을 담아둘 변수가 Record안에 모두 있으므로 void			
	void sum()
	{
		for (int i=0; i<n; i++)
		{
			
			objArr[i].tot = objArr[i].score[0]+objArr[i].score[1]+objArr[i].score[2];
		}
		
	}
	
	//  평균 점수 연산 메소드 생성
	void avg()
	{
		for (int i=0; i<n; i++)
		{
			objArr[i].avg = objArr[i].tot/3.0;
		}
	}
	
	// 순위 연산 메소드 생성
	void rank()
	{
			for (int i=0 ; i<n; i++)
			{
				objArr[i].rank = 1;

				for (int j=0 ; j<n; j++)
				{
					if (objArr[i].avg < objArr[j].avg)  // 1 4 10 
					{
						objArr[i].rank++; //               
					}
				}
			}
	}

	// 출력 메소드 생성
	void print()
	{
		for (int i=0; i<n; i++)
		{
			System.out.printf("%s %d %d %d %3d %4.2f\n", objArr[i].name,objArr[i].score[0],objArr[i].score[1],objArr[i].score[2],objArr[i].tot, objArr[i].avg);

		}
		
	}
	*/

	//[함께 풀이한 내용]
	
	//    - 속성 : 인원수, Record 형태의 배열 ex) Record[] rec
	// 주요 속성 구성
	private int inwon;			//-- 인원 수
	private Record[] recArr;	//-- Record 배열
								//   (학생 1명 당 Record 배열 방 1개 활용)
	


	//	  - 기능 : 인원수 입력, 상세 데이터 입력, 총점/평균 산출, 결과 출력
	// 메소드 정의
	// ① 인원수 입력
	public void set()
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("인원 수 입력(1~100) : ");
			inwon = sc.nextInt();
		}
		while (inwon<1 || inwon>100);

		// check~!!!
		// Record 클래스를 기반으로 생성된 객체(인스턴스)를 담을 수 있는 배열방을 
		// inwon만큼 생성한 것이지,
		// Record 클래스의 인스턴스를 생성한 것은 아니다.
		recArr = new Record[inwon];
		
	}

	// 메소드 정의
	// ② 상세 데이터 입력 ③ 총점/평균 산출

	public void input()	// 사용자에게 입력안내하면서 값을 받아내기때문에 매개변수 없다.
	{
		Scanner sc = new Scanner(System.in);

		String[] subTitle = {"국어 점수 : ", "영어 점수 : ", "수학 점수 : "};

		for (int i=0 ; i<inwon ; i++)	// 인원 수 만큼 반복~!!! (inwon == recArr.length)
		{
			// check~!!
			// Record 클래스 기반의 인스턴스 생성 
			// Record rec = new Record();		 
			// recArr[i] = rec;
			recArr[i] = new Record(); 

			System.out.printf("%d번째 학생의 이름 입력 : ", (i+1));
			recArr[i].name = sc.next();

			/*
			System.out.print("국어 점수 : ");
			recArr[i].score[0] = sc.nextInt();
			recArr[i].tot += recArr[i].score[0];

			System.out.print("영어 점수 : ");
			recArr[i].score[1] = sc.nextInt();
			recArr[i].tot += recArr[i].score[1];

			System.out.print("수학 점수 : ");
			recArr[i].score[2] = sc.nextInt();
			recArr[i].tot += recArr[i].score[2];
			*/

			for (int j=0 ; j<subTitle.length ; j++)		// 0 1 2 
			{
				// 안내 메세지 출력
				System.out.print(subTitle[j]);

				// 사용자가 입력한 데이터를 스코어(score) 배열에 담아내기
				recArr[i].score[j] = sc.nextInt();

				// 국어, 영어, 수학 점수 데이터를 반복적으로 입력받는 동안
				// 그 과정에서 총점 누적하기
				recArr[i].tot += recArr[i].score[j];
			}

			// ④ 평균 산출하기
			recArr[i].avg = recArr[i].tot/3.0;

		}
		
	}//end input()

	// 메소드 추가 정의
	// ⑤ 석차 산출 (크기 비교할려면 반복문의 중첩을 해야한다)
	private void ranking()	// 사용자가 건들지못하게 private
	{
		// 루프 변수
		int i, j;
		
		// 모든 학생들의 등수(석차)를 1로 초기화
		for (i=0; i<inwon; i++)
			recArr[i].rank = 1;
			
		// 등수(석차) 산출
		for (i=0; i<inwon-1; i++)		// i → 비교 기준을 설정하는 인덱스
		{
			for (j=i+1; j<inwon; j++)	// j → 비교 대상을 설정하는 인덱스
			{
				if (recArr[i].avg > recArr[j].avg)	// 기준 데이터가 비교 데이터보다 크다면
				{
					// 비교데이터의 rank를 1만큼 증가
					recArr[j].rank++;

				}

				else if (recArr[j].avg > recArr[i].avg)
				{
					// 기준데이터의 rank 를 1만큼 증가
					recArr[i].rank++;
				}
				 
			}
		}


	
	}



	// 메소드 정의
	// ④ 결과 출력
	public void print()
	{
		// 석차 산출 메소드 호출 구문 추가 ~!!!
		ranking();

		// 개행
		System.out.println();

		// 학생 1명당 반복 출력 구문

		for (int i=0; i<inwon ; i++)	//-- 학생 인원 수 만큼 반복~!!!
		{
			// 이름 출력
			System.out.printf("%5s", recArr[i].name);

			// 성적(국어, 영어, 수학) 반복 출력
			for (int j=0 ; j<3; j++) // 0 1 2 → 국어 영어 수학
				System.out.printf("%4d", recArr[i].score[j]);
		
			// 총점, 평균 출력
			System.out.printf("%5d", recArr[i].tot);
			System.out.printf("%8.2f", recArr[i].avg);

			// 석차 출력
			System.out.printf("%5d", recArr[i].rank);

			// 개행
			System.out.println();
		
		}
		
	}//end print()
	
}