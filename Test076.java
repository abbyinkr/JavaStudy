/*=====================================================
   ���� �޼ҵ� �ߺ�����(Method Overloading) ����
=====================================================*/

/*
��  �޼ҵ� �ߺ����� ����
	�޼ҵ� �ߺ�����(Method Overloading)��
	�޼ҵ尡 ó���ϴ� ����� ����(Ȥ�� �ſ� �����ϰ�)
	�޼ҵ� ��ȣ �ӿ� �Ѱ��ְ� �Ǵ� �μ�(����, �Ű�����, �Ķ����)�� ������ �ٸ��ų�
	�ڷ���(Data Type)�� �ٸ� ���
	�޼ҵ��� �̸��� ������ �̸����� ����ص� �̵��� ���� ����(�ĺ�)�� �� �ֱ� ������
	������ �̸��� �ο��Ͽ� �޼ҵ带 ������ �� �ֵ���
	���������� ����ϰ� �Ǵµ�
	�̸� ���޼ҵ� �����ε�(Method Overloading)���̶�� �Ѵ�.
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

		// �޼ҵ� �����ε� ����!
		System.out.println();			// �̸��� ������ �Ű����� Ÿ������ �����Ͽ� ���� ����!
		System.out.println('C');
		System.out.println(30);
		System.out.println(12.3456);
		System.out.println("������");

	}//end main

	// ���� �׸��� �޼ҵ� ����
	public void drawLine()
	{
		System.out.println("====================");	// ��=�� �� 20��
	}

	// ���� ���¸� �ٲپ� �׸��� �޼ҵ� ����
	//public void drawLine2(char c)
	public void drawLine(char c)
	{
		for (int i=0; i<20; i++)
		{
			System.out.print(c);
		}
		System.out.println();
	}

	// ���� ���¿� ���̸� �ٲپ� �׸��� �޼ҵ� ����
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