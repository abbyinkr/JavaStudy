/*==========================================
     ���� ����(Exception) ó�� ���� 
     - �ٸ� ���� �ٽ� ������
==========================================*/

public class Test148
{
	public int getValue(int value) throws Exception //-- ���� ������ �� �� ������ �Ķ� ��ź
	{
		int a;
		
		try
		{
			a = getData(-4);
			//-- ������ ���� �� �� ������ ���� ��ź
		}
		catch (Exception e) //-- ���� ��Ƴ��� �� �� ������ ���� ��ź
		{
			// ���� ó�� �� �� ������ ���� ��ź ó��
			System.out.println("printStackTrace....");
			e.printStackTrace();

			// ���� �߻� �� �� ������ �Ķ� ��ź
			throw new Exception("value�� �����Դϴ�.");

		}
		

		return a;
		
	}

	public int getData(int data) throws Exception // ���� ������ �� �� ������ ���� ��ź
	{
		if (data<0)
			throw new Exception("data�� 0���� �۽��ϴ�.");
			//-- ���� �߻� �� �� ������ ���� ��ź

		return data + 10;
	}

	public static void main(String[] args)
	{
		Test148 ob = new Test148();

		try
		{
			int a = ob.getValue(-4);
			//-- ������ ���� �� �� ������ �Ķ� ��ź
			System.out.println(a);
		}
		catch (Exception e)	//-- ���� ��Ƴ��� �� �� ������ �Ķ� ��ź
		{
			// ���� ó�� �� �� ������ �Ķ� ��ź
			System.out.println("printStackTrace.......(main)");
			e.printStackTrace();
		}
		
	}
}
