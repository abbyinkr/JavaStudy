/*==================================================
   ���� �޼ҵ� ���ȣ��(��� �޼ҵ�) ����
==================================================*/

public class Test067
{
	public static void main(String[] args)
	{
		showHi(5);
	}
	 
	 //2���� ��ġ�� 
	/*
	public static void showHi(int cnt)			// 5
	{
		
		System.out.println("Hi~~~!!");
		showHi(cnt--);							// showHi(5);
		if(cnt==1)
			return;	
	}
	*/

	/* ��ġ�� �� �����ϸ�... ���� �ݺ�
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
			return;	// �޼ҵ� ����
		showHi(--cnt);

		}
}//end 

// �޸��� �Ѽ� ���� �غ��� ! �����ڹٿ����� �ڵ��� ���纻�� ����ȴ�.
// �� �ڵ�� if�� �������� ����ؼ� showHi �޼ҵ尡 ����Ǽ� ���ѹݺ��ȴ�.