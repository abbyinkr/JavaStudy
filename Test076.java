/*=====================================================
   ■■■ 메소드 중복정의(Method Overloading) ■■■
=====================================================*/

/*
○  메소드 중복정의 개요
	메소드 중복정의(Method Overloading)란
	메소드가 처리하는 기능은 같고(혹은 매우 유사하고)
	메소드 괄호 속에 넘겨주게 되는 인수(인자, 매개변수, 파라미터)의 갯수가 다르거나
	자료형(Data Type)이 다른 경우
	메소드의 이름을 동일한 이름으로 사용해도 이들을 서루 구분(식별)할 수 있기 때문에
	동일한 이름을 부여하여 메소드를 정의할 수 있도록
	문법적으로 허용하게 되는데
	이를 『메소드 오버로딩(Method Overloading)』이라고 한다.
*/

public class Test076
{
	public static void main(String[] args)
	{
		Test076 ob = new Test076();

		//ob.drawLine();
		//--==>> ====================

		//ob.drawLine2('+');
		//--==>> ++++++++++++++++++++
		
		//ob.drawLine3('-',20);
		//--==>> --------------------

		ob.drawLine();
		//--==>> ====================

		ob.drawLine('>');
		//--==>> >>>>>>>>>>>>>>>>>>>>

		ob.drawLine('*',30);
		//--==>> ******************************

		// 메소드 오버로딩 예시!
		System.out.println();			// 이름은 같은데 매개변수 타입으로 구분하여 쓰고 있음!
		System.out.println('C');
		System.out.println(30);
		System.out.println(12.3456);
		System.out.println("정주희");

	}//end main

	// 선을 그리는 메소드 정의
	public void drawLine()
	{
		System.out.println("====================");	// 『=』 → 20개
	}

	// 선의 형태를 바꾸어 그리는 메소드 정의
	//public void drawLine2(char c)
	public void drawLine(char c)
	{
		for (int i=0; i<20; i++)
		{
			System.out.print(c);
		}
		System.out.println();
	}

	// 선의 형태와 길이를 바꾸어 그리는 메소드 정의
	//public void drawLine3(char c, int n)
	public void drawLine(char c, int n)
	{
		for (int i=0; i<n; i++)
		{
			System.out.print(c);
		}
		System.out.println();
	}
}// end class Test076