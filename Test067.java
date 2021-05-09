/*==================================================
   ■■■ 메소드 재귀호출(재귀 메소드) ■■■
==================================================*/

public class Test067
{
	public static void main(String[] args)
	{
		showHi(5);
	}
	 
	 //2군데 고치기 
	/*
	public static void showHi(int cnt)			// 5
	{
		
		System.out.println("Hi~~~!!");
		showHi(cnt--);							// showHi(5);
		if(cnt==1)
			return;	
	}
	*/

	/* 고치기 전 실행하면... 무한 반복
	public static void showHi(5)			// 5
		{
		
		System.out.println("Hi~~~!!");
		public static void showHi(4)			// 5
		{
		
		System.out.println("Hi~~~!!");
		public static void showHi(3)			// 5
		{
		
		System.out.println("Hi~~~!!");
		public static void showHi(2)			// 5
		{
		
		System.out.println("Hi~~~!!");
		public static void showHi(1)			// 5
		{
		
		System.out.println("Hi~~~!!");
		public static void showHi(-1)			// 5
		{
		
		System.out.println("Hi~~~!!");
		showHi(cnt--);							
		if(cnt==1)
			return;	
		}							
		if(cnt==1)
			return;	
		}						
		if(cnt==1)
			return;	
		}							
		if(cnt==1)
			return;	
		}							
		if(cnt==1)
			return;	
		}							
		if(cnt==1)
			return;	
		}
			:
			:
	*/
	
		public static void showHi(int cnt)  
		{
		
		System.out.println("Hi~~~!!");
		
		if(cnt==1)
			return;	// 메소드 종료
		showHi(--cnt);

		}
}//end 

// 메모장 켜서 직접 해보기 ! 실제자바에서도 코드의 복사본이 실행된다.
// 위 코드는 if문 가기전에 계속해서 showHi 메소드가 실행되서 무한반복된다.