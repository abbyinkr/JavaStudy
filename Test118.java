/*==================================
      ■■■ 클래스 고급 ■■■
      - 중첩 클래스
==================================*/

// 외부 클래스
class Test
{
	static int a = 10;		// 전역변수 멤버변수 static 변수(클래스변수)
	int b = 20;				// 전역변수 멤버변수 instance 변수(인스턴스 변수)

	// ▶ 첫번째 write() 메소드
	void write()
	{
		System.out.println("write()...①");

		final int c = 30;	// 지역변수 상수화된 변수(값이 변하지 않는 변수)
		int d = 40;			// 지역변수 값이 수시로 변할 수 있는 변수

		// 내부 클래스
		// 메소드 안에 존재하는 또다른 클래스(local class)
		class LocalTest
		{
			// ▶ 두 번째 write() 메소드
			void write()
			{
				System.out.println("Write()...②");

				System.out.println("a : " + a);
				System.out.println("b : " + b);
				System.out.println("c : " + c);	  // c는 변하지 않는 상수
				//System.out.println("d : " + d); d값은 확실히 알 수가 없다. 뒤에서 계속 바뀔 수 있음.
			}
		}

		// c = 20;
		d = 30;

		// 첫 번째 write() 메소드에서 새성한 지역 클래스의 인스턴스
		LocalTest ob1 = new LocalTest();

		// d = 10;

		// 두 번째 write() 메소드 호출
		ob1.write();
	}
}

// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test118
{
	public static void main(String[] args)
	{
		// 외부 클래스에 대한 인스턴스 생성
		Test ob2 = new Test();

		// 첫 번째 write() 메소드 호출
		ob2.write();

	}
}

/* [실행 결과]
write()...①
Write()...②
a : 10
b : 20
c : 30
계속하려면 아무 키나 누르십시오 . . .
*/