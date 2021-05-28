/*=============================================
     ■■■ 자바의 주요(중요) 클래스 ■■■
	 - Wrapper 클래스
=============================================*/

public class Test129
{
	public static void main(String[] args)
	{
		byte b = 3;
		int i = 256;

		Byte b2 = new Byte(b);			//--boxing
		Integer i2 = new Integer(i);	//--boxing

		//System.out.println(b2);			//--==>> 3
		//System.out.println(i2);			//--==>> 256

		// 나의 풀이 
		//Object obj = b2;		// 자동 업캐스팅(형변환)되므로
		//Object obj2 = i2;		// 이 부분 안써줘도 됨!!!

		print(b2);
		print(i2);
	}
	
	// 매개변수로 뭘 넣든..그 값을 출력해줘야함
	/*
	static void print(Object obj)
	{

		System.out.println(obj);
	}
	*/
	
	// [선생님 풀이]

	// Object : 객체이기만 하면 다 됨 → 데이터의 안정성이 미확보됨, 지양해야함
	// Number
	// ※ java.lang.Number 클래스(추상 클래스)는
	//    모든 Wrapper 클래스들의 부모 클래스(슈퍼 클래스, 상위클래스)이다.
	//    b2, i2 자료형이 Number n에 넘어오면서
	//    업 캐스팅이 일어나게 된다.       (Auto-Boxing 선행)
	static void print(Number n)
	{
		System.out.println(n);
	}

	// [자동 업캐스팅 예시]
	/*
	void set(int n)
	{
	}

	byte b = 5;
    set(b); <- byte타입이 자동으로 int로 바껴서 들어감
	
	1. 하위객체 생성 되어있음
	2. 상위 = 하위 ->  업캐스팅 정상적으로 이루어짐 이렇게 이해하면 된다

	*/

}