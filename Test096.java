/*=====================================================
  ■■■ 메소드 중복정의(Method Overloading) ■■■
   - 메소드 오버로딩이 가능한 형태와 불가능한 형태
=====================================================*/

public class Test096
{
	public static void main(String[] args)
	{
		print();
		print(10);

		//double result = print(10.1); 
		// print(10.1); 
		//자바는 대입연산자 보면 우항부터 처리할려고 달려드는데
		// 자바는 이걸 구분할 수없음!
		
	}

	public static void print(){}
	public static void print(int i){}
	//public static void print(int j){}				//--(X)
	public static void print(char c){}				// ※ 자동 형 변환 규칙에 주의해서 사용
	public static void print(int i, int j){}
	public static void print(int i, double d){}		// ※ 자동 형 변환 규칙에 주의해서 사용
	public static void print(double d, int k){}
	public static double print(double d){return 3.14;}
	public static void print(double d){}			//--(X)
	public static String print(double d){}			//--(X)
}