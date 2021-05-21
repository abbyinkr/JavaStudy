/*==================================
     ■■■ 클래스 고급 ■■■
	 - 추상 클래스(Abstract)
==================================*/

/*
○ 추상 클래스(abstract)는
   선언만 있고 정의가 없는 하나 이상의 메소드(추상 메소드)를 갖는 클래스로
   하위 클래스에서 오버라이딩(Overriding)할 것으로 예상되는 메소드에 대해
   메모리 낭비없이 미리 호출 계획을 세워두기 위해 만든다.

○ 형식 및 구조
   [접근제어지시자] abstract class 클래스명
   {				========
		[접근제어지시자] abstract 자료형 메소드명([매개변수], ...);
						 ========
   }

   [] : 생략가능
 
○ 특징
   클래스가 적어도 하나 이상의 추상 메소드를 포함할 때
   그 클래스는 클래스 이름 앞에 『abstract』 키워드를 붙여
   추상 클래스로 명시해야 하며,
   추상 클래스로 명시해서 선언한 경우에는
   불완전한 형태의 클래스이므로 객체를 생성할 수 없다.
   추상 메소드가 존재하지 않는 추상 클래스마저도
   객체를 생성할 수 없는 것이다.

   즉, 추상 클래스는 독립적으로 존재할 수 없기 때문에
   상속을 위해서만 존재하며,
   추상 클래스에서 상속받은 하위 클래스에서는
   반드시 추상 메소드를 오버라이딩(Overriding)해야 한다.

※ 『abstract』 키워드는
	클래스와 메소드에서만 사용할 수 있으며
	멤버 변수와 로컬 변수에서는 사용 불가능하다.
*/

// 부모 클래스 SortInt
abstract class SortInt
{
	private int[] value;

	protected void sort(int[] value)
	{
		this.value = value;
		sorting();
	}

	// 추상 메소드(abstract)
	protected abstract void sorting();

	protected int dataLength()
	{
		return value.length;
	}

	// compare() 메소드는 크기 비교 메소드
	// 『final』 키워드로 인해 이 클래스(SortInt)를 상속받는 클래스에서
	//  이 메소드를 재정의할 수 없다.
	protected final int compare(int i, int j)
	{
		int x = value[i];
		int y = value[j];
		if (x==y)
			return 0;
		else if(x>y)
			return 1;
		else
			return -1;
	}
	
	// swap() 메소드는 자리 바꿈 메소드
	// 『final』 키워드로 인해 이 클래스(SortInt)를 상속받는 클래스에서
	//  적어도 이 메소드만큼은 재정의하지 말아라~!!!
	//  라는 의미 전달
	protected final void swap(int i, int j)
	{
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}
}

// SortInt(추상클래스)를 상속받은 클래스 → 추상클래스 → 추상메소드 재정의 → 일반 정상 클래스
//public abstract class Test110 extends SortInt
public class Test110 extends SortInt
{
	int i, j;

	static int[] data = {7, 10, 3, 8, 7};

	//-----------------------------------------------------------
	//  [나의 풀이]
	/*
	// 추상 메소드 sorting()를 재정의하겠다는 표시로 @Override 써주기
	@Override	
	protected void sorting()
	{			
		// 기본 버블정렬로 자리바꾸기
		for (i=1; i<dataLength(); i++)
		{
			for (j=0; j<dataLength()-i; j++)					// 조건식에서 바로 dataLength()를 쓸 수 있다.
			{
				if (compare(j,j+1)==1)
					swap(j,j+1);
			}
		}
		
		// 향상된 버블정렬로 자리바꾸기
		/*
		boolean flag;

		for (i=1; i<k; i++)
		{
			flag = false;
			for (j=0; j<k-i; j++)
			{
				if (compare(j,j+1)==1)
				{
					swap(j,j+1);
					flag = true;			// true : 자리 바꿈 했다.
				}
			}
			if (flag==false)				// false : 자리 바꿈 안했으면 반복 그만해~!
				break;							
		}
	
	}// end sorting()
	*/

	// [선생님 풀이]
	
	// protected abstract void sorting()

	@Override
	protected void sorting()
	{
		// Selection Sort
		for (i=0; i<dataLength()-1; i++)
		{
			for (j=i+1; j<dataLength(); j++)
			{
				if (compare(i, j) > 0)	// 크기 비교(정렬 기준)
					swap(i, j);			// 자리 바꿈
			}

			// 정렬 과정 테스트
			/*
			System.out.print((i+1) + "Round Data : ");
			for (int n: data)
				System.out.print(n + " ");
			System.out.println();
			*/
		}
	}

	//-----------------------------------------------------------


	public static void main(String[] args)
	{
		System.out.print("Sourced Data : ");
		for (int n: data)
			System.out.print(n + " ");
		System.out.println();

		Test110 ob = new Test110();
		ob.sort(data);
		// data = {7, 10, 3, 8, 7} 로 초기화
		// sorting 메소드 호출

		System.out.print("Sorted Data : ");
		for (int n: data)
			System.out.print(n + " ");
		System.out.println();
		
	}

}