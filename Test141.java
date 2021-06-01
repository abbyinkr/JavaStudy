/*==========================================
   ■■■ 자바의 주요(중요) 클래스 ■■■
   - Random 클래스 
==========================================*/

/*
○ java.util.Random 클래스는 

   여러 형태의 난수를 발생시켜 제공하는 클래스이다.
   Math 클래스의 정적 메소드인 random() 메소드도 난수를 제공하는 메소드지만
   0.0 ~ 1.0 사이의 실수 형태만 발생하게 되므로
   필요한 여러 형태의 난수를 만들어내기 위해서는 추가적인 연산들을 수행해야 한다.
   그래서 자바는 여러 형태의 난수를 발생시켜주는 
   전용 클래스인 Random 클래스를 별도로 제공하고 있다.

*/

// 로또 번호 생성기 (난수 발생 프로그램)

// 프로그램이 실행되면 기본적으로 로또를 5게임 수행하는 프로그램을 구현한다.

// 실행 예)
// 1 3 4 17 23 44
//11 2 8 16 28 42
//    : 
// 계속하려면 아무 키나...

import java.util.Random;
import java.util.Arrays;

class Lotto
{
	/*
	private int[] arr = new int[6];
	int w = 1;
	*/

	// [선생님 풀이]
	// 배열 변수 선언 및 메모리 할당 → 로또 번호를 담아둘 배열방 6개
	private int[] num = new int[6];

	// getter 
	public int[] getNum()
	{
		return num;
	}

	// 6개의 난수를 발생시키는 메소드 정의
	public void start()
	{
		int cnt = 0;
		Random rd = new Random();
		int n;
		

		//continue label
		jump:
		while (cnt<6)  // cnt → 0 1 2 3 4 5
		{
			n = rd.nextInt(45)+1; // 1 ~ 45  → 27 3 14
			for (int i = 0; i<cnt; i++)
			{
				// 확인 (테스트)
				//System.out.println("i : " + i + ", cnt : " + cnt);
				if (num[i]== n)	// 지금 발생한 n이 이전값이랑 중복이라면
					continue jump;	// jump label로 가라!
					
			}

			num[cnt++] = n;  // num[0] 27 num[1] 3 num[2] 14 .. num[5] 30

		}
		
		// 정렬 메소드 호출
		sorting();
		
	}// end start()

	// 정렬 메소드 정의
	private void sorting()
	{
		Arrays.sort(num);
	}
	
	/*
	public void cal()
	{
		Random rd = new Random();

		// 배열 값 초기화 
		for (int i=0; i<6; i++)
		{	
			arr[i] = rd.nextInt(45)+1; // 1 ~ 45	// 다짜고짜 넣지말고 int에 우선 담아둘걸..

			for (int j=0; j<i; j++)   // i: 2 j: 1 일때 값이 같으면 arr[i] 재초기화
			{
				if (arr[i]==arr[j])
					arr[i] = rd.nextInt(45)+1;
			}
		}

		// 배열 출력
		for (int n : arr)
		{
			System.out.printf("%3d", n);
			if (w%6==0)
				System.out.println();
			w++;	
		}
	}
	*/


}

public class Test141
{
	public static void main(String[] args)
	{
		Lotto lotto = new Lotto();
		
		for (int i=1; i<=5; i++)
		{

			//lotto.cal();
			
			// 확인(테스트)
			//lotto.start();

			 결과 출력
			for (int n : lotto.getNum())
				System.out.printf("%4d", n);
			System.out.println();
		}
	}
}

/* [실행 결과]
  10  14  24  30  39  44
   5   6   7  13  25  32
   4  12  19  37  40  45
   2   3   5  10  23  43
   7  12  18  23  36  40
계속하려면 아무 키나 누르십시오 . . .
*/