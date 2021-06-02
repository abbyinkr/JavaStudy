/*==========================================
     ■■■ 예외(Exception) 처리 ■■■ 
==========================================*/

// Test146.java 파일과 비교~!!!

class Demo1
{
	// 아래 구조를 익혀두기
	// 주요 속성 구성
	private int value;	// 0으로 기본적으로 초기화되있음 그래서 진행됨

	// setter (값을 넣어줌)
	public void setValue(int value)
	{
		if(value<=0)
			return;		//-- 종료 → 메소드 종료

		this.value = value;
	}

	// getter (값을 꺼내줌)
	public int getValue()
	{
		return value;
	}
}


public class Test145
{
	public static void main(String[] args)
	{
		Demo1 ob = new Demo1();
		ob.setValue(-10);
		int result = ob.getValue();
		System.out.println(result);
	}
}